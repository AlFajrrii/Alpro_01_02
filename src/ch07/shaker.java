package shakersort;

public class shaker {

    public static void main(String[] args) {
      Shaker sh = new Shaker();
      sh.setData(25);
      System.out.println("Array dengan nilai element random");
      sh.testData();
      System.out.print("\n");
      System.out.println("\nArray dengan nilai element sudah terurut");
      sh.shakerSort(sh.getData());
      sh.testData();
    }

}