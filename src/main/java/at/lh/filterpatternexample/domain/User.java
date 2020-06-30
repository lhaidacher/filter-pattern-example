package at.lh.filterpatternexample.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String userName;
    private String mail;
    private String firstName;
    private String lastName;

    public boolean filter(String keyword) {
        return userName.contains(keyword) || mail.contains(keyword);
    }
}
