package williansnieves.simplerecycler.models;

/**
 * Created by willians on 17/8/17.
 */

public class Apartment {
    private int idImagen;
    private String title;
    private  String place;
    private  String description;
    private int price;

    public Apartment(int idImagen, String title, String description, String place, int price){

        this.idImagen = idImagen;
        this.title = title;
        this.place = place;
        this.price = price;
        this.description = description;

    }

    public int getIdImagen(){
        return idImagen;
    }

    public String getTitle() {
        return title;
    }

    public String getPlace() {
        return place;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
