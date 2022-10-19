create table public.users (
                              id integer primary key not null,
                              firstname character varying(255),
                              surname character varying(255),
                              dateofbirth date,
                              dateofregistration date,
                              email character varying(255),
                              phonenumber character varying
);

