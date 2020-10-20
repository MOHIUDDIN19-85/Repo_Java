public class TestMethod {
    //Problem-1
    public int[] arr(int[] value, int gvalue) {
        int[] arr1 = {};
        for (int i = 0; i <= value.length - 1; i++) {
            if (gvalue != value[i]) {

                System.out.println(value[i]);
            }
        }
        return value;
    }

    //Problem-3
    public void CheckSpeed(int speed){
        int point = 0;
        int highestPoint = 21;
        for ( int i = 0; i <= speed; i+=5){
            if (speed > 70 && speed <=75){
                System.out.println("Thank you for driving within the speed limit");
            }
            else if (speed > 75){
                for(  i = 70;i <= speed; i+=5 ) {
                    point = point + 1;
                }
                    if (point < 21){
                        System.out.println("Drive safe" + " and your reaming point is: " + (highestPoint - point));
                    }
                    else if(point >21) {
                        System.out.println("Licence Suspended");
                    }
                }

            }
        }

    }
