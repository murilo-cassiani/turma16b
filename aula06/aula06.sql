-- sintax utilizada para criar database do cliente no sgbd
create database itau;
-- sintax para deixar o database em uso
use itau;
-- criar uma tabela
create table itau.clientes(
	codigo_cliente integer not null primary key
    ,nome_cliente varchar(50) not null
    ,idade_cliente integer(3) not null
    ,email_cliente varchar(80) not null
);
-- renomear tabela
rename table itau.clientes to itau.clientes;
-- visualizar os campos da tabela
describe itau.clientes;
-- inserir registros
insert into itau.clientes (codigo_cliente, nome_cliente, idade_cliente, email_cliente)
	values 
		(1, "Adalberto", 28, "adalberto@unibanco.com")
        ,(2, "Ana Paula", 20, "ana.paula@unibanco.com.br")
        ,(3, "Alexandre Pugles", 22, "alexandre.pugles@unibanco.com.br")
        ,(4, "Isabela", 21, "isabela@unibanco.com.br")
        ,(5,"Daniel Wu", 25, "daniel.wu@unibanco.com.br");
-- visualizar registros da tabela
select * from itau.clientes;
-- obter filtros de registros
select *
	from itau.clientes
    where idade_cliente = 19;
-- criar um range / faixa de dados em uma tabela
select *
	from itau.clientes
    where idade_cliente >= 18
		and idade_cliente <= 25
	order by idade_cliente;
select *
	from itau.clientes
    where idade_cliente between 18 and 25
	order by idade_cliente;
-- menor resultado do campo escolhido do tipo numérico ou data
select min(idade_cliente) as menor_idade
	from itau.clientes;
select *
	from itau.clientes
    where idade_cliente = 19;
-- subselect
select *
	from itau.clientes
    where idade_cliente = (select min(idade_cliente) as menor_idade
			from itau.clientes
		);
-- max
select *
	from itau.clientes
    where idade_cliente = (select max(idade_cliente) as menor_idade
			from itau.clientes
		);
-- filtrar registros com texto
select 
		nome_cliente
		,idade_cliente
    from itau.clientes
    where nome_cliente like "Ana%";
-- contando registros na estrutura do bd
select count(*) as total_registros
	from itau.clientes;
-- inserir um novo campo na estrutura da nossa tabela
alter table itau.clientes add endereco_cliente varchar(50) not null;
-- excluir um campo
alter table itau.clientes drop endereco;
-- renomear um campo
alter table itau.clientes rename column endereco_cliente to endereco_cliente;
-- atualizar um registro em um campo específico
update itau.clientes
	set endereco_cliente = "Rua Tito"
    where codigo_cliente = 1;
update itau.clientes
	set endereco_cliente = "Rua Caio Graco"
    where nome_cliente = "Ana Paula";
update itau.clientes
	set endereco_cliente = "Alterar endereco cliente"
    where endereco_cliente = "";
-- alteração da estrutura do campo - ele é redeclarado, praticamente
alter table itau.clientes change endereco_cliente endereco_cliente varchar(20) not null;
-- fazer um bkp
create table itau.bkp_clientes select * from itau.clientes;
-- excluir registros de uma tabela
delete from itau.clientes;
-- subir backup
insert itau.clientes (codigo_cliente, nome_cliente, idade_cliente, email_cliente, endereco_cliente)
	select codigo_cliente, nome_cliente, idade_cliente, email_cliente, endereco_cliente from itau.bkp_clientes;
-- sintaxe para se excluir registros de uma tabela com filtro
delete from itau.clientes where idade_cliente >= 50;
-- sintaxe para subir o backup com base na faixa de registros que foram excluídos
insert itau.clientes (codigo_cliente,nome_cliente,idade_cliente,email_cliente,endereco_cliente)
	select 
			codigo_cliente
			,nome_cliente
			,idade_cliente
			,email_cliente
			,endereco_cliente
		from itau.bkp_clientes 
        where idade_cliente >= 50;
-- novo db
create database unibanco;
-- criando tabela como base outra tabela
create table unibanco.clientes select * from itau.clientes;
-- apagar todas as tabelas, registros e o banco de dados
drop database itau;
-- começando de novo
create database itau;
use itau;
-- criando uma super tabela de clientes do Itaú
create table itau.clientes (
	codigo_cliente integer not null auto_increment
    ,nome_cliente varchar(50) not null
    ,cpf_cliente char(11) not null
    ,endereco_cliente varchar(60) not null
    ,bairro_cliente varchar(40) not null
    ,cidade_cliente varchar(40) not null
    ,estado_cliente char(2) not null
    ,cep_cliente char(8) not null
    ,ddd_cliente integer(3) not null
    ,telefone_cliente bigint not null
    ,ag_cliente char(4)
    ,conta_corrente_cliente char(8) not null
    ,digito_verific_cliente integer(1)
    ,email_contato_cliente varchar(80) not null
    ,data_cadastro_cliente datetime
    ,primary key (codigo_cliente, cpf_cliente)
);

describe itau.clientes;

insert into itau.clientes (
	nome_cliente
	,cpf_cliente
	,endereco_cliente
	,bairro_cliente
	,cidade_cliente
	,estado_cliente
	,cep_cliente
	,ddd_cliente
	,telefone_cliente
	,ag_cliente
	,conta_corrente_cliente
	,digito_verific_cliente
	,email_contato_cliente
	,data_cadastro_cliente
)
	values (
		"Murilo Cassiani"
        ,"41404679839"
        ,"Rua Joaquim Novaes"
        ,"Centro"
        ,"Campinas"
        ,"SP"
        ,"13015140"
        ,19
        ,992992008
        ,"2427"
        ,"21563"
        ,5
        ,"murilo.cassiani@itau-unibanco.com.br"
        ,now()
    );
    
