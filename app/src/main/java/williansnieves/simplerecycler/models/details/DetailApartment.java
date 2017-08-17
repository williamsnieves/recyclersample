package williansnieves.simplerecycler.models.details;

import org.json.JSONException;
import org.json.JSONObject;

import williansnieves.simplerecycler.R;

/**
 * Created by willians on 17/8/17.
 */

public class DetailApartment {
    public static JSONObject mainContentApartment =  new JSONObject();
    public static JSONObject contentApartment1 =  new JSONObject();
    public static JSONObject contentApartment2 =  new JSONObject();

    /* DATA */

    public static String title1 = "titulo1";
    public static String description1 = "description1";
    public static String place1 = "Barcelona";
    public static int price1 = 120000;
    public static int imageFile1 = R.drawable.apartment;

    public static String title2 = "titulo2";
    public static String description2 = "description2";
    public static String place2 = "Barcelona";
    public static int price2 = 200000;
    public static int imageFile2 = R.drawable.apartment;



    public static void addObjectsApartment(){
        try {

            mainContentApartment.put("item1", getFirstItemData());
            mainContentApartment.put("item2", getSecItemData());

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getDetailApartment(){
        addObjectsApartment();
        return mainContentApartment;
    }

    public static JSONObject getFirstItemData() throws JSONException {

        contentApartment1.put("title", title1);
        contentApartment1.put("description", description1);
        contentApartment1.put("place", place1);
        contentApartment1.put("price", price1);
        contentApartment1.put("image", imageFile1);

        return contentApartment1;
    }

    public static JSONObject getSecItemData() throws JSONException {

        contentApartment2.put("title", title2);
        contentApartment2.put("description", description2);
        contentApartment2.put("place", place2);
        contentApartment2.put("price", price2);
        contentApartment2.put("image", imageFile2);

        return contentApartment2;
    }
}
