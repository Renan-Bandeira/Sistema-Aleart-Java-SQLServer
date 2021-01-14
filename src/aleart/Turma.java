
package aleart;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
//import java.util.Date;


public class Turma { 
private int vagas;
private Calendar duracao = Calendar.getInstance();
private Calendar horario = Calendar.getInstance();
private String estado;
private String nome;

        
    public Turma(){}
    
    //metodos get e set


   public void setVagas(int vagas){
   this.vagas=vagas;
   }
   public int getVagas(){
   return vagas;
   }
   
   public void setDuracao(int a,int b){
       duracao.set(Calendar.HOUR_OF_DAY,a);
       duracao.set(Calendar.MINUTE,b);
   }
   
   
   
   
   
   public String getDuracao(){
       SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
       String s = formato.format(duracao.getTime());
       return s;
    }
   
   public void setHorario(int a,int b){
       horario.set(Calendar.HOUR_OF_DAY,a);
       horario.set(Calendar.MINUTE,b);
    }

public void setHorario(String s){
       try{  
       SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
       horario.setTime(formato.parse(s));
        }
       catch(ParseException e){
            e.printStackTrace();
        }
    }
   
    public String getHorario(){
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
        String s = formato.format(horario.getTime());
        return s;
    }
    
   public void setEstado(String a){
       estado=a;
    }
   public String getEstado(){
   return estado; 
   }
   
  public void setNome(String a){
  nome=a;  
  }
   public String getNome(){
   return nome; 
   } 
   
   //visualizar turma
   public void visualizar(){
       SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
       System.out.println("Nome da Turma: "+nome);
       System.out.println("Horario: "+ formato.format(horario.getTime()));
       System.out.println("duração: "+ formato.format(duracao.getTime()));
       System.out.println("Estado: "+ estado);
       System.out.println("Vagas: "+vagas);
       
   }
   public void criarTurma(int vagas, int hd, int md, int h, int m, String estado, String nome){   
        this.vagas=vagas;
        duracao.set(Calendar.HOUR_OF_DAY,hd);
        duracao.set(Calendar.MINUTE,md);
        horario.set(Calendar.HOUR_OF_DAY,h);
        horario.set(Calendar.MINUTE,m);
        this.estado=estado;
        this.nome=nome;
   }
}
