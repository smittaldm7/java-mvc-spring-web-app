-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.38-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for jee-mvc
CREATE DATABASE IF NOT EXISTS `jee-mvc` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `jee-mvc`;

-- Dumping structure for table jee-mvc.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

-- Dumping data for table jee-mvc.customer: ~16 rows (approximately)
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`id`, `name`, `age`) VALUES
	(1, 'sidharth', 12),
	(2, 'Pagoda', 34),
	(3, 'pulisic', 28),
	(4, 'pogba', 28),
	(5, 'rashford', 28),
	(6, 'loftus-cheek', 28),
	(7, 'gini', 28),
	(8, 'sfsdf', 22),
	(9, 'fdsdf', 323),
	(10, 'qweq', 132),
	(11, 'gwen', 132),
	(12, 'lara', 132),
	(13, 'gigi', 32),
	(14, 'derek', 37),
	(15, 'trevon', 17),
	(16, 'trevon', 17);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
