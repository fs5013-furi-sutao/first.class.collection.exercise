import java.util.Set;

/**
 * Person は具体的な命令に応じる
 */
public class Person {
    Name name;

    Person(String firstName, String lastName) {
        this.name = new Name(firstName, lastName);
    }

    public void writeName(Set<String> nameRecords) {
        if (nameRecords == null) {
            throw new RuntimeException("人名リストが作成されていません.");
        }
        nameRecords.add(this.name.concatFullName());
    }
}
