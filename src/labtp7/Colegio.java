package labtp7;

/**
 *
 * @author Leandro Sturniolo
 */
public class Colegio {

    public static void main(String[] args) {
        // a)
        Materia ingles1 = new Materia(1, "Inglés 1", 1);
        Materia matematicas1 = new Materia(2, "Matemáticas 1", 1);
        Materia laboratorio1 = new Materia(3, "Laboratorio 1", 1);
        // b)
        Alumno lopezmartin = new Alumno(1001, "López", "Martin");
        Alumno martinezbrenda = new Alumno(1002, "Martínez", "Brenda");
        // c)
        lopezmartin.agregarMateria(ingles1);
        lopezmartin.agregarMateria(matematicas1);
        lopezmartin.agregarMateria(laboratorio1);
        // d)
        martinezbrenda.agregarMateria(ingles1);
        martinezbrenda.agregarMateria(matematicas1);
        martinezbrenda.agregarMateria(laboratorio1);
        martinezbrenda.agregarMateria(laboratorio1);
        // e)
        System.out.println("Cantidad de materias en las que está inscripto López:    " + lopezmartin.cantidadMaterias());
        System.out.println("Cantidad de materias en las que está inscripto Martínez: " + martinezbrenda.cantidadMaterias());
        /* e) a. Tienen la misma cantidad de materias porque hay lógica en la clase Alumno
                para que no se pueda inscribir en una materia más de una sola vez
              
              b. Podría haber usado alguna colección que implemente la interfaz Set,
                pero decidí usar un ArrayList y programar la lógica al agregar una materia
                porque me pareció más sencillo en este caso
        */
    }
}
