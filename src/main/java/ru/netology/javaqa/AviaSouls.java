package ru.netology.javaqa;

public class AviaSouls {
    private Ticket[] tickets = new Ticket[0];

    //вспомогательный метод для имитации добавления элемента в массив
    //current -массив, в который мы хотим добавить элемент
    //ticket -- элемент, который мы хотим добавить
    //return - возвращает новый массив, который выглядит как тот что мы переделали
    //но с добавлением нового элемента в конце
    private Ticket[] addToArray(Ticket[] current, Ticket ticket) {
        Ticket[] tmp = new Ticket[current.length + 1];
        for (int i=0; i < current.length; i++) {
            tmp[i] = current[i];
        }
        tmp[tmp.length -1] = ticket;
        return tmp;
    }

    //метод добавления билета в менеджер
    //ticket - добавляемый билет
    public void add(Ticket ticket) {
        tickets = addToArray(tickets, ticket);
    }
    public Ticket[] findAll() {
        return tickets;
    }

    //метод поиска билетов по маршруту
    //from - откуда вылетаем
    //to --куда вылетаем
    //return массив из подходящих билетов

    public Ticket[] search(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : tickets) {
            if (ticket.getFrom().equals(from)) {
                if (ticket.getTo().equals(to)) {
                    result = addToArray(result,ticket);
                }
            }
        }
        return result;
    }
}
