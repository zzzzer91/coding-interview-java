package basic.Java集合.p04_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {

    private final List<String> notes = new ArrayList<>();

    public boolean add(String s) {
        return notes.add(s);
    }

    public String get(int index) {
        return notes.get(index);
    }

    public boolean remove(int index) {
        return true;
    }

    public int getSize() {
        return notes.size();
    }

    public String[] list() {
        String[] array = new String[getSize()];
        notes.toArray(array);
        return array;
    }

    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();

        noteBook.add("first");
        noteBook.add("second");

        NoteBook noteBook2 = new NoteBook();

        noteBook2.add("first");
        noteBook2.add("second");

        System.out.println(noteBook.getSize());
        for (String e: noteBook.list()) {
            System.out.println(e);
        }
    }
}
