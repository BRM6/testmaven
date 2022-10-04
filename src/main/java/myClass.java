public class myClass {
    public String quotient(int x, int y){
        if(y == 0 ){
            throw new IllegalArgumentException("y is worng");
        }
        return "x*y";
    }
}
