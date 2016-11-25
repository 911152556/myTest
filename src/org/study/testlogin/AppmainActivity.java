package org.study.testlogin;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class AppmainActivity extends Activity {
	private GridView gvperson;
	 private ArrayList<HashMap<String,Object>> personlist=new ArrayList<HashMap<String,Object>>();
    @Override  
    protected void onCreate(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.appmain);
    	Intent intent=this.getIntent();
    	Bundle bundle=intent.getExtras();
    	String name=bundle.getString("username");
    	Toast.makeText(this, name, Toast.LENGTH_LONG).show();
    	for(int i=0;i<=5;i++){
    	HashMap<String,Object> map1=new HashMap<String,Object>();
    	map1.put("img_photo", R.drawable.record_item_framedva);
    	map1.put("img_frame", R.drawable.record_item_frame_rect);
    	map1.put("img_player", R.drawable.record_item_player);
    	map1.put("img_logo2",R.drawable.record_item_title_logo2);
    	map1.put("img_logo1", R.drawable.record_item_likes);
    	map1.put("tv1", "星星演说家");
    	map1.put("tv2", "兜兜发布");
    	map1.put("tv_time", "00:02:07");
    	map1.put("tv_day", "7天前");
    	personlist.add(map1);
    	}
    	gvperson=(GridView)this.findViewById(R.id.gv_view);
    	SimpleAdapter simpleadapter=new SimpleAdapter(this, personlist, 
    			R.layout.activity_main1, new String[]{"img_phone","img_frame","img_player","tv_1","tv_2","tv_time","tv_day" },
    			new int[]{R.drawable.record_item_framedva,R.drawable.record_item_frame_rect,
    			R.drawable.record_item_player,R.drawable.record_item_title_logo2,R.drawable.record_item_likes,});
    	gvperson.setAdapter(simpleadapter);
    }
 
}
