public class Exercise3_14Test {

    public static void main(String[] args) {

        Exercise3_14 date = new Exercise3_14(2,3,1996);


        date.displayDate();

        date.setDay(31);
        date.setMonth(4);
        date.setYear(2000);

        date.displayDate();



    }
}
