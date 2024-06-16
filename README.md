<h1>Sistema de Autenticação e Autorização</h1>
<text>Este projeto foi desenvolvido para a aula de Arquitetura de Aplicações Web. Ele visa a implementação de uma API REST utilizando Spring Boot e autenticando com JWT (JSON Web Token). A API é configurada para o gerenciamento de usuários como (ADMIN, MODERADOR e USUARIOS COMUNS) e o controle dos acessos de forma segura.</text>

<h3>Sumário</h3>
<li>Endpoints disponíveis</li>

<h3>Endpoints disponíveis</h3>
<text><li>POST /login: Endpoint para obter uma autenticação JWT</li></text>
<text><li> GET /username/{token}: Rota que obtém o Token JWT para um usuário</li></text>
<text><li>GET /user: Rota que obtém informações sobre usuários autenticados</li></text>
<text><li>GET /admin: Rota acessada apenas por um usuário ADMIN</li></text>
<text><li>GET /moderador: Rota acessada apenas por um usuário MODERADOR</li></text>
<text><li>GET /usuarioComum: Rota acessada por administradores, moderadores e usuarios comuns</li></text>

<h3>Estrutura do Projeto</h3>
<li>(Application) Onde rodaremos a aplicação</li>
<li>(Config) Onde é configurado os logins, permissoes e restrições de acesso</li>
<li>(Controller) Onde há controladores que lidam com as requisições HTTP</li>
<li>(Model) Onde temos as requisições </li>
<li>(Repository) Onde fica responsável pela interação com o banco de dados</li>
<li>(Security) Onde se faz operações relacionadas ao JWT </li>
<li>(Service) Onde ficam os serviços da aplicação  </li>

<h3>Autenticação</h3>
