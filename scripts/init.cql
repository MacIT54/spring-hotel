create keyspace hotel with replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

CREATE TABLE hotel.users
(
    username TEXT primary key,
    password TEXT,
    roles    SET<TEXT>
);