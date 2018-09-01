
package mygarage;

/**
 *
 * @author Makis
 */
public class Car {
    
    private String brand;
    private String model;
    private String number;
    private String engine;
    private int doors;
    private int horsepower;
    
    public Car(String b,String m,String n,String e,int hp,int d){
        brand = b;
        model = m;
        number = n;
        engine = e;
        horsepower = hp;
        doors = d;
    }
    
    public void setBrand(String b){
        brand = b;
    }
    
    public void setModel(String m){
        model = m;
    }
    
    public void setNumber(String n){
        number = n;
    }
    
    public void setEngine(String e){
        engine = e;
    }
    
    public void setBrand(int hp){
        horsepower = hp;
    }
    
    public void setDoors(int d){
        doors = d;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getNumber(){
        return number;
    }
    
    public String getEngine(){
        return engine;
    }
    
    public int getHorsepower(){
        return horsepower;
    }
    
    public int getDoors(){
        return doors;
    }
    
}
