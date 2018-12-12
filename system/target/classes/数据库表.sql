-- 用户表
create table user(
	id int PRIMARY key auto_increment,
	company varchar (11),
	department int,
	role int,
	username VARCHAR(11),
	name VARCHAR (11),
	phone VARCHAR(11),
	weChat VARCHAR(11),
	weChatName VARCHAR (11),
	enterpriseNumber VARCHAR (11),
	FOREIGN key (department) REFERENCES department (id),
	FOREIGN key (role) REFERENCES role (id)
);


-- 线路表
create table line(
	id int PRIMARY KEY auto_increment,
	lineName VARCHAR(11),
	companyName VARCHAR(11),
	voltageGrade VARCHAR(11),
	beginLine VARCHAR(11),
	endLine VARCHAR (11),
	towerNumber int 
);


-- 杆塔表
create table tower(
	id int PRIMARY key auto_increment,
	towerName VARCHAR (11),
	towerType VARCHAR (11),
	towerAddress VARCHAR (11),
	installDate VARCHAR (11),
	runDate VARCHAR (11),
	line_id int ,
	FOREIGN KEY (line_id) REFERENCES line(id)
)
