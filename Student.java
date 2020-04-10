import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student1 {
    String index;
    String firstName;
    String lastName;
    List<Integer> labPoints = new ArrayList<>();

    public Student1(String index, String firstName, String lastName) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //TODO constructor

    //TODO seters & getters

    public static double getAverage(ArrayList<Integer> labPoints) {
        double average;
        int sum = 0;
        for (int i = 0; i < labPoints.size(); i++) {
            sum += labPoints.get(i);
            //TODO
        }
        average=sum / labPoints.size();
return average;
    }

    public static boolean hasSignature(ArrayList<Integer> labPoints) {
        if (labPoints.size() > 8) {
            return true;
        } else return false;
        //TODO
    }

    public String getIndex() {
        return index;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getLabPoints() {
        return labPoints;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLabPoints(List<Integer> labPoints) {
        this.labPoints = labPoints;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        System.out.println("Vo prviot red vnesi kolku labaratoriski imas a vo vtoriot poenite od labs:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        line= br.readLine();
        int N=Integer.parseInt(line);
         line=br.readLine();
        String[] nizapoints = line.split(" ");
        for (int i = 0; i < N; i++) {
            lista.add(Integer.parseInt(nizapoints[i]));
        }
        double average=getAverage(lista);
        System.out.println(average);
        if(hasSignature(lista)){
            System.out.println("Ima potpis");
        }
        else{
            System.out.println("Nema potpis");
        }
    }
}