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
        this.artist="Karol";
    }
    
    public void setArtist(String artist){
       this.artist=artist;
   }
    
    @Override
    public String toString(){
        String nl =System.getProperty("line.separator");
        return this.getClass().getSimpleName()+nl
                +"Title: "+this.title+nl
                +"Price: "+this.price+nl
                +"Artysta: "+this.artist;
               
    }
    
}
