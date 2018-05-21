package com.example.naveen.animations;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView mBall;
    private Animation mAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBall=(ImageView)findViewById(R.id.ball_img);
        mAnim= AnimationUtils.loadAnimation(this,R.anim.translate);
    }

    public void translate(View view)
    {
        mAnim=AnimationUtils.loadAnimation(this,R.anim.translate);
        mBall.startAnimation(mAnim);
    }

    public void scale(View view)
    {
        mAnim=AnimationUtils.loadAnimation(this,R.anim.scale);
        mBall.startAnimation(mAnim);
    }

    public void rotate(View view)
    {
        mAnim=AnimationUtils.loadAnimation(this,R.anim.rotate);
        mBall.startAnimation(mAnim);
    }

    public void fade(View view)
    {
        mAnim=AnimationUtils.loadAnimation(this,R.anim.fade);
        mBall.startAnimation(mAnim);
    }

    public void accelerate(View view)
    {
        mAnim.setInterpolator(new AccelerateInterpolator());
        mBall.startAnimation(mAnim);
    }

    public void bounce(View view)
    {
        mAnim.setInterpolator(new BounceInterpolator());
        mBall.startAnimation(mAnim);
    }

    public void overShoot(View view)
    {
        mAnim.setInterpolator(new OvershootInterpolator());
        mBall.startAnimation(mAnim);
    }
}
