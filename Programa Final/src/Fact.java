


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Fact {
    static String strFecha;
    static String Lugar;
    static String Nombre;
    static String apellido;
    static int Numero_cedula_física_o_jurídica;
    static int Telefono;
    static String Servicio; 
    static String correo;
    static int costo; 
    static double Total;
    static double calculo_iva;
    static int opcion;
    


    public Fact() {
    }


    
    public static String SLugar(String Lg){
   
  
        Lugar = Lg;
        return Lugar;
    } 
    
        
        
        
        public static int STelefono(int Tel){
   
        
        Telefono = Tel;
        return Telefono;
    }   
        
   
        public static int SNumero_cedula_física_o_jurídica(int Nmc){
        
        Numero_cedula_física_o_jurídica =  Nmc;
        return Numero_cedula_física_o_jurídica;
    } 
        
        

                
        public static String SNombre(String Nm ){
   
         
         Nombre = Nm;
         return Nombre;

    } 
        
        
        public static String Sapellido(String Ap){
   
       
        
        apellido = Ap;
         return apellido;
    } 
        

        
        public static String Scorreo(String Ce){
   
       
        correo = Ce;    
        return correo;

    } 


     public static void SServicio(int Op){
         
        switch(Op){
            case 1: Servicio = "Grooming parcial";costo = 5000;break;
            case 2: Servicio = "Grooming Total";costo = 10000;break;
            default: JOptionPane.showMessageDialog(null, "Se requiere que seleccione un servicio paara continuar");
        } 
        
        SCalculoiva();
        SCalculofinal();
        Stiempo();
     }   
     
      public static String EServicio(int opcion ){
          return Servicio;
      }
      
       public static double SCalculoiva(){ 
       calculo_iva = costo *0.13;
       Total = costo + calculo_iva; 
       
       return calculo_iva;
      
}     
     public static double SCalculofinal(){ 
        Total = costo + calculo_iva;
        return Total;
     }  
     
    public static  String Stiempo(){
        Date Fecha = new Date();
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strFecha= formatter.format(Fecha);
        
        
        return strFecha;
        
         
    }
    
    public static void pregenerar_factura() {
        
        
        for (int x = 0; x <10; x++){
        int numero_factura = 0;
        String nombre_factura = "Factura ";
        String factura = nombre_factura + numero_factura++;
        
                try {
        FileWriter  fichero = new FileWriter("C:/Users/USER/Dropbox/Universidad/Fundamentos de progamacion/Proyecto/Sistema de Facturacion Estetica Canina/Registro de Facturas/"+ factura +".txt");
        } catch (IOException ex) {
            
        }
        
       
        }  
    }
    
    public static void generar_factura(){
       
       PrintWriter Facturacion = null;
        try {
        Facturacion = new PrintWriter("C:/Users/USER/Dropbox/Universidad/Fundamentos de progamacion/Proyecto/Sistema de Facturacion Estetica Canina/Registro de Facturas/"+ "factura 0.txt");
        } catch (FileNotFoundException ex) {

    }
        Date Fecha = new Date();
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strFecha= formatter.format(Fecha);
        
        Facturacion.println("======================== Estetica Canina S.O.S ========================");
        Facturacion.println("                                               ");
        Facturacion.println("Lugar                                              Dia/mes/año ");
        Facturacion.println("                                               ");
        Facturacion.println( Lugar+"                                            " + strFecha      );
        Facturacion.println("                                               ");
        Facturacion.println("                                               ");
        Facturacion.println("=======================================================================");
        Facturacion.println("Correo electronico de empresa:                     CaroBlanco1976@gmail.com  ");
        Facturacion.println("                                               ");
        Facturacion.println("Telefono de empresa:" +"                               "+ "60506713"        );
        Facturacion.println("                                               ");
        Facturacion.println("=======================================================================");
        Facturacion.println("                                               ");
        Facturacion.println("Nombre de Comprador:" +"                               "+ Nombre +" "+apellido );
        Facturacion.println("                                               ");
        Facturacion.println("Numero de Cedula:" +"                                  " + Numero_cedula_física_o_jurídica);
        Facturacion.println("                                               ");
        Facturacion.println("Telefono:" +"                                          "+ Telefono        );
        Facturacion.println("                                               ");
        Facturacion.println("Correo Electronico de comprador:                   " + correo  );
        Facturacion.println("                                               ");
        Facturacion.println("=======================================================================");
        Facturacion.println("Servicio" + "........................................... " + Servicio);
        Facturacion.println("                                               ");
        Facturacion.println("I.V.A" + ".............................................. " + calculo_iva);
        Facturacion.println("                                               ");
        Facturacion.println("Total" + ".............................................. " + Total);
        Facturacion.println("                                               ");
        Facturacion.println("=======================================================================");
        
     

        Facturacion.close();
    
}

}