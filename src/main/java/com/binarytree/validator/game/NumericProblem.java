package com.binarytree.validator.game;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
    public class NumericProblem {

    public LinkedHashMap<Key, Integer> findSolutions() {
        LinkedHashMap<Key, Integer> solutions = new LinkedHashMap<>();

        ArrayList toFind = new ArrayList();
        toFind.add(111);
        toFind.add(222);
        toFind.add(333);
        toFind.add(444);
        toFind.add(555);
        toFind.add(666);
        toFind.add(777);
        toFind.add(888);
        toFind.add(999);

        boolean exist = false;
        for (int i = 1; i < 10; i++) {
            for (int j = 10; j < 100; j++) {
                Integer m = i * j;
                exist = toFind.stream().anyMatch(e -> e.equals(m));

                if (exist) {
                    Key k = new Key(i, j);
                    solutions.put(k, m);
                }
            }
        }

        return solutions;
    }

    public class Key {
        Integer r;
        Integer c;

        public Key(Integer r, Integer c) {
            this.r = r;
            this.c = c;
        }

        @Override
        public String toString() {
            return String.format("(%s, %s)", r, c);
        }
    }

}
