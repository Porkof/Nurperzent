class Code {
    private String name;

    public Code(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
public class code {
    public static void main(String[] args) {
        Code code = new Code("aslkd");
        System.out.println(code.getName());

    }
}