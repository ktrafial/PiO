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
public class MovieCD extends CD {
    String genre;
    
    
    public MovieCD(){
        
    }
        public MovieCD(String genre, String title, double price){
        this.genre=genre;
         setTitle(title);
        this.price=price;
    }
    public void setGenre(String genre){
       this.genre=genre;
   }
    
    public String getGenre(){
        return this.genre;
    }
    
    @Override
    public String toString(){
       
        return this.getClass().getSimpleName()+nl
                 +super.toString()+nl
                +"Genre: "+this.genre;
               
    }
}
