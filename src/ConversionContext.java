public class ConversionContext {
    private String question = "";
    private String response = "";
    private String fromConv = "";
    private String toConv = "";
    private String[] partsOfQues;
    private Double quantity;

    public ConversionContext(String input) {
        this.question = input;
        this.partsOfQues = getInput().split(" ");
        this.fromConv = getCapitalized(this.partsOfQues[1]);
        this.toConv = getLowerCase(this.partsOfQues[3]);
        this.quantity = Double.valueOf(this.partsOfQues[0]);
        this.response = partsOfQues[0] + " " + partsOfQues[1] + " equals ";
    }

    public Double getQuantity() {
        return quantity;
    }

    public String getFromConv() {
        return fromConv;
    }

    public String getToConv() {
        return toConv;
    }

    public String getResponse() {
        return response;
    }

    public String getInput() {
        return this.question;
    }

    public String getCapitalized(String word) {
        word = word.toLowerCase();
        word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
        int lengthofword = word.length();
        if (word.charAt(lengthofword-1) != 's')
            word = new StringBuffer(word).insert(lengthofword,"s").toString();
        return word;
    }

    public String getLowerCase(String word) {
        return word.toLowerCase();
    }
}
