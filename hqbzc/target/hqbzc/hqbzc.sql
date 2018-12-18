-- 创建管理员表
drop database if EXISTS hqbzc
create database hqbzc;
use hqbzc;
create table admin(
	id int primary key auto_increment,
	admin_name varchar(30),
	admin_id varchar(30),
	admin_university varchar(30)
);

-- 创建新闻表

drop table if exists newInfo;
create table newInfo (
	id int primary key auto_increment,
	title varchar(30),
	type varchar (30),
	time varchar(30),
	admin_id int
);
