


import java.util.Scanner;

class cli {  
       

    public void clientela() {
//         String[][] matrix = new String[6][6];
//        cargarMatriz(matrix);
//        UsuariosPredeterminados(matrix);
        
    }


    public static void menu(String matrix[][],int contador){
        Scanner t= new Scanner(System.in);
        int o;
        int c= 0;
        while (c != 4){
            System.out.println("Menu listado de Clientela");
            System.out.println("");
            System.out.println("1. Agregar clientes \n2. Modificar clientes \n3. Eliminar clientes \n4. Ver clientes \n5. Buscar Clientes \n6. Salir");
            o=t.nextInt();
            System.out.println("");
            if (c==4){;}
            switch(o){
            case 1: agregar(matrix,contador);contador++ ; System.out.println("");DesplegarMatriz(matrix); break; 
            case 2: modificar(matrix);System.out.println(""); DesplegarMatriz(matrix); break;
            case 3: eliminar(matrix); System.out.println(""); DesplegarMatriz(matrix); break;
            case 4: System.out.println("Listado de clientes");System.out.println("");DesplegarMatriz(matrix);System.out.println(""); break;
            case 5: buscarcliente(matrix);System.out.println(""); break;    
            case 6: c = 6; return;
            default: System.out.println("Opcion no existe ");System.out.println("");;
            
        }
        }
    }
    
    public static void agregar(String lista[][],int cont){
        Scanner v= new Scanner(System.in);

            int cont2=0;
            if (cont>lista.length){
                lista=expandirlista(lista,cont);
            }

            System.out.println("Ingrese el numero de  cedúla");
            lista[cont][cont2]=v.nextLine();
            System.out.println("");
            cont2++;
            System.out.println("Ingrese el Nombre Completo");
            lista[cont][cont2]=v.nextLine();
            System.out.println("");
            cont2++;
            System.out.println("Ingrese el Domicilio");
            lista[cont][cont2]=v.nextLine();
            System.out.println("");
            cont2++;
            System.out.println("Ingrese el numero de telefono");
            lista[cont][cont2]=v.nextLine();
            System.out.println("");
            cont2++;
            System.out.println("Ingrese el correo electronico");
            lista[cont][cont2]=v.nextLine();
            System.out.println("");
            cont2++;
    }
    
    public static void modificar(String lista[][]){
        Scanner t= new Scanner(System.in);
        String des;
        System.out.println("Ingrese el numero de cedula de la cuenta que desea modificar");
        String cuenta=t.nextLine();
        for (int cont=0; cont<lista.length; cont++){
            if(lista[cont][0] == null ? cuenta == null : lista[cont][0].equals(cuenta)){
            for (int con2=0; con2<lista[cont].length; con2++){
                System.out.println("Que desea modificar? 1. Cedula  2. Nombre   3, Direccion 4. Telefono 5. Correo");
                des=t.nextLine();
                switch (des){
                    case "1": System.out.println("Ingrese nuevo numero de cedula");lista[cont][0]=t.nextLine();break; 
                    case "2":System.out.println("Ingrese nuevo nombre");lista[cont][1]=t.nextLine(); return;
                    case "3":System.out.println("Ingrese nuevo direccion");lista[cont][2]=t.nextLine(); return;
                    case "4":System.out.println("Ingrese nuevo telefono");lista[cont][3]=t.nextLine(); return;
                    case "5":System.out.println("Ingrese nuevo correo");lista[cont][4]=t.nextLine(); return;
                    default: System.out.println("Ese no es opcion"); return;
                }
                }
                }
        }
    }
    
    
    public static void  eliminar(String lista[][]){
        Scanner t= new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula  de la cuenta que desea eliminar");
        String cuenta=t.nextLine();
        for (int cont=0; cont<lista.length; cont++){
            if(lista[cont][0] == null ? cuenta == null : lista[cont][0].equals(cuenta)){
            for (int con2=0; con2<lista[cont].length; con2++){
                lista[cont][con2]= "";
                }
        }
    }
    }
    
        public static void DesplegarMatriz (String lista[][]){
        
        for (int posf=0; posf<lista.length; posf++){
            for (int posc=0; posc<lista[posf].length; posc++)
            {
                System.out.print(lista[posf][posc]+" ");
                
            }            
            System.out.println(" ");
        }
    }
	public static void buscarcliente (String lista[][]){
            Scanner t= new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula  de la cuenta que desea buscar");
        String cuenta=t.nextLine();
        for (int cont=0; cont<lista.length; cont++){
            if(lista[cont][0] == null ? cuenta == null : lista[cont][0].equals(cuenta)){
                for (int con2=0; con2<lista[cont].length; con2++){
                    System.out.print(lista[cont][con2]+"\t");
                }
            }
            }
            System.out.println("");
        }
    public static void cargarMatriz(String lista[][]){
        int num[][]=new int [3][3];
        for(int posf=0;posf<lista.length;posf++){
            for(int posc=0;posc<lista[posf].length;posc++){
            lista[posf][posc]="";
            }            
        }
    }    
     public static void UsuariosPredeterminados (String lista[][]){
         
         lista [1][0]= "118110987";
         lista [1][1]= "Karl Aase Blanco";
         lista [1][2]= "San Antonio";
         lista [1][3]= "60601151";
         lista [1][4]= "karl23aase@gmail.com";
         //
         lista [2][0]= "593249324";
         lista [2][1]= "Carolina Blanco Fernandez";
         lista [2][2]= "Moravia";
         lista [2][3]= "60601891";
         lista [2][4]= "caroblanco1976@gmail.com";
                  //
         lista [3][0]= "812356131";
         lista [3][1]= "Edgar Mora Alvarado";
         lista [3][2]= "Santa Ana";
         lista [3][3]= "70491820";
         lista [3][4]= "Edgarmora@gmail.com";
                          //
         lista [4][0]= "012375123124";
         lista [4][1]= "Andrey obando Solis";
         lista [4][2]= "Desamparados";
         lista [4][3]= "80123482";
         lista [4][4]= "AndreyObando@hotmail.com";
         
         lista [0][0]= "Cedula";
         lista [0][1]= "Nombre";
         lista [0][2]= "Domicilio";
         lista [0][3]= "Telefono";
         lista [0][4]= "Correo electronico";
     }  
     public static String[][] expandirlista (String lista[][], int cont){
         String[][] nmatrix = new String[cont][5];
         for (int posf=0; posf<lista.length; posf++){
            for (int posc=0; posc<lista[posf].length; posc++)
            {
                nmatrix[posf][posc]=lista[posf][posc];
            }            
        }
         return nmatrix;
     }
            
            
    }



