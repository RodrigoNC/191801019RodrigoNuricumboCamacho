
import Proyecto.Cliente;
import Proyecto.Empresa;
import Proyecto.Trabajador;
import java.util.ArrayList;
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
public class TestEmpresa {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Empresa empresa= new Empresa();
        int opcion=7;
        do{
            System.out.println("Elige una opción: ");
            System.out.println("1-Agregar cliente: ");
            System.out.println("2- Agregar Trabajador: ");
            System.out.println("3- Agregar Actividad: ");
            System.out.println("4- Mostrar clientes: ");
            System.out.println("5- Mostrar trabajadores: ");
            System.out.println("6- Mostrar actividades: ");
            opcion= scanner.nextInt();
            switch(opcion){
                case 1:
                    Cliente nuevoCliente= new Cliente();
                    System.out.println("Inserta el nombre del cliente: ");
                    String nombre= scanner.nextLine();
                    nuevoCliente.setNombre(nombre);
                    nuevoCliente.getNombre();
                    System.out.println("Inserta el apellido paterno del cliente: ");
                    String apellidoPaterno= scanner.nextLine();
                    nuevoCliente.setApellidoPaterno(apellidoPaterno);
                    nuevoCliente.getApellidoPaterno();
                    System.out.println("Inserta el apellido materno del cliente: ");
                    String apellidoMaterno= scanner.nextLine();
                    nuevoCliente.setApellidoMaterno(apellidoMaterno);
                    nuevoCliente.getApellidoMaterno();
                    System.out.println("Inserta el sexo del cliente: ");
                    String sexo= scanner.nextLine();
                    nuevoCliente.setSexo(sexo);
                    nuevoCliente.getSexo();
                    System.out.println("Inserta el rfc del cliente: ");
                    int rfc= scanner.nextInt();
                    nuevoCliente.setRfc(rfc);
                    nuevoCliente.getRfc();
                    empresa.agregarCliente(nuevoCliente);
                    empresa.cantidadClientes();
                    break;
                case 2:
                    System.out.println("Inserta el nombre del trabajador: ");
                    String nombreT= scanner.nextLine();
                    System.out.println("Inserta el apellido paterno del trabajador: ");
                    String apellidoPaternoT= scanner.nextLine();
                    System.out.println("Inserta el apellido materno del trabajador: ");
                    String apellidoMaternoT= scanner.nextLine();
                    System.out.println("Inserta el sexo del trabajador: ");
                    String sexoT= scanner.nextLine();
                    System.out.println("Inserta el rfc del trabajador: ");
                    int rfcT= scanner.nextInt();
                    System.out.println("Inserta el cargo del trabajador: ");
                    String cargoT= scanner.nextLine();
                    System.out.println("Inserta el sueldo del trabajador: ");
                    int sueldoT= scanner.nextInt();
                    Trabajador nuevoTrabajador= new Trabajador(cargoT, true, true, rfcT, sueldoT, nombreT, apellidoPaternoT, apellidoMaternoT, sexoT);
                    break;
                case 3:
                    System.out.println(empresa.cantidadClientes());
                    break;
            }
        }
        while(opcion!=7);
    }
}