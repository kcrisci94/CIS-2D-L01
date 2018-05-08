public class CardDeckApp
{
    //Declare Arrays
    String[] suits = {"s", "h", "c", "d"};
    String[] cards = new String[52];
    String[][] cardHands = new String[4][5];

    //Main Function
    public static void main(String[] args)
    {
        //Create new instance of class to run the modules
        CardDeckApp myInstance = new CardDeckApp();
        myInstance.loadDeck();
        myInstance.display();
        myInstance.shuffle();
        myInstance.display();
        myInstance.dealCards();
        myInstance.displayHands();

    }

    //Load all 52 cards into deck
    public void loadDeck() {
        //loop through suits
        int count = 0;
        System.out.println("\n");
            for(int i = 0; i < 4; i++) {
                for(int j = 1; j < 14; j++) {
                    if(count < 13) {
                        cards[count] = Integer.toString(j) + suits[0];
                    }else if(count < 26) {
                        cards[count] = Integer.toString(j) + suits[1];
                    }else if(count < 39) {
                        cards[count] = Integer.toString(j) + suits[2];
                    }else {
                        cards[count] = Integer.toString(j) + suits[3];
                    }
                    count++;
                }
            }
    }

    //Display deck of cards
    public void display() {
        System.out.println("Deck of Cards:");
       for(int i = 0; i < cards.length; i++) {
           //if the line has reached 13 cards, print new line
           if((i+1) % 13 != 0)
               System.out.print(cards[i] + " ");
           else
               System.out.println(cards[i] + "\n");
       }
        System.out.println("\n");
    }
    //shuffle deck
    public void shuffle() {
        for(int j = 0; j < 100; j++) {
            //get new random integer between 1 and 51 each time shuffled
            int rand = (int) (Math.random() * 50 + 1);
            for(int i = 0; i < cards.length; i++) {
                //prevent shuffling with non-existent spaces
                if(i + rand < 52) {
                    String saveValue = cards[i];
                    cards[i] = cards[i + rand];
                    cards[i + rand] = saveValue;
                }
            }
        }
    }
    public void dealCards() {
        //sets variable to ensure each player gets 5 cards
        int loopCount = 0;
        //sets variable to continue moving up the deck starting from the top
        int index = 0;
        while(loopCount < 5) {
            for(int i = 0; i < cardHands.length; i++) {
                cardHands[i][loopCount] = cards[index];
                index++;
            }
            loopCount++;
        }
    }
    public void displayHands() {
        System.out.println("Player Hands");
        System.out.println("\n");
        for(int i = 0; i < cardHands.length; i++) {
            //print player number using the loop variable
            System.out.println("Player " + (i + 1) + ": ");
            for(int j = 0; j < cardHands[i].length; j++) {
                System.out.print(cardHands[i][j] + " ");
            }
            System.out.println("\n");

        }


    }
}
