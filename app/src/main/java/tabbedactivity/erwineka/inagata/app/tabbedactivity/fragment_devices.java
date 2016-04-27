package tabbedactivity.erwineka.inagata.app.tabbedactivity;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public  class fragment_devices extends Fragment {

    public static final String DescriptionKey="descriptionkey";
    public static final String TitleKey="title";

    public fragment_devices() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragment_devices, container, false);;

        Bundle bundel=getArguments();
        if(bundel!=null){

            String description=bundel.getString(DescriptionKey);
            String title=bundel.getString(TitleKey);
            setValues(view,description,title);
        }


        return view;
    }


    private void setValues(View view,String Description, String Judul){
        TextView tvku=(TextView) view.findViewById(R.id.tv_description);
        tvku.setText(Description);
        TextView titleku=(TextView) view.findViewById(R.id.tv_devices);
        titleku.setText(Judul);

    }
}
