package tdd.Chapter3;

public class HealthRecord {

    private int height;
    private int weight;
    private String gender;
    private int year;
    private int age;
    private int day;
    private String month;
    private String firstName;
    private String lastName;
    private String middleName;
    private int targetRateInRecord;
    private int maximumHeartRate;

    public HealthRecord(String firstName, String middleName, String lastName,
                        String gender, int age, int day, String month, int year, int height, int weight) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setHeight(int height) {
        this.height = height;

    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {

        return weight;
    }

    public int getHeight() {

        return height;
    }

    public int getBMI() {
        return (weight * 703) / height * height;
    }

    public String getDateOfBirth() {
        return day + "/" + month + "/" + year;
    }

    public int getTargetRateInRecord() {
        targetRateInRecord = (50 - maximumHeartRate) / 100;
        return targetRateInRecord;
    }

    public int getMaximumHeartRate() {
        maximumHeartRate = 220 - age;
        return maximumHeartRate;
    }

    public String getGender() {
        return gender;
    }
}

