package Software_Eng_TPs;

public class Database {
    private static Database database = null;
    String name;
    private Database() {
    }
    public void getConnection() {
        System.out.println("You are connected to the database " + this.name);
    }
    public static Database getInstance(String name) {
        if (database == null) {
            database = new Database();
        }
        database.name = name;
        return database;
    }
}
class MainSingleton {
    public static void main(String[] args) {
        Database X = Database.getInstance("MySQL");
        Database Y = Database.getInstance("SQLite");

        System.out.println(X==Y);
    }
}
