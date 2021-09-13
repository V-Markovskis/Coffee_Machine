class Application {

    String name;

    void run(String[] args) {
        // implement me
        System.out.println(name);
        for (String tmp: args) {
            System.out.println(tmp);
        }

    }
}