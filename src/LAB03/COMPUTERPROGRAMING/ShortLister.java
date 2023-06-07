package LAB03.COMPUTERPROGRAMING;

import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShortLister {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            ArrayList<String> words = readFile(file);
            Filter filter = new ShortWordFilter();
            ArrayList<String> shortWords = collectAll(words, filter);
            System.out.println("Short Words:");
            for (String word : shortWords) {
                System.out.println(word);
            }
        }
    }

    private static ArrayList<String> readFile(File file) {
        ArrayList<String> words = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return words;
    }

    private static ArrayList<String> collectAll(ArrayList<String> objects, Filter filter) {
        ArrayList<String> filteredList = new ArrayList<>();
        for (String object : objects) {
            if (filter.accept(object)) {
                filteredList.add(object);
            }
        }
        return filteredList;
    }
}
