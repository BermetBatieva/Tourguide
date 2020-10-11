package com.example.android.tourguide;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
public class CultureFragment extends Fragment {


    public CultureFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.theater), R.drawable.opera_theater));
        places.add(new Place(getString(R.string.museum), R.drawable.museum));
        places.add(new Place(getString(R.string.Historical_museum), R.drawable.m2));
        places.add(new Place(getString(R.string.zoo_mus), R.drawable.zoo_mus));
        places.add(new Place(getString(R.string.Geological_Museum), R.drawable.geolog));
        places.add(new Place(getString(R.string.Frunze_Museum), R.drawable.frunze));



        View rootView = inflater.inflate(R.layout.places_list, container, false);


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
