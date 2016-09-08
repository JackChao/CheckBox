package org.alex.checkbox.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alex.util.LogUtil;

import org.alex.checkbox.CheckBox;
import org.alex.checkbox.OnCheckChangeListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CheckBox cb1;
    private CheckBox cb2;
    private CheckBox cb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt).setOnClickListener(this);
        cb1 = (CheckBox) findViewById(R.id.cb_1);
        cb2 = (CheckBox) findViewById(R.id.cb_2);
        cb3 = (CheckBox) findViewById(R.id.cb_3);
        MyOnCheckChangeListener onCheckChangeListener = new MyOnCheckChangeListener();
        cb1.setOnCheckChangeListener(onCheckChangeListener);
        cb2.setOnCheckChangeListener(onCheckChangeListener);
        cb3.setOnCheckChangeListener(onCheckChangeListener);
    }
    private final class MyOnCheckChangeListener implements OnCheckChangeListener
    {

        /**
         * @param isChecked 被选中
         * @param checkBox
         */
        @Override
        public void OnCheckChange(boolean isChecked, CheckBox checkBox) {
            LogUtil.e(""+isChecked);
        }
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
    cb1.toggleChecked(true);
    cb2.toggleChecked(true);
    cb3.toggleChecked(true);

    }
}
