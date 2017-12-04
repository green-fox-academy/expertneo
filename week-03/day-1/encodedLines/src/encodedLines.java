import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class encodedLines {
  public static void main(String[] args) {
    // Create a method that decrypts encoded-lines.txt

    List<String> abc = new ArrayList<>();
    abc.add("a");  // a	b	c	d	e	f	g	h	i	j	k	l	m	n	o	p	q	r	s	t	u	v	w	x	y	z
    abc.add("b");
    abc.add("c");
    abc.add("d");
    abc.add("e");
    abc.add("f");
    abc.add("g");
    abc.add("h");
    abc.add("j");
    abc.add("k");
    abc.add("l");
    abc.add("m");
    abc.add("n");
    abc.add("o");
    abc.add("p");
    abc.add("q");
    abc.add("r");
    abc.add("s");
    abc.add("t");
    abc.add("u");
    abc.add("v");
    abc.add("w");
    abc.add("x");
    abc.add("y");
    abc.add("z");

    String path = "encoded-lines.txt";

    readingThefile(path);
    List<String> importedText = readingThefile(path);
    System.out.println(readingThefile(path));   //QC

    decrypter(importedText, abc);

  }

  private static void decrypter(List<String> text, List<String> abc) {
    List<String> decrypted_step1 = new ArrayList<>();
    for (int i = 0; i < text.size(); i++) {
      for (int j = 0; j < text.get(i).length(); j++) {
        decrypted_step1.add()
      }

    }

  }

  private static List<String> readingThefile(String inputText) {
    List<String> text = new ArrayList<>();
    try {
      Path filePath = Paths.get(inputText);
      text = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.err.println("Importing the file went into an error. Fix it.");
    }
    return text;
  }
}
