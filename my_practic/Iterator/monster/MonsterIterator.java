package Iterator.monster;

import java.util.Iterator;
import java.util.NoSuchElementException;

class MonsterIterator implements Iterator<Monster.Part> {
    private int cursor = -1;
    private Monster m;

    public MonsterIterator(Monster m) {
        this.m = m;
    }

    public boolean hasNext() {
        if (cursor == -1) return m.hasHead() || m.hasHand() || m.hasLeg();
        if (cursor == 0) return m.hasHand() || m.hasLeg();
        if (cursor == 1) return m.hasLeg();
        return false;
    }

    public Monster.Part next() {
        if (cursor == -1) {
            if (m.hasHead()) {
                cursor = 0;
                return m.getHead();
            } else if (m.hasHand()) {
                cursor = 1;
                return m.getTheOnlyHand();
            } else if (m.hasLeg()) {
                cursor = 2;
                return m.getTheOnlyLeg();
            }
        }
        if (cursor == 0) {
            if (m.hasHand()) {
                cursor = 1;
                return m.getTheOnlyHand();
            } else if (m.hasLeg()) {
                cursor = 2;
                return m.getTheOnlyLeg();
            }
        }
        if (cursor == 1) {
            if (m.hasLeg()) {
                cursor = 2;
                return m.getTheOnlyLeg();
            }
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (cursor == -1) throw new IllegalStateException();
        if (cursor == 0)
            if (m.hasHead()) m.setHead(null);
            else throw new IllegalStateException();
        if (cursor == 1)
            if (m.hasHand()) m.setTheOnlyHand(null);
            else throw new IllegalStateException();
        if (cursor == 2)
            if (m.hasLeg()) m.setTheOnlyLeg(null);
            else throw new IllegalStateException();
    }
}
