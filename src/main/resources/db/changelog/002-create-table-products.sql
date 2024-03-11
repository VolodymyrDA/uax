CREATE TABLE products
(
    id          SERIAL PRIMARY KEY,
    title       VARCHAR(255)   NOT NULL,
    description TEXT,
    price       NUMERIC(10, 2) NOT NULL,
    category    VARCHAR(255),
    user_id     BIGINT         NOT NULL,
    CONSTRAINT fk_product_user FOREIGN KEY (user_id) REFERENCES users (id)
);
