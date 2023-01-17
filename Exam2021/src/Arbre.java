public class Arbre {
    private int age;

    //Q1 - 1p
    public Arbre() {
        this.age = 0;
    }

    //Q2 - 1p
    public String toString() {
        String ch;
        if (this.age == 0 || this.age == 1) ch = this.age + " an";
        else ch = this.age + " ans";
        return ch;
    }

    //Q3 - 1p
    public void passeAnnee() {
        this.age++;
    }

    //Q4 - 1p
    public boolean ageDepasse(int limite) {
        return this.age >= limite;
    }

    public int getAge() {
        return this.age;
    }
}
