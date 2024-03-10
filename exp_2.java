import java.util.Scanner;
class Video {
  private String title;
  private boolean checkedOut;
  private double averageRating;
  public Video(String title) {
    this.title = title;
    this.checkedOut = false;
    this.averageRating = 0.0;
  }
  public String getTitle() {
    return title;
  }
  public boolean isCheckedOut() {
    return checkedOut;
  }
  public double getAverageRating() {
    return averageRating;
  }
  public void checkOut() {
    checkedOut = true;
  }
  public void returnVideo() {
    checkedOut = false;
  }
  public void receiveRating(int rating) {
    // Assuming ratings are on a scale of 1 to 5
    averageRating = (averageRating + rating) / 2.0;
  }
}
class VideoStore {
  private Video[] inventory;
  public VideoStore() {
    this.inventory = new Video[10];
  }
  public void addVideo(String title) {
    for (int i = 0; i < inventory.length; i++) {
      if (inventory[i] == null) {
        inventory[i] = new Video(title);
        System.out.println("Video '" + title + "' added to the inventory.");
        return;
      }
    }
    System.out.println("Inventory is full. Cannot add more videos.");
  }
  public void checkOut(String title) {
    for (Video video : inventory) {
      if (video != null && video.getTitle().equals(title)) {
        if (!video.isCheckedOut()) {
          video.checkOut();
          System.out.println("Video " + title + "checked out successfully.");
          return;
        } else {
          System.out.println("Video " + title + " is already checked out.");
          return;
        }
      }
    }
    System.out.println("Video " + title + " not found in the inventory.");
  }
  public void returnVideo(String title) {
    for (Video video : inventory) {
      if (video != null && video.getTitle().equals(title)) {
        if (video.isCheckedOut()) {
          video.returnVideo();
          System.out.println("Video " + title + " returned successfully.");
          return;
        } else {
          System.out.println("Video " + title + " is not checked out.");
          return;
        }
      }
    }
    System.out.println("Video " + title + " not found in the inventory.");
  }
  public void receiveRating(String title, int rating) {
    for (Video video : inventory) {
      if (video != null && video.getTitle().equals(title)) {
        video.receiveRating(rating);
        System.out.println("Rating received for video " + title + ".");
        return;
      }
    }
    System.out.println("Video " + title + " not found in the inventory.");
  }
  public void listInventory() {
    System.out.println("Inventory List:");
    for (Video video : inventory) {
      if (video != null) {
        System.out.println("Title: " + video.getTitle()
            + ", Checked Out: " + (video.isCheckedOut() ? "Yes" : "No")
            + ", Average Rating: " + video.getAverageRating());
      }
    }
  }
}
public class exp_2 {
  public static void main(String[] args) {
    VideoStore videoStore = new VideoStore();
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
      System.out.println("Video Rental System Menu:");
      System.out.println("1. Add a Video");
      System.out.println("2. Give Ratings to a Video");
      System.out.println("3. Rent a Video");
      System.out.println("4. Return a Video");
      System.out.println("5. List Inventory");
      System.out.println("6. Exit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();
      scanner.nextLine(); // Consume the newline character
      switch (choice) {
        case 1:
          System.out.print("Enter the title of the video: ");
          String title = scanner.nextLine();
          videoStore.addVideo(title);
          break;
        case 2:
          System.out.print("Enter the title of the video: ");
          String ratingTitle = scanner.nextLine();
          System.out.print("Enter the rating (1 to 5): ");
          int rating = scanner.nextInt();
          videoStore.receiveRating(ratingTitle, rating);
          break;
        case 3:
          System.out.print("Enter the title of the video to rent: ");
          String rentTitle = scanner.nextLine();
          videoStore.checkOut(rentTitle);
          break;
        case 4:
          System.out.print("Enter the title of the video to return: ");
          String returnTitle = scanner.nextLine();
          videoStore.returnVideo(returnTitle);
          break;
        case 5:
          videoStore.listInventory();
          break;
        case 6:
          System.out.println("Exiting the Video Rental System. Goodbye!");
          break;
        default:
          System.out.println(
              "Invalid choice. Please enter a number between 1 and 6.");
      }
    } while (choice != 6);
    scanner.close();
  }
}