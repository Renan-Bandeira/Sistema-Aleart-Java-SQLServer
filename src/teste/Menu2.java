/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Faculdade
 */
public class Menu2 {
    
    
    private Calendar cale = Calendar.getInstance();
    private SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
    Scanner ler = new Scanner(System.in);
    
    public void setDatateste(int a, int b){
    cale.set(Calendar.HOUR_OF_DAY,a);
    cale.set(Calendar.MINUTE,b);
    }
    
    public void setDatateste(String s){
        
    try{cale.setTime(formato.parse(s));
    }catch(ParseException e){
        e.printStackTrace();
    }
    }
    
    public String getDatateste(){
    String s = formato.format(cale.getTime());
    return s;
    }
    
   
    
    
    public void testMenu2(){
    
    
    
    
    while(true){
    
    System.out.println("Escolha uma opção:");
    System.out.println("1");
    System.out.println("2");
    
    int x = Integer.parseInt(ler.nextLine());
    
    
    
    
    
    
    switch(x){
        case 1:
            
           System.out.println("você escolheu o 1");
            break;
        case 2:
            System.out.println("você escolheu o 2");
            
            break;
      
        
        
        
    }
    
    
    
    
}
  
    
    
    
}
}
