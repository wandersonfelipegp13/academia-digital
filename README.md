<h1>Conhecendo o Projeto Spring Data JPA na Prática </h1>

<p> Bem-vindos a implementação do Desafio de Código proposta no projeto de LAB <strong>Conhecendo o Projeto 
Spring Data JPA na Prática</strong> oferecido gratuitamente pela plataforma de cursos online 
<a href="https://dio.me/"><strong> Digital Innovation One</strong></a>.<br>

<h2>🎯 Objetivo do Projeto</h2>

<p>Este projeto teve por objetivo, explorar os principais conceitos de mapeamento objeto relacional (ORM) 
usando o <strong>Spring Data JPA</strong>. Para isso, uma <strong>API RESTful</strong> foi desenvolvida com ênfase 
na modelagem de suas entidades, no domínio de uma academia de ginástica.</p>

<h2>🛠 Tecnologias Utilizadas</h2>

<ul>
    <li>Spring Tool Suite 4</li>
    <li>Java 11</li>
    <li>Maven</li>
    <li><strong>Spring Web</strong></li>
    <li><strong>Spring Data JPA</strong></li>
    <li><strong>PostgreSQL Driver</strong></li>
    <li><strong>Hibernate Validator</strong></li>
    <li>Lombok</li>
    <li>Postman</li>
</ul>

<h2>✨ Novas Funcionalidades</h2>

<p>Seguindo as regras de negócio, neste repositório, foram implementados mais alguns endpoints: </p>

* GET `http://localhost:8081/alunos/{id}` (para buscar um aluno em específico)
* PUT `http://localhost:8081/alunos/{id}` (para atualizar um aluno em específico)
* DELETE `http://localhost:8081/alunos/{id}` (para deletar um aluno em específico)
* GET `http://localhost:8081/avaliacoes/{id}` (para busca uma avaliação)
* PUT `http://localhost:8081/avaliacoes/{id}` (para atualizar uma avaliação)
* DELETE `http://localhost:8081/avaliacoes/{id}` (para deletar uma avaliação)
* DELETE `http://localhost:8081/matriculas/{id}` (para deletar uma matrícula)
