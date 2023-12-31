use villaclaudia;

insert into clientes (nombre, direccion, telefono) values ("Jose Duarte","Cra 8 #10/41","3142083350");
insert into clientes (nombre, direccion, telefono) values("Luis Jaimes","Cll 6 #8/15","3215468895");
insert into clientes (nombre, direccion, telefono) values("Daniel Suarez","Cra 9 #7/26","3215647890");
insert into clientes (nombre, direccion, telefono) values("Karina Alfonso","Cra 10 #15/8","3228165346");
insert into clientes (nombre, direccion, telefono) values("Jenifer Carrero", "Cll 7#13/24","3698521465");
insert into clientes (nombre, direccion, telefono) values("Anyi Ruiz","Cll 15 # 12/34","3502156548");
insert into clientes (nombre, direccion, telefono) values("Lorena Sanchez","Cra 12 #31/5","3123012560");
insert into clientes (nombre, direccion, telefono) values("Juan Perez","Cra 8 #14/5","3215698658");
insert into clientes (nombre, direccion, telefono) values("Daniel Fuentes","Cra 13 #5/18","3142589960");
insert into clientes (nombre, direccion, telefono) values("Juan Gomez","Cll 4 #21/41","3256489962");
insert into clientes (nombre, direccion, telefono) values("Carlos Lopez","Cra 12 #50/23","3215987462");
insert into clientes (nombre, direccion, telefono) values("Manuel Lache ","Cll 11 #6/25","3246985620");
insert into clientes (nombre, direccion, telefono) values("Luis Salinas","Cra 9 # 32/43","3216086692");
insert into clientes (nombre, direccion, telefono) values("Manuel Quintero","Cll 13 #15/25","3215896650");
insert into clientes (nombre, direccion, telefono) values("Sandra Castañeda","Cra 6 #5/25","3502149630");
insert into clientes (nombre, direccion, telefono) values("Elcida Sierra","Cll 5 # 8/14","3256926540");
insert into clientes (nombre, direccion, telefono) values("Claudio Ortiz","Cra 6 11/12","3228165362");
insert into clientes (nombre, direccion, telefono) values("Hilde Rincon","Cra 8 #10/23","3256984123");
insert into clientes (nombre, direccion, telefono) values("Cesar Carreño","Cll 7 #10/32","3215648930");
insert into clientes (nombre, direccion, telefono) values("Augusto Trujillo","Cra 15 #31/22","3289604562");
insert into clientes (nombre, direccion, telefono) values("Camilo Sepulveda","Cra 3 # 18/21","3256984103");
insert into clientes (nombre, direccion, telefono) values("Ana Pineda","Cra 2 #21/12","3215649870");
insert into clientes (nombre, direccion, telefono) values("Yenifer Valbuena","Cll 5 #10/21","3625973201");
insert into clientes (nombre, direccion, telefono) values("Andrés Corzo","Cra 8 #7/16","3265142350");
insert into clientes (nombre, direccion, telefono) values("Frankin Peñaranda","Cll 5 #9/63","3256879140");
insert into clientes (nombre, direccion, telefono) values("Ruben Mendez","Cra 3 #15/2","3952104623");
insert into clientes (nombre, direccion, telefono) values("Evelin Palencia","Cll 9 #1/2","3256981036");
insert into clientes (nombre, direccion, telefono) values("Jony Vargas","Cra 2 #10/11","3256980032");
insert into clientes (nombre, direccion, telefono) values("Darsy Caicedo","Cll 6 #7/14","3265105566");
insert into clientes (nombre, direccion, telefono) values("Jerson Tamayo","Cra 8 #13/45","3985326655");
select *from clientes;

