package Iterator.refactoring_ex.social_networks;

import Iterator.refactoring_ex.iterators.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
