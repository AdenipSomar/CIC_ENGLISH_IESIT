DROP DATABASE IF EXISTS cic_english_iesit;
create database cic_english_iesit;
use cic_english_iesit;

create table usuario_tbl(
cveUsuario int not null auto_increment,
nombreUsuario varchar (40) not null,
pass varchar(20) not null,
primary key (cveUsuario)
);
create table grupo_tbl(
-- nomenclatura del grupo BA2425-1
cveGrupo varchar(8) not null primary key,
nombreGrupo varchar(30) not null,
nivelIngles varchar(60) not null,

diaClase1 varchar (60) default null,
horarioClase1 varchar(40) default null,
salonClase1 varchar (25) default null,

diaClase2 varchar (60) default null,
horarioClase2 varchar(40) default null,
salonClase2 varchar (25) default null,

cicloEscolar varchar(35) default null,
maxEstudiantes int(2) default null
);

create table licenciatura_tbl(
rvoe char(13) not null primary key,
nombreLicenciatura varchar(70) not null 
);
create table docente_tbl(
rfcDocente char(13) not null primary key,
nombreDocente varchar(50) not null,
apePaternoDocente varchar(50) not null,
apeMaternoDocente varchar (50) default null,
email varchar (50) default null,
telefono char(10) default null,
fechaInicio varchar(15) default null,
estado bit default 1

);
CREATE TABLE docente_grupo_tbl (
    idDocenteGrupo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    rfcDocente CHAR(13) NOT NULL,
    cveGrupo VARCHAR(8) NOT NULL,
    
    UNIQUE (rfcDocente, cveGrupo),
    FOREIGN KEY (rfcDocente) REFERENCES docente_tbl(rfcDocente)ON UPDATE CASCADE ON DELETE RESTRICT,
    FOREIGN KEY (cveGrupo) REFERENCES grupo_tbl(cveGrupo)ON UPDATE CASCADE ON DELETE RESTRICT
);

create table alumno_tbl(
matricula char(8) not null primary key,
nombreAlumno varchar(40) not null,
apePaternoAlumno varchar(40) not null,
apeMaternoAlumno varchar(40) default null,
generacion varchar(20) default null,
semestre int(2) default null,
estatusConstancia int default null,
observaciones varchar(100) default null,

cveGrupo varchar(8) not null,
rvoe char(13) not null,

foreign key (cveGrupo) references grupo_tbl(cveGrupo) on update cascade on delete restrict,
foreign key (rvoe) references licenciatura_tbl(rvoe) on update cascade on delete restrict
);

CREATE TABLE calificaciones_tbl (
  cveCalificaciones INT AUTO_INCREMENT PRIMARY KEY,
  nivelCursado VARCHAR(50) NOT NULL, -- ESTA TAMBIEN ES LA CLAVE
  primerParcial TINYINT UNSIGNED DEFAULT NULL,
  segundoParcial TINYINT UNSIGNED DEFAULT NULL,
  tercerParcial TINYINT UNSIGNED DEFAULT NULL,
  examenFinal TINYINT UNSIGNED DEFAULT NULL,
  matricula CHAR(8) NOT NULL,-- ESTA ES LA CLAVE

  -- Clave única compuesta
  UNIQUE (matricula, nivelCursado),

  FOREIGN KEY (matricula) REFERENCES alumno_tbl(matricula) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE alumno_grupo_tbl (
    idAlumnoGrupo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   matricula char(8) NOT NULL,
    cveGrupo VARCHAR(8) NOT NULL,
    
    UNIQUE (matricula, cveGrupo),
    FOREIGN KEY (matricula) REFERENCES alumno_tbl(matricula)ON UPDATE CASCADE ON DELETE RESTRICT,
    FOREIGN KEY (cveGrupo) REFERENCES grupo_tbl(cveGrupo)ON UPDATE CASCADE ON DELETE RESTRICT
);


CREATE TABLE extra_ordinarios_tbl (
  cveExtra INT AUTO_INCREMENT PRIMARY KEY,
  cveCalificaciones INT NOT NULL,
  numeroExtra TINYINT UNSIGNED NOT NULL, -- 1, 2 o 3
  fechaExtra varchar(15) default NULL,
  calificacionExtra TINYINT UNSIGNED DEFAULT NULL,

  -- Relación con la tabla de calificaciones
  FOREIGN KEY (cveCalificaciones) REFERENCES calificaciones_tbl(cveCalificaciones) ON UPDATE CASCADE ON DELETE CASCADE,

  -- Asegurar que un nivel de cursado solo tenga 3 exámenes extra
  UNIQUE (cveCalificaciones, numeroExtra)
);

create table nomina_docente_tbl(
cveNominaIesit  int not null primary key,
rfcDocente char(13) not null,
horasTrabajadas int(2) default null,
fechaTrabajada varchar(20) default null,
observaciones varchar (100) default null,
foreign key (rfcDocente) references docente_tbl(rfcDocente) on update cascade on delete restrict

);