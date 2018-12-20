package com.sleepsoft.decker.pojos;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * developed by agermenos
 * Date: 12/13/2018
 */
@Data
@RequiredArgsConstructor
public class Card {
    public enum Rank{
        ACE ("ace"),
        TWO ("two"),
        THREE ("three"),
        FOUR ("four"),
        FIVE ("five"),
        SIX ("six"),
        SEVEN ("seven"),
        EIGHT ("eight"),
        NINE ("nine"),
        TEN ("ten"),
        JACK ("jack"),
        QUEEN ("queen"),
        KING ("king");

        private final String name;

        private Rank(String s) {
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

    public enum Suit{
        HEARTS ("hearts"),
        SPADES ("spades"),
        DIAMONDS ("diamonds"),
        CLUBS ("clubs");

        private final String name;

        private Suit(String s) {
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

    final @NotNull Rank rank;
    final @NotNull Suit suit;

}
