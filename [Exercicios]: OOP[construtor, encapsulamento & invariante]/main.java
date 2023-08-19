public class Point {
    // data hiding
    private int x = 0, y = 0;

    // constructor com encapsulamento, apenas podemos utilizar as funcs set e get para acessar x e y
    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) { 
        if (isValidCoordinate(x)) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("Coordinate x must be between 0 and 400");
        }
    }

    public void setY(int y) { 
        if (isValidCoordinate(y)) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("Coordinate y must be between 0 and 400");
        }
    }

    public void moveBy(int dx, int dy) {
        int newX = getX() + dx;
        int newY = getY() + dy;
        
        if (isValidCoordinate(newX) && isValidCoordinate(newY)) {
            setX(newX);
            setY(newY);
        } else {
            throw new IllegalArgumentException("New coordinates must be between 0 and 400");
        }
    }

    // func para ser chamada nas outras a fim de ver se o valor da coordenada é válido
    private boolean isValidCoordinate(int coordinate) {
        return coordinate >= 0 && coordinate <= 400;
    }
}
 