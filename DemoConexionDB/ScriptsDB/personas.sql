CREATE TABLE `nombreDB`.`personas`
(`id` INT(10) NOT NULL AUTO_INCREMENT , 
`nombre` VARCHAR(30) NOT NULL ,
`edad` INT(3) NOT NULL ,
`profesion` VARCHAR(30) NOT NULL ,
`telefono` VARCHAR(10) NOT NULL ,
PRIMARY KEY (`id`))
ENGINE = InnoDB; 