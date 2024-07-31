package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {
    @Test
    public void testNotTicketsSort() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Домодедово",
                "Толмачево",
                472,
                9,
                19);
        Ticket ticket2 = new Ticket("Домодедово", "Толмачево", 593, 11, 24);
        Ticket ticket3 = new Ticket("Толмачево", "Домодедово", 345, 7, 20);
        Ticket ticket4 = new Ticket("Волгоград", "SPB", 283, 12, 19);
        Ticket ticket5 = new Ticket("Домодедово", "Толмачево", 637, 8, 21);
        Ticket ticket6 = new Ticket("SPB", "Домодедово", 124, 12, 15);
        Ticket ticket7 = new Ticket("Домодедово", "Толмачево", 499, 10, 23);
        Ticket ticket8 = new Ticket("Домодедово", "Толмачево", 397, 11, 22);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Ticket[] expected = {};
        Ticket[] actual = manager.search("Домодедово", "Казань");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSeveralSortTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Домодедово",
                "Толмачево",
                472,
                9,
                19);
        Ticket ticket2 = new Ticket("Домодедово", "Толмачево", 593, 11, 24);
        Ticket ticket3 = new Ticket("Толмачево", "Домодедово", 345, 7, 20);
        Ticket ticket4 = new Ticket("Волгоград", "SPB", 283, 12, 19);
        Ticket ticket5 = new Ticket("Домодедово", "Толмачево", 637, 8, 21);
        Ticket ticket6 = new Ticket("SPB", "Домодедово", 124, 12, 15);
        Ticket ticket7 = new Ticket("Домодедово", "Толмачево", 499, 10, 23);
        Ticket ticket8 = new Ticket("Домодедово", "Толмачево", 397, 11, 22);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Ticket[] expected = {ticket8, ticket1, ticket7, ticket2, ticket5};
        Ticket[] actual = manager.search("Домодедово", "Толмачево");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testOneTicketSort() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Домодедово",
                "Толмачево",
                472,
                9,
                19);
        Ticket ticket2 = new Ticket("Домодедово", "Толмачево", 593, 11, 24);
        Ticket ticket3 = new Ticket("Толмачево", "Домодедово", 345, 7, 20);
        Ticket ticket4 = new Ticket("Волгоград", "SPB", 283, 12, 19);
        Ticket ticket5 = new Ticket("Домодедово", "Толмачево", 637, 8, 21);
        Ticket ticket6 = new Ticket("SPB", "Домодедово", 124, 12, 15);
        Ticket ticket7 = new Ticket("Домодедово", "Толмачево", 499, 10, 23);
        Ticket ticket8 = new Ticket("Домодедово", "Толмачево", 397, 11, 22);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Ticket[] expected = {ticket6};
        Ticket[] actual = manager.search("SPB", "Домодедово");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Домодедово",
                "Толмачево",
                472,
                9,
                19);
        Ticket ticket2 = new Ticket("Домодедово", "Толмачево", 593, 11, 24);
        Ticket ticket3 = new Ticket("Толмачево", "Домодедово", 345, 7, 21);
        Ticket ticket4 = new Ticket("Волгоград", "SPB", 283, 12, 19);
        Ticket ticket5 = new Ticket("Домодедово", "Толмачево", 637, 8, 24);
        Ticket ticket6 = new Ticket("SPB", "Домодедово", 124, 12, 15);
        Ticket ticket7 = new Ticket("Домодедово", "Толмачево", 499, 10, 21);
        Ticket ticket8 = new Ticket("Домодедово", "Толмачево", 397, 11, 19);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();
        Ticket[] expected = {ticket6};
        Ticket[] actual = manager.searchAndSortBy("SPB", "Домодедово", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNotTicketsSortAvia() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Домодедово",
                "Толмачево",
                472,
                9,
                19);
        Ticket ticket2 = new Ticket("Домодедово", "Толмачево", 593, 11, 24);
        Ticket ticket3 = new Ticket("Толмачево", "Домодедово", 345, 7, 20);
        Ticket ticket4 = new Ticket("Волгоград", "SPB", 283, 12, 19);
        Ticket ticket5 = new Ticket("Домодедово", "Толмачево", 637, 8, 21);
        Ticket ticket6 = new Ticket("SPB", "Домодедово", 124, 12, 15);
        Ticket ticket7 = new Ticket("Домодедово", "Толмачево", 499, 10, 23);
        Ticket ticket8 = new Ticket("Домодедово", "Толмачево", 397, 11, 22);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();
        Ticket[] expected = {};
        Ticket[] actual = manager.searchAndSortBy("Домодедово", "Екатеринбург", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLessSortComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Домодедово",
                "Толмачево",
                472,
                9,
                19);
        Ticket ticket2 = new Ticket("Домодедово", "Толмачево", 593, 11, 24);
        Ticket ticket3 = new Ticket("Толмачево", "Домодедово", 345, 7, 20);
        Ticket ticket4 = new Ticket("Волгоград", "SPB", 283, 12, 19);
        Ticket ticket5 = new Ticket("Домодедово", "Толмачево", 637, 8, 21);
        Ticket ticket6 = new Ticket("SPB", "Домодедово", 124, 12, 15);
        Ticket ticket7 = new Ticket("Домодедово", "Толмачево", 499, 10, 23);
        Ticket ticket8 = new Ticket("Домодедово", "Толмачево", 397, 11, 22);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();
        Ticket[] expected = {ticket1, ticket5, ticket8, ticket7, ticket2};
        Ticket[] actual = manager.searchAndSortBy("Домодедово", "Толмачево", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }
}
