//Nombre: Hugo Alejandro Garcia Rodriguez
//Matricula: 1945201
//Grupo: 011
//Clase: Lenguajes de programacion


import java.util.Scanner;

public class tarea21 {


    public static void main(String[]args)
    {
        var lec= new Scanner(System.in);

        int i,m,j;
        System.out.println("Dimension de las matrices?: ");
        m= lec.nextInt();
        int[][] A = new int[m][m];
        int [][] B= new int[m][m];
        int [][] C= new int[m][m];

        System.out.println("Primera matriz: ");

        for(i=0; i<m; i++)
        {
            for (j=0; j<m; j++)
            {
                System.out.println("Digite el numero de la posicion ["+ (i+1)+"]"+"["+(j+1)+"]");
                 A[i][j]= lec.nextInt();
                
                
            }
            
        }

        System.out.println("\n\n\n\nSegunda matriz: ");

        for(i=0; i<m; i++)
        {
            for (j=0; j<m; j++)
            {
                System.out.println("Digite el numero de la posicion ["+ (i+1)+"]"+"["+(j+1)+"]");
                 B[i][j]= lec.nextInt();
                
                
            }
            
        }
        
        for(i=0; i<m; i++)
        {
            for (j=0; j<m; j++)
            {
               
                 C[i][j]= A[i][j]+B[i][j];
                
                
            }
            
        }

        System.out.println("\n\nEl resultado de la suma es:\n");

        for(i=0; i<m; i++)
        {
            for (j=0; j<m; j++)
            {
               
                System.out.print("\t"+C[i][j]);
                
                
            }
            System.out.println("");
        }




    
    }

}
