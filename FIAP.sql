-- Gerado por Oracle SQL Developer Data Modeler 22.2.0.165.1149
--   em:        2023-05-25 17:19:59 BRT
--   site:      Oracle Database 11g
--   tipo:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

--  ERROR: Table name length exceeds maximum allowed length(30) 
CREATE TABLE "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA" (
    id_resultado                                                            INTEGER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    t_smcea_converte_t_smcea_tipo_energias_renovaveis_id_energia_renvovavel INTEGER NOT NULL,
    t_smcea_fabrica_id_fabrica                                              INTEGER NOT NULL
);

--  ERROR: Index name length exceeds maximum allowed length(30) 
CREATE UNIQUE INDEX "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA__IDX" ON
    "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA" (
        t_smcea_fabrica_id_fabrica
    ASC );

--  ERROR: PK name length exceeds maximum allowed length(30) 
ALTER TABLE "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA" ADD CONSTRAINT "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA_PK" PRIMARY KEY (
id_resultado,
                                                                                                                                t_smcea_converte_t_smcea_tipo_energias_renovaveis_id_energia_renvovavel
                                                                                                                                );

CREATE TABLE t_smcea_consumo_agua (
    t_smcea_fabrica_id_fabrica INTEGER NOT NULL,
    vl_agua_gasta              NUMBER,
    t_smcea_consumo_agua_id    NUMBER NOT NULL
);

CREATE UNIQUE INDEX t_smcea_consumo_agua__idx ON
    t_smcea_consumo_agua (
        t_smcea_fabrica_id_fabrica
    ASC );

ALTER TABLE t_smcea_consumo_agua ADD CONSTRAINT t_smcea_consumo_agua_pk PRIMARY KEY ( t_smcea_consumo_agua_id );

--  ERROR: Table name length exceeds maximum allowed length(30) 
CREATE TABLE t_smcea_consumo_energia_eletrica (
    t_smcea_fabrica_id_fabrica          INTEGER NOT NULL,
    "vl_Kw/h_gasto"                     NUMBER, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    t_smcea_consumo_energia_eletrica_id NUMBER NOT NULL
);

--  ERROR: Index name length exceeds maximum allowed length(30) 
CREATE UNIQUE INDEX t_smcea_consumo_energia_eletrica__idx ON
    t_smcea_consumo_energia_eletrica (
        t_smcea_fabrica_id_fabrica
    ASC );

--  ERROR: PK name length exceeds maximum allowed length(30) 
ALTER TABLE t_smcea_consumo_energia_eletrica ADD CONSTRAINT t_smcea_consumo_energia_eletrica_pk PRIMARY KEY ( t_smcea_consumo_energia_eletrica_id
);

CREATE TABLE t_smcea_converte (
    id_conversao                                                  INTEGER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    t_smcea_tipo_energias_renovaveis_id_energia_renvovavel        INTEGER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    t_smcea_tipos_energia_nao_renovaveis_id_energia_nao_renovavel INTEGER NOT NULL
);

ALTER TABLE t_smcea_converte ADD CONSTRAINT t_smcea_converte_pk PRIMARY KEY ( t_smcea_tipo_energias_renovaveis_id_energia_renvovavel )
;

CREATE TABLE t_smcea_fabrica (
    id_fabrica                                                                                                           INTEGER NOT NULL
    , 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA_id_resultado"                                                            INTEGER NOT NULL
    , 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA_T_SMCEA_CONVERTE_T_SMCEA_TIPO_ENERGIAS_RENOVAVEIS_id_energia_renvovavel" INTEGER NOT NULL
    , 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    t_smcea_consumo_energia_eletrica_t_smcea_consumo_energia_eletrica_id                                                 NUMBER NOT NULL
    , 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    t_smcea_consumo_agua_t_smcea_consumo_agua_id                                                                         NUMBER NOT NULL
);

CREATE UNIQUE INDEX t_smcea_fabrica__idx ON
    t_smcea_fabrica (
        t_smcea_consumo_energia_eletrica_t_smcea_consumo_energia_eletrica_id
    ASC );

