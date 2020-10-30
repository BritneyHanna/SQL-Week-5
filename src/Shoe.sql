CREATE DATABASE IF NOT EXISTS shoes;
USE shoes;
DROP table if exists shoes;
CREATE table shoes (shoe_id INT not null auto_increment,shoe_name VARCHAR (25),Primary Key (shoe_id));