create table jooq_test.employees
(
    first_name   varchar(50)  not null,
    last_name    varchar(50)  not null,
    email        varchar(100) not null,
    phone_number varchar(50)  not null
        constraint pk_emp
            primary key
        constraint unique_tel
            unique,
    department   varchar(50),
    job_title    varchar(50),
    salary       varchar(10),
    hire_date    date         not null
);

alter table jooq_test.employees
    owner to postgres;
