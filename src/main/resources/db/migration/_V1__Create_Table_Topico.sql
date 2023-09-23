create table topicos(
	id bigint not null auto_increment,
	titulo varchar(100) not null,
	mensaje varchar(100) not null ,
	fecha_creacion timestamp not null,
	status varchar(30) not null,
	usuario_id integer not null,
	curso_id integer not null,
	primary key(id)	
);
create table usuarios(
	id integer not null auto_increment,
	nombre varchar(100) not null,
	email varchar(100) not null ,
	contrasena varchar(20) not null,
	primary key(id)	
);
create table respuestas(
	id integer not null auto_increment,
	mensaje varchar(100) not null ,
	topico integer not null,
	fecha_creacion timestamp not null,
	usuario_id integer not null,
	solucion  boolean null,
	primary key(id)	
);
	