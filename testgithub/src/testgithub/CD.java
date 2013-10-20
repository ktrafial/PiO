
package testgithub;


public class CD {
    
    String title;
    double price;
   
   
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
        String nl =System.getProperty("line.separator");
        return this.getClass().getSimpleName()+nl
                +"Title: "+this.title+nl
                +"Price: "+this.price;
               
    }
   
}
