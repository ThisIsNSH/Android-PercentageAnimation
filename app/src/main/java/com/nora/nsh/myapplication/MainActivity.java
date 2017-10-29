package com.nora.nsh.myapplication;

import android.graphics.Rect;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import com.tzanou.PercentVisibleLayout.PercentVisibleLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        final LinearLayout one = (LinearLayout) findViewById(R.id.one);
        final LinearLayout two = (LinearLayout) findViewById(R.id.two);
        final LinearLayout three = (LinearLayout) findViewById(R.id.three);
        final LinearLayout four = (LinearLayout) findViewById(R.id.four);
        final LinearLayout five = (LinearLayout) findViewById(R.id.five);
        final LinearLayout six = (LinearLayout) findViewById(R.id.six);
        final LinearLayout seven = (LinearLayout) findViewById(R.id.seven);
        final ScrollView scrollView = (ScrollView) findViewById(R.id.scroll);


        PercentVisibleLayout mCustomLayout2=(PercentVisibleLayout) findViewById(R.id.twotwo);

        mCustomLayout2.setOnVisibilityPercentChangedListener(new PercentVisibleLayout.OnVisibilityPercentChanged() {
            @Override
            public void onVisibilityChange(int fromHeight, int fromWidth, int percentageHeight, int percentageWidth) {
                if(two.getVisibility()==View.VISIBLE)
                {two.setVisibility(View.VISIBLE);
                     if(percentageHeight<40)
                {
                    Animation aboutus1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate_exit);
                    aboutus1.setDuration(800);
                    two.startAnimation(aboutus1);
                    two.postDelayed(new Runnable() {
                        public void run() {
                            two.setVisibility(View.INVISIBLE);                        }
                    }, 00);
                }}

                else if(percentageHeight>=50&&percentageHeight<90)
                {Animation aboutus1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
                    aboutus1.setDuration(800);
                    two.startAnimation(aboutus1);
                    two.postDelayed(new Runnable() {
                        public void run() {
                            two.setVisibility(View.VISIBLE);                        }
                    }, 00);
                }

            }
        });
        PercentVisibleLayout mCustomLayout3=(PercentVisibleLayout) findViewById(R.id.threethree);

        mCustomLayout3.setOnVisibilityPercentChangedListener(new PercentVisibleLayout.OnVisibilityPercentChanged() {
            @Override
            public void onVisibilityChange(int fromHeight, int fromWidth, int percentageHeight, int percentageWidth) {
                if(three.getVisibility()==View.VISIBLE)
                { three.setVisibility(View.VISIBLE);
                     if(percentageHeight<40)
                {
                    Animation aboutus1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate_exit);
                    aboutus1.setDuration(800);
                    three.startAnimation(aboutus1);
                    three.postDelayed(new Runnable() {
                        public void run() {
                            three.setVisibility(View.INVISIBLE);                        }
                    }, 00);
                }}

                else if(percentageHeight>=50&&percentageHeight<90)
                {Animation aboutus1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
                    aboutus1.setDuration(800);
                    three.startAnimation(aboutus1);
                    three.postDelayed(new Runnable() {
                        public void run() {
                            three.setVisibility(View.VISIBLE);                        }
                    }, 0);
                }

            }
        });

        PercentVisibleLayout mCustomLayout4=(PercentVisibleLayout) findViewById(R.id.fourfour);

        mCustomLayout4.setOnVisibilityPercentChangedListener(new PercentVisibleLayout.OnVisibilityPercentChanged() {
            @Override
            public void onVisibilityChange(int fromHeight, int fromWidth, int percentageHeight, int percentageWidth) {
                if(four.getVisibility()==View.VISIBLE)
                {four.setVisibility(View.VISIBLE);
                     if(percentageHeight<40)
                {
                    Animation aboutus1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate_exit);
                    aboutus1.setDuration(800);
                    four.startAnimation(aboutus1);
                    four.postDelayed(new Runnable() {
                        public void run() {
                            four.setVisibility(View.INVISIBLE);                        }
                    }, 00);
                }}

                else if(percentageHeight>=50)
                {Animation aboutus1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
                    aboutus1.setDuration(800);
                    four.startAnimation(aboutus1);
                    four.postDelayed(new Runnable() {
                        public void run() {
                            four.setVisibility(View.VISIBLE);                        }
                    }, 0);
                }

            }
        });
        PercentVisibleLayout mCustomLayout5=(PercentVisibleLayout) findViewById(R.id.fivefive);

        mCustomLayout5.setOnVisibilityPercentChangedListener(new PercentVisibleLayout.OnVisibilityPercentChanged() {
            @Override
            public void onVisibilityChange(int fromHeight, int fromWidth, int percentageHeight, int percentageWidth) {
                if(five.getVisibility()==View.VISIBLE)
                {  five.setVisibility(View.VISIBLE);
                     if(percentageHeight<40)
                {
                    Animation aboutus1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate_exit);
                    aboutus1.setDuration(800);
                    five.startAnimation(aboutus1);
                    five.postDelayed(new Runnable() {
                        public void run() {
                            five.setVisibility(View.INVISIBLE);                        }
                    }, 00);
                }}

                else if(percentageHeight>=50)
                {Animation aboutus1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
                    aboutus1.setDuration(800);
                    five.startAnimation(aboutus1);
                    five.postDelayed(new Runnable() {
                        public void run() {
                            five.setVisibility(View.VISIBLE);                        }
                    }, 0);
                }

            }
        });
        PercentVisibleLayout mCustomLayout6=(PercentVisibleLayout) findViewById(R.id.sixsix);

        mCustomLayout6.setOnVisibilityPercentChangedListener(new PercentVisibleLayout.OnVisibilityPercentChanged() {
            @Override
            public void onVisibilityChange(int fromHeight, int fromWidth, int percentageHeight, int percentageWidth) {
                if(six.getVisibility()==View.VISIBLE)
                {six.setVisibility(View.VISIBLE);
                     if(percentageHeight<40)
                {
                    Animation aboutus1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate_exit);
                    aboutus1.setDuration(800);
                    six.startAnimation(aboutus1);
                    six.postDelayed(new Runnable() {
                        public void run() {
                            six.setVisibility(View.INVISIBLE);                        }
                    }, 00);
                }}
                else if(percentageHeight>=50)
                {Animation aboutus1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
                    aboutus1.setDuration(800);
                    six.startAnimation(aboutus1);
                    six.postDelayed(new Runnable() {
                        public void run() {
                            six.setVisibility(View.VISIBLE);                        }
                    }, 0);
                }

            }
        });
        PercentVisibleLayout mCustomLayout7=(PercentVisibleLayout) findViewById(R.id.sevenseven);

        mCustomLayout7.setOnVisibilityPercentChangedListener(new PercentVisibleLayout.OnVisibilityPercentChanged() {
            @Override
            public void onVisibilityChange(int fromHeight, int fromWidth, int percentageHeight, int percentageWidth) {
                if(seven.getVisibility()==View.VISIBLE)
                {seven.setVisibility(View.VISIBLE);
                    if(percentageHeight<40)
                    {
                        Animation aboutus1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate_exit);
                        aboutus1.setDuration(800);
                        seven.startAnimation(aboutus1);
                        seven.postDelayed(new Runnable() {
                            public void run() {
                                seven.setVisibility(View.INVISIBLE);                        }
                        }, 00);
                    }}

                else if(percentageHeight>=50)
                {Animation aboutus1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
                    aboutus1.setDuration(800);
                    seven.startAnimation(aboutus1);
                    seven.postDelayed(new Runnable() {
                        public void run() {
                            seven.setVisibility(View.VISIBLE);                        }
                    }, 0);
                }

            }
        });
    }

}
