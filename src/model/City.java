package model;

public class City {
    private String title;
    private String country;
    private float squareKM;
    private int population;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public float getSquareKM() {
        return squareKM;
    }
    public void setSquareKM(float squareKM) {
        this.squareKM = squareKM;
    }

    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }

    public City(String title, String country, float squareKM, int population) {
        this.title = title;
        this.country = country;
        this.squareKM = squareKM;
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "title='" + title + '\'' +
                ", country='" + country + '\'' +
                ", squareKM=" + squareKM +
                ", population=" + population +
                '}';
    }
}
