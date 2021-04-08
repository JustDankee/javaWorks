public class Lesson {
    public static void main(String[] args) {
        Person petya = new Person ("Петя", 74, null, null);
        Person nina = new Person ("Нина", 72, null, null);
        Person ivan = new Person ("Иван", 75, null, null);
        Person katya = new Person ("Екатерина", 70, null, null);

        Person oleg = new Person ("Олег",45, katya, ivan);
        Person olga = new Person ("Ольга", 47, nina, petya);

        Person igor = new Person ("Игорь", 20, olga, oleg);
        igor.getInfo();

    }
}
    class Person {
        public String name;
        private int age;
        private Person mother;
        private Person father;

        public Person(String name, int age, Person mother, Person father) {
            this.name = name;
            this.age = age;
            this.mother = mother;
            this.father = father;

        }

        public Person getMother() {
            return mother;
        }
        public Person getFather() {
            return father;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public void getInfo() {
            String info = "";
            info += "Меня зовут " + this.name + "\n" +
                    "Мне " + this.age + " лет \n";

            if (this.mother != null) {
                info += "Мою маму зовут " + this.mother.name + "\n";
                if (this.mother.mother != null)
                    info += "Бабушку по маминой линии зовут " + this.mother.mother + "\n";
                    info += "Дедушку по маминой линии зовут " + this.mother.father + "\n";

            } else {
                if (this.father != null)
                    info += "Моего папу зовут" + this.father.name + "\n";
                if (this.father.father != null)
                    info += "Бабушку по папиной линии зовут " + this.mother.father + "\n";
                    info += "Дедушку по маминой линии зовут " + this.mother.father + "\n";
                {
                    return;
                }
                System.out.println(info);
            }
        }
    }
