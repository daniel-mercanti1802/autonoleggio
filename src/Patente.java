import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;



public class Patente {

        private char patente1;
    
        //metodi cotruttore
        Patente(char patente1){
            this.patente1=patente1;
        }
    
        public Patente(){
            super();
            this.patente1='b';
        }
    
        public Patente(Patente that){
            this.patente1=that.patente1;
        }
    
        //metodi getter 
    
        
        public char getPatente(){
            return patente1;
        }
    
    
        //metodi setter
    
        public void setPatente (char patente){
            this.patente1=patente1;
        }
        
    
}
