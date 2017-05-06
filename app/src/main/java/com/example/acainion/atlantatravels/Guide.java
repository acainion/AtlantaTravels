package com.example.acainion.atlantatravels;

import android.content.Context;

/**
 * Created by acainion on 4/29/17.
 */

public class Guide {

    // String Value for Tour Guide Description
    private final String mGuideDescription;

    // String Value for Tour Guide Name
    private final String mGuideName;

    // Integer Value for Image Resource ID
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this guide */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     *
     *Creata new Guide object.
     * *
     * @param guideName is the atlanta tour guide name
     *
     * @param guideDescription is the atlanta tour guide description
     *                         *
     * @param imageResourceID is the drawable resource ID for the image associated with the guide
     */
    public Guide(String guideName, String guideDescription, int imageResourceID)
    {
        mGuideName = guideName;
        mGuideDescription = guideDescription;
        mImageResourceID = imageResourceID;
    }

    /**
     *
     *Creata new Guide object.
     * *
     * @param guideName is the atlanta tour guide name
     *
     * @param guideDescription is the atlanta tour guide description
     */
    public Guide(String guideName, String guideDescription)
    {
        mGuideName = guideName;
        mGuideDescription = guideDescription;
    }

    /**
     * Gets the string value for guide name.
     */
    public String getGuideName(){
        return mGuideName;
    }

    /**
     * Gets the string value for guide Description.
     */
    public String getGuideDescription(){
        return mGuideDescription;
    }

    /**
     * Gets the integer value for image resource id
     */
    public int getImageResourceID(){ return mImageResourceID; }

    /**
     * * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() { return mImageResourceID != NO_IMAGE_PROVIDED;}

}
