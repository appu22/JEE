SELECT * FROM jee.insta_register_table;
CREATE TABLE `jee`.`insta_register_table` (
  `R_ID` INT NOT NULL AUTO_INCREMENT,
  `R_NAME` VARCHAR(45) NOT NULL,
  `R_LAST_NAME` VARCHAR(45) NOT NULL,
  `R_MOBILE_NO` VARCHAR(45) NOT NULL,
  `R_GENDER` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`R_ID`));
