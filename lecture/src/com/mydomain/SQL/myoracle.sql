select * from tab;      -- 테이블 목록
select * from customer; -- customer 목록
select * from seq;      -- 시퀀스 목록
delete from customer;   -- 테이블 목록 삭제

-- 테이블 삭제
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

			