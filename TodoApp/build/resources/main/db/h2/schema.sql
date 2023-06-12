CREATE TABLE IF NOT EXISTS TODO (
    todo_id bigint NOT NULL AUTO_INCREMENT,
    todo varchar(20) NOT NULL,
    orders int NOT NULL,
    PRIMARY KEY (todo_id)
);