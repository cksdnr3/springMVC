--create user spring identified by java;
--grant resource, connect to spring;
--conn spring/java;

drop table BOARD;
drop sequence BOARD_SEQ;
purge recyclebin;

create table BOARD(
   SEQ bigint NULL AUTO_INCREMENT PRIMARY KEY,
   WRITER varchar(15), 
   EMAIL varchar(20),
   SUBJECT varchar(20), 
   CONTENT varchar(20), 
   RDATE date
); 

insert into BOARD(writer, email, subject, content, rdate) values('������', 'kim@hanmail.net','����1', '����1', now());
insert into BOARD(writer, email, subject, content, rdate) values('�躸��', 'lee@hanmail.net','����2', '����2', now());
insert into BOARD(writer, email, subject, content, rdate) values('�輺��', 'han@hanmail.net','����3', '����3', now());
insert into BOARD(writer, email, subject, content, rdate) values('�輼��', 'oh@hanmail.net','����4', '����4', now());
insert into BOARD(writer, email, subject, content, rdate) values('��Ҵ�', 'chm@hanmail.net','����5', '����5', now());
insert into BOARD(writer, email, subject, content, rdate) values('��öȣ', 'kim@hanmail.net','����6', '����6', now());
insert into BOARD(writer, email, subject, content, rdate) values('�����', 'lee@hanmail.net','����7', '����7', now());
insert into BOARD(writer, email, subject, content, rdate) values('�տ���', 'han@hanmail.net','����8', '����8', now());
insert into BOARD(writer, email, subject, content, rdate) values('�۽���', 'oh@hanmail.net','����9', '����9', now());
insert into BOARD(writer, email, subject, content, rdate) values('������', 'chm@hanmail.net','����10', '����10', now());
insert into BOARD(writer, email, subject, content, rdate) values('����', 'kim@hanmail.net','����11', '����11', now());
insert into BOARD(writer, email, subject, content, rdate) values('�Ӽ���', 'lee@hanmail.net','����12', '����12', now());
insert into BOARD(writer, email, subject, content, rdate) values('������', 'han@hanmail.net','����13', '����13', now());
insert into BOARD(writer, email, subject, content, rdate) values('����ȯ', 'oh@hanmail.net','����14', '����14', now());
insert into BOARD(writer, email, subject, content, rdate) values('������', 'chm@hanmail.net','����15', '����15', now());

commit;

select CONSTRAINT_NAME, CONSTRAINT_TYPE from user_constraints where TABLE_NAME='BOARD';
select * from BOARD order by SEQ desc;


select * from tab;

desc BOARD