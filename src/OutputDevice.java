public class OutputDevice {
    void writeMessage(){
        System.out.println("Hello and welcome to MONOPOLY.");
        System.out.println("Today's players are:\n");
    }

    void print_round_nr(int round){
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("ROUND " + round);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
    }

    void print_name(Player player){
        System.out.println("Player: " + player.getName());
    }

    void print_roll_nr(Player player){
        System.out.println("Number on dice: " + player.getDice_roll());
    }

    void print_position(Player player, Square[] squares){
        System.out.println("Position on board: " + squares[player.getPosition()].getName());
    }

    void print_money(Player player){
        System.out.println("Money: " + player.getMoney() + "$\n");
    }

    void print_finish(){
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("FINISH");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
    }

    void print_winner(Player player){
        System.out.println("The winner is " + "\033[0;1m" + player.getName() + "\u001B[0m" + " ! HURRAY!!");
    }

    void print_bank(Board board){
        System.out.println("Money left in bank: " + board.Bank + "$");
    }

    void buy_property(Square square){
        System.out.println("Bought this property for " + ((Property) square).getCost() + "$");
    }

    void pay_tax(Square square){
        System.out.println("The tax paid was: " + ((Property) square).getTax() + "$");
    }

    void player_missing_cash(){
        System.out.println("Player doesn't have enough money to buy this property. Moving on...");
    }

    void print_networth(Player[] playersarr, int players)
    {
        for(int i=0; i<players; i++)
        {
            System.out.println(playersarr[i].getName() + " has a networth of " + playersarr[i].getNetworth() + "$");
        }
        System.out.println();
    }
}
