package ie.atu.week4;

public class Student {
        // Private fields
        private String name;
        private String email;
        private String course;

        public Student(){

        }
        public Student(String name, String email, String course){

            this.email = email;
            this.name = name;
            this.course = course;
        }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


