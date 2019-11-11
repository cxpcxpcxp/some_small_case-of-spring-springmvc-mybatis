create table aopaccount
(
  id    int auto_increment
    primary key,
  name  varchar(10) not null,
  money double      not null
);

create table dept
(
  id    int         not null
    primary key,
  dname varchar(50) null,
  loc   varchar(50) null
);

create table job
(
  id          int         not null
    primary key,
  jname       varchar(20) null,
  description varchar(50) null
);

create table province
(
  id       int auto_increment
    primary key,
  province varchar(255) null
);

create table regandlogin
(
  id           int auto_increment
    primary key,
  user_name    varchar(255) not null,
  user_pwd     varchar(255) null,
  gender       varchar(255) not null,
  age          int          not null,
  native_place varchar(255) not null,
  qq           varchar(255) not null,
  email        varchar(255) not null,
  oprate       varchar(255) null
);

create table roletb
(
  id       int auto_increment
    primary key,
  rolename varchar(10) null
);

create table salarygrade
(
  grade    int not null
    primary key,
  losalary int null,
  hisalary int null
);

create table emp
(
  id                int           not null
    primary key,
  ename             varchar(50)   null,
  job_id            int           null,
  mgr               int           null,
  joindate          date          null,
  salary            decimal(7, 2) null,
  bonus             decimal(7, 2) null,
  dept_id           int           null,
  salarygrade_grade int           null,
  constraint emp_deptid_ref_dept_id_fk
  foreign key (dept_id) references dept (id),
  constraint emp_jobid_ref_job_id_fk
  foreign key (job_id) references job (id),
  constraint salarygrade_grade
  foreign key (salarygrade_grade) references salarygrade (grade)
);

create table student
(
  sname    varchar(20) null
  comment '学生姓名',
  age      int         null
  comment '学生年龄',
  address  varchar(50) null
  comment '家庭住址',
  sex      varchar(1)  null
  comment '学生性别',
  money    int         null
  comment '薪资',
  ssubject varchar(50) null
  comment '学生专业'
);

create table usertb
(
  id        int(10) auto_increment
    primary key,
  user_name varchar(255) null,
  user_pwd  varchar(255) null
);

create table account
(
  id    int auto_increment
    primary key,
  uid   int            null,
  money double(255, 1) null,
  constraint uid
  foreign key (uid) references usertb (id)
);

create table cardtb
(
  id      int auto_increment
    primary key,
  uid     int    null,
  cardNum bigint null,
  constraint cardtb_uid_uindex
  unique (uid),
  constraint cardtb_usertb_id_fk
  foreign key (uid) references usertb (id)
);

create table usertbrole
(
  id  int auto_increment
    primary key,
  uid int null,
  rid int null,
  constraint usertbrole___fk1
  foreign key (uid) references usertb (id),
  constraint usertbrole___fk2
  foreign key (rid) references roletb (id)
);

