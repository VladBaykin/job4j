package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        Address address = new Address("City", "Street", 1, 2);
        Address address2 = new Address("City2", "Street2", 2, 3);
        Profile profile = new Profile(address);
        Profile profile2 = new Profile(address2);
        List<Profile> profiles = List.of(profile, profile2);
        List<Address> result = Profiles.collect(profiles);
        List<Address> expected = List.of(address, address2);
        assertEquals(expected, result);
    }
}