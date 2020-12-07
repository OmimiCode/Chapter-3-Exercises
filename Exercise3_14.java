



/*( Date Class) Create a class called Date that includes three instance variables—a month (type a day (type int )
 and a year (type int ). Provide a constructor that initializes the three instance
variables and assumes that the values provided are correct. Provide a set and a get method for each
instance variable. Provide a method displayDate that displays the month, day and year separated
by forward slashes ( / ). Write a test app named DateTest that demonstrates class Date ’s capabilities.*/


public class Exercise3_14 {
    private int day;
    private int month;
    private int year;



    public Exercise3_14(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public int getDay() {
        return day;
    }


    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }


    public int getMonth() {
        return month;
    }


    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        if (year >= 1000 && year <= 9999) {
            this.year = year;
        }
    }

    public String displayDate() {
        System.out.println(day + "/" + month + "/" + year);
        return null;
    }

}