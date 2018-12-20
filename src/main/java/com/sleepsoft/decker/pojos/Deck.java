package com.sleepsoft.decker.pojos;

import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cardList;
    private Color color;

    public enum Color{
        RED ("red"),
        BLUE ("green");

        private final String name;

        private Color(String s) {
            name = s;
        }

        public boolean equalsName(String otherName) {
            // (otherName == null) check is not needed because name.equals(null) returns false
            return name.equals(otherName);
        }

        public String toString() {
            return this.name;
        }
    }

    public Deck shuffle(){
        Collections.shuffle(cardList);
        return this;
    }

    public Card getTop(){
        return cardList.remove(0);
    }

    public Card getBottom(){
        return cardList.remove(cardList.size() - 1);
    }

    public Card getPosition(int pos){
        return cardList.remove(pos);
    }
}
