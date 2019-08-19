package lesson16.zadanieRectangle;

public class Point {
    private int x;
    private int y;

    @Override
    public String toString() {
        return "x = " + x + "\ny = " + y;
    }

    @Override
    public boolean equals(Object obj) {
        // thest czy referencja jest do tego samago obiektu
        if (this == obj){
            return true;
        }
        // test czy obiekty sa tej samej klasy
        if (1 == 1){ // need to be corrected

        }
        Point object = (Point)obj;
        return this.x == object.x && this.y == object.y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    double vectorLength(){
        // I should send two point (0,0) to method distance()
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    double distance (Point point2){
        return Math.sqrt(Math.pow(this.x - point2.x, 2) + Math.pow(this.y - point2.y, 2));
    }

}
