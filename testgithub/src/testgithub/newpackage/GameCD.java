/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testgithub;

/**
 *
 * @author Student
 */
public class GameCD extends CD{
    
    String nazwa;
    
    public GameCD(){
            
       }
    
    public GameCD(String nazwa, String title, double price){
        this.nazwa=nazwa;
        setTitle(title);
        this.price=price;
    }
    
    public void setNazwa(String nazwa){
        this.nazwa=nazwa;
    }
    
    public String getNazwa(){
        return this.nazwa;
    }
    
    @Override
    public String toString(){
        
        return this.getClass().getSimpleName()+nl
                 +super.toString()+nl
                +"Genre: "+this.nazwa;
    
   
}
}
