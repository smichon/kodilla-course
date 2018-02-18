package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User jack = new Millenials("Jack Kowalsky");
        User jerry = new YGeneration("Jerry Novak");
        User john = new ZGeneration("John Doe");

        //When
        String jackUses = jack.publish();
        System.out.println("Jack " + jackUses);
        String jerryUses = jerry.publish();
        System.out.println("Jerry " + jerryUses);
        String johnUses = john.publish();
        System.out.println("John " + johnUses);

        //Then
        Assert.assertEquals("uses Facebook", jackUses);
        Assert.assertEquals("uses Twitter", jerryUses);
        Assert.assertEquals("uses Snapchat", johnUses);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User jerry = new YGeneration("Jerry Novak");

        //When
        String jerryUses = jerry.publish();
        System.out.println("Jerry " + jerryUses);
        jerry.setSocialCommunicator(new SnapchatPublisher());
        jerryUses = jerry.publish();
        System.out.println("Jerry now " + jerryUses);

        //Then
        Assert.assertEquals("uses Snapchat", jerryUses);
    }
}
