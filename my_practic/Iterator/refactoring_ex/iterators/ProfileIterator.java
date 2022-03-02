package Iterator.refactoring_ex.iterators;

import Iterator.refactoring_ex.profile.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}
