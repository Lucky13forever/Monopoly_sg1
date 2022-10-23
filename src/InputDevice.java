import java.util.Random;

public class InputDevice {
    Integer[] fr = new Integer[10];
    public void declare(){
        for(int i=0;i<10;i++)
            fr[i]=0;
    }
    public String getName(){
        String[] names = {"Dog", "Cat", "Battleship", "Penguin", "Rubber Ducky", "Top Hat", "Race Car", "Thimble"};
        Random random = new Random();
        int r = random.nextInt(8);
        while(fr[r] == 1)
            r = random.nextInt(8);
        fr[r]=1;

        return names[r];
    }

    public int ThrowDice(){
        Random random = new Random();
        int x = 2 + random.nextInt(10);

        return x;
    }

//    public String[] getPlaces(){
//        String[] locations = {"Pacific Avenue", "North Carolina Avenue", "Community Chest", "Pennsylvania Avenue", "Short Line", "Chance", "Park Place", "LUXURY TAX", "Boardwalk"};
//        return locations;
//    }

    public Square[] getSquares(){
        Square[] squares = {
            new Square("Start"),
            new Property("Mediterranean Avenue", 100, 20),
            new Square("Community Chest"),
            new Property("Baltic Avenue", 110, 22),
            new Square("INCOME TAX"),
            new Property("Reading Railroad", 200, 25),
            new Property("Oriental Avenue", 120, 24),
            new Square("Chance"),
            new Property("Vermont Avenue", 130, 26),
            new Property("Connecticut Avenue", 140, 28),
            new Square("Just Visiting Jail"),
            new Property("St. Charles Place", 150, 30),
            new Property("Electric Company", 160, 32),
            new Property("States Avenue", 170, 34),
            new Property("Virginia Avenue", 180, 36),
            new Property("Pennsylvania Railroad", 190, 38),
            new Property("St. James Place", 200, 40),
            new Square("Community Chest"),
            new Property("Tennessee Avenue", 210, 42),
            new Property("New York Avenue", 220, 44),
            new Square("Free Parking"),
            new Property("Kentucky Avenue", 230, 46),
            new Square("Chance"),
            new Property("Indiana Avenue", 240, 48),
            new Property("Illinois Avenue", 250, 50),
            new Property("B&O Railroad", 260, 52),
            new Property("Atlantic Avenue", 270, 54),
            new Property("Ventnor Avenue", 280, 56),
            new Property("Water Works", 290, 58),
            new Property("Marvin Gardens", 300, 60),
            new Square("Go to Jail"),
            new Property("Pacific Avenue", 310, 62),
            new Property("North Carolina Avenue", 320, 64),
            new Square("Community Chest"),
            new Property("Pennsylvania Avenue", 330, 66),
            new Property("Short Line Railroad", 340, 68),
            new Square("Chance"),
            new Square("Park Place"),
            new Square("LUXURY TAX"),
            new Property("Boardwalk", 350, 70),

        };
        return squares;
    }
}
