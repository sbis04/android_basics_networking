package com.example.android.quakereport;

class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    double getMagnitude() {
        return mMagnitude;
    }

    String getLocation() {
        return mLocation;
    }

    long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    String getUrl() {
        return mUrl;
    }
}
