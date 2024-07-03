CREATE DATABASE cine_Campus;
USE cine_Campus;

CREATE TABLE actor(
    id_actor INT AUTO_INCREMENT,
    nombre_actor VARCHAR(50),
    id_nacionalidad INT,
    edad_actor INT,
    id_genero INT,
    PRIMARY KEY(id_actor)
);

CREATE TABLE  pais(
    id_nacionalidad INT AUTO_INCREMENT,
    descripcion_pais VARCHAR(50),
    PRIMARY KEY(id_nacionalidad)

);

CREATE TABLE genero(
    id_genero INT AUTO_INCREMENT,
    descripcion VARCHAR(50),
    PRIMARY KEY(id_genero)
);

CREATE TABLE pelicula(
    id_pelicula INT AUTO_INCREMENT,
    cod_interno VARCHAR(5),
    nombre_pelicula VARCHAR(50),
    duracion VARCHAR(20),
    sinopsis text,
    PRIMARY KEY(id_pelicula)
);

CREATE TABLE pelicula_formato(
    id_pelicula_formato INT AUTO_INCREMENT, 
    id_pelicula INT,
    id_formato INT,
    cantidad INT,
    PRIMARY KEY(id_pelicula_formato)
);

CREATE TABLE formato(
    id_formato INT AUTO_INCREMENT,
    descripcion VARCHAR(50),
    PRIMARY KEY(id_formato)
);



CREATE TABLE pelicula_protagonista(
    id_protagonista INT AUTO_INCREMENT,
    id_pelicula INT,
    id_actor INT ,
    id_tipo_actor INT,
    PRIMARY KEY(id_protagonista)
);

CREATE TABLE tipo_actor(
    id_tipo_actor INT AUTO_INCREMENT,
    descripcion VARCHAR(50),
    PRIMARY KEY(id_tipo_actor)
);

ALTER TABLE actor
ADD CONSTRAINT fk_actor_pais 
FOREIGN KEY (id_nacionalidad) REFERENCES pais(id_nacionalidad) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE actor
ADD CONSTRAINT fk_actor_genre 
FOREIGN KEY(id_genero) REFERENCES genero(id_genero) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE pelicula_formato ADD CONSTRAINT pelicula_formato_formato_FK 
FOREIGN KEY (id_formato) REFERENCES formato(id_formato) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE pelicula_protagonista 
ADD CONSTRAINT pelicula_protagonista_actor_FK 
FOREIGN KEY (id_actor) REFERENCES actor(id_actor) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE pelicula_protagonista 
ADD CONSTRAINT pelicula_protagonista_tipo_actor_FK 
FOREIGN KEY (id_tipo_actor) REFERENCES type_actor(id_tipo_actor) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE pelicula_formato 
ADD CONSTRAINT pelicula_formato_pelicula_FK 
FOREIGN KEY (id_pelicula) REFERENCES pelicula(id_pelicula) ON DELETE CASCADE ON UPDATE CASCADE;