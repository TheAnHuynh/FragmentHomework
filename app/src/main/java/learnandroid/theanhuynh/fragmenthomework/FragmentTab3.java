package learnandroid.theanhuynh.fragmenthomework;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by An on 10/31/2017.
 */

public class FragmentTab3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3, container, false);

        Typeface typeface1 = Typeface.createFromAsset(getActivity().getAssets(),"fonts/Roboto-Regular.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getActivity().getAssets(),"fonts/Roboto-Thin.ttf");
        TextView txtTen = view.findViewById(R.id.txtTen);
        TextView txtJob = view.findViewById(R.id.txtjob);
        txtTen.setTypeface(typeface1);
        txtJob.setTypeface(typeface2);

        ListView listView = view.findViewById(R.id.lvInfo);
        List arrInfo = Arrays.asList(getResources().getStringArray(R.array.arrInfo));
        AdapterInfo adapterInfo = new AdapterInfo(getActivity(),R.layout.listitem,arrInfo);
        listView.setAdapter(adapterInfo);
        return view;
    }
}
