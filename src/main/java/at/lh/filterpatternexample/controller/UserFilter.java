package at.lh.filterpatternexample.controller;

import at.lh.filterpatternexample.repository.Criteria;
import at.lh.filterpatternexample.repository.FirstNameCriteria;
import at.lh.filterpatternexample.repository.KeywordCriteria;
import lombok.Data;

@Data
public class UserFilter {
    private int page;
    private int size;
    private String keyword;
    private String firstName;

    public Criteria getCriteria() {
        return keyword == null ?
                new FirstNameCriteria(firstName) :
                new KeywordCriteria(keyword);
    }
}


