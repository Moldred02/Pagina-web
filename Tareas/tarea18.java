//Nombre: Hugo Alejandro Garcia Rodriguez
//Matricula: 1945201
//Grupo: 011
//Clase: Lenguajes de programacion


import java.util.Scanner;

public class tarea18 {
    public static void main(String[]args)
    {
        Scanner lec =new Scanner(System.in);
        int n;
        int i;
        int potencia=1;
        double serie;
        System.out.println("Cuantos numeros?: ");
        n=lec.nextInt();

        for(i=0; i<n; i++)
        {
            serie=Math.pow((i+1),potencia);
            System.out.println(""+serie+",");
            potencia+=2;
            
        }
    }
}
