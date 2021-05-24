package me.ianguuima.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface EventListener {
    void notify(String newsTitle);
}

class NewsAgency {

    private final List<EventListener> communicationChannels;

    public NewsAgency() {
        this.communicationChannels = new ArrayList<>();
    }

    public void addCommunicationChannel(EventListener... item) {
        communicationChannels.addAll(Arrays.asList(item));
    }

    public void notifyNews(String title) {
        for (EventListener subscriber : communicationChannels) {
            subscriber.notify(title);
        }
    }
}

class SiteChannel implements EventListener {
    @Override
    public void notify(String newsTitle) {
        System.out.println("BREAK NEWS: The new #1 web site news is: " + newsTitle);
    }
}

class NewsPaperChannel implements EventListener {
    @Override
    public void notify(String newsTitle) {
        System.out.println("BREAK NEWS: Going to print to our customers the new news: " + newsTitle);
    }
}

class Observer {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addCommunicationChannel(new SiteChannel(), new NewsPaperChannel());

        newsAgency.notifyNews("I hope this repository helps a lot of people.");
    }

}