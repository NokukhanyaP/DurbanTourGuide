package com.example.nokukhanya.durbantourguide;

import java.io.Serializable;

/**
 * Created by Nokukhanya on 2017/08/17.
 */

public class beachClass extends Beach implements Serializable {
    String bcName,bcDescription,bcAbout;
    int bcimage;

    public String getBcName() {
        return bcName;
    }

    public void setBcName(String bcName) {
        this.bcName = bcName;
    }

    public String getBcDescription() {
        return bcDescription;
    }

    public void setBcDescription(String bcDescription) {
        this.bcDescription = bcDescription;
    }

    public String getBcAbout() {
        return bcAbout;
    }

    public void setBcAbout(String bcAbout) {
        this.bcAbout = bcAbout;
    }

    public int getBcimage() {
        return bcimage;
    }

    public void setBcimage(int bcimage) {
        this.bcimage = bcimage;
    }
}
