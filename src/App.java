public class App {
    public static void main(String[] args) {

        App app = new App();

        try {
            app.execute();
        } catch(Exception e) {
            // アプリケーションエラーはすべて最上流でキャッチする
            e.printStackTrace();
        }
    }

    /**
     * メイン処理を実施する
     */
    private void execute() {

        Person p1 = new Person("yamada", "taro");
        Person p2 = new Person("yamamoto", "ichiro");
        Person p3 = new Person("", "");

        People people = new People();
        people.join(p1).join(p2);

        people.consoleOutNames();
    }
}
