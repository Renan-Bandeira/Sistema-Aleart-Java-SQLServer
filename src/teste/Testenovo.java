/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 *
 * @author Faculdade
 */
public class Testenovo {
    
    private Calendar data = Calendar.getInstance();
    private SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
    
    
    
    public Testenovo(){
    }
    
public void setData(int a, int b){
data.set(Calendar.HOUR_OF_DAY,a);
data.set(Calendar.MINUTE,b);
}

public void setData(String s){
   try{
    data.setTime(formato.parse(s));
   
   }catch(ParseException e){
            e.printStackTrace();
            }
}
   
    public String getData(){
    String s = formato.format(data.getTime());
    return s;
    }




    
    

}