select * from itau.clientes;

-- consolidação dos dados para migrar em outra tabela
insert into itau.clientes (
	nome_cliente
	,cpf_cliente
	,endereco_cliente
	,bairro_cliente
	,cidade_cliente
	,estado_cliente
	,cep_cliente
	,ddd_cliente
	,telefone_cliente
	,ag_cliente
	,conta_corrente_cliente
	,digito_verific_cliente
	,email_contato_cliente
	,data_cadastro_cliente
)
	select 
			nome_cliente
			,"Atualizar"
			,endereco_cliente
			,"Atualizar"
			,"Atualizar"
			,"XX"
			,"0"
			,0
			,0
			,"0"
			,"0"
			,0
			,email_cliente
			,now()
		from unibanco.clientes;
-- criando uma tabela para gerar cálculos
create table itau.vendas (
	codigo_venda integer not null auto_increment primary key
    ,produto_vendido varchar(40) not null
    ,quantidade_vendida integer not null
    ,valor_unitario_vendido decimal(8,2) not null
    ,nome_vendedor varchar(50) not null
);

-- inserindo registros na tabela de vendas para cálculo
insert into itau.vendas (
	produto_vendido
    ,quantidade_vendida
    ,valor_unitario_vendido
    ,nome_vendedor
)
	values
		("Mouse",20,28.50,"Ricardo")
        ,("Teclado",38,38,"Marcos")
        ,("Monitor",15,450.99,"Cristina")
        ,("CPU",10,630,"Cristina")
        ,("PenDrive",15,35,"Marcos")
;

-- criando cálculos em colunas com comando select
SELECT
	produto_vendido
    ,quantidade_vendida
    ,valor_unitario_vendido
    ,(quantidade_vendida * valor_unitario_vendido) AS total_vendido
    ,nome_vendedor
  FROM itau.vendas
;
-- criando uma soma de todos os valores na tabela e vendo o retorno no select
SELECT
    SUM(quantidade_vendida * valor_unitario_vendido) AS total_geral
  FROM itau.vendas
;
-- 
SELECT
	nome_vendedor
    ,SUM(quantidade_vendida * valor_unitario_vendido) AS total_vendido
  FROM itau.vendas
  GROUP BY nome_vendedor
;

SELECT
	idade_cliente
    ,COUNT(*) AS qtd_pessoas
  FROM unibanco.clientes
  WHERE idade_cliente BETWEEN 18 AND 25
  GROUP BY idade_cliente
  ORDER BY idade_cliente
;

USE itau;

CREATE TABLE `produtos` (
	`codigo_produto` INT NOT NULL AUTO_INCREMENT,
	`nome_produto` varchar(50) NOT NULL,
	`valor_produto` DECIMAL(8,2) NOT NULL,
	`codigo_marca` INT NOT NULL,
	PRIMARY KEY (`codigo_produto`)
);

CREATE TABLE `marcas` (
	`codigo_marca` INT NOT NULL AUTO_INCREMENT,
	`nome_marca` varchar(50) NOT NULL,
	PRIMARY KEY (`codigo_marca`)
);

ALTER TABLE `produtos` ADD CONSTRAINT `produtos_fk0` FOREIGN KEY (`codigo_marca`) REFERENCES `marcas`(`codigo_marca`);

INSERT INTO itau.marcas (nome_marca)
  VALUES
	("Brastemp")
    ,("Cadence")
    ,("Samsung")
    ,("LG")
    ,("HP")
;

SELECT * FROM itau.marcas;

INSERT INTO itau.produtos (
	nome_produto
    ,valor_produto
    ,codigo_marca
)
  VALUES 
	("Geladeira", 2280, 1)
    ,("Fogão", 1800, 1)
    ,("Microondas", 680, 1)
    ,("Liquidificador", 89.89, 2)
    ,("Batedeira", 280, 2)
    ,("TV", 1750, 3)
    ,("Celular", 1600, 3)
;

SELECT * FROM itau.produtos;
-- não exclui, pois tem registro relacionado
DELETE FROM itau.marcas;

SELECT
	p.codigo_produto
    ,p.nome_produto
    ,p.valor_produto
	,m.nome_marca
  FROM itau.produtos AS p
  RIGHT JOIN itau.marcas AS m 
    ON p.codigo_marca = m.codigo_marca
;

INSERT INTO itau.marcas (nome_marca)
  VALUES
	("CCE")
    ,("Gradiente")
    ,("Kodak")
;

SELECT * FROM itau.bkp_marcas;

INSERT INTO itau.marcas (nome_marca)
  VALUES
	("GM")
    ,("Fiat")
;

SELECT * FROM itau.bkp_marcas;

call itau.create_bkp_tables();

SELECT
	p.codigo_produto
    ,p.nome_produto
    ,p.valor_produto
	,m.nome_marca
  FROM itau.produtos AS p
  RIGHT JOIN itau.marcas AS m 
    ON p.codigo_marca = m.codigo_marca
;

DELETE FROM itau.marcas
  WHERE nome_marca IN ("GM", "Fiat")
;

SELECT
	m.nome_marca
    ,COUNT(p.codigo_produto) AS qtd_produtos
    ,SUM(p.valor_produto) AS valor_total
  FROM itau.produtos AS p
  RIGHT JOIN itau.marcas AS m 
    ON p.codigo_marca = m.codigo_marca
  GROUP BY m.nome_marca
  ORDER BY qtd_produtos DESC
;