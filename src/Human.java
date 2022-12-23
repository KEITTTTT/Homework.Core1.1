public class Human {
    String name;
    private String town;
    private int yearOfBirth;
    String jobTitle;

    Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (name == null || name.isEmpty()) {
            this.name = " Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town.isEmpty()) {
            this.town = " Информация не указана";
        } else {
            this.town = town;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = " Информация не указана";

        } else {
            this.jobTitle = jobTitle;
        }

    }

    void introduce() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + getTown() + ". Я родился в " + getYearOfBirth() + " году." +
                " Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty()) {
            this.town = town;
        } else {
            this.town = " Информация не указана";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }
}

