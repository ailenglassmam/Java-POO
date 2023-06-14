package Entidad;

//el nombre de la clase tiene que iniciar en mayus (si es más de una palabra, formato camelCase) y debe estar en SINGULAR

public class Persona {
    private String nombre;
    public String apellido;
    public String pasatiempo;
    
    // creación de constructor (alt + insert es el comando para generar el constructor automaticamente)
    //los constructores NO pueden repetirse
    // los constructores pueden recibir parametros
    //this refiere al atributo de la clase en donde estoy
        // y nombre es el valor que va a 
    
    
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //para crear un encapsulamiento (protección de atributos) lo que puedo hacer es crear un setter
    //el encapsulamiento es para datos PRIVADOS
    // con el setter puedo tomar un atributo y cambiarle su valor
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //con el getter entro en la clase, obtengo el atributo que necesito y su valor para posterior uso
    
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", pasatiempo=" + pasatiempo + '}';
    }
    
    
    
    
    
    
}
