create table details(
id varchar primary key not null,
city varchar(20),
phone_number varchar(25),
email varchar(30)
);

CREATE TABLE employees(
id varchar not null primary key,
name varchar(30),
surname varchar(30),
department varchar(20),
salary int,
details_id varchar,
foreign key (details_id) references details(id)
);
