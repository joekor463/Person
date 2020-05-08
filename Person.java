public class Person {
    private String firstName;
    private String lastName;
    private int age = 0;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String Name){
        firstName = Name;
        //return firstName;
    }

    public void setLastName(String Name){
        lastName = Name;
        //return lastName;
    }

    public void setAge(int a){
        age = a;
        if ((age < 0)|(age > 100)) age = 0;
        //return age;
    }

    public boolean isTeen(){
        //System.out.println ("age2 = " + age);
        //if ((age > 12)|(age < 20)) return true;
        if ((age < 13)|(age>=20)) return false;
        return true;
    }

    public String getFullName(){
        //System.out.println (firstName);
        if (firstName == null) firstName = "";
        if (lastName == null) lastName = "";
        String s = new String(" ");
        String fullName = firstName +s+ lastName;
        return fullName;
    }
}
