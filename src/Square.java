public class Square implements Shape{
    Draw2D draw2D;
    Draw3D draw3D;

    DatabaseOperations databaseOperations;
    public void setDraw2D(Draw2D draw2D) {
        this.draw2D = draw2D;
    }

    public void setDraw3D(Draw3D draw3D) {
        this.draw3D = draw3D;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    void SquareCircle(){
        this.draw2D.draw(getShapeName());
        this.draw3D.draw(getShapeName());
    }

    public void setDatabaseOperations(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    void saveIntoDatabase(){
        this.databaseOperations.saveIntoDatabase(this.getShapeName());
    }
}
