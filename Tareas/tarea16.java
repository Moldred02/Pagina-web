
//Nombre: Hugo Alejandro Garcia Rodriguez
//Matricula: 1945201
//Grupo: 011
//Clase: Lenguajes de programacion

import javax.swing.JOptionPane;

public class tarea16 {
    public static void main(String[] args)
    {
        String [] menu={"Grados Centigrados a F","Grados Farenheit a C"};
        int opcion;
        float t;
        double g;

         t = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite la temperatura:")); 

        
        opcion = JOptionPane.showOptionDialog ( null, "Conversion de: ", "A continuación se le mostrara:", 
                         JOptionPane.YES_NO_CANCEL_OPTION,  JOptionPane.INFORMATION_MESSAGE, 
                         null, 
                         menu,  menu[0]);


        switch(opcion)
        {
            case 0:
                g= (t*1.8)+32;
                System.out.println("Son "+g+" graods Farenheit");
                break;
            case 1:
                g= (t-32)/1.8;
                System.out.println("Son "+g+" graods Centigrados");
                break;
            default:
                System.out.println("Ha ocurrido un error.");
                break;
        }

    }
}
