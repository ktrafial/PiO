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
    
    public void setNazwa(String nazwa){
        this.nazwa=nazwa;
    }
    
    public String getNazwa(){
        return this.nazwa;
    }
    
    @Override
    public String toString(){
        
        return this.getClass().getSimpleName()+nl
                 +"Title: "+this.title+nl
                +"Price: "+this.price+nl
                +"Genre: "+this.nazwa;
    
   
}
}
