package com.example.android.tourguide;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
public class MonumentsFragment extends Fragment {
    public MonumentsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.monument_Bubusara),
                R.drawable.skulp1));
        places.add(new Place(getString(R.string.monument_angel),
                R.drawable.skulp2));
        places.add(new Place(getString(R.string.monument_poslanie),
                R.drawable.skulp3));
        places.add(new Place(getString(R.string.monument_spasatel),
                R.drawable.skulp4));
        places.add(new Place(getString(R.string.monument_erkindik),
                R.drawable.skulp5));


        View rootView = inflater.inflate(R.layout.places_list, container, false);
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}