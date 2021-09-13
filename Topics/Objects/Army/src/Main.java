class Army {

    public static void createArmy() {
        Unit unit1 = new Unit("Gar1");
        Unit unit2 = new Unit("Gar2");
        Unit unit3 = new Unit("Gar3");
        Unit unit4 = new Unit("Gar4");
        Unit unit5 = new Unit("Gar5");

        Knight kn1 = new Knight("Bar1");
        Knight kn2 = new Knight("Bar2");
        Knight kn3 = new Knight("Bar3");

        General gen = new General("Aloe");

        Doctor doc = new Doctor("Rez");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}