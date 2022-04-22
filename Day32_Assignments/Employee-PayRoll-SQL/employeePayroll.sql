show databases;

#UC1 
create database employee_payroll_service;
use employee_payroll_service;
select database();

#UC2
drop table employee_payroll;
create table employee_payroll
(
	id INT unsigned NOT NULL AUTO_INCREMENT,
	name VARCHAR(150) NOT NULL,
    salary double NOT NULL ,
    start DATE NOT NULL,
    primary key (id)
);
describe employee_payroll;

#UC3
insert into employee_payroll (name,salary,start) values
	('Rahul',1000000.0,'2018-01-03'),
    ('Shital',2000000.0,'2019-11-13'),
    ('Neha',3000000.0,'2020-05-21');
    
#UC4    
select * from employee_payroll;  

#UC5
select salary from employee_payroll where name='Rahul';
select * from employee_payroll where start between cast( '2018-01-01' as date) and date((now()));

#UC6
alter table employee_payroll add gender char(1) not null after name  ;
update employee_payroll set gender ='F' where name='Neha';
select * from employee_payroll;
update employee_payroll set gender ='M' where name='Rahul' or name='Shital';
select * from employee_payroll;

#UC7
select sum(salary) from employee_payroll where gender='M' group by gender;
select avg(salary) from employee_payroll where gender='M' group by gender;
select max(salary) from employee_payroll;
select min(salary) from employee_payroll;
select count(id) from employee_payroll;

