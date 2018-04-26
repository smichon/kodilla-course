package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void assignObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
