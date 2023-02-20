DROP TABLE posts IF EXISTS;

CREATE TABLE posts
(
    id        INTEGER IDENTITY PRIMARY KEY,
    title     VARCHAR(30),
    content   VARCHAR(8192),
    post_date DATE
);
CREATE INDEX posts_title ON posts (title);
