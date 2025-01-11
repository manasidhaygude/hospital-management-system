create database hospital_management_system;
use hospital_management_system;
create  table login(
ID varchar(20),
PW varchar(20));
select * from login;
insert into login value("mansi","1234");
create table patient_info(ID varchar(20),Number varchar(40),Name varchar(20),Gender varchar(20),Patient_Disease varchar(20),Room_number varchar(20),Time varchar(100),Deposite varchar(20));
select * from patient_info;
create table Room(room_no varchar(20),Avaliability varchar(20),Price varchar(20),Room_type varchar(100));

insert into Room values("100","Availabile","500","G Bed 1");
insert into Room values("101","Availabile","500","G Bed 2");
insert into Room values("102","Availabile","500","G Bed 3");
insert into Room values("103","Availabile","500","G Bed 4");
insert into Room values("200","Availabile","1500","Private Room");
insert into Room values("201","Availabile","1500","Private Room");
insert into Room values("202","Availabile","1500","Private Room");
insert into Room values("203","Availabile","1500","Private Room");
insert into Room values("300","Availabile","3500","ICU Bed 1");
insert into Room values("301","Availabile","3500","ICU Bed 2");
insert into Room values("302","Availabile","3500","ICU Bed 3");
insert into Room values("303","Availabile","3500","ICU Bed 4");
insert into Room values("304","Availabile","3500","ICU Bed 5");
insert into Room values("305","Availabile","3500","ICU Bed 6");
select * from Room;
drop table Room;

create table Department(Department varchar(100),Phone_No varchar(20));
select * from Department;
insert into Department values("Surgical Department,","1234567898");
insert into Department values("nursing Department,","1234567823");
insert into Department values("operation theater complex(OT),","1236767890");
insert into Department values("Paramedical Department,","9323456789");

create table EMP_INFO(Name varchar(20),Age varchar(20),Phone_number varchar(20),Salary varchar(20),Gmail varchar(20),Adhar_Number varchar(20));
select * from EMP_INFO;

insert into EMP_INFO values("Docter1","30","1234567891","50000","abc@gmail.com","12345678919");
insert into EMP_INFO values("Docter2","32","1234567891","60000","xyz@gmail.com","14234567781");