insert into proveedores (nombre, direccion, telefono) values ('Lee Amorts', '7656 Menomonie Drive', '849-304-1821');
insert into proveedores (nombre, direccion, telefono) values ('Annecorinne Blazej', '67 Goodland Crossing', '100-781-9657');
insert into proveedores (nombre, direccion, telefono) values ('Purcell Colhoun', '59 Cambridge Terrace', '511-525-1208');
insert into proveedores (nombre, direccion, telefono) values ('Loree Barwack', '7 Meadow Vale Court', '448-985-8393');
insert into proveedores (nombre, direccion, telefono) values ('Ruy Sketcher', '18743 Buell Crossing', '135-199-5048');
insert into proveedores (nombre, direccion, telefono) values ('Gabbey Montilla', '32765 Cottonwood Circle', '618-137-0672');
insert into proveedores (nombre, direccion, telefono) values ('Jodee Ramsden', '5 Dennis Terrace', '247-675-5334');
insert into proveedores (nombre, direccion, telefono) values ('Martina Eglin', '6 Monterey Crossing', '200-322-8905');
insert into proveedores (nombre, direccion, telefono) values ('Auguste Hembry', '15655 Fallview Point', '449-233-5879');
insert into proveedores (nombre, direccion, telefono) values ('Blondy Bridgement', '46 Sage Road', '703-400-4489');
insert into proveedores (nombre, direccion, telefono) values ('Donaugh Dowsett', '8664 Victoria Plaza', '421-299-2257');
insert into proveedores (nombre, direccion, telefono) values ('Neila Blunden', '6 Hermina Crossing', '802-844-4562');
insert into proveedores (nombre, direccion, telefono) values ('Daron Huff', '7238 Meadow Vale Parkway', '645-307-4450');
insert into proveedores (nombre, direccion, telefono) values ('Verine Laurent', '15441 Valley Edge Circle', '958-280-3359');
insert into proveedores (nombre, direccion, telefono) values ('Riane McFadin', '29298 Amoth Junction', '961-213-2028');
insert into proveedores (nombre, direccion, telefono) values ('Beverlie Bartlomieczak', '8059 Reindahl Drive', '234-558-2789');
insert into proveedores (nombre, direccion, telefono) values ('Phip Kruschev', '7131 Stone Corner Circle', '609-130-7221');
insert into proveedores (nombre, direccion, telefono) values ('Calhoun Craigg', '79 Lighthouse Bay Point', '728-706-6441');
insert into proveedores (nombre, direccion, telefono) values ('Estelle Fairest', '479 Manley Trail', '800-314-5956');
insert into proveedores (nombre, direccion, telefono) values ('Thomasina Kobiera', '78236 Mallory Way', '744-614-7728');
select * from proveedores;

insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Aguacate","1500000","2020-3-5","2022-3-5");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Mango","1900000","2022-10-23","2023-2-15");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Ciruela","1300000","2022-5-28","2023-4-22");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Durazno","1700000","2022-8-8","2022-12-16");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Tomate","800000","2022-7-5","2022-12-9");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Fresa","1600000","2022-10-11","2023-4-13");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Maiz","1000000","2022-7-19","2022-10-25");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Kiwi","2000000","2022-5-30","2022-12-3");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Mandarina","500000","2021-11-8","2022-12-2");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Naranja","700000","2022-2-12","2023-1-13");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Uva","1800000","2022-10-30","2023-4-30");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Toronja","900000","2022-04-6","2023-05-15");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Perejil","400000","2023-01-1","2023-4-9");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Zanahoria","500000","2023-1-29","2023-5-15");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Cebolla","600000","2022-6-01","2022-10-09");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Cilantro","200000","2022-12-28","2023-4-8");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Lechuga","300000","2023-1-29","2023-05-20");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Banano","1100000","2022-5-17","2023-02-27");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Ajo","100000","2022-11-7","2023-04-9");
insert into productos (nombre_producto, precio_semilla, inicio_siembra,fin_recolecta) values("Papa","1400000","2022-7-14","2022-12-15");
select *from productos;

insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (1, '2020-03-16', '2022-03-15', 17000000, null);
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (2, '2020-03-10', '2022-12-14', 25000000, 'velit nec nisi');
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (3, '2020-06-25', '2021-08-28', 15000000, null );
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (4, '2020-03-29', '2022-06-23', 20000000, 'vel est donec');
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (5, '2021-09-01', '2023-03-07', 10000000, null);
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (6, '2022-07-24', '2022-06-03', 19000000, 'ut volutpat sapien');
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (7, '2020-11-28', '2022-03-20', 12000000, 'tortor');
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (8, '2021-10-15', '2023-01-20', 27000000, null);
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (9, '2020-08-30', '2021-10-30', 7000000, 'sapien');
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (10, '2021-12-20', '2022-05-01', 8000000, 'at diam nam');
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (11, '2021-09-24', '2022-07-30', 23000000, null);
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (12, '2020-10-12', '2021-11-30', 11000000, 'nisl');
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (13, '2021-09-12', '2023-01-02', 5000000, 'tincidunt');
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (14, '2020-11-25', '2022-09-18', 6000000, 'odio elementum');
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (15, '2021-02-12', '2021-10-27', 8000000, null);
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (16, '2021-09-30', '2023-05-17', 3000000, 'arcu');
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (17, '2021-05-16', '2023-05-15', 4000000, null);
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (18, '2021-07-02', '2022-09-25', 13000000, 'pede');
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (19, '2022-06-01', '2022-07-06', 2000000, 'mi');
insert into cultivos (producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas) values (20, '2021-11-27', '2023-02-25', 16000000, null);
select * from cultivos;

insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-06-29', 'fertilizante', '250000', 'efectivo', 1,20);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-04-06', 'semilla', '548093', 'trasnferencia', 2,19);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2021-09-25', 'Tractor', '564474', 'efectivo', 3,18);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-10-21', 'fumigadora', '978373', 'efectivo', 4,17);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-04-13', 'cyto potasio', '888388', 'trasnferencia', 5,16);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2023-04-05', 'cytoboro', '995013', 'efectivo', 6,15);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-02-12', 'CHorticrop vecil', '922614', 'trasnferencia', 7,14);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-08-11', 'Cyto seed', '551906', 'efectivo', 8,13);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2021-12-25', 'rizotar', '580238', 'trasnferencia', 9,12);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-02-13', 'toros arada', '803407', 'trasnferencia', 10,11);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-03-10', 'lombriliq', '516671', 'trasnferencia', 11,10);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2023-02-22', 'rizofos', '999795', 'efectivo', 12,9);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2023-03-03', 'Rizotar', '870661', 'trasnferencia', 13,8);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2023-04-10', 'provicom', '636258', 'trasnferencia', 14,7);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-05-22', 'alquiler guadaña', '845045', 'trasnferencia', 15,6);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2021-10-27', 'diatomeas', '533636', 'efectivo', 16,5);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-12-03', 'cal', '766148', 'trasnferencia', 17,4);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-02-27', 'Bioestimulante', '834427', 'trasnferencia', 18,3);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2023-01-06', 'Yeso agricola', '569730', 'trasnferencia', 19,2);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-06-13', 'Roca fosforica', '527089', 'efectivo', 20,1);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2023-01-15', 'Humus liquido', '837026', 'trasnferencia', 12,19);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-07-04', 'Minerales', '577840', 'efectivo', 8,5);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2021-11-18', 'Picas', '775794', 'trasnferencia', 9,15);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-03-11', 'Imidacloprid', '638584', 'trasnferencia', 17,6);
insert into gastos (fecha_compra, articulo_comprado, monto_pagado, medio_pago, proveedor,cultivos_id_cultivo) values ('2022-01-14', 'GBetaciflutrin', '701377', 'trasnferencia', 5,16);
select * from gastos;

insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Deeanne Cluney', 'Programmer Analyst IV', 'Mydeo', '139-259-5860', 25, 'vestibulum', 1129637);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Reinold McGaughie', 'Electrical Engineer', 'Zoonoodle', '543-446-4179', 29, 'et ultrices posuere', 1208075);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Jacquetta Rain', 'Staff Accountant III', 'Voolith', '210-645-2722', 29, 'rhoncus', 1076926);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Bearnard Fossitt', 'Structural Analysis Engineer', 'Rooxo', '389-191-0014', 28, 'nonummy integer non', 968825);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Sibylle Kennelly', 'Sales Representative', 'Jazzy', '333-553-9952', 31, 'risus auctor', 926871);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Kristy Antonovic', 'Junior Executive', 'Tekfly', '520-313-2793', 22, 'vel sem', 909058);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Ingrid Klambt', 'Executive Secretary', 'Eamia', '249-150-0275', 24, 'duis bibendum morbi', 959207);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Wini Pimley', 'Social Worker', 'Meedoo', '608-356-2013', 25, 'eget', 945930);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Vallie Bennough', 'Design Engineer', 'Eamia', '113-769-5200', 29, 'at lorem', 1050145);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Dagny Slocom', 'Programmer Analyst II', 'Kanoodle', '293-871-2869', 32, 'convallis', 926409);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Morey Ianittello', 'Data Coordinator', 'Flashdog', '550-127-2948', 20, 'blandit nam nulla', 1040768);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Alena Phebee', 'Mechanical Systems Engineer', 'Skyvu', '269-851-7515', 26, 'interdum eu', 1227688);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Riane Jansens', 'Tax Accountant', 'Avaveo', '634-584-7431', 34, 'vestibulum velit', 1063765);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Dion Alcide', 'Account Executive', 'Dazzlesphere', '980-251-5285', 34, 'vulputate', 890903);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Mary Haton', 'Assistant Media Planner', 'Meetz', '537-656-4249', 33, 'ac lobortis vel', 1089203);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Blinni Caulkett', 'Budget/Accounting Analyst I', 'Topiczoom', '434-979-7736', 24, 'nulla mollis', 1094935);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Enrika Ruddock', 'Environmental Tech', 'Linklinks', '522-512-8845', 35, 'massa tempor', 900709);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Morgan Stephen', 'Payment Adjustment Coordinator', 'Jayo', '492-758-0028', 35, 'amet', 1189997);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Eba Heeran', 'VP Quality Control', 'Wordware', '165-351-8093', 21, 'curabitur gravida', 1061756);
insert into empleados (nombre_completo, cargo, eps, telefono, edad, beneficios, salario) values ('Junette Thiese', 'Marketing Assistant', 'Yozio', '772-557-8684', 26, 'lobortis convallis tortor', 860878);
select * from empleados;

insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2020-03-16', '2022-07-20', '54676',1);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2021-12-17', '2022-08-16', '49766',2);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2022-12-13', '2022-06-27', '38480',3);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2021-05-26', '2022-09-11', '47157',4);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2022-09-22', '2022-06-29', '72248',5);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2021-07-01', '2022-12-30', '71913',6);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2022-03-08', '2022-06-29', '65604',7);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2021-11-24', '2022-12-02', '52634',8);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2020-05-03', '2022-06-20', '45242',9);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2022-10-01', '2023-01-22', '34225',10);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2022-03-04', '2022-10-26', '33487',11);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2021-10-06', '2022-08-28', '45739',12);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2020-11-14', '2022-08-23', '52082',13);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2022-07-31', '2023-02-11', '55067',14);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2021-07-26', '2023-01-06', '42086',15);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2022-07-24', '2022-09-29', '32938',16);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2020-11-25', '2022-08-21', '66449',17);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2022-01-16', '2022-08-29', '46488',18);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2020-09-03', '2022-08-25', '57815',19);
insert into nomina (fecha_inicio_siembra, fecha_fin_recolecta, pago, empleados_id_empleado) values ('2020-11-22', '2022-09-07', '71050',20);
select* from nomina;

insert into ventas (fecha, cliente, cultivo, precio) values ('2023-03-13', 2, 2, 19410332);
insert into ventas (fecha, cliente, cultivo, precio) values ('2022-08-07', 3, 3, 21796159);
insert into ventas (fecha, cliente, cultivo, precio) values ('2022-09-01', 4, 4, 19596869);
insert into ventas (fecha, cliente, cultivo, precio) values ('2022-11-28', 5, 5, 22124886);
insert into ventas (fecha, cliente, cultivo, precio) values ('2023-04-26', 6, 6, 19715786);
insert into ventas (fecha, cliente, cultivo, precio) values ('2022-11-23', 7, 7, 24749566);
insert into ventas (fecha, cliente, cultivo, precio) values ('2023-03-09', 8, 8, 16982548);
insert into ventas (fecha, cliente, cultivo, precio) values ('2023-02-10', 9, 9, 25083423);
insert into ventas (fecha, cliente, cultivo, precio) values ('2023-04-24', 10, 10, 23276888);
insert into ventas (fecha, cliente, cultivo, precio) values ('2023-03-25', 11, 11, 15892748);
insert into ventas (fecha, cliente, cultivo, precio) values ('2023-05-13', 12, 12, 24332879);
insert into ventas (fecha, cliente, cultivo, precio) values ('2023-02-07', 13, 13, 14666638);
insert into ventas (fecha, cliente, cultivo, precio) values ('2022-12-26', 14, 14, 15140990);
insert into ventas (fecha, cliente, cultivo, precio) values ('2022-09-05', 15, 15, 17165417);
insert into ventas (fecha, cliente, cultivo, precio) values ('2022-12-23', 16, 16, 18260681);
insert into ventas (fecha, cliente, cultivo, precio) values ('2023-04-30', 17, 17, 17366843);
insert into ventas (fecha, cliente, cultivo, precio) values ('2023-03-04', 18, 18, 16648594);
insert into ventas (fecha, cliente, cultivo, precio) values ('2022-07-17', 19, 19, 13623348);
insert into ventas (fecha, cliente, cultivo, precio) values ('2022-10-09', 20, 20, 23072625);
insert into ventas (fecha, cliente, cultivo, precio) values ('2022-10-20', 1, 1, 25093791);
select*from ventas;

insert into empleados_has_cultivos (id_empleado, id_cultivo) values (1, 1);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (2, 2);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (3, 3);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (4, 4);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (5, 5);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (6, 6);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (7, 7);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (8, 8);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (9, 9);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (10, 10);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (11, 11);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (12, 12);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (13, 13);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (14, 14);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (15, 15);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (16, 16);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (17, 17);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (18, 18);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (19, 19);
insert into empleados_has_cultivos (id_empleado, id_cultivo) values (20, 20);
select * from empleados_has_cultivos;