package com.example.android.tourguide;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
public class ParksFragment extends Fragment {


    public ParksFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        ArrayList<Place> places = new ArrayList<Place>();


        places.add(new Place(getString(R.string.Ala_Archa_Gorge), R.drawable.park1));
        places.add(new Place(getString(R.string.Ataturk_Park), R.drawable.park2));
        places.add(new Place(getString(R.string.flamingo), R.drawable.flamingo));
        places.add(new Place(getString(R.string.Korona_Peak), R.drawable.korona));
        places.add(new Place(getString(R.string.Asanbay), R.drawable.asan));
        places.add(new Place(getString(R.string.Panfilov), R.drawable.panfilov));


        View rootView = inflater.inflate(R.layout.places_list, container, false);


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
