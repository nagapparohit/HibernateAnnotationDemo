  
create database ecommerce;



CREATE TABLE public.eproduct (
    id integer NOT NULL,
    name character varying(100),
    price numeric(10,2),
    date_added timestamp without time zone DEFAULT now()
);

insert into eproduct (name,price) values ('java book',700);
insert into eproduct (name,price) values ('redmi phone',10700);
insert into eproduct (name,price) values ('hp laptop',57700);
insert into eproduct (name,price) values ('apple laptop',90700);
insert into eproduct (name,price) values ('dell laptop',4700);

pg_dump -t 'schema-name.table-name' --schema-only database-name