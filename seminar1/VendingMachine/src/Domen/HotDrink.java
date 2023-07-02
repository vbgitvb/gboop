package Domen;

public class HotDrink extends Product{

    //Температура напитка
    private int drinkTemperature;
    private int minTemperature = 0;
    private int maxTemperature = 100;
    private static int defaultTemperature = 40;

    //Геттер
    public int getDrinkTemperature() {
        return drinkTemperature;
    }

    //Сеттер
    public void setHotDrinkTemperature(int inputTemperature) {

        if ((inputTemperature > minTemperature) && (inputTemperature < maxTemperature)) {
            this.drinkTemperature = inputTemperature;
        }
    }

    //конструкторы
    public HotDrink(int price, int place, String name, long id, int drinkTemperature){
        super(price,place,name,id);
        this.drinkTemperature = drinkTemperature;
    }
    public  HotDrink(int price, int place, String name, long id){
        this(price, place, name, id, defaultTemperature);
     
        // super(price,place,name,id);
        // this.drinkTemperature = defaultTemperature;
    }

    @Override
    public String toString() {
        
        return super.toString() + "Temperature = "+ drinkTemperature; 
    }
    
}
