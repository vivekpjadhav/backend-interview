package ai.brace;

public final class Employee {
    /**
     * Emploee object need to be  done properly .
     * if we are usng the any object in the Map collection as Key , it must be immutable.
     * Like wrapper classes. i e String , Integer ,Double ....
     * we must impliment equals and hashcode
     * make the attributes final and  private
     * provide only getters
     */
    final private String firstName;
    final private String middleInitial;
    final private String lastName;
    final private String socialSecurityNumber;

    public Employee(String _lastName, String _firstName, String _middleInitial, String _socialSecurityNumber) {
        firstName = _firstName;
        middleInitial = _middleInitial;
        lastName = _lastName;
        socialSecurityNumber = _socialSecurityNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
        if (middleInitial != null ? !middleInitial.equals(employee.middleInitial) : employee.middleInitial != null)
            return false;
        if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;
        return socialSecurityNumber != null ? socialSecurityNumber.equals(employee.socialSecurityNumber) : employee.socialSecurityNumber == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (middleInitial != null ? middleInitial.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (socialSecurityNumber != null ? socialSecurityNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
