package lecture1;

public class MovieReviewMain{
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";

        MovieReview abouttime = new MovieReview();
        abouttime.title = "어바웃타임";
        abouttime.review = "인생은 아름다워";

        System.out.println("영화 제목은 " +inception.title + "리뷰는 " + inception.review);
        System.out.println("영화 제목은 " +abouttime.title + "리뷰는 " + abouttime.review);

}
}   
