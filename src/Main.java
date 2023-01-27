import javax.swing.JOptionPane;

public class Main {


    public static void main(String[] args) {

        //practica_1();
        //practica_2();
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

        double porcentaje = (uma_2 - uma_1)/uma_1 * 100;

        JOptionPane.showMessageDialog(null, String.format("La inflación fue de %.1f%%", porcentaje));
    }


    static void practica_3(){

    }

}