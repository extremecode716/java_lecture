-- MySQL
show databases;
show tables;
select * from member;

-- 예1.
create table customer( no int(4) auto_increment  primary key, 
		       name varchar(20),
		       email varchar(20),
		       tel varchar(20),
		       address varchar(50),
		       reg_date timestamp);

select * from customer;

-- 예2.
create table board(
	no int auto_increment primary key,
	writer varchar(20) not null,
	passwd varchar(20) not null,
	subject varchar(100) not null,
	content varchar(1000) not null,
	reg_date timestamp
	);
	
select * from board;

-- 테이블 삭제 MySQL은 purge를 안붙여도됨. 
drop table board;

-- 테이블 입력
insert into board(writer,passwd,subject,content,reg_date)
 values('안시성','1234','게시판 제목','게시판 내용',sysdate());
 
 -- 전체 데이터를 내림차순 정렬(최근글 순)
 select * from board order by no desc;
 
 -- 최근글 5개 검색
 -- limit 추출할 인덱스 번호, 추출할 데이터 갯수
 select * from board order by no desc limit 0, 5;
 

 
 
 
 
 