import java.util.ArrayList;

public class Person {
    private String name, surname, bdate;
    private ArrayList<Integer> favColor;
    private int height, weight, bmi;

    public Person(String name, String surname, String bdate, String favColor, String height, String weight) {
        this.favColor = new ArrayList<>();
        this.name = name;
        this.surname = surname;
        this.bdate = bdate;
        for (String s : favColor.split(",")){
            this.favColor.add(Integer.parseInt(s));
        }
        this.height = Integer.parseInt(height);
        this.weight = Integer.parseInt(weight);
        this.bmi = this.weight/((this.height/100)*(this.height/100));
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBdate() {
        return bdate;
    }

    public ArrayList<Integer> getFavColor() {
        return favColor;
    }

    public int getBmi() {
        return bmi;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
