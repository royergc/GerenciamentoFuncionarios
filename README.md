# Projeto de Férias 1 - Sistema de Gerenciamento de Funcionários

Esse sistema desenvolvido em Java visa implementar um “Sistema de Gerenciamento de Funcionários”. 
O sistema é um projeto educacional e visa praticar os seguintes conceitos básicos da linguagem Java:

- Classes e Objetos;
- Heranças;
- Polimorfismo;
- Interfaces.

### Requisitos
O sistema de gerenciamento de funcionários deve implementar a gestão de funcionários de uma empresa fictícia.
A empresa possui os seguintes cargos:
- Gerente Geral
- Gerente de departamento
- Líder técnico
- Colaborador

O sistema irá apresentar o seguinte menu em interface de linha de comando:
- Adicionar funcionário
- Ver detalhes de um funcionário
- Demitir funcionário (Neste caso o funcionário não deverá ser apagado)
- Atualizar informações de um funcionário
- Listar todos os funcionários
- Listar somente os funcionários trabalhando
- Listar somente os funcionários demitidos
- Sair

## Decisões de projeto

Decidi criar as seguintes classes 
- Pessoa:  visível para toda a aplicação, pois é a que terá os dados iniciais de todas as pessoas que virão a ser funcionários da empresa
- Funcionário: classe abstrata, herda os dados pessoais de Pessoa e adiciona dados básicos relativos à empresa, como matricula, email, salario, cargo, dataAdmissao e se está ativo na empresa (inativo signifca que foi demitido, mas os dados continuarão no sistema, conforme requisito)
- Colaborador: herda de funcionário, tem associado a ele um LiderTecnico.
- LiderTecnico: herda de funcionário.
- GerenteDepartamento: herda de funcionário e implementa a interface Gerente, que define os comportamentos de alocar e remanejar os funcionários nos Departamentos, promover e demitir funcionários
- GerenteGeral: herda de funcionário e também implementa a interface Gerente, implementando os mesmos comportamentos
- GestorFuncionarios: implementa a interface RH, que define os comportamentos de adicionar funcionario na empresa, alterar os dados do funcionario, aumentar salário do funcionario, listar todos os funcionarios, listar os funcionarios ativos e os funcionarios inativos. 
- Departamento: possui um GerenteDepartamento e uma lista de Funcionários que fazem parte do departamento, com os métodos para adicionar e remover funcionários desse departamento.
- InterfaceCLI: responsável por rodar a aplicação e fazer a interface com o usuário. Ela interage com o sistema através das interfaces do RH e do Gerente. 

Criei um diagrama de classes simplificado para tentar ilustrar a arquitetura do sistema e o relacionamento entre as classes do projeto:

