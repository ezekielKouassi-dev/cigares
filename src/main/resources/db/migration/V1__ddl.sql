-- creation de la table utilisateur
create table if not exists utilisateur(
    id serial not null primary key,
    nom varchar(255) not null,
    prenoms varchar(255) not null,
    date_naissance timestamp without time zone not null,
    email varchar(255) not null,
    mot_de_passe varchar(255) not null,
    dt_creation timestamp without time zone not null,
    dt_mise_a_jour timestamp without time zone,
    status varchar(255) not null
);

-- creation de la table profile
create table if not exists profile(
    id serial not null primary key,
    code varchar(255) not null,
    designation varchar(255) not null,
    dt_creation timestamp without time zone not null,
    dt_mise_a_jour timestamp without time zone,
    status varchar(255) not null
)