CREATE DATABASE  IF NOT EXISTS `provadb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `provadb`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: provadb
-- ------------------------------------------------------
-- Server version	5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alternativas`
--

DROP TABLE IF EXISTS `alternativas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alternativas` (
  `ID_alternativas` int(11) NOT NULL AUTO_INCREMENT,
  `alt1` varchar(200) DEFAULT NULL,
  `esta_correta1` bit(1) DEFAULT NULL,
  `alt2` varchar(200) DEFAULT NULL,
  `esta_correta2` bit(1) DEFAULT NULL,
  `alt3` varchar(200) DEFAULT NULL,
  `esta_correta3` bit(1) DEFAULT NULL,
  `alt4` varchar(200) DEFAULT NULL,
  `esta_correta4` bit(1) DEFAULT NULL,
  `alt5` varchar(200) DEFAULT NULL,
  `esta_correta5` bit(1) DEFAULT NULL,
  `FK_questao` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_alternativas`),
  KEY `FK_questao` (`FK_questao`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alternativas`
--

LOCK TABLES `alternativas` WRITE;
/*!40000 ALTER TABLE `alternativas` DISABLE KEYS */;
INSERT INTO `alternativas` VALUES (26,'ecferc','','erver','\0',NULL,NULL,NULL,NULL,NULL,NULL,60),(27,'snciosd','','sdcn','\0','sdcj','\0',NULL,NULL,NULL,NULL,61),(28,'fewff3','\0','f34f','','f34fe','\0','wef','\0',NULL,NULL,62),(29,'vsfd','\0','23r3','','f34fe343','\0','tg4g','\0','wef42','\0',63),(30,'a','','b','\0','c','\0','d','\0','e','\0',64),(31,'f','\0','g','\0','h','','i','\0','j','\0',65),(32,'a','\0','b','\0','c','','d','\0','e','\0',66),(33,'número de entradas mapeadas por entidade atribuída.','\0','número de entidades ordenadas no mapeamento de um conjunto de relacionamentos primários.','\0','número de mapeamentos ao qual se associa uma relação de cardinalidade.','\0','número de entidades ao qual outra entidade pode ser associada por um conjunto de relacionamento.','','mapeamento de entidades ao qual outra entidade pode ser mapeada por um conjunto de atributos numéricos.','\0',67),(34,'start, from, to.','\0','select, from, where.','','select, up, what.','\0','start, from, who.','\0','select, initial, final.','\0',68),(35,'relacionamentos - entidades','\0','atributos - relacionamentos','','entidades - relacionamentos','\0','entidades - atributos','\0','atributos – entidades','\0',69),(36,'Todas são verdadeiras.','\0','Todas são falsas.','\0','Somente um item é verdadeiro','\0','Somente dois itens são verdadeiros','','Nenhuma das alternativas','\0',70),(37,'V - F - F','\0','V - V - F','','F - V - V','\0','F - F - V','\0','nenhuma das alternativas','\0',71),(38,'Alicate de bico técnico','\0','Alicate de trançar','\0','Alicate de crimpar','','Alicate de conexão de pares','\0','Alicate de corte','\0',74),(39,'wfwefwe','\0','ewvwvw','\0','ewwevwe','','wvwrvwr','\0','wvrdwvw','\0',74),(40,'Alicate de bico técnico','\0','Alicate de trançar','\0','Alicate de crimpar','','Alicate de conexão de pares','\0','Alicate de corte','\0',75),(41,'Cross-Over','\0','Straight Through','','Switched-Over','\0','Linear-Link','\0','Cross-Link','\0',76);
/*!40000 ALTER TABLE `alternativas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disciplina`
--

DROP TABLE IF EXISTS `disciplina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `disciplina` (
  `ID_disciplina` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_disciplina`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disciplina`
--

LOCK TABLES `disciplina` WRITE;
/*!40000 ALTER TABLE `disciplina` DISABLE KEYS */;
INSERT INTO `disciplina` VALUES (40,'aleatoria'),(41,'Banco de Dados'),(42,'aleatoria'),(43,'Redes de Computadores I'),(44,'Banco de Dados');
/*!40000 ALTER TABLE `disciplina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questoes`
--

DROP TABLE IF EXISTS `questoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `questoes` (
  `ID_questao` int(11) NOT NULL AUTO_INCREMENT,
  `enunciado` text NOT NULL,
  `imagem` longtext,
  `tipo` enum('Verdadeiro e Falso','Discursiva','Alternativa') NOT NULL,
  `tema` varchar(100) DEFAULT NULL,
  `nota` varchar(4) DEFAULT NULL,
  `justificativa` longtext,
  `FK_disciplina` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_questao`),
  KEY `FK_disciplina` (`FK_disciplina`),
  CONSTRAINT `questoes_ibfk_1` FOREIGN KEY (`FK_disciplina`) REFERENCES `disciplina` (`ID_disciplina`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questoes`
--

LOCK TABLES `questoes` WRITE;
/*!40000 ALTER TABLE `questoes` DISABLE KEYS */;
INSERT INTO `questoes` VALUES (67,'O que significa o termo cardinalidade de mapeamento entidade relacionamento?',NULL,'Alternativa','Cardinalidade','0.5',NULL,41),(68,'As três cláusulas de que são utilizadas em uma consulta SQL são:',NULL,'Alternativa','Consulta SQL','0.5',NULL,41),(69,'No modelo de Entidade - Relacionamento utiliza-se um losango para representar __ e um retângulo para representar ___. As lacunas são preenchidas, correta e respectivamente, por:',NULL,'Alternativa','Entidade e Relacionamento','0.5',NULL,41),(70,'Analise as proposições abaixo.\nI)	O comando Delete é utilizado para remoção de uma tupla de uma determinada tabela;\nII)	O comando Insert é utilizado para adicionar uma nova coluna a uma determinada tabela;\nIII)	O comando Drop pode ser utilizado para remover uma coluna de uma determinada tabela.\nIV)	O comando Alter pode ser utilizado para alterar o nome de uma coluna de uma determinada tabela.\nMarque a opção correta referente as proposições acima.',NULL,'Alternativa','DDL','0.5',NULL,41),(71,'Quanto aos diversos comandos da linguagem SQL (Structured Query Language), analise as afirmativas abaixo, dê valores Verdadeiro ou Falso e assinale a alternativa que apresenta a sequência correta de cima para baixo.\n(  ) A palavra-chave da DQL (Data Control Language) são: SELECT.\n(   ) Um dos comandos do DML (Data Manipulation Language) é o UPDATE.\n(   ) O comando básico da DDL (Data Definition Language) são: Alter.',NULL,'Alternativa','Comandos SQL','0.5',NULL,41),(72,'[será avaliada a capacidade de construção textual do aluno, considerando os aspectos didáticos de um texto, coerência, coesão e clareza].\nEscreve os comandos SQL que criam as seguintes tabelas]\n\nEmpregado (RG, sexo, dt_nasc, pnome, unome, rua, cidade, estado, salario, dnum, supRG)\n	 supRG references Empregado(RG)\n	dnum references departamento(dnum)\n\nDepartamento (dnum, dnome, gerRG, dt_inicio) \n	gerRG references Empregado(rg)\n',NULL,'Discursiva','DDL','2','CREATE TABLE empregado(\n	RG number primary key,\n	sexo char not null,\n	dt_nasc date not null,\n	pnome varchar not null,\n	unome varchar not null,\n	rua varchar not null,\n	cidade varchar not null,\n	estado varchar not null,\n	salario number not null,\n	dnum number,\n	supRG number,\n	FOREIGN KEY (supRG),\n	REFERENCES empregado (RG),\n	FOREIGN KEY (dnum),\n	REFERENCES departamento(dnum)\n);\n\nCREATE TABLE departamento(\n	dnum number primary key,\n	dnome varchar not null,\n	gerRG number,\n	dt_inicio date not null,\n	FOREIGN KEY (gerRG),\n	REFERENCES empregado (RG)\n);',41),(73,'[será avaliada a capacidade de construção textual do aluno, considerando os aspectos didáticos de um texto, coerência, coesão e clareza].\nCrie um script SQL que retorne as informações a seguir:\n\na)	Retorne o nome completo, endereço e a cidade dos empregados de todos empregados  (0,5 ponto)\nb)	Retorne o RG e o salario dos empregados com salário maior que 3000,00 e a cidade igual a “São Luís” (0,75 ponto)\nc)	Retorne o nome dos empregados supervisionados pelo empregado com RG 987654321 (1 ponto)\n',NULL,'Discursiva','Consulta SQL','2.5','a)\n	SELECT pnome, unome, dt_nasc, cidade\n	FROM empregado\n	WHERE dnum = 3;\n\nb)\n	SELECT RG, salario\n	FROM empregado\n	WHERE salario < 3000 and cidade = \'Fortaleza\';\n\nc)\n	SELECT pnome, unome\n	FROM empregado\n	WHERE supRG = 123456789;',41),(75,'Atualmente o cabo mais utilizado em redes de computadores é o cabo de par trançado. Para montarmos fisicamente um cabo desse tipo haverá  necessidade da ferramenta intitulada tecnicamente de:',NULL,'Alternativa','Cabos de rede','1,00',NULL,43),(76,'Paulo deseja ligar dois computadores com uso de um concentrador. Resolveu utilizar um tipo de cabo par trançado para interligar a saida de dados dos dois micros as portas de dados do switch. O tipo de cabo utilizado por Paulo é conhecido como:',NULL,'Alternativa','Cabos de rede','1,00',NULL,43),(77,'dfbdb','C:\\Users\\jacks\\OneDrive\\Documentos\\BancodeQuestões\\Imagens\\Questao_logo.jpg','Discursiva','Entidade e Relacionamento','2,00','dhbfdx',44);
/*!40000 ALTER TABLE `questoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'provadb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-11 12:33:32
