use villaclaudia;
/*Select*/
/*De la tabla clientes solo nos muestre el nombre y el telefono*/
select nombre, telefono from clientes; 
/*De la tabla productos nos muestre el nombre del producto la fecha en que se inicia la siembra y la fecha en que se finaliza la recolecta*/
select nombre_producto, inicio_siembra,fin_recolecta from productos;
/*De la tabla cultivos nos muestra el id del producto y el precio en que se vende*/
select producto_agricola, precio_venta from cultivos;
/*De la tabla gastos nos muestre el articulo comprado el monto pagado y el id del cultivo en que se utilizo*/
select articulo_comprado, monto_pagado,cultivos_id_cultivo from gastos;
/*De la tabla ventas nos muestre */
select fecha, cultivo, precio from ventas;

/*Where*/
/*De la tabla productos nos muestra los productos que inicia su siembra el 2021-11-8*/
select * from productos where inicio_siembra = '2021-11-8'; 
/*De la tabla empleados vamos a mostrar los que tengan un salario mayor a $1.000.000*/
select nombre_completo, salario from empleados where salario > 1000000;
/*De la tabla productos vamos a mostrar los productos que el precio de su semilla está entre $900.000 y $1.200.000*/
select nombre_producto, precio_semilla from productos where  precio_semilla between 900000 and 1200000;
/*De la tabla gastos nos muestre los gastos generados del cultivo de tomate */
select fecha_compra, monto_pagado, cultivos_id_cultivo from gastos where cultivos_id_cultivo=5;
/*De la tabla nomina nos muestre los empleados queayudaron a sembrar entre 2020-03-16 y 2021-07-26*/
select fecha_inicio_siembra, empleados_id_empleado from nomina where fecha_inicio_siembra between 20200316 and 20210726;

/*And Or Not*/
/*De la tabla gastos nos muestre los gastos generados por el cultivo con id 1 que sean mayor a $230.000*/
select * from gastos where (cultivos_id_cultivo=1) and (monto_pagado >=230000);
/*De la tabla productos nos muestra el precio de la una y de los productoa de un precio menos a $800.000*/
select nombre_producto, precio_semilla from productos where (nombre_producto='uva') or (precio_semilla <=800000);
/*De la tabla ventas no nos muestre las ventas menores a $22.124.886 */
select * from ventas where not precio <= 22124886;

/*Order by*/
/*Nos muestra la tabla empleados ordenados alfabeticamente de ornden ascendente*/
select nombre_completo, cargo from empleados order by nombre_completo ASC;
/*Nos muestra la tabla nomina ordenando si id de forma descendente*/
select * from nomina order by id_nomina DESC;

/*NULL Values*/
/*Nos muestra los cultivos que tuvieron problematicas*/
select producto_agricola, problematicas from cultivos where problematicas IS NOT NULL;














 
