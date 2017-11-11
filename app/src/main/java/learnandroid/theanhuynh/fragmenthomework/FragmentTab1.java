package learnandroid.theanhuynh.fragmenthomework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by An on 10/31/2017.
 */

public class FragmentTab1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1,container,false);
        ListView lvMonHoc = view.findViewById(R.id.lvDSMonHoc);
        List<String> dsMonHoc = Arrays.asList(getResources().getStringArray(R.array.dsMonHoc));
        ArrayAdapter<String> adapterMonHoc = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,dsMonHoc);
        lvMonHoc.setAdapter(adapterMonHoc);
        return view;
    }
}
