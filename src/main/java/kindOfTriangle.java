public class kindOfTriangle {
    private int first_side;
    private int second_side;
    private int third_side;

    public kindOfTriangle(int a, int b, int c){
        this.first_side = a;
        this.second_side = b;
        this.third_side = c;
    }

    public int getFirstSide() {
        return first_side;
    }
    public int getSecondSide() {
        return second_side;
    }
    public int getThirdSide() {
        return third_side;
    }



    public String equal(){
        if (this.getFirstSide() == this.getSecondSide() && this.getSecondSide() == this.getThirdSide()){
            return "Equilateral";
        }
        return "Not Equilateral";
    }

    public String isosceles(){
        if (this.getFirstSide() == this.getSecondSide() || this.getSecondSide() == this.getThirdSide() || this.getFirstSide() == this.getThirdSide()){
            return "Isosceles";
        }
        return "Not Isosceles";
    }

    public String scalene(){
        if (this.getFirstSide() != this.getSecondSide() && this.getSecondSide() != this.getThirdSide()){
            return "Scalene";
        }
        return "Not Scalene";
    }

    public String invalid(){
        if ( (this.getFirstSide() + this.getSecondSide()) <= this.getThirdSide() || (this.getSecondSide() + this.getThirdSide()) <= this.getFirstSide() || (this.getFirstSide() + this.getThirdSide()) <= this.getSecondSide()){
            return "Invalid";
        }
        return "Not Invalid";
    }
}