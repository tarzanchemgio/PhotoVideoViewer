package com.hcmus.photovideoviewer.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.hcmus.photovideoviewer.models.PhotoModel;
import com.hcmus.photovideoviewer.services.MediaDataRepository;

import java.util.ArrayList;

public class PhotosViewModel extends ViewModel {
	private final MutableLiveData<ArrayList<PhotoModel>> livePhotoModels;

	public PhotosViewModel(ArrayList<PhotoModel> photoModels) {
		this.livePhotoModels = new MutableLiveData<>(photoModels);
	}

	public MutableLiveData<ArrayList<PhotoModel>> getLivePhotoModels() {
		return this.livePhotoModels;
	}

}