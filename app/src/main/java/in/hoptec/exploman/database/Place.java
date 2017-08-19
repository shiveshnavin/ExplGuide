package in.hoptec.exploman.database;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONArray;

import java.util.ArrayList;

/**
 * Created by shivesh on 19/8/17.
 */

public class Place {


    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("desc")
    @Expose
    public String desc;
    @SerializedName("lat")
    @Expose
    public Double lat;
    @SerializedName("lng")
    @Expose
    public Double lng;
    @SerializedName("address")
    @Expose
    public String address;
    @SerializedName("images")
    @Expose
    public String images;
    @SerializedName("rating")
    @Expose
    public String rating;
    @SerializedName("distance")
    @Expose
    public String distance;

    public boolean marked=false;


    public ArrayList<String> getImages()
    {
        ArrayList<String> imags=new ArrayList<>();

        try {
            JSONArray jar=new JSONArray(images);
            for(int i=0;i<jar.length();i++)
            {
                imags.add(jar.get(i).toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return imags;

    }




}