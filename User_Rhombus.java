import java.util.Scanner;
/**
 * Write a description of class User_Rhombus here.
 *
 * Saulo Bosquez
 * v1.1
 */
public class User_Rhombus
{
    public static void main ()
    {
        int size,mid;
        int i,j,h;
        char ch;
        size = 0;
        Scanner leerDatos = new Scanner (System.in);
        Scanner datos = new Scanner (System.in);
        System.out.print('\u000c');
        System.out.println("Ingrese el número de filas deseadas del rombo: ");
        size = leerDatos.nextInt();
        System.out.println("Ingrese el carácter que desea usar: ");
        ch = datos.next().charAt(0);
        System.out.println();
        mid = (size)/2;
        h = 1;
        for (i = mid; i > 0; i--)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (j = 1; j <= h; j++)
            {
                System.out.print(ch + " ");
            }  
            h++;
            System.out.println();
        }
        for (i = 0; i <= mid; i++) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print(" ");
            }
            for (j = h; j > 0; j--) 
            {
                    System.out.print(ch + " ");
            }
            h--;
            System.out.println();
        }
    }
}
