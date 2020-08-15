import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Value Object
 */
public class Name {
    String firstName;
    String lastName;

    Name(String firstName, String lastName) {
        this.isNull(firstName, lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private void isNull(String firstName, String lastName) throws RuntimeException {
        if (!firstName.equals("") && !lastName.equals(""))
            return;

        List<String> list = new ArrayList<>();
        if (firstName.equals("")) list.add("firstName");
        if (lastName.equals("")) list.add("lastName");
        String args = list.stream().collect(Collectors.joining(", "));
        String mess  = String.format(
            "名前が設定されていません. %s がブランクです.", args);
        throw new RuntimeException(mess);
    }

    String concatFullName() {
        return this.firstName + "." + this.lastName;
    }
}
