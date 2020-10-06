package edu.up.mm5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * class Artwork
 *
 * Displays one of the following as controlled by the toggle() method:
 *   -  yellow bat
 *   - two perpendicular, pink lines that form a plus shape
 *
 *
 *   - Step 1: public class Toggler implements View.OnClickListener {
 *   - Step 2: public void onClick(View v) {
 *   - Step 3: pushMeButton.setOnClickListener(tog);
 *
 */
public class Artwork extends SurfaceView {

    private Paint yellowPaint = new Paint();
    private Paint pinkPaint = new Paint();
    private boolean clicked = false;

    public Artwork(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);

        yellowPaint.setColor(0xFFF4D03F);
        yellowPaint.setStrokeWidth(3.0f);

        pinkPaint.setColor(0xFFFF80c);
        pinkPaint.setStrokeWidth(3.0f);
    }

    public void toggle() {
        this.clicked = !this.clicked;

    }

    @Override
    public void onDraw(Canvas canvas) {
        if(this.clicked == true) {
            canvas.drawLine(0, 20, 40, 20, pinkPaint);
            canvas.drawLine(10, 0, 10, 40, pinkPaint);
        }
        else {
            mystery(canvas);
        }
    }

    /**
     * Draws a bat (akin to the batman logo) upon a given canvas
     */
    public void mystery(Canvas canvas) {
            float[][] points = {{7f, -6f}, {8f, -5f}, {9.5f, -4f}, {11f, -3.5f}, {13f, -3f}, {10.5f, -2.5f},
                    {8.5f, -1.5f}, {7.5f, -0.5f}, {5f, -.5f}, {3.5f, -0f}, {2.5f, 1f},
                    {2f, 2f}, {1f, 1.5f}, {-1f, 1f}, {-2.5f, 1.5f}, {-4f, 2.5f},
                    {-5f, -0f}, {-7f, -1.5f}, {-9f, -1.5f}, {-8.5f, -4f}, {-9.5f, -5.5f},
                    {-12f, -6f}, {-13f, -9f}, {-14f, -10.5f}, {-11f, -10.5f}, {-9f, -10.5f},
                    {-8f, -11f}, {-7f, -8f}, {-5.5f, -5.5f}, {-4f, -4f}, {-2.5f, -6f},
                    {-2.5f, -5f}, {-1.5f, -5f}, {-0.5f, -4.5f}, {0f, -5f}, {-0.5f, -3f},
                    {0f, -2.5f}, {1f, -3f}, {3f, -4f}, {5f, -5f}, {7f, -6f}};

        for(int i = 1; i < points.length; ++i) {
            canvas.drawLine(50.0f * points[i - 1][0] + 700.0f,
                    50.0f * points[i - 1][1] + 700.0f,
                    50.0f * points[i][0] + 700.0f,
                    50.0f * points[i][1] + 700.0f,
                    yellowPaint);
        }
    }

}
