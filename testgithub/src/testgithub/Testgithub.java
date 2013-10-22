
package testgithub;


public class Testgithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     AudioCD plyta = new AudioCD("Marek", "W pięty", 99);
       AudioCD o4 = new AudioCD();
       o4.setTitle("chain").setPrice(18);
        
        System.out.println(o4.toString());
    }
}
