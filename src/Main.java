import javax.swing.JOptionPane;

public class Main {


    public static void main(String[] args){

        //practica_1();
        //practica_2();
        practica_3();
    }


    static void practica_1(){

        //Entrada de datos
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el día: "));
        String mes = JOptionPane.showInputDialog(null, "Ingrese el mes del año: ");
        mes = mes == null? "": mes.trim().toLowerCase();

        String estacion = "";

        //Switch para asignación de estaciones
        switch (mes){
            case "enero":
            case "febrero":
                estacion = "invierno";
                break;

            case "marzo":
                estacion = dia < 20? "invierno": "primavera";
                break;

            case "abril":
            case "mayo":
                estacion = "primavera";
                break;

            case "junio":
                estacion = dia < 21? "primavera": "verano";
                break;

            case "julio":
            case "agosto":
                estacion = "verano";
                break;

            case "septiembre":
                estacion = dia < 23? "verano": "otoño";
                break;

            case "octubre":
            case "noviembre":
                estacion = "otoño";
                break;

            case "diciembre":
                estacion = dia < 22? "otoño": "invierno";
                break;

            default:
                dia = 0;
        }

        //Mensajes de error
        if(mes.equals(""))
            return;
        if(dia == 0) {
            JOptionPane.showMessageDialog(null, String.format("El mes %s no existe", mes));
            return;
        }

        //Despliegue del resultado
        estacion = String.format("El día %d de %s es %s", dia, mes, estacion);
        JOptionPane.showMessageDialog(null, estacion);
    }


    static void practica_2(){

        //Entrada de datos
        double uma_1 = Double.parseDouble(JOptionPane.showInputDialog(null, "UMA del año anterior: "));
        double uma_2 = Double.parseDouble(JOptionPane.showInputDialog(null, "UMA de este año: "));

        //Formula
        double porcentaje = (uma_2 - uma_1)/uma_1 * 100;

        //Impresión
        JOptionPane.showMessageDialog(null, String.format("La inflación fue de %.1f%%", porcentaje));
    }


    static void practica_3(){

        //Entrada de datos
        String telefono = JOptionPane.showInputDialog(null, "Escriba el número");
        if(telefono == null || telefono.equals(""))
            return;
        String guardadito = telefono;

        //Limpieza del string
        telefono = telefono.replace(" ", "");
        telefono = telefono.replace("(","").replace(")","");
        telefono = telefono.replaceAll("-", "");

        String lada = telefono.substring(0,2);

        //Identificación del número
        if(telefono.length() != 10) {
            JOptionPane.showMessageDialog(null, String.format("El telefono %s no es valido", guardadito));
            return;
        }

        if(lada.equals("33"))
            JOptionPane.showMessageDialog(null, String.format("El telefono %s es de Guadalajara", guardadito));
        else if (lada.equals("55"))
            JOptionPane.showMessageDialog(null, String.format("El telefono %s es de la CDMX", guardadito));
        else if (lada.equals("81"))
            JOptionPane.showMessageDialog(null, String.format("El telefono %s es de Monterrey", guardadito));

    }

}