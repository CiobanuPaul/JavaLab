package lab12.task3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GitInit {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Please provide a path to the git repository");
            System.exit(1);
        }

        String str = args[0];
        Path path = Paths.get(str);
        System.out.println(path);

        try {
            initializeGitRepository(path);
            System.out.println("Initialized empty Git repository in " + path.resolve(".git"));
        } catch (IOException e) {
            System.err.println("Erorr: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static void initializeGitRepository(Path path) throws IOException {
        Path gitDir = path.resolve(".git");
        Files.createDirectories(gitDir);

        Files.createDirectories(gitDir.resolve("objects"));
        Files.createDirectories(gitDir.resolve("refs"));

        Path headFile = gitDir.resolve("HEAD");
        Files.writeString(headFile, "ref: refs/heads/main\n");
    }
}