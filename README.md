-<h1>Sistema de Autenticação e Autorização</h1>
<text>Este projeto foi desenvolvido para a aula de Arquitetura de Aplicações Web. Ele visa a implementação de uma API REST utilizando Spring Boot e autenticando com JWT (JSON Web Token). A API é configurada para o gerenciamento de usuários como (ADMIN, MODERADOR e USUARIOS COMUNS) e o controle dos acessos de forma segura.</text>

<h3>Resumo</h3>
<li>Ferramentas utilizadas</li>
<li>Endpoints disponíveis</li>
<li>Estrutura do Projeto</li>
<li>Autenticação</li>
<li>Erros comuns</li>

<h3>Ferramentas utilizadas</h3>
<li>IntelliJ IDEAD Community Edition</li>
<li>MongoDB Compass</li>
<li>Insomnia</li>

<h3>Endpoints disponíveis</h3>
<h5>POST /login: Endpoint para obter uma autenticação JWT</h5>
<h5>GET /username/{token}: Rota que obtém o Token JWT para um usuário</h5>
<h5>GET /user: Rota que obtém informações sobre usuários autenticados</h5>
<h5>GET /admin: Rota acessada apenas por um usuário ADMIN</h5>
<h5>GET /moderador: Rota acessada apenas por um usuário MODERADOR</h5>
<h5>GET /usuarioComum: Rota acessada por administradores, moderadores e usuarios comuns</h5>

<h3>Estrutura do Projeto</h3>
<h5>(Application) Onde rodaremos a aplicação</h5>
<h5>(Config) Onde é configurado os logins, permissoes e restrições de acesso</h5>
<h5>(Controller) Onde há controladores que lidam com as requisições HTTP</h5>
<h5>(Model) Onde temos as requisições</h5>
<h5>(Repository) Onde fica responsável pela interação com o banco de dados</h5>
<h5>(Security) Onde se faz operações relacionadas ao JWT </h5>
<h5>(Service) Onde ficam os serviços da aplicação </h5>

<h3>Autenticação</h3>
Este sistema utiliza o JWT (Jason Web Token) como método de autenticação utilizando uma chave Token JWT.

<h3>Respostas de retornos</h3>
<h5>[200 OK] Requisição autorizada com sucesso.</h5>
<h5>[401 Unautorizhed] Não autorizado, senha ou usuário incorreto.</h5>
<h5>[403 Forbidden] Usuário não possui autorização para este acesso.</h5>

