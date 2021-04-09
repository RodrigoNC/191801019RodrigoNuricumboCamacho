
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
        Almacen almacen= new Almacen();
        
        
        almacen.setNombreAlmacen("Vacunación");
        almacen.setHoraInicio(8);
        almacen.setHoraFin(18);
        
        int opcion=0;
        do{
            System.out.println("\n");
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
            scanner.nextLine();
            switch(opcion){
                case 1:
                    Empleado empleado= new Empleado();
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
                    scanner.nextLine();
                    empleado.setRfc(rfc);
                    System.out.println("Inserta el cargo del empleado: ");
                    String cargo= scanner.nextLine();
                    empleado.setCargo(cargo);
                    System.out.println("Inserta el sueldo del empleado: ");
                    int sueldo= scanner.nextInt();
                    scanner.nextLine();
                    empleado.setSueldo(sueldo);
                    almacen.agregarEmpleado(empleado);
                    break;
                case 2:
                    Medicamento medicamento= new Medicamento();
                    System.out.println("Inserta el nombre del medicamento: ");
                    String nombreMedicamento= scanner.nextLine();
                    medicamento.setNombreMedicamento(nombreMedicamento);
                    System.out.println("Inserta el tipo de medicamento: ");
                    String tipoMedicamento= scanner.nextLine();
                    medicamento.setTipo(tipoMedicamento);
                    System.out.println("Inserta el volumen (ml) del medicamento: ");
                    int volumen= scanner.nextInt();
                    scanner.nextLine();
                    medicamento.setVolumen(volumen);
                    System.out.println("Inserta el año de caducidad del medicamento: ");
                    String anio= scanner.nextLine();
                    scanner.nextLine();
                    medicamento.setFechaCaducidad(anio);
                    System.out.println("Inserta la clave del medicamento: ");
                    int clave= scanner.nextInt();
                    scanner.nextLine();
                    medicamento.setClave(clave);
                    almacen.agregarMedicamento(medicamento);
                    break;
                case 3:
                    if(almacen.cantidadEmpleados()!=0){
                        System.out.println(almacen.imprimirEmpleadoCompleto());
                    }
                    else{
                        System.out.println("No hay empleados registrados");
                    }
                    break;
                case 4:
                    if(almacen.cantidadMedicamentos()!=0){
                        System.out.println(almacen.imprimirMedicamentoCompleto());
                    }
                    else{
                        System.out.println("No hay medicamentos registrados");
                    }
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("La cantidad de empleados registrados es "+almacen.cantidadEmpleados());
                    break;
                case 7:
                    System.out.println("La cantidad de medicamentos registrados es "+almacen.cantidadMedicamentos());
                    break;
                case 8:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
        while(opcion!=8);
    }
}
