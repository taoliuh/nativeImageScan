package com.sadieyu.imagescan;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import java.util.List;

/**
 *
 * @author sadieyu
 *
 */
public class ShowImageActivity extends Activity {
    private GridView mGridView;
    private List<String> list;
    private ChildAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_image_activity);

        mGridView = (GridView) findViewById(R.id.child_grid);
        list = getIntent().getStringArrayListExtra("data");

        adapter = new ChildAdapter(this, list, mGridView);
        mGridView.setAdapter(adapter);

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "选中 " + adapter.getSelectItems().size() + " item", Toast.LENGTH_LONG).show();
        super.onBackPressed();
    }




}
