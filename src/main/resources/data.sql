ALTER TABLE public.product_types
    ALTER COLUMN product_type_id SET DEFAULT nextval('product_type_id_seq');


INSERT INTO public.product_types(product_type_name)
VALUES ('Smartphone'),
       ('Laptop');

INSERT INTO public.products(product_name, price, product_status, product_type_id)
VALUES ('Iphone 15', 20000000, 'OUT_OF_STOCK', 1),
       ('Iphone 14', 15000000, 'AVAILABLE', 1),
       ('Xiaomi Redmi Note 10', 5000000, 'AVAILABLE', 1),
       ('Asus TUF Gaming F15', 15000000, 'AVAILABLE', 2),
       ('Macbook Pro M3', 27000000, 'AVAILABLE', 2);