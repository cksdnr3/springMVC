drop table ADDRESS_FILE;
drop table ADDRESS;
create table ADDRESS(
   SEQ bigint AUTO_INCREMENT PRIMARY KEY, 
   NAME varchar(10), 
   ADDR varchar(20), 
   RDATE datetime
); 

create table ADDRESS_FILE(
   SEQF bigint AUTO_INCREMENT PRIMARY KEY, 
   OFNAME varchar(50), 
   SFNAME varchar(50), 
   FSIZE bigint, 
   SEQ bigint constraint ADDRESS_FK references ADDRESS(SEQ) on delete cascade 
); 

commit;
select * from ADDRESS_FILE;