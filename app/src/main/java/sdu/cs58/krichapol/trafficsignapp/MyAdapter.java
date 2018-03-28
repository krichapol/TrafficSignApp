package sdu.cs58.krichapol.trafficsignapp;

//Class ทำหน้าที่สร้าง Layout เสมือน เพือ่ไปแสดงผลที่หน้า MainActivity

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{
    //Explicit ประกาศตัวแปร
    private Context context;
    private int[] ints; //เก็บข้อมูลโลโก้ปของ้ายจราจร
    private String[] titleStrings, detailStrings; //title เก็บข้อมูลชื่อ detail เก็บข้อมูลรายละเอียด

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }//end Constructor

    @Override
    public int getCount() { //getCount() ใช้นับจำนวนข้อมูลใน Array แล้วส่งข้อมูลไปยัง Method getView()
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) { //getView() รับข้อมูล Method getCount() มาแสดงผลบนแอป
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //ผูกตัวแปรบน Java กับ Element บน XML ที่หน้า my_listview
        ImageView imageView = view1.findViewById(R.id.imageView);
        TextView titleTextView = view1.findViewById(R.id.txv1);
        TextView detailTextView = view1.findViewById(R.id.txv2);

        //Show data นำข้อมูลไปแสดงบนแอป
        imageView.setImageResource(ints[i]);
        titleTextView.setText(titleStrings[i]);
        detailTextView.setText(detailStrings[i]);
        return view1;
    }
}//end Class
