
package testgithub;


public class CD {
    
    protected String title;
    protected double price;
    
    protected String nl =System.getProperty("line.separator"); // pakietowy dostęp
    
    public CD(){
        
    }
   
   
   
   public final void setTitle(String title){
       if(!title.equals("")){
       this.title=title;
       }else{
           throw new IllegalArgumentException("Tytuł nie może być pusty");
       }
       
       
   }
   
  public String getTitle(){
       return title;
   }

    
    public double getPrice() {
        return price;
    }

    
    public void setPrice(double price) {
        this.price = price;
        
    }
    
    @Override
    public String toString(){
        
        return this.getClass().getSimpleName()+nl
                +"Title: "+this.title+nl
                +"Price: "+this.price;
               
    }
   
}
