package learnandroid.theanhuynh.fragmenthomework;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by An on 10/31/2017.
 */

public class PagerAdapter extends FragmentPagerAdapter{

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:{
                return new FragmentTab1();
            }
            case 1:{
                return new FragmentTab2();
            }
            case 2:{
                return new FragmentTab3();
            }
            default: return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:{
                return "Môn Học";
            }
            case 1:{
                return "Giảng Viên";
            }
            case 2:{
                return "Thông tin";
            }
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
