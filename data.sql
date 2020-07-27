CREATE TABLE IF NOT EXISTS `hacknew`.`tags` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;
INSERT INTO `hacknews`.`tags` (`id`, `name`) VALUES ('1', 'Angular');
INSERT INTO `hacknews`.`tags` (`id`, `name`) VALUES ('2', 'Java');
INSERT INTO `hacknews`.`tags` (`id`, `name`) VALUES ('3', 'Mysql');
INSERT INTO `hacknews`.`tags` (`id`, `name`) VALUES ('4', 'Hibernate');
INSERT INTO `hacknews`.`tags` (`id`, `name`) VALUES ('5', 'springboot');
