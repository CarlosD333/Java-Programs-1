public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point newP1, Point newP2) {
        p1 = newP1;
        p2 = newP2;
    }

    @Override
    public String toString() {
        return p1.toString() + "-" + p2.toString();
    }

    @Override
    public Object clone() {
        try {
            Segment s = (Segment)super.clone();
            s.p1 = (Point)p1.clone();
            s.p2 = (Point)p2.clone();
            return s;
        } catch(CloneNotSupportedException cnse) {
            return null;
        }
    }
}
