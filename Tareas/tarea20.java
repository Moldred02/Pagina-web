//Nombre: Hugo Alejandro Garcia Rodriguez
//Matricula: 1945201
//Grupo: 011
//Clase: Lenguajes de programacion

import java.util.Scanner;

public class tarea20 {


    public static void main(String[]args)
    {
        var lec= new Scanner(System.in);

        int n=0,x,i,m,j;
        System.out.println("Dimension de la matriz?: ");
        m= lec.nextInt();
        int[][] A = new int[m][m];
        System.out.println("Que numero  deseas encontrar?");
        x= lec.nextInt();

        for(i=0; i<m; i++)
        {
            for (j=0; j<m; j++)
            {
                System.out.println("Digite el numero de la posicion ["+ (i+1)+"]"+"["+(j+1)+"]");
                 A[i][j]= lec.nextInt();
            
                 if(x==A[i][j])
                 {
                     n++;
                }
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
       


        for(i=0; i<m; i++)
        {
            for(j=0; j<m; j++)
            {
                System.out.print("\t"+A[i][j]);
            }
            System.out.println("");
           
        }
        

    }
}
