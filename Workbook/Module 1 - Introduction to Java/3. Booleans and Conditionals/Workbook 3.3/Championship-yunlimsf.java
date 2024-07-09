public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor - ravenclaw;
        if(margin>200){
            System.out.println("gryffindor is better than ravenclaw");
        }else if(margin==200){
            System.out.println("gryffindor has same point with ravenclaw");
        }else{
            System.out.println("gryffindor is worse than ravenclaw");
        }


    }
}
