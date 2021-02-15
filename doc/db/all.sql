drop table if exists 'user';
create  table  'user' (
 'id' char (8) not null default '' ,
 'name'  varchar (50) ,
 primary key('id')
)engine =innodb default  charset =utf8mb4 comment = '测试';

insert  into  'user' ('id','name') values (1, 测试);