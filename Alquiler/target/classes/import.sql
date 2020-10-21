-- You can use this file to load seed data into the database using SQL statements

insert into PELICULA (TITULO, SINOPSIS, ANIO, GENERO) values ('Nemo','buena', 2005, 0);

insert into ALQUILER (FECHA_ALQUILER, SOCIO_ID, PELICULA_ID) values ('10/10/2020', 1, 1);

insert into SOCIO (NOMBRE , APELLIDO , DNI, EMAIL) values ('Ticiana', 'Cobresi', '42358387', 'tici.cobresi21@gmail.com');