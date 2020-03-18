DROP TABLE IF EXISTS user;

CREATE TABLE user (
	id INT AUTO_INCREMENT PRIMARY KEY,
	user VARCHAR(50) NOT NULL,
	name VARCHAR(100) NOT NULL,
	email VARCHAR(50) NOT NULL

);

INSERT INTO user (user, name, email) VALUES(
	'adal' , 'Adalberto Hernandez', 'adal@mail.com'
);