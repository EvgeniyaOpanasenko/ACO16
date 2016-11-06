package base.demo;

/**
 * Created by Lisa on 10/31/2016.
 */
public class Worker {
        private String name;
        private int age;
        private String mail;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public Worker(String name, int age, String mail) {
            this.name = name;
            this.age = age;
            this.mail = mail;
        }

        @Override
        public String toString() {
            return "Worker{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", mail='" + mail + '\'' +
                    '}';
        }


    }
