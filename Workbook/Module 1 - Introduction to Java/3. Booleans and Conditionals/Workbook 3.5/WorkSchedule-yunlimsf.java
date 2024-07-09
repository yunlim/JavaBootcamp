public class WorkSchedule {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int day = 3;   //3rd day of the week...
        boolean holiday = true;
         
        // IF - ELSE IF - ELSE HERE!
        if(holiday = true){
            System.out.println("woohoo, no work!");
        }else if(day >= 6 && day <=1){
            System.out.println("Its weekend");
        }else{
            System.out.println("Wake up at 7:00 :(");
        }
    }
    }
