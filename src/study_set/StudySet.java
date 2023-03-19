package study_set;

import java.util.ArrayList;

public class StudySet {
    private ArrayList<String> terms;
    private ArrayList<String> definitions;
    private String name;
    private String descriptions;

    public void addTermAndDefinition(String term, String definition) {
        terms.add(term);
        definitions.add(definition);
    }

    public void removeTermAndDefinition(String term) {
        int i = terms.lastIndexOf(term);
        if(i != -1) {
            terms.remove(i);
            definitions.remove(i);
        }
    }

    public void removeTermAndDefinition(int index) {
        terms.remove(index);
        definitions.remove(index);
    }

    public String getDefinition(String term) {
        int i = terms.lastIndexOf(term);
        if(i != -1) {
            return definitions.get(i);
        } else {
            return "NULL";
        }
    }

    public String getDefinition(int index) {
        return definitions.get(index);
    }

}
