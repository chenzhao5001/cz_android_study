// 创建表
create table person (id Integer primary key,name varchar(10),age Integer not null);

// 删除表
drop table person

// 插入
insert into [字段，字段] values(a,b,c)
inert into person(id,age) values(a,b)
inert into person values(id,name,age)

// 修改数据
update person set name="ls",age=20 where id = 1

//删除数据
delete from person where id = 2

//查询语句
select name from person where id = 20  group by 分组字段 having 筛选条件 order by 排序字段
select * from person where id =1
select * from person where id <> 1
select * from person where id=1 and age>20
select * from person where name like "%小%"
select * from person where name like "小%"
select * from person where name is null
select * from person where age >20 and age <30




