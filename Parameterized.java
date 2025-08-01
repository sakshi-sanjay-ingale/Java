class Parameterized {
    String name;
    int id;

    Parameterized(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class GFG {
    public static void main(String[] args) {
        Parameterized parameter1 = new Parameterized("Pooja", 68);
        System.out.println("Name: " + parameter1.name + " and Id: " + parameter1.id);
    }
}
