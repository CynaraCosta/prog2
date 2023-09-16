public class Point {
    private int x = 0, y = 0;

    public Point(int i, int j) {
        this.x = i;
        this.y = j;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) throws PointBoundException {
        if (x < 0 || x > 400) {
            throw new PointBoundException("Coordenada x fora dos limites permitidos");
        }
        this.x = x;
    }

    public void setY(int y) throws PointBoundException {
        if (y < 0 || y > 400) {
            throw new PointBoundException("Coordenada y fora dos limites permitidos");
        }
        this.y = y;
    }

    public void moveBy(int dx, int dy) throws PointBoundException {
        int newX = getX() + dx;
        int newY = getY() + dy;

        if ((newX < 0 || newX > 400) || (newY < 0 || newY > 400)) {
            throw new PointBoundException("Movimento resulta em coordenadas fora dos limites permitidos");
        }

        setX(newX);
        setY(newY);
    }
}

class PointBoundException extends Exception {
    public PointBoundException(String message) {
        super(message);
    }
}

class ClientPoint {
    public static void main(String args[]) {
        Point p1 = new Point(100, 100);

        try {
            p1.setX(500);
        } catch (PointBoundException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        try {
            p1.setY(300);
        } catch (PointBoundException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        try {
            p1.moveBy(50, 50);
        } catch (PointBoundException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
