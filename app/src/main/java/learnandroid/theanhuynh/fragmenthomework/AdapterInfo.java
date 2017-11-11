package learnandroid.theanhuynh.fragmenthomework;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by An on 11/12/2017.
 */

public class AdapterInfo extends ArrayAdapter<String> {

    Activity context = null;
    List<String> arrInfo;
    int layoutId;
    Typeface typeface;
    public AdapterInfo(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context,resource,objects);
        this.context = (Activity) context;
        this.arrInfo = objects;
        this.layoutId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(layoutId,null);
        if(arrInfo.size() > 0 && position >= 0){
            TextView txtInfo = view.findViewById(R.id.txtinfo);
            txtInfo.setText(arrInfo.get(position));
            typeface = Typeface.createFromAsset(context.getAssets(),"fonts/Roboto-LightItalic.ttf");
            txtInfo.setTypeface(typeface);
        }
        return view;
    }
}
