package ru.sapteh;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sapteh.dao.BookDAO;
import ru.sapteh.dao.imp.BookDAOImpl;
import ru.sapteh.model.Book;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        BookDAO<Book, Integer> bookDAO = new BookDAOImpl(factory);

        bookDAO.delete(bookDAO.read(3));

        System.out.println();

    }
}
