public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 67;
        int englishGrade = 65;
        String language = "java";

        if(chemistryGrade > 75 || englishGrade > 75 || language.equals("java")){
            System.out.println("congratulations, you got the scholarship!");
            
        }else{
            System.out.println("you didnt");
        }

        int credits = 56;
        double GPA =1.4;
        if(credits >=40 && GPA >=2.0){
            System.out.println("you earned your diploma");
        }else{
            System.out.println("you need try");
        }





    }
}
