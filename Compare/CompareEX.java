package Compare;

public class CompareEX  implements Comparable<CompareEX>{
    int id;
    int marks;

    public CompareEX(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }

    @Override
    public int compareTo(CompareEX o) {
        return (int) (this.marks - o.marks);
    }
}
