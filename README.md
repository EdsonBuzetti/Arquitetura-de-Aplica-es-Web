<h1>Sistema de Autenticação e Autorização</h1>
<p>Este projeto foi desenvolvido para a aula de Arquitetura de Aplicações Web. Ele visa a implementação de uma API REST utilizando Spring Boot e autenticando com JWT (JSON Web Token). A API é configurada para o gerenciamento de usuários como (ADMIN, MODERADOR e USUARIOS COMUNS) e o controle dos acessos de forma segura.</p>

<h3>Resumo</h3>
<li>Ferramentas utilizadas</li>
<li>Endpoints disponíveis</li>
<li>Estrutura do Projeto</li>
<li>Autenticação</li>
<li>Respostas de retornos</li>
<li>Prints do Insomnia</li>
<li>Diagrama</li>

<h3>Ferramentas utilizadas</h3>
<li>IntelliJ IDEA Community Edition</li>
<li>Maven</li>
<li>MongoDB Compass</li>

<h3>Endpoints disponíveis</h3>
<p>POST /login: Endpoint para obter uma autenticação JWT</p>
<p>GET /username/{token}: Rota que obtém o Token JWT para um usuário</p>
<p>GET /user: Rota que obtém informações sobre usuários autenticados</p>
<p>GET /admin: Rota acessada apenas por um usuário ADMIN</p>
<p>GET /moderador: Rota acessada apenas por um usuário MODERADOR</p>
<p>GET /usuarioComum: Rota acessada por administradores, moderadores e usuarios comuns</p>

<h3>Estrutura do Projeto</h3>
<p>(Application) Onde rodaremos a aplicação</p>
<p>(Config) Onde é configurado os logins, permissoes e restrições de acesso</p>
<p>(Controller) Onde há controladores que lidam com as requisições HTTP</p>
<p>(Model) Onde temos as requisições</h5>
<p>(Repository) Onde fica responsável pela interação com o banco de dados</p>
<p>(Security) Onde se faz operações relacionadas ao JWT </p>
<p>(Service) Onde ficam os serviços da aplicação </p>

<h3>Autenticação</h3>
<p>Este sistema utiliza o JWT (Jason Web Token) como método de autenticação utilizando uma chave Token JWT.</p>

<h3>Respostas de retornos</h3>
<p>[200 OK] Requisição autorizada com sucesso.</p>
<p>[401 Unautorizhed] Não autorizado, senha ou usuário incorreto.</p>
<p>[403 Forbidden] Usuário não possui autorização para este acesso.</p>

<h3>Prints do Insomnia</h3>

<h4>Login:</h4>

![LoginInsomnia](https://github.com/EdsonBuzetti/Arquitetura-de-Aplicacoes-Web/assets/126629330/b6864e84-3d22-4552-8472-ca6a1dfe1e90)

<h4>Utilizando o Token:</h4>

![loginToken](https://github.com/EdsonBuzetti/Arquitetura-de-Aplicacoes-Web/assets/126629330/1ae9ff81-c5b9-41a2-8d40-3a52fdc00372)

<h4>User:</h4>

![loginuser](https://github.com/EdsonBuzetti/Arquitetura-de-Aplicacoes-Web/assets/126629330/9dda3cac-16a1-4d96-bda7-30a0281a73f0)

<h4>Administrador:</h4>

![LoginADM](https://github.com/EdsonBuzetti/Arquitetura-de-Aplicacoes-Web/assets/126629330/342a64bb-489e-46a3-9454-89026fd9c07b)

<h4>Usuario não autorizado:</h4>

![naoAutorizado](https://github.com/EdsonBuzetti/Arquitetura-de-Aplicacoes-Web/assets/126629330/e9042cc0-33a9-4588-9c2b-c425c2fe90d1)

<h4>Falha login administrador:</h4>

![LoginFalhaADM](https://github.com/EdsonBuzetti/Arquitetura-de-Aplicacoes-Web/assets/126629330/6dc8eb70-a2ce-4c86-ab48-554270a29d9c)

<h4>Moderador:</h4>

![LoginModerador](https://github.com/EdsonBuzetti/Arquitetura-de-Aplicacoes-Web/assets/126629330/2d55ca44-819c-405b-9941-0e5017d378fe)

<h4>Usuario comum:</h4>

![loginUsuarioComum](https://github.com/EdsonBuzetti/Arquitetura-de-Aplicacoes-Web/assets/126629330/04c03500-bee0-4476-8d9c-51fbc31bd5bd)

<h3>Diagrama</h3>

![DiagramaJwt](https://github.com/EdsonBuzetti/Arquitetura-de-Aplicacoes-Web/assets/126629330/0da474a0-4837-4387-9e6d-373537b03e39)

[Link do Figma](https://www.figma.com/board/tr8WgZqoGpmwjJyDOBAMU1/Untitled?node-id=0-1&t=LwBmlAU9o7Hl0ddk-0)




