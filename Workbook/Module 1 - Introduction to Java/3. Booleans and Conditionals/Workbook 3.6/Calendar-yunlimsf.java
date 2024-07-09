public class Calendar {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        String day = "Friday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar. \n");
        
        //Check 'calendar' here:        
        
        switch(day){
            case "Monday": System.out.println("I cannot"); break;
            case "Tuesday": System.out.println("I cannot"); break;
            case "Wednesday": System.out.println("I cannot"); break;
            case "Thursday": System.out.println("I cannot"); break;
            case "Friday": System.out.println("OK"); break;
            case "Saturday": System.out.println("OK"); break;
            case "Sunday": System.out.println("OK"); break;
            default: System.out.println("that is not a day");
        }

    }
}
