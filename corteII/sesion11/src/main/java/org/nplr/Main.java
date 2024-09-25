package org.nplr;

import org.nplr.dao.StudentDAO;
import org.nplr.models.Student;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sesion September 24, 2024");

        // crear instancia
        Student richard = new Student("23010471", "Richard", "Romero", "rlacayo@uamv.edu.ni", "3216957");
        Student pavel = new Student("22011275", "Pavel", "Lacayo", "nplacayo@uamv.edu.ni", "854356221");

        // Creacion del DAO
        StudentDAO studentDAO = new StudentDAO();
        System.out.println("Adding students...");
        studentDAO.create(richard);
        studentDAO.create(pavel);


        //  lista del estudiante
        System.out.println("\n" + "Mostrar lista de estudiantes:");
        for (Student student : studentDAO.showList()) {
            System.out.println(student);
        }

        // Datos del estudiante
        System.out.println("Adding another student...");
        Student Carlos = new Student("123314121", "Carlos", "Avalos", "carlos14@uamv.edu.ni", "2145466");
        studentDAO.create(Carlos);

        // Editar info del estudiante
        System.out.println("editar estudiante...");
        pavel.setNames("Direr");
        pavel.setSurnames("Martinez");
        studentDAO.update(pavel);

        //  lista actualizada de los estudiantes
        System.out.println("Mostrar lista de estudiantes:");
        for (Student student : studentDAO.showList()) {
            System.out.println(student);
        }
    }
}
