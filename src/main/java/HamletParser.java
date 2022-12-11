import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }
    public int findHamlet(String hamletText) {
        Pattern pattern=Pattern.compile("Hamlet",Pattern.CASE_INSENSITIVE); //pattern to be searched for
        Matcher matcher=pattern.matcher(hamletText);
        int count=0;
        while(matcher.find()) count++;
        return count;
    }
    public int findHoratio(String hamletText) {
        Pattern pattern=Pattern.compile("Horatio",Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(hamletText);
        int count=0;
        while(matcher.find()) count++;
        return count;

    }
    public String changeHamletToLeon(String hamletText) {
        String output=null;
        Pattern pattern=Pattern.compile("Hamlet",Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(hamletText);
        output=matcher.replaceAll("Leon");
        return output;
    }
    public String changeHoratioToTariq(String hamletText) {
        String output=null;
        Pattern pattern=Pattern.compile("Hamlet",Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(hamletText);
        output=matcher.replaceAll("Horatio");
        return output;
    }

}
