


import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ProyectoFacturación {

    public static void main(String[] args) {      
        Conta con = new Conta();
        Fact fac = new Fact();
        cli c = new cli();
        
        String continuar="";
        String[][] matrix = new String[6][5];
        c.cargarMatriz(matrix);
        c.UsuariosPredeterminados(matrix);
        int contador=5;
        
         while (continuar!="S")
            {DesplegarMenu();
           continuar= ControlarOpcion(con, fac, c, matrix,contador);
            // date time
        } 
        
    }
    
    public static String ControlarOpcion (Conta p, Fact s, cli c,String matrix[][], int contador){
    Scanner teclado = new Scanner(System.in);
        int respuesta;
        
        respuesta = teclado.nextInt();
        
//        String[][] matrix = new String[6][6];
//        c.cargarMatriz(matrix);
//        c.UsuariosPredeterminados(matrix);
        
        switch ( respuesta ) {
            case 1:
                System.out.println("Opcion 1");

                
                
                return "X";  
                
            case 2:
                System.out.println("Opcion 2 ");               

              
                return "X";
            case 3:
                System.out.println("Opcion 3 ");
                System.out.println("");
                cli.menu(matrix,contador);
                System.out.println("");
                return "X";                
            case 4:
                System.out.println("Opcion Salir");                
                return "S";
     
            default:
                return "";
                    
        } 

    }
        public static void DesplegarMenu(){
     System.out.println("===================================================");
     System.out.println("\\    Estetica Canina S.O.S                       /");
     System.out.println("\\   1-Contabilidad                               /");
     System.out.println("\\   2-Facturacion                                /");
     System.out.println("\\   3-Clientes                                   /");
     System.out.println("\\   4-SALIR                                      /");
     System.out.println("===================================================");
    System.out.print("Su opción:[  ]"+"\b");
    }
}
