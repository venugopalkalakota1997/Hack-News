SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

CREATE SCHEMA IF NOT EXISTS `hacknews` DEFAULT CHARACTER SET utf8 ;
USE `hacknews` ;

CREATE TABLE IF NOT EXISTS `hacknews`.`tags` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;
INSERT INTO `hacknews`.`tags` (`id`, `name`) VALUES ('1', 'Angular');
INSERT INTO `hacknews`.`tags` (`id`, `name`) VALUES ('2', 'Java');
INSERT INTO `hacknews`.`tags` (`id`, `name`) VALUES ('3', 'Mysql');
INSERT INTO `hacknews`.`tags` (`id`, `name`) VALUES ('4', 'Hibernate');
INSERT INTO `hacknews`.`tags` (`id`, `name`) VALUES ('5', 'springboot');