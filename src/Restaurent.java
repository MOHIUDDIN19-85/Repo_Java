import java.util.Scanner;

public class Restaurent {



        public String restaurentName = "Burger King";
        public int guestCapasity = 100;
        public static int guestCount = 0;
        public static int availableSeats =100 ;
        public static int guests;

        public Restaurent() {

        }


        //P1
        public void seatAvailable(){
            System.out.println("Available number of seats are: "+ availableSeats);
            Scanner seat = new Scanner(System.in);
            System.out.println("Please enter the number of guest: ");
            this.guests = seat.nextInt();
            if (guests<=availableSeats){
                System.out.println("Wellcome to our restaurent");
                guestCount = guestCount + guests;
                availableSeats = availableSeats - guestCount;
            }
            else{
                System.out.println("Please wait for a moment,\nwhen we are available you are most wellcome");
            }
        }
        //P2
        public void seatsParty(int guestNum){
            int num = guestNum;
            if (num <= availableSeats){
                System.out.println("Please be seated and enjoy the meal");
            }
            else {
                System.out.println(" Wait for a moment, Soon we will be available");
            }
        }
        //P-3
        public void removeParty(int rm){
            availableSeats = availableSeats + rm;
            System.out.println("Enjoy your time,Come again");
        }
        //P-4
        public Restaurent(String name, String guestcapacity){
            name = restaurentName;
            guestcapacity = guestcapacity;
        }
        //p-5
        public void summary_of_restaurent(){
            System.out.println(" Name of the restaurent is: "+ restaurentName);
            System.out.println("Current guest count is: "+ guestCount);
            System.out.println("Guest capacity is: "+ guestCapasity);
        }
    }


