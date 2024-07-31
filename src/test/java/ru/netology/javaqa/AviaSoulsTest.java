package ru.netology.javaqa;

import org.junit.jupiter.api.Test;

public class AviaSoulsTest {
    @Test
    public void testSortSeveralTicketsSort() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Домодедово",
                "Толмачево",
                472,
                9,
                19);
        Ticket ticket2 =new Ticket("Домодедово","Толмачево",593,11,24);
        Ticket ticket3= new Ticket("Толмачево","Домодедово",345,7,20);
        Ticket ticket4=new Ticket("Волгоград","SPB",283,12,19);
        Ticket ticket5=new Ticket("Домодедово","Толмачево",637,8,21);
        Ticket ticket6=new Ticket("SPB","Домодедово",124,12,15);
        Ticket ticket7= new Ticket("Домодедово","Толмачево",499,10,23);
        Ticket ticket8= new Ticket("Домодедово","Толмачево",397,11,22);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Ticket[] expected= {};
        Ticket[] actual = manager.search("Домодедово","Казань");
    }
}