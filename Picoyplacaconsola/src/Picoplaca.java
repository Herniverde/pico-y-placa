
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hverdezoto
 */
public class Picoplaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner entrada = new Scanner(System.in);
            String placa;
            String fecha;
            String hora;
         System.out.println("Revise si tiene pico y placa");
  
         
 
         
         
         
         
 System.out.print("Ingrese su placa: ");
 placa = entrada.nextLine();
 char ultimo_valor= placa.charAt(placa.length()-1);
 
 
 System.out.print("Ingrese la fecha: ");
 fecha = entrada.nextLine();
 
 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
       Date fecha1 = null;
         try {
            fecha1 = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
 Calendar calendar = Calendar.getInstance();
  calendar.setTime(fecha1);
 int dia;
        dia = calendar.get(Calendar.DAY_OF_WEEK);
  
        
    System.out.print("Ingrese la hora:");
 hora = entrada.nextLine();
    String hora0 = hora;
       LocalTime hora1 = LocalTime.parse("07:00");
       LocalTime hora2 = LocalTime.parse("09:30");
       LocalTime hora3 = LocalTime.parse("16:00");
       LocalTime hora4 = LocalTime.parse("19:30");

////horas en fechas
 
 
 LocalTime justoAhora = LocalTime.parse(hora); 
       //System.out.printf("En este momento son las %d horas con %d minutos y %d segundos\n", justoAhora.getHour(),justoAhora.getMinute(), justoAhora.getSecond());
 
if(dia==2 && (ultimo_valor=='1' || ultimo_valor=='2'))
        {
            //System.out.println(justoAhora.compareTo(hora1)>=0);
            //System.out.println(justoAhora.compareTo(hora2)<=0);
            if(justoAhora.compareTo(hora1)>=0 && justoAhora.compareTo(hora2)<=0 || justoAhora.compareTo(hora3)>=0 && justoAhora.compareTo(hora4)<=0){
            System.out.println("Lunes");
            System.out.println("no puede circular \t");
            }else 
            {
                 System.out.println("puede circular \t");
            }
       
           
        }else if(dia==3&& (ultimo_valor=='3' || ultimo_valor=='4'))
        {
            if(justoAhora.compareTo(hora1)>=0 && justoAhora.compareTo(hora2)<=0 || justoAhora.compareTo(hora3)>=0 && justoAhora.compareTo(hora4)<=0){
            System.out.println("Martes");
            System.out.println("no puede circular \t");
            }else 
            {
                 System.out.println("puede circular \t");
            }
              
              
        }else if(dia==4 && (ultimo_valor=='5' || ultimo_valor=='6'))
        {
            if(justoAhora.compareTo(hora1)>=0 && justoAhora.compareTo(hora2)<=0 || justoAhora.compareTo(hora3)>=0 && justoAhora.compareTo(hora4)<=0){
            System.out.println("Miércoles");
            System.out.println("no puede circular \t");
            }else 
            {
                 System.out.println("puede circular \t");
            }
            
        }else if(dia==5&& (ultimo_valor=='7' || ultimo_valor=='8'))
        {
            if(justoAhora.compareTo(hora1)>=0 && justoAhora.compareTo(hora2)<=0 || justoAhora.compareTo(hora3)>=0 && justoAhora.compareTo(hora4)<=0){
            System.out.println("Jueves");
            System.out.println("no puede circular \t");
            }else 
            {
                 System.out.println("puede circular \t");
            }

        }else if(dia==6 && (ultimo_valor=='9' || ultimo_valor=='0'))
        {
            if(justoAhora.compareTo(hora1)>=0 && justoAhora.compareTo(hora2)<=0 || justoAhora.compareTo(hora3)>=0 && justoAhora.compareTo(hora4)<=0){
            System.out.println("Viernes");
            System.out.println("no puede circular \t");
            }else 
            {
                 System.out.println("puede circular \t");
            }
            
        }else 
        {
             System.out.println("puede circular \t");
        }
        
        
   }





 
    }
    
