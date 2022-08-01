package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.infra.utils.JavaTimeUtils;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoServiceImpl implements IAlunoService {

	@Autowired
	private AlunoRepository repository;

	@Override
	public Aluno create(AlunoForm form) {
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setCpf(form.getCpf());
		aluno.setBairro(form.getBairro());
		aluno.setDataDeNascimento(form.getDataDeNascimento());

		return repository.save(aluno);
	}

	@Override
	public Aluno get(Long id) {
		return repository.getById(id);
	}

	@Override
	public List<Aluno> getAll(String dataDeNascimento) {

		if (dataDeNascimento == null) {
			return repository.findAll();
		} else {
			LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
			return repository.findByDataDeNascimento(localDate);
		}

	}

	@Override
	public Aluno update(Long id, AlunoUpdateForm formUpdate) {
		
		Optional<Aluno> aluno = repository.findById(id);
		
		if (!aluno.isPresent())
			return null;
		
		aluno.get().setId(id);
		aluno.get().setNome(formUpdate.getNome());
		aluno.get().setBairro(formUpdate.getBairro());
		aluno.get().setDataDeNascimento(formUpdate.getDataDeNascimento());
		
		return repository.save(aluno.get());
	}

	@Override
	public void delete(Long id) {
		Optional<Aluno> aluno = repository.findById(id);
		
		if (!aluno.isPresent())
			return;
		
		repository.deleteById(id);
	}

	@Override
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

		Aluno aluno = repository.findById(id).get();

		return aluno.getAvaliacoes();

	}

}
