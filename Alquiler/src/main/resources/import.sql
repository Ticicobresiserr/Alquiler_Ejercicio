-- You can use this file to load seed data into the database using SQL statements

insert into PELICULA (titulo, sinopsis, anio, genero) values ('Nemo', 'buena', 2005, 'animada');
insert into PELICULA (titulo, sinopsis, anio, genero) values ('Bambi', 'mala', 2003, 'animada');

insert into ALQUILER (fecha_alquiler, socio) values (10/10/2020, 1);

insert into SOCIO (nombre,apellido,dni, email) values ('Ticiana', 'Cobresi', 42358387, 'tici.cobresi21@gmail.com');