import java.util.HashMap;

public class Colegio {
    ///ArrayList<String> alumnosNac = new ArrayList<>();
    HashMap<String, Integer> alumnosNac = new HashMap<>();
    //HashMap<String, Alumno> alumnosNac = new HashMap<>();

    public Colegio(){

    }

    public void agregarAlumno(Alumno alumno) {
        if (alumno.getNacionalidad() != null && !alumno.getNacionalidad().isBlank()) {
            if (alumnosNac.containsKey(alumno.getNacionalidad()))
                alumnosNac.replace(alumno.getNacionalidad(), 1);///agregar?
            else
                alumnosNac.put(alumno.getNacionalidad(), 1);
        }
    }

    public int prueba(int x){
        try{
            if(x%2 == 0) {
                throw new Exception("lanzando excepcion");
            }
            return 1;
        } catch (Exception e) {
            e.getMessage().concat("rompi todo y pase por catch");
            return 2;
        }
        finally {
            return 3;
        }
    }

    public void verNacionalidad(String nacionalidad) {
        System.out.println("nacionalidad: " + nacionalidad + "   cantidad: ");///y poner cantidad

    }

    public void cuantos() {
        int cant = 0;
        for (String clave : alumnosNac.keySet())
            cant++;

        System.out.println("hay " + cant + " nacionalidades distintas");
    }

    public void borrar(Alumno alumno) {
        //if (alumnosNac.containsKey(alumno.getNacionalidad()))
            alumnosNac.remove(alumno.getNacionalidad());///devuelve null si no hay nada
    }

    public void verTodos() {
        for (String clave : alumnosNac.keySet()) {
            System.out.println("nacionalidad: " + clave + "  cantidad:");
            System.out.println(alumnosNac.get(clave)); ///asi muestra valor??
        }
    }
}
