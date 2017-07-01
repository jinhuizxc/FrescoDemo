package com.example.jh.frescodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.GenericDraweeView;

public class MainActivity extends AppCompatActivity {
    GenericDraweeView genericDraweeView0;
    GenericDraweeView genericDraweeView1;
    String imagePath = "http://images.rednet.cn/articleimage/2010/03/05/1713562041.jpg";
    String imagePathFailure = "http://images.rednet.cn/articleimage/2010/03/05/1713562041111.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImageUtils();
    }

    private void initImageUtils(){
        genericDraweeView0 = (GenericDraweeView)findViewById(R.id.genericDraweeView0);
        genericDraweeView1 = (GenericDraweeView)findViewById(R.id.genericDraweeView1);
        ImageUtils.setImageUrl(genericDraweeView0,imagePath,R.drawable.icon_failure,
                R.drawable.icon_placeholder,R.drawable.icon_downloading,R.drawable.icon_retry ,null);
        ImageUtils.setImageUrl(genericDraweeView1,imagePath,R.drawable.icon_failure,
                R.drawable.icon_placeholder,R.drawable.icon_downloading,R.drawable.icon_retry ,null);
        if(genericDraweeView1.getHierarchy()!=null){
            genericDraweeView1.getHierarchy().setRoundingParams(new RoundingParams()
                    .setRoundAsCircle(true)
                    .setBorder(R.color.colorAccent,10));
        }

    }
}
