package com.example.hotelreservation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HotelListFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private HotelAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hotel_list, container, false);
        mRecyclerView = view.findViewById(R.id.hotel_recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        updateUI();

        return view;
    }

    private void updateUI() {
        HotelList hotelList = HotelList.get(getActivity());
        List<HotelsAndNames> hotelsAndNames = hotelList.getHotelsAndNames();
        mAdapter = new HotelAdapter(hotelsAndNames);
        mRecyclerView.setAdapter(mAdapter);
    }

    private class HotelHolder extends RecyclerView.ViewHolder {
        public HotelHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item, parent, false));
        }
    }

    private class HotelAdapter extends RecyclerView.Adapter<HotelHolder> {
        private List<HotelsAndNames> mHotelsAndNames;

        public HotelAdapter(List<HotelsAndNames> hotelsAndNames) {
            mHotelsAndNames = hotelsAndNames;
        }

        @NonNull
        @Override
        public HotelHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new HotelHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(@NonNull HotelHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return mHotelsAndNames.size();
        }
    }
}
