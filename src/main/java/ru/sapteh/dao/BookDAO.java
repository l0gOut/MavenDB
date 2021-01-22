package ru.sapteh.dao;

public interface BookDAO<Book, Key>  {

    Book read (Key id);
    void create (Book book);
    void update (Book book);
    void delete (Book book);
}
