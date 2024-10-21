package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    boolean theSameAs(T comparedObject);

    boolean equals(Object comparedObject);
}
