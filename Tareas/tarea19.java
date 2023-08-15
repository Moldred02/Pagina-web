//Nombre: Hugo Alejandro Garcia Rodriguez
//Matricula: 1945201
//Grupo: 011
//Clase: Lenguajes de programacion


import java.util.Scanner;

public class tarea19 {


    public static void main(String[]args)
    {
        var lec= new Scanner(System.in);

        int n=0,x,i;
        int[] A = new int[10];
        System.out.println("Que numero  deseas encontrar?");
        x= lec.nextInt();

        for(i=0; i<10; i++)
        {
            System.out.println("Digite el numero de la posicion ["+ (i+1)+"]");
            A[i]= lec.nextInt();
            
            if(x==A[i])
            {
                n++;
            }
        }

        if(n==0)
        {
            System.out.println("\n\n\nNo se ha encontrado "+x+ " en el arreglo..");
        }
        else
        {
            System.out.println("\n\n\nEl numero "+x+" se encontro "+n+" veces..");
        }
       


        for(i=0; i<10; i++)
        {
            System.out.print("\t"+A[i]);
        }
        

    }
}
