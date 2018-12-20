package com.sleepsoft.decker.factories;

import com.sleepsoft.decker.pojos.Deck;
import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Data
public class DeckConfiguration  {
    public int cardAmount;
    public List<RandomRange> randomRangeList;
    public Deck.Color color;

    public void addRandomRange(int minimum, int maximum, int amount) {
        if (CollectionUtils.isEmpty(randomRangeList)) {
            randomRangeList = new ArrayList<>();
        }
        randomRangeList.add (new RandomRange(minimum, maximum, amount));
    }

    class RandomRange {
        public int minimum;
        public int maximum;
        public int amount;

        public RandomRange(int minimum, int maximum, int amount) {
            this.minimum = minimum;
            this.maximum = maximum;
            this.amount = amount;
        }
    }
}
