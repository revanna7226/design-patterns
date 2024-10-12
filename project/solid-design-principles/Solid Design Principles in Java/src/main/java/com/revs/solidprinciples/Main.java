package com.revs.solidprinciples;

import java.util.*;

interface ValueContainer extends Iterable<Integer> {}

class SingleValue implements ValueContainer {
    public int value;

    // please leave this constructor as-is
    public SingleValue(int value) {
        this.value = value;
    }

    @Override
    public Iterator<Integer> iterator() {
        return Collections.singleton(value).iterator();
    }
}

class ManyValues extends ArrayList<Integer> implements ValueContainer {
    @Override
    public Iterator<Integer> iterator() {
        return super.iterator();
    }
}

class MyList extends ArrayList<ValueContainer> {
    // please leave this constructor as-is
    public MyList(Collection<? extends ValueContainer> c) {
        super(c);
    }

    public int sum() {
        int total = 0;
        for (ValueContainer container : this) {
            for (int value : container) {
                total += value;
            }
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        SingleValue singleValue = new SingleValue(1);
        ManyValues manyValues = new ManyValues();
        manyValues.add(2);
        manyValues.add(3);

        MyList myList = new MyList(Arrays.asList(singleValue, manyValues));
        System.out.println(myList.sum()); // Output: 6
    }
}

