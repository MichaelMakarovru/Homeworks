package module9_java_advanced_coding.ex_27_joiner;

import java.util.List;

class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(List<T> list) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {

            sb.append(list.get(i));

            if (i != list.size() - 1) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }
}
