create table public.addresses (
                                  id integer primary key not null default nextval('addresses_id_seq'::regclass),
                                  city character varying(255),
                                  country character varying(255),
                                  test character varying(255),
                                  zip_code integer,
                                  customer_id integer,
                                  foreign key (customer_id) references public.customers (id)
                                      match simple on update no action on delete no action
);

create table public.carts (
    id integer primary key not null default nextval('carts_id_seq'::regclass)
);

create table public.customers (
                                  id integer primary key not null default nextval('customers_id_seq'::regclass),
                                  date_of_birth date,
                                  date_of_registration date,
                                  email character varying(255),
                                  first_name character varying(255),
                                  phone_number bigint,
                                  sur_name character varying(255),
                                  customer_id integer,
                                  foreign key (customer_id) references public.carts (id)
                                      match simple on update no action on delete no action
);

create table public.orders (
                               id integer primary key not null default nextval('orders_id_seq'::regclass),
                               delivery_price double precision,
                               total_price double precision,
                               order_id integer,
                               customer_id integer,
                               foreign key (order_id) references public.carts (id)
                                   match simple on update no action on delete no action,
                               foreign key (customer_id) references public.customers (id)
                                   match simple on update no action on delete no action
);

create table public.products (
                                 id integer primary key not null default nextval('products_id_seq'::regclass),
                                 category character varying(255),
                                 is_available boolean,
                                 price double precision,
                                 product_name character varying(255),
                                 cart_id integer,
                                 foreign key (cart_id) references public.carts (id)
                                     match simple on update no action on delete no action
);

