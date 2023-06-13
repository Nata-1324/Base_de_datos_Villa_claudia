create database villaclaudia;
USE villaclaudia ;

-- -----------------------------------------------------
-- Tabla clientes
-- -----------------------------------------------------
CREATE TABLE  clientes (
  id_cliente INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  direccion VARCHAR(45) NOT NULL,
  telefono VARCHAR(45) NOT NULL,
  PRIMARY KEY (id_cliente)
  );
-- -----------------------------------------------------
-- Tabla proveedores
-- -----------------------------------------------------
CREATE TABLE  proveedores (
  id_proveedor INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  direccion VARCHAR(45) NOT NULL,
  telefono VARCHAR(45) NOT NULL,
  PRIMARY KEY (id_proveedor)
  );
-- -----------------------------------------------------
-- Tabla productos
-- -----------------------------------------------------
CREATE TABLE  productos (
  id_producto INT NOT NULL AUTO_INCREMENT,
  nombre_producto VARCHAR(45) NOT NULL,
  precio_semilla INT NOT NULL,
  inicio_siembra DATE NOT NULL,
  fin_recolecta DATE NOT NULL,
  PRIMARY KEY (id_producto)
  );
-- -----------------------------------------------------
-- Tabla cultivos
-- -----------------------------------------------------
CREATE TABLE  cultivos (
  id_cultivo INT NOT NULL AUTO_INCREMENT,
  producto_agricola INT NOT NULL,
  fecha_siembra DATE NOT NULL,
  fecha_finrecolecta DATE NOT NULL,
  precio_venta DOUBLE NOT NULL,
  problematicas VARCHAR(45) NULL,
  PRIMARY KEY (id_cultivo),
  CONSTRAINT cultivos_productos_fk2
    FOREIGN KEY (producto_agricola)
    REFERENCES productos (id_producto)
    );
-- -----------------------------------------------------
-- Tabla gastos
-- -----------------------------------------------------
CREATE TABLE  gastos (
  id_compra INT NOT NULL AUTO_INCREMENT,
  fecha_compra DATE NOT NULL,
  articulo_comprado VARCHAR(45) NOT NULL,
  monto_pagado DOUBLE NOT NULL,
  medio_pago VARCHAR(45) NOT NULL,
  proveedor INT NOT NULL,
  cultivos_id_cultivo INT NOT NULL,
  PRIMARY KEY (id_compra),
  CONSTRAINT compra_proveedores_fk1
    FOREIGN KEY (proveedor)
    REFERENCES proveedores (id_proveedor),
  CONSTRAINT fk_gastos_cultivos1
    FOREIGN KEY (cultivos_id_cultivo)
    REFERENCES cultivos (id_cultivo)
    );
-- -----------------------------------------------------
-- Tabla empleados
-- -----------------------------------------------------
CREATE TABLE  empleados (
  id_empleado INT NOT NULL AUTO_INCREMENT,
  nombre_completo VARCHAR(45) NOT NULL,
  cargo VARCHAR(45) NOT NULL,
  eps VARCHAR(45) NOT NULL,
  telefono VARCHAR(45) NOT NULL,
  edad INT NOT NULL,
  beneficios VARCHAR(45) NOT NULL,
  salario DOUBLE NOT NULL,
  PRIMARY KEY (id_empleado)
  );
-- -----------------------------------------------------
-- Tabla nomina
-- -----------------------------------------------------
CREATE TABLE  nomina (
  id_nomina INT NOT NULL AUTO_INCREMENT,
  fecha_inicio_siembra DATE NOT NULL,
  fecha_fin_recolecta DATE NOT NULL,
  pago DOUBLE NOT NULL,
  empleados_id_empleado INT NOT NULL,
  PRIMARY KEY (id_nomina),
  CONSTRAINT fk_nomina_empleados1
    FOREIGN KEY (empleados_id_empleado)
    REFERENCES empleados (id_empleado)
    );
-- -----------------------------------------------------
-- Tabla ventas
-- -----------------------------------------------------
CREATE TABLE  ventas (
  id_venta INT NOT NULL AUTO_INCREMENT,
  fecha DATE NOT NULL,
  cliente INT NOT NULL,
  cultivo INT NOT NULL,
  precio DOUBLE NOT NULL,
  PRIMARY KEY (id_venta),
  CONSTRAINT ventas_clientes_fk1
    FOREIGN KEY (cliente)
    REFERENCES clientes (id_cliente),
  CONSTRAINT ventas_cultivos_fk2
    FOREIGN KEY (cultivo)
    REFERENCES cultivos (id_cultivo)
    );
-- -----------------------------------------------------
-- Tabla empleados_has_cultivos
-- -----------------------------------------------------
CREATE TABLE  empleados_has_cultivos (
  id_empleado INT NOT NULL,
  id_cultivo INT NOT NULL,
  PRIMARY KEY (id_empleado, id_cultivo),
  CONSTRAINT fk_empleados_has_cultivos_empleados1
    FOREIGN KEY (id_empleado)
    REFERENCES empleados (id_empleado)
    ,
  CONSTRAINT fk_empleados_has_cultivos_cultivos1
    FOREIGN KEY (id_cultivo)
    REFERENCES cultivos (id_cultivo)
    );
