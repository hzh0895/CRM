package com.example.showjoy.crm.contact.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

import com.example.showjoy.crm.R;
import com.example.showjoy.crm.contact.adapter.ContactPagerAdapter;

public class ContactActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private View allContactTag;
    private View myContactTag;
    private View tagsLayout;

    private View cursor;
    private int offset = 0;
    private int currentIndex = 0;
    private int cursorWidth;
    private boolean hasMeasured = false;
    private int one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        initView();
        initViewPager();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home: this.finish();
            default: return super.onOptionsItemSelected(item);
        }
    }

    private void initView() {
        allContactTag = findViewById(R.id.all_contact_tag);
        allContactTag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

        myContactTag = findViewById(R.id.my_contact_tag);
        myContactTag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });

        tagsLayout = findViewById(R.id.tags_layout);
        cursor = findViewById(R.id.cursor);

        ViewTreeObserver vto = tagsLayout.getViewTreeObserver();
        vto.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            public boolean onPreDraw() {
                if (hasMeasured == false) {
                    initCursorWidth();
                }
                return true;
            }
        });
    }

    private void initCursorWidth(){
        cursorWidth = allContactTag.getMeasuredWidth();
        hasMeasured = true;
        ViewGroup.LayoutParams layoutParams = cursor.getLayoutParams();
        layoutParams.width = cursorWidth;
        cursor.setLayoutParams(layoutParams);
        one = cursorWidth;
    }

    private void initViewPager() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new ContactPagerAdapter(getSupportFragmentManager()));
        viewPager.setCurrentItem(0);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Animation animation = null;
                switch (position) {
                    case 0:
                        if (currentIndex == 1) {
                            animation = new TranslateAnimation(one, 0, 0, 0);
                        }
                        break;
                    case 1:
                        if (currentIndex == 0) {
                            animation = new TranslateAnimation(offset, one, 0, 0);
                        }
                        break;
                }
                currentIndex = position;
                animation.setFillAfter(true);// True:图片停在动画结束位置
                animation.setDuration(300);
                cursor.startAnimation(animation);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
