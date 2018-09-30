CREATE SCHEMA `products` ;

CREATE TABLE `products`.`product` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `products`.`product_price` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `value` VARCHAR(45) NULL,
  `currency_code` VARCHAR(45) NULL,
  `product_id` BIGINT NULL,
  PRIMARY KEY (`id`));
  
  ALTER TABLE `products`.`product_price` 
	ADD INDEX `product_id_idx` (`product_id` ASC);
	ALTER TABLE `products`.`product_price` 
	ADD CONSTRAINT `fk_product_id`
  FOREIGN KEY (`product_id`)
  REFERENCES `products`.`product` (`id`)
  ON DELETE NO ACTION
  ON UPDATE CASCADE;
  