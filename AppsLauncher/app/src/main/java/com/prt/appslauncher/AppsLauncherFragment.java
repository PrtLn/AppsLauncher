package com.prt.appslauncher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Pikalova Lena on 2/27/2017.
 */
public class AppsLauncherFragment extends Fragment {

    private RecyclerView mRecyclerView;

    public static AppsLauncherFragment newInstance() {
        return new AppsLauncherFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_apps_launcher, container, false);

        mRecyclerView = (RecyclerView) view
                .findViewById(R.id.fragment_apps_launcher_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
}
