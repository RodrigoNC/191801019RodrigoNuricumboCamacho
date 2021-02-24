
import Proyecto.Almacen;
import Proyecto.Empleado;
import Proyecto.Medicamento;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class TestProyecto {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Empleado empleado= new Empleado();
        Medicamento medicamento= new Medicamento();
        Almacen almacen= new Almacen();
        
        
        medicamento.setNombreMedicamento("Paracetamol");
        medicamento.setTipo("Tranquilizante");
        medicamento.setVolumen(500);
        medicamento.setFechaCaducidad(2021);
        almacen.agregarMedicamento(medicamento);
        
        almacen.setNombreAlmacen("Vacunación");
        almacen.setHoraInicio(8);
        almacen.setHoraFin(18);
        System.out.println(almacen);
        System.out.println(almacen.imprimirEmpleado());
        System.out.println(almacen.imprimirMedicamento());
        
        int opcion=0;
        do{
            System.out.println(almacen);
            System.out.println("Elige una opción: ");
            System.out.println("1-Agregar empleado");
            System.out.println("2-Agregar medicamento");
            System.out.println("3-Ver empleados registrados");
            System.out.println("4-Ver medicamentos registrados");
            System.out.println("5-Asociar cargos");
            System.out.println("6-Ver número de empleados");
            System.out.println("7-Ver número de medicamentos");
            System.out.println("8-Salir");
            System.out.println("Opción: ");
            opcion= scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Inserta el nombre del empleado: ");
                    String nombre= scanner.nextLine();
                    empleado.setNombre(nombre);
                    System.out.println("Inserta el apellido paterno del empleado: ");
                    String apellidoPaterno= scanner.nextLine();
                    empleado.setApellidoPaterno(apellidoPaterno);
                    System.out.println("Inserta el apellido materno del empleado: ");
                    String apellidoMaterno= scanner.nextLine();
                    empleado.setApellidoMaterno(apellidoMaterno);
                    System.out.println("Inserta la edad del empleado: ");
                    int edad= scanner.nextInt();
                    empleado.setEdad(edad);
                    System.out.println("Inserta el RFC del empleado: ");
                    int rfc= scanner.nextInt();
                    empleado.setRfc(rfc);
                    System.out.println("Inserta el cargo del empleado: ");
                    String cargo= scanner.nextLine();
                    empleado.setCargo(cargo);
                    System.out.println("Inserta el sueldo del empleado: ");
                    int sueldo= scanner.nextInt();
                    empleado.setSueldo(sueldo);
                    almacen.agregarEmpleado(empleado);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println(almacen.imprimirEmpleadoCompleto());
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
        while(opcion!=8);
    }
}
