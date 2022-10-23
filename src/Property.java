public class Property extends Square{
    private int cost;
    private int tax;

    private Player holder = null;

    public Property(String name, int cost, int tax) {
        super(name);
        this.cost = cost;
        this.tax = tax;
    }

    public void buy(Player player){
        player.setMoney(player.getMoney() - this.cost);
        player.increment_property_value(this.cost);
        this.holder = player;
    }

    public int getCost() {
        return cost;
    }

    public int getTax() {
        return tax;
    }

    public void tax_player(Player player)
    {
        player.setMoney(player.getMoney() - this.tax);
    }

    public boolean has_holder()
    {
        return holder != null;
    }
}
