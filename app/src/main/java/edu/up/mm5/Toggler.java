package edu.up.mm5;

import android.view.View;

/**
 * class Toggler
 * responds to click events by calling toggle() on a given Artwork object
 */
public class Toggler implements View.OnClickListener {

    private Artwork art = null;

    public Toggler(Artwork initArt) {
        this.art = initArt;
    }

    @Override
    public void onClick(View v) {
        this.art.toggle();
        this.art.invalidate();
    }
}
