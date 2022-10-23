import java.util.List;

public class Player {
    private String name;
    private int money = 0;
    private int dice_roll = 0;

    public void increment_property_value(int property_value) {
        this.property_value += property_value;
    }

    private int position = 0;

    private int property_value = 0;

    public void add_property(Square square)
    {
        this.property_value += ((Property) square).getCost();
    }

    public int getNetworth()
    {
        return this.money + this.property_value;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDice_roll() {
        return dice_roll;
    }

    public void move(int dice_roll, Board board) {
        this.dice_roll = dice_roll;
        this.position = this.position + dice_roll;
        if(this.position >= 39){
            this.position = this.position - 39;
            this.money = this.money + 200;
            board.Bank = board.Bank - 200;
        }
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
