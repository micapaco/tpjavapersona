public class Persona {
    String nombre;
    String apellidos;
    String númeroDocumentoIndentidad;
    int añoNacimiento;
    String paisNacimiento;
    char genero;

    public Persona(String nombre, String apellidos, String númeroDocumentoIndentidad, int añoNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.númeroDocumentoIndentidad = númeroDocumentoIndentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    void imprimir () {
            System.out.println("Nombre=" + nombre);
            System.out.println("Apellidos=" + apellidos);
            System.out.println("Numero de documento de indentidad=" + númeroDocumentoIndentidad);
            System.out.println("Año de nacimiento=" + añoNacimiento);
            System.out.println("Pais de nacimiento="+ paisNacimiento);
            System.out.println("Genero="+ genero);
            System.out.println();
        }
    }