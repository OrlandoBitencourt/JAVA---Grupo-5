-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 12-Mar-2021 às 23:39
-- Versão do servidor: 10.4.13-MariaDB
-- versão do PHP: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `dbgrupo05`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `evento`
--

CREATE TABLE `evento` (
  `evento_id` int(11) NOT NULL,
  `evento_nome` text NOT NULL,
  `evento_inscricoes` int(11) DEFAULT NULL,
  `evento_inicio` text NOT NULL,
  `evento_fim` text NOT NULL,
  `evento_etapa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `evento_cafe`
--

CREATE TABLE `evento_cafe` (
  `evento_cafe_id` int(6) UNSIGNED NOT NULL,
  `evento_id` int(6) NOT NULL,
  `sala_cafe_id` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `evento_sala`
--

CREATE TABLE `evento_sala` (
  `evento_sala_id` int(6) UNSIGNED NOT NULL,
  `evento_id` int(6) NOT NULL,
  `sala_id` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `pessoa_id` int(11) NOT NULL,
  `pessoa_nome` text NOT NULL,
  `pessoa_sobrenome` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa_evento`
--

CREATE TABLE `pessoa_evento` (
  `pessoa_evento_id` int(6) UNSIGNED NOT NULL,
  `pessoa_id` int(6) NOT NULL,
  `evento_id` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `sala`
--

CREATE TABLE `sala` (
  `sala_id` int(11) NOT NULL,
  `sala_nome` text NOT NULL,
  `sala_lotacao` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `sala_cafe`
--

CREATE TABLE `sala_cafe` (
  `sala_cafe_id` int(11) NOT NULL,
  `sala_cafe_nome` text NOT NULL,
  `sala_cafe_lotacao` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `evento`
--
ALTER TABLE `evento`
  ADD UNIQUE KEY `evento_id` (`evento_id`);

--
-- Índices para tabela `evento_cafe`
--
ALTER TABLE `evento_cafe`
  ADD PRIMARY KEY (`evento_cafe_id`),
  ADD KEY `evento_id` (`evento_id`),
  ADD KEY `sala_cafe_id` (`sala_cafe_id`);

--
-- Índices para tabela `evento_sala`
--
ALTER TABLE `evento_sala`
  ADD PRIMARY KEY (`evento_sala_id`),
  ADD KEY `sala_id` (`sala_id`),
  ADD KEY `evento_id` (`evento_id`);

--
-- Índices para tabela `pessoa`
--
ALTER TABLE `pessoa`
  ADD UNIQUE KEY `pessoa_id` (`pessoa_id`);

--
-- Índices para tabela `pessoa_evento`
--
ALTER TABLE `pessoa_evento`
  ADD PRIMARY KEY (`pessoa_evento_id`),
  ADD KEY `pessoa_id` (`pessoa_id`),
  ADD KEY `evento_id` (`evento_id`);

--
-- Índices para tabela `sala`
--
ALTER TABLE `sala`
  ADD UNIQUE KEY `sala_id` (`sala_id`);

--
-- Índices para tabela `sala_cafe`
--
ALTER TABLE `sala_cafe`
  ADD UNIQUE KEY `sala_cafe_id` (`sala_cafe_id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `evento`
--
ALTER TABLE `evento`
  MODIFY `evento_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `evento_cafe`
--
ALTER TABLE `evento_cafe`
  MODIFY `evento_cafe_id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `evento_sala`
--
ALTER TABLE `evento_sala`
  MODIFY `evento_sala_id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `pessoa_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `pessoa_evento`
--
ALTER TABLE `pessoa_evento`
  MODIFY `pessoa_evento_id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `sala`
--
ALTER TABLE `sala`
  MODIFY `sala_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `sala_cafe`
--
ALTER TABLE `sala_cafe`
  MODIFY `sala_cafe_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `evento_cafe`
--
ALTER TABLE `evento_cafe`
  ADD CONSTRAINT `evento_cafe_ibfk_1` FOREIGN KEY (`evento_id`) REFERENCES `evento` (`evento_id`),
  ADD CONSTRAINT `evento_cafe_ibfk_2` FOREIGN KEY (`sala_cafe_id`) REFERENCES `sala_cafe` (`sala_cafe_id`);

--
-- Limitadores para a tabela `evento_sala`
--
ALTER TABLE `evento_sala`
  ADD CONSTRAINT `evento_sala_ibfk_1` FOREIGN KEY (`sala_id`) REFERENCES `sala` (`sala_id`),
  ADD CONSTRAINT `evento_sala_ibfk_2` FOREIGN KEY (`evento_id`) REFERENCES `evento` (`evento_id`);

--
-- Limitadores para a tabela `pessoa_evento`
--
ALTER TABLE `pessoa_evento`
  ADD CONSTRAINT `pessoa_evento_ibfk_1` FOREIGN KEY (`pessoa_id`) REFERENCES `pessoa` (`pessoa_id`),
  ADD CONSTRAINT `pessoa_evento_ibfk_2` FOREIGN KEY (`evento_id`) REFERENCES `evento` (`evento_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
