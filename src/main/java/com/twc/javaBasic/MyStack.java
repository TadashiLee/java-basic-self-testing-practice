package com.twc.javaBasic;

@SuppressWarnings({"unused", "FieldCanBeLocal"})
public class MyStack {
    private int[] storage;
    private int capacity;
    private int count;
    private static final int GROW_FACTOR = 2;

    public MyStack(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("Capacity too small.");
        }

        capacity = initialCapacity;
        storage = new int[initialCapacity];
        count = 0;
    }

    public void push(int value) {
        if (count == capacity) {
            ensureCapacity();
        }

        // TODO: Please push the value into the storage here.
        // <--start
        this.storage[count] = value;
        this.count += 1;
        // --end-->
    }

    private void ensureCapacity() {
        int newCapacity = capacity * GROW_FACTOR;

        // TODO:
        //  Please create a new array of size newCapacity. Copy the original values into The new
        //  array, and update related fields.
        //  IMPORTANT: You SHOULD NOT USE COLLECTIONS (such as List<T>) OTHER THAN ARRAY.
        //
        // <--start
        int[] newstorge = new int[newCapacity];
        System.arraycopy(this.storage,0, newstorge,0, this.capacity);
        this.storage = newstorge;
        this.capacity = newCapacity;
        // --end-->
    }

    public int[] popToArray() {
        final int totalItemsCount = count;
        int[] array = new int[totalItemsCount];

        while (count > 0) {
            array[totalItemsCount - count] = pop();
        }

        return array;
    }

    private int pop() {
        // TODO:
        //  Please pop one element from the array. You should update the `count` field
        //  as well.
        // <--start
        int popnum = this.storage[count-1];
        this.count -= 1;
        return popnum;
        // --end-->
    }
}
