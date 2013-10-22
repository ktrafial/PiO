
package testgithub;


public class CD {
    
    String title;
    double price;
    
    protected String nl =System.getProperty("line.separator"); // pakietowy dostęp
   
    public CD(){
        this.title="300";
        this.price=59;
}
   
   public void setTitle(String title){
       this.title=title;
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
