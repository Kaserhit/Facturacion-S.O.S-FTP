
public class Conta {
 
       static int Grooming_parcial;
       static int Grooming_T;
       static int ingreso_total;
       static int Grooming_parcialtotal;
       static int Grooming_Ttotal;
       static int monto_adicional;
       static int monto_adicionaltotal;
       static int gastos;
       static int gastostotal;



    public Conta(int perro_pequeño, int perro_mediano, int perro_grande, int ingreso_total, int perro_pequeñototal, int perro_medianototal, int perro_grandetotal, int monto_adicional, int monto_adicionaltotal, int gastos, int gastostotal) {
        this.Grooming_parcial = Grooming_parcial;
        this.Grooming_T = Grooming_T;
        this.ingreso_total = ingreso_total;
        this.Grooming_parcialtotal = Grooming_parcialtotal;
        this.Grooming_Ttotal = Grooming_Ttotal;
        this.monto_adicional = monto_adicional;
        this.monto_adicionaltotal = monto_adicionaltotal;
        this.gastos=gastos;
        this.gastostotal=gastostotal;
    }

    public Conta() {
    }
            public  static void CalculoP_Gastos(int gastos){    

        gastostotal = gastostotal - gastos; 
}

       

        public  static void CalculoP_pequeño(int Grooming_parcial){    

        Grooming_parcialtotal = Grooming_parcialtotal + Grooming_parcial * 5000;
        
       }

      
        public static void CalculoP_mediano(int Grooming_T){    

        Grooming_Ttotal = Grooming_Ttotal + Grooming_T * 10000; 
      
      
}
     

      
        public static void CalculoP_Monto_adicional(int monto_adicional ){    

        monto_adicionaltotal = monto_adicionaltotal + monto_adicional; 
}

        public static int CalculoP_ingreso_total(){
    ;    
        ingreso_total = Grooming_parcialtotal + Grooming_Ttotal  + monto_adicionaltotal +gastostotal;
        return ingreso_total;

      
}
}