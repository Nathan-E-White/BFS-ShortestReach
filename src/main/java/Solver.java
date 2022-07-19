import org.jetbrains.annotations.Contract;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solver {

    private Scanner scanner;
    private Graph graph;
    private File input;

    @Contract(pure = true)
    public static void main (String[] args) throws FileNotFoundException {

        Solver solver = new Solver();
        solver.input = new File();
        solver.scanner = new Scanner(solver.input);

    }
}
