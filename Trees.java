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
                if (this.mother.mother != null) {
                    info += "Бабушку по маминой линии зовут " + this.mother.mother.name + "\n";
                    info += "Дедушку по маминой линии зовут " + this.mother.father.name + "\n";
                }
            } else {
                if (this.father != null)
                    info += "Моего папу зовут" + this.father.name + "\n";
                if (this.father.father != null) {
                    info += "Бабушку по папиной линии зовут " + this.father.mother.name + "\n";
                    info += "Дедушку по маминой линии зовут " + this.father.father.name + "\n";
                    }
                {
                    return;
                }
                System.out.println(info);
            }
        }
    }
