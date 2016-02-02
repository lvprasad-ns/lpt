package com.example.prasadtumma.lpt;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by prasad.tumma on 02-02-2016.
 */
public class ImageLayout extends LinearLayout {
    public ImageLayout(Context context) {
        super(context);
        initialize(context);
    }

    public ImageLayout(Context context,AttributeSet attributeSet){
        super(context,attributeSet);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context,R.layout.image_layout,this);
    }

}