CREATE UNIQUE INDEX t_smcea_fabrica__idxv1 ON
    t_smcea_fabrica (
        t_smcea_consumo_agua_t_smcea_consumo_agua_id
    ASC );

CREATE UNIQUE INDEX t_smcea_fabrica__idxv2 ON
    t_smcea_fabrica (
        "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA_id_resultado"
    ASC,
        "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA_T_SMCEA_CONVERTE_T_SMCEA_TIPO_ENERGIAS_RENOVAVEIS_id_energia_renvovavel"
    ASC );

ALTER TABLE t_smcea_fabrica ADD CONSTRAINT t_smcea_fabrica_pk PRIMARY KEY ( id_fabrica );

CREATE TABLE t_smcea_maquinas (
    id_maquina                 INTEGER NOT NULL,
    t_smcea_fabrica_id_fabrica INTEGER NOT NULL
);

CREATE UNIQUE INDEX t_smcea_maquinas__idx ON
    t_smcea_maquinas (
        t_smcea_fabrica_id_fabrica
    ASC );

ALTER TABLE t_smcea_maquinas ADD CONSTRAINT t_smcea_maquinas_pk PRIMARY KEY ( id_maquina );

--  ERROR: Table name length exceeds maximum allowed length(30) 
CREATE TABLE t_smcea_tipo_energias_renovaveis (
    id_energia_renvovavel INTEGER NOT NULL,
    nm_energias           VARCHAR2(30) NOT NULL
);

--  ERROR: PK name length exceeds maximum allowed length(30) 
ALTER TABLE t_smcea_tipo_energias_renovaveis ADD CONSTRAINT t_smcea_tipo_energias_renovaveis_pk PRIMARY KEY ( id_energia_renvovavel )
;

--  ERROR: Table name length exceeds maximum allowed length(30) 
CREATE TABLE t_smcea_tipos_energia_nao_renovaveis (
    id_energia_nao_renovavel INTEGER NOT NULL,
    nm_energias              VARCHAR2(30) NOT NULL
);

--  ERROR: PK name length exceeds maximum allowed length(30) 
ALTER TABLE t_smcea_tipos_energia_nao_renovaveis ADD CONSTRAINT t_smcea_tipos_energia_nao_renovaveis_pk PRIMARY KEY ( id_energia_nao_renovavel
);

CREATE TABLE t_smcea_tipos_produtos (
    id_tipo_produto             INTEGER NOT NULL,
    t_smcea_maquinas_id_maquina INTEGER NOT NULL
);

CREATE UNIQUE INDEX t_smcea_tipos_produtos__idx ON
    t_smcea_tipos_produtos (
        t_smcea_maquinas_id_maquina
    ASC );

ALTER TABLE t_smcea_tipos_produtos ADD CONSTRAINT t_smcea_tipos_produtos_pk PRIMARY KEY ( id_tipo_produto );

CREATE TABLE t_smcea_valida_metas (
    t_smcea_fabrica_id_fabrica                   INTEGER NOT NULL,
    "st_15%_menos_em_todas_fabricas"             CHAR(1), 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    "st_energia_consumida_igual_ou_superior_51%" CHAR(1),
    "st_20%redc_consumo_total_agua"              CHAR(1)
);

