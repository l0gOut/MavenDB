package ru.sapteh.dao.imp;

import com.sun.istack.NotNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sapteh.dao.BookDAO;
import ru.sapteh.model.Book;

public class BookDAOImpl implements BookDAO<Book, Integer> {

    private final SessionFactory factory;

    public BookDAOImpl(SessionFactory factory){
        this.factory = factory;
    }

    @Override
    public Book read(@NotNull final Integer id) {
        try(Session session = factory.openSession()){
            Book result = session.get(Book.class, id);
            return result != null ? result : new Book();
        }
    }

    @Override
    public void create(@NotNull final Book book) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.save(book);
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(@NotNull final Book book) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.update(book);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(@NotNull final Book book) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(book);
            session.getTransaction().commit();
        }
    }
}
