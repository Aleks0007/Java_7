public class Plate {
    private int food;
    
    public Plate(int food) {
        this.food = food;
    }
    
    public int getFood() {
        return food;
    }
    
    public void info() {
        System.out.println("тарелка: " + food);
    }
    
    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }
    
    public void addFood(int amount) {
        food += amount;
    }
}