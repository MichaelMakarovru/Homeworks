package module4_java_fundamentals_coding.exercise19;

class Main {

    public static void main(String[] args) {

        Poem poem1 = new Poem();
        poem1.setCreator(new Author("Smith", "England"));
        poem1.setStrophesCount(34);

        Poem poem2 = new Poem(new Author("Johnson", "USA"), 56);

        Author author = new Author("White", "New Zealand");
        Poem poem3 = new Poem(author, 42);

        Poem[] poems = new Poem[]{poem1, poem2, poem3};

//        Poem[] poems1 = new Poem[3];
//        poems1[0] = poem1;
//        poems1[1] = poem2;
//        poems1[2] = poem3;

        Poem poemWithLargestStrophesCount = poem1;

        for (int i = 1; i < poems.length; i++) {
            if (poems[i].getStrophesCount() > poemWithLargestStrophesCount.getStrophesCount()) {
                poemWithLargestStrophesCount = poems[i];
            }
        }

        System.out.println("Largest poem author: " +
                poemWithLargestStrophesCount.getCreator().getSurname() + ", " +
                poemWithLargestStrophesCount.getCreator().getNationality());
    }
}
