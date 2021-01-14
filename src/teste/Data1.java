
package teste;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Data1 {
    private Calendar hora = Calendar.getInstance();
    SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
    private GregorianCalendar gc;
            
    public void setData1(int a, int b){
        this.hora.set(Calendar.HOUR_OF_DAY, a);
        this.hora.set(Calendar.MINUTE, b);
    }
    
    public void setData2(String s){
        try{
        hora.setTime(formato.parse(s));
              
        }
        
        catch(ParseException e){
            e.printStackTrace();
        }
    }
    
  
    public String getData1(){
        String s = formato.format(hora.getTime());
        return s;
    }    
}
