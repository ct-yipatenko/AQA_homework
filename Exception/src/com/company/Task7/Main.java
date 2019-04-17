package com.company.Task7;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class Main {
    private final String first, last;

    public Main(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return Objects.equals(first, main.first) &&
                Objects.equals(last, main.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }


    //    @Override
//    public boolean equals(Object o) {
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return 0;
//    }

    public static void main(String[] args) {
        Set<Main> s = new HashSet<>();
        s.add(new Main("Donald", "Duck"));
        System.out.println(s.contains(new Main("Donald", "Duck")));
    }
}
