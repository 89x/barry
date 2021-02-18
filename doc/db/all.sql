drop table if exists 'user';
create  table  'user' (
 'id' char (8) not null default '' ,
 'name'  varchar (50) ,
 primary key('id')
)engine =innodb default  charset =utf8mb4 comment = '测试';

insert  into  'user' ('id','name') values (1, 测试);

drop table if exists 'chapter';
create table 'chapter' (
 'id' char(8)  not null comment 'ID',
 'course_id' char(8) comment '课程Id',
 'name' varchar(50) comment '名称',
 primary key ('id')
)engine =ignore default charset =utf8mb4 comment ='大章';