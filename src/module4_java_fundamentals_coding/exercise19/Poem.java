package module4_java_fundamentals_coding.exercise19;

class Poem {

    private Author creator;
    private int strophesCount;

    public Poem(Author creator, int strophesCount) {
        this.creator = creator;
        this.strophesCount = strophesCount;
    }

    public Poem() {
    }

    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public int getStrophesCount() {
        return strophesCount;
    }

    public void setStrophesCount(int strophesCount) {
        this.strophesCount = strophesCount;
    }
}
