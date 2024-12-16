package builder;

public class UserBuilder {
    private String name;
    private String lastName;

    private UserBuilder() {

    }

    public static UserBuilder getUser() {
        return new UserBuilder();
    }

    public UserBuilder withName(String name) {
        // доп.логика: проверки и т.д
        this.name = name;
        return this;
    }

    public UserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    UserBuilder user = getUser()
            .withName("Pavel")
            .withLastName("Iwanow");

}
