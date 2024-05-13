import java.util.*;

// Class representing a user post
class Post implements Comparable<Post> {
  private int id;
  private Date timestamp;
  private String postText;

  public Post(int id, Date timestamp, String postText) {
    this.id = id;
    this.timestamp = timestamp;
    this.postText = postText;
  }

  public int getId() {
    return id;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public String getPostText() {
    return postText;
  }

  @Override
  public int compareTo(Post other) {
    // Compare posts based on timestamp
    return this.timestamp.compareTo(other.timestamp);
  }
}

// Custom class representing a social feed that aggregates posts
class SocialFeed implements Iterable<Post> {
  private List<Post> posts = new ArrayList<>();

  public void addPost(Post post) {
    posts.add(post);
  }

  @Override
  public Iterator<Post> iterator() {
    return posts.iterator();
  }
}

public class PartTwo {

  public static void main(String[] args) {
    // Create an ArrayList named allPosts and add several posts to it
    List<Post> allPosts = new ArrayList<>();
    allPosts.add(new Post(1, new Date(), "Hello World!"));
    allPosts.add(new Post(2, new Date(), "Happy weekend!"));
    allPosts.add(new Post(3, new Date(), "Java programming"));

    // Convert allPosts into a LinkedList named linkedPosts
    List<Post> linkedPosts = new LinkedList<>(allPosts);

    // Demonstrate behavior and performance of LinkedList when adding elements to
    // the beginning
    long startTime = System.nanoTime();
    linkedPosts.add(0, new Post(4, new Date(), "New post at the beginning"));
    long endTime = System.nanoTime();
    long linkedListInsertionTime = endTime - startTime;
    System.out.println("Time taken to insert at beginning in LinkedList: " + linkedListInsertionTime + " ns");

    // Create a HashSet to store posts and demonstrate behavior with duplicate posts
    Set<Post> postSet = new HashSet<>();
    postSet.addAll(allPosts);
    // Adding a post with the same ID as an existing post
    postSet.add(new Post(1, new Date(), "Duplicate post"));

    // Display posts in the HashSet
    System.out.println("Posts in HashSet:");
    for (Post post : postSet) {
      System.out.println(post.getId() + ": " + post.getPostText());
    }

    // Sort posts in allPosts using Comparable (based on timestamp)
    Collections.sort(allPosts);
    System.out.println("Sorted posts by timestamp:");
    for (Post post : allPosts) {
      System.out.println(post.getTimestamp() + ": " + post.getPostText());
    }

    // Demonstrate Iterable behavior with SocialFeed
    SocialFeed socialFeed = new SocialFeed();
    socialFeed.addPost(new Post(5, new Date(), "New post in social feed"));
    socialFeed.addPost(new Post(6, new Date(), "Another post"));
    System.out.println("Posts in SocialFeed:");
    for (Post post : socialFeed) {
      System.out.println(post.getTimestamp() + ": " + post.getPostText());
    }
  }
}
