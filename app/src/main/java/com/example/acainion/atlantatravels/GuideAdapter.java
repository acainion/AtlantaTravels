package com.example.acainion.atlantatravels;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by acainion on 4/30/17.
 */

public class GuideAdapter extends ArrayAdapter<Guide> {

    private static final String LOG_TAG = GuideAdapter.class.getSimpleName();

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /** Resource ID for audio file for each list of words */
    //private int mAudioResourceId;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param androidGuide A List of android travel guide objects to display in a list
     */
    public GuideAdapter(Activity context, ArrayList<Guide> androidGuide, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, androidGuide);

        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //return super.getView(position, convertView, parent);

        // Get the {@link AndroidWord} object located at this position in the list
        Guide currentGuide = getItem(position);

        // Find the ImageView in the list_item.xml layout with the Resource ID
        ImageView guideImageView = (ImageView) listItemView.findViewById(R.id.image);

        // Check if an image is provided for this word or not
        if (currentGuide.hasImage()){

            // Get the Resource ID from the current AndroidGuide object and
            // get this image on the number ImageView
            guideImageView.setImageResource(currentGuide.getImageResourceID());
            guideImageView.setVisibility(View.VISIBLE);
        }
        else{

            // Otherwise hide the ImageView (set visibility to GONE)
            guideImageView.setVisibility(View.GONE);

        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView guideNameTextView = (TextView) listItemView.findViewById(R.id.guide_name);
        // Get the version name from the current AndroidWord object and
        // set this text on the guide name TextView
        guideNameTextView.setText(currentGuide.getGuideName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView guideDescriptionTextView = (TextView) listItemView.findViewById(R.id.guide_description);
        // Get the version number from the current AndroidGuide object and
        // set this text on the guide description TextView
        guideDescriptionTextView.setText(currentGuide.getGuideDescription());

        return listItemView;
    }
}
