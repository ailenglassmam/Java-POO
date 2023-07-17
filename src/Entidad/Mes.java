package Entidad;

/**
     * Crea una clase en Java donde declares una variable de tipo array de
     * Strings que contenga los doce meses del año, en minúsculas. A
     * continuación, declara una variable mesSecreto de tipo String, y hazla
     * igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. 
 */

public class Mes {
    private final String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private final String mesSecreto = mes[mes.length - 1];

    public Mes() {
    }

    public String[] getMes() {
        return mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
    
}