ALTER TABLE t_smcea_valida_metas ADD CONSTRAINT t_smcea_valida_metas_pk PRIMARY KEY ( t_smcea_fabrica_id_fabrica );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA"
    ADD CONSTRAINT "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA_T_SMCEA_CONVERTE_FK" FOREIGN KEY ( t_smcea_converte_t_smcea_tipo_energias_renovaveis_id_energia_renvovavel
    )
        REFERENCES t_smcea_converte ( t_smcea_tipo_energias_renovaveis_id_energia_renvovavel );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA"
    ADD CONSTRAINT "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA_T_SMCEA_FABRICA_FK" FOREIGN KEY ( t_smcea_fabrica_id_fabrica )
        REFERENCES t_smcea_fabrica ( id_fabrica );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE t_smcea_consumo_agua
    ADD CONSTRAINT t_smcea_consumo_agua_t_smcea_fabrica_fk FOREIGN KEY ( t_smcea_fabrica_id_fabrica )
        REFERENCES t_smcea_fabrica ( id_fabrica );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE t_smcea_consumo_energia_eletrica
    ADD CONSTRAINT t_smcea_consumo_energia_eletrica_t_smcea_fabrica_fk FOREIGN KEY ( t_smcea_fabrica_id_fabrica )
        REFERENCES t_smcea_fabrica ( id_fabrica );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE t_smcea_converte
    ADD CONSTRAINT t_smcea_converte_t_smcea_tipo_energias_renovaveis_fk FOREIGN KEY ( t_smcea_tipo_energias_renovaveis_id_energia_renvovavel
    )
        REFERENCES t_smcea_tipo_energias_renovaveis ( id_energia_renvovavel );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE t_smcea_converte
    ADD CONSTRAINT t_smcea_converte_t_smcea_tipos_energia_nao_renovaveis_fk FOREIGN KEY ( t_smcea_tipos_energia_nao_renovaveis_id_energia_nao_renovavel
    )
        REFERENCES t_smcea_tipos_energia_nao_renovaveis ( id_energia_nao_renovavel );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE t_smcea_fabrica
    ADD CONSTRAINT "T_SMCEA_FABRICA_T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA_FK" FOREIGN KEY ( "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA_id_resultado"
    ,
                                                                                                 "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA_T_SMCEA_CONVERTE_T_SMCEA_TIPO_ENERGIAS_RENOVAVEIS_id_energia_renvovavel"
                                                                                                 )
        REFERENCES "T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA" ( id_resultado,
                                                                  t_smcea_converte_t_smcea_tipo_energias_renovaveis_id_energia_renvovavel
                                                                  );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE t_smcea_fabrica
    ADD CONSTRAINT t_smcea_fabrica_t_smcea_consumo_agua_fk FOREIGN KEY ( t_smcea_consumo_agua_t_smcea_consumo_agua_id )
        REFERENCES t_smcea_consumo_agua ( t_smcea_consumo_agua_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE t_smcea_fabrica
    ADD CONSTRAINT t_smcea_fabrica_t_smcea_consumo_energia_eletrica_fk FOREIGN KEY ( t_smcea_consumo_energia_eletrica_t_smcea_consumo_energia_eletrica_id
    )
        REFERENCES t_smcea_consumo_energia_eletrica ( t_smcea_consumo_energia_eletrica_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE t_smcea_maquinas
    ADD CONSTRAINT t_smcea_maquinas_t_smcea_fabrica_fk FOREIGN KEY ( t_smcea_fabrica_id_fabrica )
        REFERENCES t_smcea_fabrica ( id_fabrica );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE t_smcea_tipos_produtos
    ADD CONSTRAINT t_smcea_tipos_produtos_t_smcea_maquinas_fk FOREIGN KEY ( t_smcea_maquinas_id_maquina )
        REFERENCES t_smcea_maquinas ( id_maquina );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE t_smcea_valida_metas
    ADD CONSTRAINT t_smcea_valida_metas_t_smcea_fabrica_fk FOREIGN KEY ( t_smcea_fabrica_id_fabrica )
        REFERENCES t_smcea_fabrica ( id_fabrica );

CREATE SEQUENCE t_smcea_consumo_agua_t_smcea_c START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER t_smcea_consumo_agua_t_smcea_c BEFORE
    INSERT ON t_smcea_consumo_agua
    FOR EACH ROW
    WHEN ( new.t_smcea_consumo_agua_id IS NULL )
BEGIN
    :new.t_smcea_consumo_agua_id := t_smcea_consumo_agua_t_smcea_c.nextval;
END;
/

CREATE SEQUENCE t_smcea_consumo_energia_eletri START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER t_smcea_consumo_energia_eletri BEFORE
    INSERT ON t_smcea_consumo_energia_eletrica
    FOR EACH ROW
    WHEN ( new.t_smcea_consumo_energia_eletrica_id IS NULL )
BEGIN
    :new.t_smcea_consumo_energia_eletrica_id := t_smcea_consumo_energia_eletri.nextval;
END;
/



-- Relat�rio do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                            10
-- CREATE INDEX                             8
-- ALTER TABLE                             22
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           2
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          2
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                  31
-- WARNINGS                                 0
