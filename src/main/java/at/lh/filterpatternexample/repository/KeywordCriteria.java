package at.lh.filterpatternexample.repository;

import at.lh.filterpatternexample.domain.User;

import java.util.Set;

public class KeywordCriteria extends Criteria {
    private String keyword;

    public KeywordCriteria(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public Set<User> get(UserRepository repository) {
        return repository.findByKeyword(keyword);
    }
}
