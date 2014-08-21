package sample.framework;

public class InputLine {
    private String input;
    private String output;
    private String inRadix;
    private String outRadix;
 
    public InputLine() {
        inRadix = "10";
        outRadix = "10";        
    }
    public String getInput() {
        return input;
    }
    public void setInput(String input) {
        this.input = input;
    }
    public String getOutput() {
        return output;
    }
    public void setOutput(String output) {
        this.output = output;
    }
    public String getInRadix() {
        return inRadix;
    }
    public void setInRadix(String inRadix) {
        this.inRadix = inRadix;
    }
    public String getOutRadix() {
        return outRadix;
    }
    public void setOutRadix(String outRadix) {
        this.outRadix = outRadix;
    }
}
