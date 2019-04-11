package com.example.android.soonami;


class Event {

    final String title;
    final long time;
    final int tsunamiAlert;

    Event(String eventTitle, long eventTime, int eventTsunamiAlert) {
        title = eventTitle;
        time = eventTime;
        tsunamiAlert = eventTsunamiAlert;
    }
}
