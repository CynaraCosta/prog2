import java.util.Objects;

class Point {
    public int x = 0, y = 0;

    public int getX() { return x; }

    public int getY() { return y; }

    public void setX(int x) { this.x = x; }

    public void setY(int y) { this.y = y; }

    public void moveBy(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class ScreenPoint extends Point {
    public ScreenPoint(int x, int y) {
        if (!isValid(x, y)) {
            throw new IllegalArgumentException("Invalid ScreenPoint coordinates");
        }
        setX(x);
        setY(y);
    }

    private boolean isValid(int x, int y) {
        return x >= 0 && x <= 300 && y >= 0 && y <= 300;
    }
}
