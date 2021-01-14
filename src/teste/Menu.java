package teste;

import java.util.Scanner;



/**
 *
 * @author Faculdade
 */
public class Menu {

    
    public Menu(){}
    
    public static void metmenu(){
       
              
                
                Scanner ler = new Scanner(System.in);
                
                int op;
                
                while(true){
                System.out.println("1- cadastrar turma");
                System.out.println("2- cadastrar aluno");
                System.out.println("3- pesquisar");
                System.out.println("4- cursos");
                System.out.println("5- pagamento");
                System.out.println("6- configuração");
                
                op = Integer.parseInt(ler.nextLine());
              
                   switch(op){
                    case 1:
                        System.out.println("Informações para o cadastro:");
                        break;
                        
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                   }
                }
    }
                
   
}
  
           
   //System.out.printf("Informe um numero:\n");
    //int x = ler.nextInt();
    
    

