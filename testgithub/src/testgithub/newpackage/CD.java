
package testgithub;


public class CD {
    
    private String title;
    protected double price;
    
    protected String nl =System.getProperty("line.separator"); // pakietowy dostęp
    
    public CD(){
        
    }
   
   
   
   public final CD setTitle(String title){
       this.title=title;
       return this;
   }
   
  public String getTitle(){
       return title;
   }

    
    public double getPrice() {
        return price;
    }

    
    public CD setPrice(double price) {
        this.price = price;
        return this;
    }
    
    @Override
    public String toString(){
        
        return this.getClass().getSimpleName()+nl
                +"Title: "+this.title+nl
                +"Price: "+this.price;
               
    }
   
}
