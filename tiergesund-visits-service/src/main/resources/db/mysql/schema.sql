CREATE DATABASE IF NOT EXISTS tiergesund;
GRANT ALL PRIVILEGES ON tiergesund.* TO tg@localhost IDENTIFIED BY 'tg';

USE tiergesund;

CREATE TABLE IF NOT EXISTS visits (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  pet_id INT(4) UNSIGNED NOT NULL,
  visit_date DATE,
  description VARCHAR(8192),
  FOREIGN KEY (pet_id) REFERENCES pets(id)
) engine=InnoDB;
