create table public.users (
                              id integer primary key not null,
                              firstName character varying(255),
                              surName character varying(255),
                              dateOfBirth date,
                              dateOfRegistration date,
                              email character varying(255),

                              phoneNumber varchar
                              );


