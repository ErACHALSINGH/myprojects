create table people (
id int IDENTITY(1,1) primary key,
first_name varchar(20) not null,
last_name varchar(20) not null,
age integer not null
);

insert into people (first_name, last_name, age) values
('bharat', 'singh', 35),
('ajay', 'parihar', 34),
('lalit', 'vyas', 36),
('irfan', 'khan', 34);

commit;