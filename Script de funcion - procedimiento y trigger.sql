SET GLOBAL log_bin_trust_function_creators = 1;
select promedio_precio_cultivo();
call listar_ventas_mayores_a(15000000,20000000);
delete from cultivos where id_cultivo = 20;
select * from empleados_has_cultivos;
select * from ventas;
delete from empleados where id_empleado=5;
select* from empleados_has_cultivos;
select*from nomina;

drop trigger eliminar_cultivo;

delimiter $$
create function promedio_precio_cultivo()
	returns varchar(100) 
    begin 
		declare promedio double;
        declare salida varchar(100);
        set promedio=(select avg(precio_venta)from cultivos);
        set salida=(select concat("El promedio del precio de los cultivos: ",promedio));
        return salida;
    end
$$ 


delimiter //
create procedure listar_ventas_mayores_a(in valor double, in valor2 double)
	begin
		select * from ventas where precio between valor and valor2;
    end
//

delimiter //
create trigger eliminar_cultivo
	before delete on cultivos
    for each row
    begin
    delete from empleados_has_cultivos where empleados_has_cultivos.id_cultivo = old.id_cultivo;
    delete from gastos where gastos.cultivos_id_cultivo=old.id_cultivo;
    delete from ventas where ventas.cultivo = old.id_cultivo;
    end
//

delimiter //
create trigger eliminar_empleado
	before delete on empleados
    for each row
    begin
    delete from empleados_has_cultivos where empleados_has_cultivos.id_empleado=old.id_empleado;
    delete from nomina where nomina.empleados_id_empleado=old.id_empleado;
    end
//

