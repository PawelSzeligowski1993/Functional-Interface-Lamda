package pl.sda.functionalinterfaces;

import java.util.List;

@FunctionalInterface
public interface SorterForFourNumbers<T> {
    List <T> sort(T x1, T x2, T x3, T x4);
}
