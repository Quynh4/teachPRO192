public class WordData extends Factory implements IConnect {
    private String content;

    public WordData(String type, String dataSource) {
        super(type, dataSource);
        content = "this is a string";
    }

    @Override
    public boolean makeConnection() {
        return getDataSource().contains("localhost:8080");
    }

    @Override
    public void readData() {
        if (getType().endsWith(".doc")) {
            content = "humpty dumpty sat on the wall";
        }
    }

    @Override
    public String writeData() {
        String[] words = content.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    result.append(word.substring(1));
                }
                result.append(" ");
            }
        }
        return result.toString().trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}