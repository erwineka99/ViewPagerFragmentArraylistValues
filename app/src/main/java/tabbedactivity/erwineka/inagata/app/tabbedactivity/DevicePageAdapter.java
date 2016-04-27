package tabbedactivity.erwineka.inagata.app.tabbedactivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class DevicePageAdapter extends FragmentPagerAdapter {

    String[] devices;
    String[] devices_description;

    ArrayList <doa> deviceku=new ArrayList<>();




    public DevicePageAdapter(FragmentManager fm) {
        super(fm);
        doa aku=new doa("IPhone","Erwin Eka Ardiansah");
        doa budi=new doa("Android","Asus ZENFONE 55");
        doa brodin=new doa("Nokia","Kandas hancur karena android");
        deviceku.add(aku);
        deviceku.add(budi);
        deviceku.add(brodin);

//        Resources resource=context.getResources();
//        devices=resource.getStringArray(R.array.devices);
//        devices_description=resource.getStringArray(R.array.device_description);
    }

    @Override
    public Fragment getItem(int position) {

        Bundle bundle=new Bundle();
        bundle.putString(fragment_devices.DescriptionKey,deviceku.get(position).description);
        bundle.putString(fragment_devices.TitleKey,deviceku.get(position).devices);

        fragment_devices fd=new fragment_devices();
        fd.setArguments(bundle);

        return fd;
    }



    @Override
    public int getCount() {
        return deviceku.size();
    }
}
