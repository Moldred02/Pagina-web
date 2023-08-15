//Nombre: Hugo Alejandro Garcia Rodriguez
//Matricula: 1945201
//Grupo: 011
//Clase: Lenguajes de programacion

import javax.swing.JOptionPane;

public class tarea17 {
    public static void main(String[] args)
    {
        String [] menu={"Dolar","Euro","Yen","Dolar de Hong Kong"};
        int opcion;
        float c;
        double p;
        

       
        c = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite la temperatura:"));
          

        opcion = JOptionPane.showOptionDialog ( null, "Selecciona la conversion de moneda ", "A continuación se le mostrara:", 
        JOptionPane.YES_NO_CANCEL_OPTION,  JOptionPane.INFORMATION_MESSAGE, 
        null, 
        menu,  menu[0]);

        

        switch(opcion)
        {
            case 0:
                p= c*0.048;
                System.out.println("Son "+p+" dolares");
                break;
            case 1:
                p= c*0.041;
                System.out.println("Son "+p+" euros");
                break;
            
            case 2:
                p=c*5.47;
                System.out.println("Son "+p+" yenes");
                break;

            case 3:
                p=c*0.37;
                System.out.println("Son "+p+" hongkones");
                break;
            
            default:
                System.out.println("Ha ocurrido un error.");
                break;
        }

    }
}