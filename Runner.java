class Runner{
  public static void main(String[] args) {
    Workshop workshop = new Workshop("Santa's Workshop", 3);
    String name = workshop.getName();

    if (workshop.hiring() == true)
      System.out.println(name + " is hiring!");
    else
      System.out.println(name + " is full!");
   
    Elf staff1 = new Elf("John");
    Reindeer staff2 = new Reindeer("Jarrod");
    Elf staff3 = new Elf("Steven");
    System.out.println(workshop.employStaff(staff1));
    System.out.println(workshop.employStaff(staff2));
    System.out.println(workshop.employStaff(staff3));

    int employees = workshop.staffCount();
    System.out.println("Staff:" + employees);

   if (workshop.hiring() == true)
     System.out.println(name + " is hiring!");
   else
     System.out.println(name + " is full!");
  }
}