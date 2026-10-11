# Notice Board

O projeto consiste no desenvolvimento de uma plataforma web voltada à organização de tarefas e afazeres por meio de um quadro de avisos

## Objetivo

Oferecer ao usuário um quadro pessoal de avisos com data limite, funcionando como agenda inteligente que alerta quando o prazo está próximo e sinaliza o atraso até que a atividade seja concluída

## Levantamento de Requisitos

## Requisitos Funcionais (RF)

| ID | Descrição                                                                                                                                                 |
|---|-----------------------------------------------------------------------------------------------------------------------------------------------------------|
| RF01 | O sistema deve permitir o cadastro de um novo usuário informando nome, email e senha.                                                                     |
| RF02 | O sistema deve permitir que o usuário cadastrado realize login com email e senha.                                                                         |
| RF04 | O sistema deve permitir que o usuário realize logout.                                                                                                     |
| RF05 | O sistema deve permitir que o usuário consulte e edite seus dados de perfil (nome, email e senha).                                                        |
| RF06 | O sistema deve permitir que o usuário exclua sua conta, removendo também seus avisos.                                                                     |
| RF07 | O sistema deve permitir que o usuário autenticado crie um aviso informando nome, detalhamento e data limite.                                              |
| RF08 | O sistema deve listar todos os avisos do usuário autenticado, com suporte a ordenação por data limite.                                                    |
| RF09 | O sistema deve permitir a consulta dos detalhes de um aviso específico.                                                                                   |
| RF10 | O sistema deve permitir a edição de nome, detalhamento e data limite de um aviso.                                                                         |
| RF11 | O sistema deve permitir a exclusão de um aviso.                                                                                                           |
| RF12 | O sistema deve permitir marcar um aviso como concluído.                                                                                                   |
| RF13 | O sistema deve permitir desfazer a conclusão de um aviso.                                                                                                 |
| RF14 | O sistema deve permitir filtrar avisos por situação (pendente, próximo do prazo, atrasado, concluído).                                                    |
| RF15 | O sistema deve calcular automaticamente o status de cada aviso (pendente, próximo do prazo, atrasado, concluído) com base na data limite e na data atual. |
| RF17 | O sistema deve retornar, em cada aviso, informações auxiliares como tempo restante até o prazo ou tempo de atraso.                                        |
| RF18 | O sistema deve continuar sinalizando como "atrasado" todo aviso vencido e não concluído, até que seja marcado como concluído                              |
| RF19 | O sistema deve permitir que o usuário configure a antecedência do alerta (ex.: 1 dia, 3 horas) por aviso ou como preferência geral.                       |

