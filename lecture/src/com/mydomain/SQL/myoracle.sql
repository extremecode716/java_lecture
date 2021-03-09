-- Oracle

select * from tab;      -- 테이블 목록
select * from customer; -- customer 목록
select * from seq;      -- 시퀀스 목록
delete from customer;   -- 테이블 목록 삭제

-- 테이블 삭제 oracle은 purge를 붙임으로써 임시테이블 교체없이 삭제 가능.
drop table customer purge;

-- 예1.
-- customer 테이블 생성 (DDL) 
-- primary key:제약조건 : not null + unique
create table customer( no number(4)  primary key, 
		       name varchar2(20),
		       email varchar2(20),
		       tel varchar2(20)      
		       );

-- 예2.
alter table customer add(address varchar2(50));
alter table customer add(reg_date timestamp);

-- 시퀀스란 자동으로 순차적으로 증가하는 순번을 반환하는 데이터베이스 객체. 중복값을 방지하기위해 사용.
-- create sequnce [시퀀스명(테이블명_column명_seq)]
-- start with [시작숫자] 
-- increment by [증감숫자] 
create sequence customer_no_seq
	start with 1
	increment by 1;

select customer_no_seq from CUSTOMER; -- 해당 시퀀스 값 조회
drop sequence customer_no_seq;        -- 시퀀스 삭제

-- 게시판 (p2021_02_23)

create table board(
	no number primary key,
	writer varchar2(20) not null,
	passwd varchar2(20) not null,
	subject varchar2(100) not null,
	content varchar2(1000) not null,
	reg_date timestamp
	);

create sequence board_seq
	start with 1
	increment by 1;
	
-- 테이블 목록 select
select * from board;
	
-- 테이블 목록 삭제
delete from board;
	
-- 시퀀스 삭제
drop sequence board_seq;

-- board 목록중 삭제
delete from BOARD where no = 7;
-- 시퀀스의 현재 값을 확인
select LAST_NUMBER from USER_SEQUENCES where SEQUENCE_NAME='BOARD_SEQ';
-- 현재 시퀀스의 INCREMENT를 현재 값 만큼 차감
alter sequence board_seq increment by -6;
-- 시퀀스의 다음 값 실행
select BOARD_SEQ.NEXTVAL FROM BOARD;
-- 시퀀스의 현재 값 조회
select board_seq.currval from BOARD;

			