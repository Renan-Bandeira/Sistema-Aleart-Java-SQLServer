package teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Saudacao {
    
public Saudacao(){
}
    
public static void saudacao(){
    
    
    
         Calendar hora = Calendar.getInstance();
         SimpleDateFormat formato = new SimpleDateFormat("HH");
        
         String s = formato.format(hora.getTime());
        
         int x = Integer.parseInt(s);
         
        if(x >= 6 && x <= 12){
            System.out.println("Bom dia");
        
        }else if (x >= 13 && x <= 18){
            System.out.println("Boa tarde");
            
        }else {
            System.out.println("Boa noite");
    }
}
}
