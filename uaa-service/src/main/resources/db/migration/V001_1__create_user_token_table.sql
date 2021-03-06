CREATE TABLE USER_TOKEN (
  id bigint generated by default as identity,
  USERNAME VARCHAR(60) NOT NULL,
  ACCESS_TOKEN VARCHAR(150) NOT NULL,
  REFRESH_TOKEN VARCHAR(150) NOT NULL,
  SCOPE VARCHAR(50) NOT NULL,
  CREATION_DATE TIMESTAMP NOT NULL,
  TOKEN_TYPE VARCHAR(20) NOT NULL,
  EXPIRES_IN bigint NOT NULL,

  PRIMARY KEY (id)
);

