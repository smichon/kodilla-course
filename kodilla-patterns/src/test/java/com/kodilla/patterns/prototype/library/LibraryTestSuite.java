package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Math", "Pithagoras", LocalDate.of(2001,10,25));
        Book book2 = new Book("Physics", "Einstein", LocalDate.of(1958, 4, 30));
        Book book3 = new Book("Geography", "Magellan", LocalDate.of(1987, 8, 24));

        Library library = new Library("School Library No.1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library No.2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library No.3");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.getBooks().remove(book2);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepCloneLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepCloneLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(), deepCloneLibrary.getBooks());
    }
}
