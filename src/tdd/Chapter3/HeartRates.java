package tdd.Chapter3;

public class HeartRates {
    private int year;
    private int month;
    private int age;
    private int day;
    private String firstName;
    private String middleName;
    private String lastName;
    private int maximumRate;
    private int targetRate;

    public HeartRates(String firstName, String middleName,String lastName, int age, int day, int month, int year) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
    this.age = age;
    this.day = day;
    this.month = month;
    this.year = year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        age = 2022 - year;
        return age;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;

    }

    public String getDateOfBirth() {
        return day + "/" + month + "/" + year;
    }

    public int getAgeOfPatient() {
        return age;
    }

    public int getMaximumRate() {
        maximumRate = 220 - age;
        return maximumRate;
    }

    public void setMaximumRate(int maximumRate) {
    this.maximumRate = maximumRate;
    }

    public void setTargetRate(int targetRate) {
        this.targetRate = targetRate;
    }

    public int getTargetRate() {
        targetRate = (50 - maximumRate) /  100;
        return targetRate;
    }
}
