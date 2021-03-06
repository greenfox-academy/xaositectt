

public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  Student() {
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public void getGoal() {
    System.out.println("My goal: Be a junior software developer.");
  }

  public void introduce(Person person) {
    System.out.println("Hi, i'm " + this.getName() + " from " + this.getPreviousOrganization() + " who skipped " + this.getSkippedDays() + " from the course already");
  }

  public void skipDays(int numberOfDays) {
    skippedDays = skippedDays + numberOfDays;
  }

  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public int getSkippedDays() {
    return skippedDays;
  }
}
