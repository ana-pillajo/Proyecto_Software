public class MainProyecto {

    public static void main(String[] args) {

        Proyecto proyecto = new Proyecto();
        proyecto.setNombre("Sistema de Ventas");
        proyecto.setResponsable("Anita");
        proyecto.setProgreso(12);

        System.out.println("Nombre: " + proyecto.getNombre());
        System.out.println("Responsable: " + proyecto.getResponsable());
        System.out.println("Progreso: " + proyecto.getProgreso());

        proyecto.setProgreso(150);

        proyecto.avanzar(30);
        System.out.println("Progreso: " + proyecto.getProgreso());

        proyecto.avanzar(40);
        System.out.println("Progreso: " + proyecto.getProgreso());
    }
}