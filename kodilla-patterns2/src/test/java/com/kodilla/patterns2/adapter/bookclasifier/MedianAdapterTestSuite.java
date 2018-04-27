package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<BookA> bookASet = new HashSet<>();
        for (int n = 1; n < 10; n++) {
            bookASet.add(new BookA("Author" + n, "Title" + n, 2000 + n, "00" + n));
        }
        MedianAdapter theAdapter = new MedianAdapter();
        //When
        int median = theAdapter.publicationYearMedian(bookASet);
        //Then
        System.out.println(bookASet);
        assertEquals(median, 2005);
    }
}
