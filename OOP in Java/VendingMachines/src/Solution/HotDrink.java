package Solution;

public class HotDrink {
    private String name;
    private int cost;
    private int temp;

    public HotDrink(String name, int cost, int temp) {
        this.name = name;
        this.cost = cost;
        this.temp = temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "\n\r" +
                "Product:" + "\n\r" +
                "name = '" + name + "'" + ", cost = " + cost + ", temp = " + temp;
    }
}
