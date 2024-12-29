-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : dim. 29 déc. 2024 à 20:14
-- Version du serveur : 10.4.32-MariaDB
-- Version de PHP : 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `javacontrol`
--

-- --------------------------------------------------------

--
-- Structure de la table `test`
--

CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `nom` varchar(125) NOT NULL,
  `categorie` varchar(125) NOT NULL,
  `quantite` varchar(255) NOT NULL,
  `prix` varchar(125) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `test`
--

INSERT INTO `test` (`id`, `nom`, `categorie`, `quantite`, `prix`) VALUES
(1, 'pc', 'hp', '33', '1000'),
(4, 'pc', 'hp', '33', '100'),
(5, 'tele', 'son', '23', '500'),
(6, 'PC PROTABLE', 'Hp', '100', '2000'),
(8, 'PC PROTABLE', 'DELL', '100', '100'),
(10, 'Ecran', 'LG', '45', '300'),
(11, 'imprimante', 'Canon', '15', '700'),
(12, 'clavier', 'Logitech', '55', '150'),
(13, 'souris', 'HP', '60', '50'),
(14, 'routeur', 'TP-Link', '20', '250'),
(15, 'casque', 'Sony', '35', '400'),
(16, 'tablette', 'Samsung', '12', '800'),
(17, 'PC', 'PC', '1', '1900'),
(18, 'PC BUREAU', 'HP', '20', '7000'),
(19, 'Pc bureau', 'Dell I5 5 gen 8Go/1To', '1000', '2660'),
(20, 'Ordinateur HP ', 'i6 5 Gene 16g/1T', '20', '7000');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `Name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`Name`, `email`, `Password`) VALUES
('zakaria', 'zakaria', 'zakaria'),
('zakaria kassemi', 'zakariakassemi@gmail.com', 'zakariakassemi@gmail.com'),
('zakaria ichou', 'zakariaichou@gmail.com', 'zakariaichou@gmail.com'),
('zakaria kassemi', 'zakariakassemi1@gmail.com', 'zakariakassemi1@gmail.com');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `test`
--
ALTER TABLE `test`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
