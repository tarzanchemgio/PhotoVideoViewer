package com.hcmus.photovideoviewer.views;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hcmus.photovideoviewer.viewmodels.PhotosViewModel;
import com.hcmus.photovideoviewer.R;

import java.util.Objects;

public class PhotosFragment extends Fragment {

	public static final int SPAN_COUNT = 4;

	private RecyclerView recyclerView;
	private RecyclerView.LayoutManager layoutManager;

	private PhotosViewModel photosViewModel;
	private PhotoViewAdapter photoViewAdapter;


	public static PhotosFragment newInstance() {
		return new PhotosFragment();
	}

	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
	                         @Nullable Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.photos_fragment, container, false);
		recyclerView = rootView.findViewById(R.id.photo_recycle_view);

		return rootView;
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		photosViewModel = new ViewModelProvider(this).get(PhotosViewModel.class);
		photoViewAdapter = new PhotoViewAdapter(photosViewModel.getPhotoModels());
		recyclerView.setAdapter(photoViewAdapter);

		layoutManager = new GridLayoutManager(getActivity(), SPAN_COUNT);
		recyclerView.setLayoutManager(layoutManager);
	}

	@Override
	public void onSaveInstanceState(@NonNull Bundle outState) {
		super.onSaveInstanceState(outState);
	}
}