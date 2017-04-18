package net.slipcor.pvparena.api.command;

public interface ICommandTree<T> {
    void define(final T[] args);
    boolean contains(final T key);
    ICommandTree<T> get(final T key);
    T getKey();
    boolean remove(final T key);
}
