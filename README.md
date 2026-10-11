# Notice Board

O projeto consiste no desenvolvimento de uma plataforma web voltada à organização de tarefas e afazeres por meio de um quadro de avisos

## Objetivo

Oferecer ao usuário um quadro pessoal de avisos com data limite, funcionando como agenda inteligente que alerta quando o prazo está próximo e sinaliza o atraso até que a atividade seja concluída

## Levantamento de Requisitos

## Requisitos Funcionais (RF)

| ID | Descrição |
|---|---|
| RF01 | O sistema deve permitir o cadastro de um novo usuário informando nome, email e senha. |
| RF02 | O sistema deve permitir que o usuário cadastrado realize login com email e senha. |
| RF03 | O sistema deve gerar um token de autenticação (ex.: JWT) após o login bem-sucedido. |
| RF04 | O sistema deve permitir que o usuário realize logout, invalidando a sessão/token. |
| RF05 | O sistema deve permitir que o usuário consulte e edite seus dados de perfil (nome, email e senha). |
| RF06 | O sistema deve permitir que o usuário exclua sua conta, removendo também seus avisos. |
| RF07 | O sistema deve permitir que o usuário autenticado crie um aviso informando nome, detalhamento e data limite. |
| RF08 | O sistema deve listar todos os avisos do usuário autenticado (o "quadro"), com suporte a ordenação por data limite. |
| RF09 | O sistema deve permitir a consulta dos detalhes de um aviso específico. |
| RF10 | O sistema deve permitir a edição de nome, detalhamento e data limite de um aviso. |
| RF11 | O sistema deve permitir a exclusão de um aviso. |
| RF12 | O sistema deve permitir marcar um aviso como concluído. |
| RF13 | O sistema deve permitir desfazer a conclusão de um aviso (reabri-lo). |
| RF14 | O sistema deve permitir filtrar avisos por situação (pendente, próximo do prazo, atrasado, concluído). |
| RF15 | O sistema deve calcular automaticamente o status de cada aviso (pendente, próximo do prazo, atrasado, concluído) com base na data limite e na data atual. |
| RF16 | O sistema deve disponibilizar um endpoint que retorne os avisos que exigem atenção (próximos do prazo e atrasados) para que o front-end exiba as notificações. |
| RF17 | O sistema deve retornar, em cada aviso, informações auxiliares como tempo restante até o prazo ou tempo de atraso. |
| RF18 | O sistema deve continuar sinalizando como "atrasado" todo aviso vencido e não concluído, até que seja marcado como concluído, permitindo ao front-end gerar o retorno visual. |
| RF19 | O sistema deve permitir que o usuário configure a antecedência do alerta (ex.: 1 dia, 3 horas) por aviso ou como preferência geral. |

## Regras de Negócio (RN)

| ID | Descrição |
|---|---|
| RN01 | O email do usuário deve ser único no sistema; não é permitido cadastrar dois usuários com o mesmo email. |
| RN02 | Nome, email e senha são obrigatórios no cadastro. |
| RN03 | O email deve seguir um formato válido. |
| RN04 | A senha deve ter no mínimo 8 caracteres e ser armazenada de forma criptografada (hash com bcrypt ou Argon2), nunca em texto puro. |
| RN05 | Cada aviso pertence a um único usuário, e este só pode visualizar, editar, concluir ou excluir seus próprios avisos. |
| RN06 | Nome e data limite do aviso são obrigatórios; o detalhamento pode ser opcional. |
| RN07 | O nome do aviso deve ter limite de caracteres (ex.: 100) e o detalhamento também (ex.: 1000). |
| RN08 | Na criação, a data limite não pode ser anterior à data/hora atual. |
| RN09 | Todo aviso é criado com o status inicial "pendente". |
| RN10 | Um aviso é considerado "próximo do prazo" quando a diferença entre a data limite e a data atual for menor ou igual ao período de antecedência configurado (padrão sugerido: 24 horas). |
| RN11 | Um aviso é considerado "atrasado" quando a data limite já passou e ele não foi marcado como concluído. |
| RN12 | Um aviso concluído não gera mais notificações nem alertas de atraso, independentemente da data limite. |
| RN13 | Ao concluir um aviso, o sistema deve registrar a data e hora da conclusão. |
| RN14 | Se a data limite de um aviso atrasado for alterada para uma data futura, o status deve ser recalculado. |
| RN15 | Rotas de avisos e de perfil só podem ser acessadas por usuários autenticados; requisições sem token válido devem retornar erro 401. |
| RN16 | O token de autenticação deve ter tempo de expiração definido (ex.: 1 a 24 horas). |
| RN17 | Ao excluir uma conta, todos os avisos do usuário devem ser excluídos em cascata. |
| RN18 | Datas devem ser armazenadas em UTC e convertidas para o fuso do usuário no front-end. |
