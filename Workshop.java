import java.util.*;

public class Workshop{
  private String name;
  private ArrayList<Employable> staff;
  private int teamSize;

  public Workshop(String name, int teamSize){
    this.name = name;
    this.staff = new ArrayList<Employable>();
    this.teamSize = teamSize;
  }

  public String getName(){
    return this.name;
  }

  public int staffCount(){
    return staff.size();
  }

  public boolean hiring(){
    int count = staffCount();
    return (count < teamSize);
  }

  public String employStaff(Employable newStaff){
    staff.add(newStaff);
    return newStaff.getName() + " is hired";
  }

}