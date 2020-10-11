package com.example.android.tourguide;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        ArrayList<Place> places = new ArrayList<Place>();


        places.add(new Place(getString(R.string.asia_mall), R.drawable.asiamall));
        places.add(new Place(getString(R.string.tumarartsalon), R.drawable.insidetumarartsalon));
        places.add(new Place(getString(R.string.vefa), R.drawable.vefa));
        places.add(new Place(getString(R.string.Bishkek_Park), R.drawable.bish));
        places.add(new Place(getString(R.string.dordoi_pl), R.drawable.dordoi_pl));
        places.add(new Place(getString(R.string.Seoul_Plaza), R.drawable.seoul));
        places.add(new Place(getString(R.string.ala), R.drawable.ala));


        View rootView = inflater.inflate(R.layout.places_list, container, false);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
