drop database if exists grandes_almacenes;
create database if not exists grandes_almacenes;

use grandes_almacenes;

drop table if exists productos;
drop table if exists maquinas_registradoras;
drop table if exists venta;

drop table if exists cajeros;
create table cajeros(
codigo int auto_increment primary key,
nom_apels varchar(255)
);

create table productos(
codigo int auto_increment primary key,
nombre varchar(100),
precio int
);

drop table if exists maquinas_registradoras;
create table maquinas_registradoras(
codigo int auto_increment primary key,
piso int
);

create table venta(
codigo int auto_increment primary key,
cajero int,
maquina int,
producto int,
Key(cajero),
foreign key(cajero) references cajeros(codigo),
Key(maquina),
foreign key(maquina) references maquinas_registradoras(codigo),
Key(producto),
foreign key(producto) references productos(codigo)
);

CREATE TABLE usuario (
  `id` INT AUTO_INCREMENT,
  `username` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `role` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

insert into cajeros values(default,"Joan");
insert into maquinas_registradoras values(default,1);
insert into productos values(default,"Producto1",300);
insert into venta values(default,1,1,1);
INSERT INTO usuario (username, password, role) VALUES ('remote', '$2a$10$vzROYR2Ndw3bQiGqbC1VXO.oDmQH9UQQurU6Mwj7f7LjlNIeX4ojq','admin');
INSERT INTO `maquinas_registradoras` (`codigo`,`piso`) VALUES (2,1);
INSERT INTO `maquinas_registradoras` (`codigo`,`piso`) VALUES (3,2);
INSERT INTO `maquinas_registradoras` (`codigo`,`piso`) VALUES (4,2);
INSERT INTO `cajeros` (`codigo`,`nom_apels`) VALUES (2,'Javier Lorens');
INSERT INTO `cajeros` (`codigo`,`nom_apels`) VALUES (3,'Jose A');
INSERT INTO `cajeros` (`codigo`,`nom_apels`) VALUES (4,'Daniel Fernandez');
INSERT INTO `productos` (`codigo`,`nombre`,`precio`) VALUES (2,'Producto 2',300);
INSERT INTO `productos` (`codigo`,`nombre`,`precio`) VALUES (3,'Producto 3',600);
INSERT INTO `productos` (`codigo`,`nombre`,`precio`) VALUES (4,'Producto 4',900);
INSERT INTO `venta` (`codigo`,`cajero`,`maquina`,`producto`) VALUES (2,1,1,1);
INSERT INTO `venta` (`codigo`,`cajero`,`maquina`,`producto`) VALUES (3,2,1,2);
INSERT INTO `venta` (`codigo`,`cajero`,`maquina`,`producto`) VALUES (4,2,1,3);
INSERT INTO `venta` (`codigo`,`cajero`,`maquina`,`producto`) VALUES (5,1,2,3);

