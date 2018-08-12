public class EnumExamples {


    public static void main(String[] args) {
        Days today =  Days.FRIDAY;

        String response = "";

        switch (today){

            case MONDAY:
                response = "Get to work";
                break;
            case FRIDAY:
                response = "Time to relax";
            default:
            response = "Practice java";
        }
        System.out.println(response);


        //pass by value primitive copy the value and pass it into the method


    }
}
