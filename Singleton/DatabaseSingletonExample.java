class Database {

    // a classe deve ser única, portanto, ninguém pode instancia-la
    private Database() {}

    public String performQuery(String query) {
        // Imagine uma ação pesada no banco de dados
        // Uma lógica de queue ou cache seria interessante aqui!
        return query;
    }

    private static Database database;

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

}