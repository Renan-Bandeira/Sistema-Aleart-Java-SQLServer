
package teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Saudacaodata {
    
    public static void saudacao1(){
    
    Calendar hora = Calendar.getInstance();
    //set hora atual
    SimpleDateFormat forme1 = new SimpleDateFormat("HH");
    String xx = forme1.format(hora.getTime());
    
    //converter string para int
    int x = Integer.parseInt(xx);
    //System.out.println(x);
       
    
    
    // set hora manual
    /*hora.set(Calendar.HOUR_OF_DAY,12);
    int x=hora.get(Calendar.HOUR_OF_DAY);*/
     
    
    
    //instancia para receber a hora do dia
    Calendar horaatual = Calendar.getInstance();
    SimpleDateFormat forme = new SimpleDateFormat("HH':'mm");
    
   
    //estrutura da condicional
if (x >=6 && x <=11){
    System.out.println("Bom dia! \nagora são: "+forme.format(horaatual.getTime())+ " horas.\n");
    }else if (x >=12 && x <=18){
    System.out.println("Boa tarde! \nagora são: "+forme.format(horaatual.getTime())+ " horas.\n");
    } else{
    System.out.println("Boa noite! \nagora são: "+forme.format(horaatual.getTime())+ " horas.");
    }
    }
    
    
}