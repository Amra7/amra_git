package ba.bitcamp.exercies.CSVBase;

public class User {

	private String name;
	private String surname;
	private int age;
	private boolean driverLicenece;

	/**
	 * Constructor for User with parameters name, surname , age, driverLicense;
	 * 
	 * @param name
	 *            - name of user.
	 * @param surname
	 *            - surname of user.
	 * @param age
	 *            - age of user.
	 * @param driverLicenece
	 *            - true if it has drivers license or false if it does not.
	 */
	public User(String name, String surname, int age, boolean driverLicenece) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.driverLicenece = driverLicenece;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname
	 *            the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the driverLicenece
	 */
	public boolean isDriverLicenece() {
		return driverLicenece;
	}

	/**
	 * @param driverLicenece
	 *            the driverLicenece to set
	 */
	public void setDriverLicenece(boolean driverLicenece) {
		this.driverLicenece = driverLicenece;
	}

	public String toCSVString(String delimeter) {
		StringBuilder sb = new StringBuilder();
        sb.append(name).append(delimeter).append(surname).append(delimeter).append(age).append(delimeter);
        return sb.toString();
	}

}
