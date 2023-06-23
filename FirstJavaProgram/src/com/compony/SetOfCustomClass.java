package com.compony;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Games{
    String GName;
    int GId;

    public Games(String GName, int GNo) {
        this.GName = GName;
        this.GId = GNo;
    }
    @Override
    public String toString() {
        return GName + '-' + GId;
    }
// Game ID should be unique so, to do this we have to make hashes(in set) of two obj same if two IDS are same
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Games games = (Games) o;
        return GId == games.GId;
    }
    @Override
    public int hashCode() {
        return Objects.hash(GId);
    }
}
public class SetOfCustomClass{
    public static void main(String[] args){
        Set<Games> games = new HashSet<>();

        games.add(new Games("Baseball", 2));
        games.add(new Games("Hockey", 3));
        games.add(new Games("Golf", 4));
        games.add(new Games("Cricket", 1));
        games.add(new Games("Chess", 1));

        System.out.println(games);
    }
}
