/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testgithub;

/**
 *
 * @author Student
 */
public class AudioCD extends CD {
    
    String artist;
    
   public AudioCD(){
   
   }
  
    public AudioCD(String artist, String title, double price){
        this.artist=artist;
        setTitle(title);
        this.price=price;
    }
    
    public void setArtist(String artist){
       this.artist=artist;
   }
    
    public String getArtist(){
        return this.artist;
    }
    
    
               
    @Override
    public String toString(){
        
        return  super.toString()+nl
                +"Artist "+this.artist;
    }
    
}
