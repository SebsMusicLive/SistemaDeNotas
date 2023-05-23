/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaNotas;

/**
 *
 * @author ASUS
 */
public class Prueba {

    public static void main(String[] args) throws Exception {
        SistemaNotas sistema = new SistemaNotas();

        Estudiante e = new Estudiante();
        e = new Estudiante(1152196, "Sebastian Lopez", 4.2, 2.3, 4.5, 5);
        sistema.crearPilas(e, "Ingles");
        e = new Estudiante(9857452, "Jhoana Alvalucia", 2, 2.3, 1, 5);
        sistema.crearPilas(e, "Ingles");
        e = new Estudiante(9674152, "Eva Rostamorsio", 2, 2.3, 4.5, 5);
        sistema.crearPilas(e, "Ingles");
        e = new Estudiante(6351457, "Aleos Go", 1, 3, 2, 5);
        sistema.crearPilas(e, "Ingles");
        e = new Estudiante(2563987, "Juan Yepes", 1, 1, 0.5, 5);
        sistema.crearPilas(e, "programacion");
        e = new Estudiante(5868452, "Abelardo Marin", 2, 1, 0.5, 3);
        sistema.crearPilas(e, "programacion");
        e = new Estudiante(94485746, "Maria Castillo", 5,3, 4, 5);
        sistema.crearPilas(e, "programacion");
        e = new Estudiante(5844879, "Alejandro Rojas", 2, 4, 4.5, 3);
        sistema.crearPilas(e, "calculo");
        e = new Estudiante(5248667, "Johan Ortega", 2, 1, 4, 2);
        sistema.crearPilas(e, "calculo");
        e = new Estudiante(88775552, "Jesus Castilla", 2, 2, 2, 3);
        sistema.crearPilas(e, "calculo");
        e = new Estudiante(10050288, "Alberto Pineda", 2, 4, 4.5, 3);
        sistema.crearPilas(e, "calculo");
        
        System.out.println(sistema.imprimirReprobados());
        System.out.println(sistema.imprimirAprobados());
    }
}
