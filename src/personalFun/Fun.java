package personalFun;

public class Fun {
    private String name;
    private  int age;
    private int day;
    private int month;
    private int year;

//    all arg
    public Fun(String name, int age, int day, int month, int year) {
        this.name = name;
        this.age = age;
        this.day = day;
        this.month = month;
        this.year = year;
    }

//    Required arg
    public Fun(String name) {
        this.name = name;

    }

    //    Required arg
    public Fun(int age) {
        this.age = age;

    }

    //    Required arg
    public Fun(int day,int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    //    Required arg
    public Fun(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    No arg
    public Fun(){
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public int getDay() {
         return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDateOfBirth() {
        return day + "/" + month +"/" + year;
    }
    }
