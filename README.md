# Notice Board

O projeto consiste no desenvolvimento de uma plataforma web voltada à comunicação acadêmica entre professores e alunos, 
por meio de um sistema de quadro de avisos organizado por turma.

## Objetivo

Desenvolver uma plataforma simples e funcional que centralize a comunicação de avisos acadêmicos entre professores e alunos, 
otimizando o fluxo de informações sobre atividades pendentes, com controle de acesso por perfil de usuário e organização por turma.

## Levantamento de Requisitos

### Requisitos Funcionais
| ID    | Descrição                                                                                                                                                                                          |
|-------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| RF001 | O sistema deve permitir o cadastro de alunos (nome, e-mail, senha, dados básicos)                                                                                                                  | 
| RF002 | O sistema deve permitir o cadastro de professores (nome, e-mail, senha, dados básicos)                                                                                                             |
| RF003 | O sistema deve permitir a criação de turmas                                                                                                                                                        |
| RF004 | Ao criar uma turma, o sistema deve gerar automaticamente um quadro de avisos vinculado a ela                                                                                                       |
| RF005 | O sistema deve permitir que um professor seja associado a uma ou mais turmas                                                                                                                       |
| RF006 | O sistema deve permitir que um aluno seja associado à sua turma principal e, opcionalmente, a turma(s) adicional(is) somente em caráter de dependência/reposição                                   |
| RF007 | O sistema deve permitir que professores cadastrem avisos (título, conteúdo, data, turma destino)                                                                                                   |
| RF008 | O sistema deve permitir que professores editem ou excluam avisos que tenham cadastrado                                                                                                             |
| RF009 | O sistema deve exibir aos alunos os avisos de todas as turmas às quais estão vinculados (principal e de dependência, quando houver)                                                                |
| RF010 | O sistema deve impedir que alunos cadastrem, editem ou excluam avisos (permissão somente leitura)                                                                                                  |
| RF011 | O sistema deve enviar automaticamente uma notificação por e-mail ao(s) aluno(s) da turma sempre que um novo aviso for publicado                                                                    |
| RF012 | O sistema deve validar o e-mail cadastrado pelo aluno antes de considerá-lo apto a receber notificações                                                                                            |
| RF013 | O sistema deve permitir autenticação de alunos e professores                                                                                                                                       |
| RF014 | O sistema deve diferenciar os níveis de acesso/permissão entre aluno e professor                                                                                                                   |
| RF015 | O sistema deve permitir a visualização do histórico de avisos de uma turma enquanto o semestre estiver vigente                                                                                     |
| RF016 | O sistema deve permitir que professores editem ou excluam avisos já publicados, sem necessidade de reenvio de notificação por e-mail                                                               |
| RF017 | O sistema deve excluir automaticamente todos os avisos de uma turma ao atingir a data de fim de semestre configurada manualmente (com base no calendário acadêmico), sem manter registro histórico |

### Regras de Negócio
| ID   | Descrição                                                                                                                            |
|------|--------------------------------------------------------------------------------------------------------------------------------------|
| RN01 | Um quadro de avisos é sempre criado junto com a turma e não pode existir de forma independente                                       |
| RN02 | Um aviso pertence a uma única turma (e, portanto, a um único quadro de avisos)                                                       |
| RN03 | Um professor pode publicar avisos em qualquer turma à qual esteja vinculado                                                          |
| RN04 | Um aluno é vinculado, por padrão, a apenas uma turma; o vínculo a uma segunda turma só é permitido em casos de dependência/reposição |
| RN05 | O e-mail de notificação deve ser enviado para o e-mail informado no cadastro do aluno                                                |
| RN06 | Avisos servem apenas como notificação textual da existência de uma atividade pendente, sem suporte a anexos                          |
| RN07 | Ao término do semestre, todos os avisos vinculados às turmas daquele período devem ser excluídos do sistema                          |
| RN08 | A edição/exclusão de um aviso não gera reenvio de e-mail aos alunos                                                                  |
| RN09 | O perfil de administrador (desenvolvedor) possui acesso irrestrito à gestão da plataforma                                            |


