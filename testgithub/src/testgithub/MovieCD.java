/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testgithub;

/**
 *
 * @author Kacper
 */
public class MovieCD extends AudioCD {
    String genre;
    
    
        public MovieCD(){
            this.genre="Akcja";
        }
    public void setGenre(String genre){
       this.genre=genre;
   }
    
    @Override
    public String toString(){
        String nl =System.getProperty("line.separator");
        return this.getClass().getSimpleName()+nl
                 +"Title: "+this.title+nl
                +"Price: "+this.price+nl
                +"Artysta: "+this.artist+nl
                +"Genre: "+this.genre;
               
    }
}
