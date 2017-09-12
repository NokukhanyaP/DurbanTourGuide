package com.example.nokukhanya.durbantourguide;

import java.io.Serializable;

/**
 * Created by Nokukhanya on 2017/08/15.
 */

public class Restuarent implements Serializable {
    String Name,Descrioption,AboutRestu;
    int image;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescrioption() {
        return Descrioption;
    }
    public int getImage() {
        return image;
    }

    public String getAboutRestu() {
        return AboutRestu;
    }

    public void setAboutRestu(String aboutRestu) {
        AboutRestu = aboutRestu;
    }

    public void setImage(int image) {
        this.image = image;

    }

    public void setDescrioption(String descrioption) {
        Descrioption = descrioption;
    }
}
