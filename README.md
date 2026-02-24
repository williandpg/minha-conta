<h1><strong>Minha Conta</strong></h1>

<h2><strong>Descrição</strong></h2>
<p align="justify">
  Neste projeto, desenvolvi uma ferramenta para gestão do consumo energético.
  A aplicação permite que pessoas consumidoras emitam faturas, estimem gastos mensais, consultem histórico de pagamentos e executem outras funcionalidades baseadas em uma SDK fornecida pela Íons Energia, uma concessionária fictícia que simula uma demanda real do mercado.
</p>

<h2><strong>Funcionalidades</strong></h2>
<ul>
  <li align="justify"><strong>Emissão de faturas</strong> com base nos dados de consumo e regras disponibilizadas pela SDK.</li>
  <li align="justify"><strong>Estimativa de gastos mensais</strong> para apoiar planejamento e previsibilidade de custos.</li>
  <li align="justify"><strong>Consulta de histórico de pagamentos</strong> para visualização e auditoria de cobranças.</li>
  <li align="justify"><strong>Integração com SDK</strong> da Íons Energia para obter dados, validar operações e executar ações do domínio.</li>
  <li align="justify"><strong>Testes automatizados</strong> para garantir comportamento esperado e reduzir regressões.</li>
</ul>

<h2><strong>Demonstração do Projeto</strong></h2>
<p align="center">
  <em>Projeto sem interface gráfica, focado em lógica de negócios e integração com SDK. A demonstração a seguir apresenta a execução de testes unitários e a verificação de qualidade do código.</em>
  <br>
  <a href="https://github.com/williandpg/minha-conta" target="_blank"><strong>Acesse o projeto no GitHub</strong></a>
</p>

<h2><strong>Tecnologias Utilizadas</strong></h2>
<ul>
  <li align="justify"><a href="https://www.java.com/" target="_blank"><strong>Java</strong></a>: Linguagem principal do projeto, com foco em orientação a objetos e boas práticas.</li>
  <li align="justify"><a href="https://maven.apache.org/" target="_blank"><strong>Maven</strong></a>: Gerenciamento de dependências e automação de build e testes. O projeto utiliza wrapper (<code>mvnw</code>) para padronizar execução.</li>
  <li align="justify"><a href="https://junit.org/junit5/" target="_blank"><strong>JUnit</strong></a>: Base para testes unitários, garantindo confiança na evolução do código.</li>
  <li align="justify"><a href="https://site.mockito.org/" target="_blank"><strong>Mockito</strong></a>: Criação de mocks para isolamento de dependências, especialmente útil em integrações com SDK.</li>
  <li align="justify"><a href="https://checkstyle.sourceforge.io/" target="_blank"><strong>Checkstyle</strong></a>: Análise estática e padronização do estilo do código para manter consistência e legibilidade.</li>
</ul>

<h2><strong>Estrutura do Projeto</strong></h2>
<p align="justify">A estrutura do projeto é organizada da seguinte forma:</p>
<pre><code>/
├── .mvn/             # Pasta de configuração do Maven Wrapper
├── images/           # Imagens e recursos estáticos
├── src/
│   └── main/
│       └── java/
│           └── com/  # Código-fonte do projeto, organizado por pacotes
├── FAQ.md
├── index.html
├── style.css
├── mvnw
├── pom.xml
└── README.md
</code></pre>

<h2><strong>Contato</strong></h2>
<p>
  <strong>Willian Gonçalves</strong> |
  <a href="https://www.linkedin.com/in/williandpg/" target="_blank"><strong>LinkedIn</strong></a> |
  <a href="https://github.com/williandpg" target="_blank"><strong>GitHub</strong></a> |
  <a href="https://williandpg.github.io/" target="_blank"><strong>Portfólio</strong></a> |
  <a href="mailto:goncalves.wdp@outlook.com" target="_blank"><strong>Email</strong></a>
</p>

<h2><strong>Créditos</strong></h2>
<p align="justify">
  Projeto desenvolvido como parte da formação de Java da Trybe, com foco em boas práticas de desenvolvimento, testes automatizados, integração com SDK e padronização de código.
</p>

<details>
  <summary><strong>English Version</strong></summary>

  <h1><strong>Minha Conta</strong></h1>

  <h2><strong>Description</strong></h2>
  <p align="justify">
    In this project, I implemented a tool for energy consumption management.
    The application allows consumers to issue invoices, estimate monthly costs, check payment history, and other features powered by an SDK provided by Íons Energia, a fictional energy utility designed to simulate a real-world demand.
  </p>

  <h2><strong>Features</strong></h2>
  <ul>
    <li align="justify"><strong>Invoice issuing</strong> based on consumption data and SDK business rules.</li>
    <li align="justify"><strong>Monthly cost estimation</strong> to support planning and predictability.</li>
    <li align="justify"><strong>Payment history lookup</strong> for tracking and auditing charges.</li>
    <li align="justify"><strong>SDK integration</strong> to fetch data, validate operations, and execute domain actions.</li>
    <li align="justify"><strong>Automated tests</strong> to keep the code reliable and prevent regressions.</li>
  </ul>

  <h2><strong>Project Demonstration</strong></h2>
  <p align="center">
    <em>Project without a graphical interface, focused on business logic and SDK integration. The demonstration below shows the execution of unit tests and code quality checks.</em>
    <br>
    <a href="https://github.com/williandpg/minha-conta" target="_blank"><strong>Acess the project on GitHub</strong></a>
  </p>

  <h2><strong>Technologies Used</strong></h2>
  <ul>
    <li align="justify"><a href="https://www.java.com/" target="_blank"><strong>Java 17</strong></a>: Main language, focusing on OOP and clean code practices.</li>
    <li align="justify"><a href="https://maven.apache.org/" target="_blank"><strong>Maven</strong></a>: Dependency management and build automation, using wrapper (<code>mvnw</code>).</li>
    <li align="justify"><a href="https://junit.org/junit5/" target="_blank"><strong>JUnit 5</strong></a>: Unit testing foundation.</li>
    <li align="justify"><a href="https://site.mockito.org/" target="_blank"><strong>Mockito</strong></a>: Mocking dependencies to isolate tests and SDK integration points.</li>
    <li align="justify"><a href="https://checkstyle.sourceforge.io/" target="_blank"><strong>Checkstyle</strong></a>: Static analysis to enforce coding standards.</li>
  </ul>

  <h2><strong>Project Structure</strong></h2>
  <p align="justify">The project structure is organized as follows:</p>
  <pre><code>/
  ├── .mvn/             # Maven Wrapper configuration folder
  ├── images/           # Images and static resources
  ├── src/
  │   └── main/
  │       └── java/
  │           └── com/  # Project source code, organized by packages
  ├── FAQ.md
  ├── index.html
  ├── style.css
  ├── mvnw
  ├── pom.xml
  └── README.md
  </code></pre>

  <h2><strong>Contact</strong></h2>
  <p>
    <strong>Willian Gonçalves</strong> |
    <a href="https://www.linkedin.com/in/williandpg/" target="_blank"><strong>LinkedIn</strong></a> |
    <a href="https://github.com/williandpg" target="_blank"><strong>GitHub</strong></a> |
    <a href="https://williandpg.github.io/" target="_blank"><strong>Portfolio</strong></a> |
    <a href="mailto:goncalves.wdp@outlook.com" target="_blank"><strong>Email</strong></a>
  </p>

  <h2><strong>Credits</strong></h2>
  <p align="justify">
    Project developed as part of Trybe Java training, focusing on development best practices, automated tests, SDK integration, and code style enforcement.
  </p>
</details>