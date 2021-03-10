package com.hcmus.photovideoviewer.models;

import android.net.Uri;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class PhotoModel {
	public long id;
	public String displayName;
	public long size; //byte
	public Date dateModified;
	public Uri uri;

	@NotNull
	@Override
	public String toString() {
		return "PhotoModel{" +
				       "id=" + id +
				       ", displayName='" + displayName + '\'' +
				       ", size='" + size + '\'' +
				       ", dateModified='" + dateModified + '\'' +
				       '}';
	}
}
