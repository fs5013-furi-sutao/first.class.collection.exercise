import java.util.HashSet;
import java.util.Set;

/**
 * People クラス
 * <p>
 * Person のファーストクラスコレクション<br>
 * Person インスタンスの制御に専念する
 */
public class People {
    Set<Person> people;

    People() {
        this.people = new HashSet<>();
    }

    /**
     * People インスタンスに参加しているメンバの名前一覧を取得する
     * <p>
     * 実装内容: <br>
     * {@code Person} に名簿を渡すので, そこに各自, <br> 
     * 名前を書き込んでくださいね, というイメージ
     * @return 名前一覧 {@code Set<String>}
     */
    private Set<String> nameList() {
        Set<String> nameRecords = new HashSet<>(people.size());

        for (final Person person : people) {
            person.writeName(nameRecords);
        }
        return nameRecords;
    }

    /**
     * 渡された {@code Person} オブジェクトを People インスタンスに参加させる
     * @param person {@code Person} のインスタンス
     * @return 自身 {@code People} のインスタンスを返す
     */
    public People join(Person person) {
        this.people.add(person);
        return this;
    }

    /**
     * {@code People} インスタンスに参加しているすべての Person の名前を表示する
     */
    public void consoleOutNames() {
        for (String name : this.nameList()) {
            System.out.println(name);
        }
    }
}
