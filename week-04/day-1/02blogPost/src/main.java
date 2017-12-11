//Create a BlogPost class that has
//        an authorName
//        a title
//        a text
//        a publicationDate
//        Create a few blog post objects:
//          "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//            Lorem ipsum dolor sit amet.
//          "Wait but why" titled by Tim Urban posted at "2010.10.10."
//            A popular long-form, stick-figure-illustrated blog about almost everything.
//          "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//            Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
//            When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t
//            really into the whole organizer profile thing.

public class main {
  public static void main(String[] args) {

    blogPost trial1 = new blogPost();
    trial1.setTitle("Lorem Ipsum");
    trial1.setText("Lorem ipsum dolor sit amet.");
    trial1.setAuthorName("John Doe");
    trial1.setPublicationDate("2000.05.04.");

    blogPost trial2 = new blogPost();
    trial2.setTitle("Wait but why");
    trial2.setText("A popular long-form, stick-figure-illustrated blog about almost everything.");
    trial2.setAuthorName("Tim Urban");
    trial2.setPublicationDate("2010.10.10.");

    blogPost trial3 = new blogPost();
    trial3.setTitle("One Engineer Is Trying to Get IBM to Reckon With Trump");
    trial3.setText("Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");
    trial3.setAuthorName("William Turton");
    trial3.setPublicationDate("2017.03.28");

    System.out.println(trial3.title);
  }
}
