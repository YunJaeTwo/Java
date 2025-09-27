package lecture1;

public class MovieReviewMain2 {
    public static void main (String[] args) {
        //배열을 만들어야 하는데 어떻게 배열을 만들까?
        
        MovieReview[] review = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";
        review[0] = inception;

        MovieReview abouttime = new MovieReview();
        abouttime.title = "어바웃타임";
        abouttime.review = "인생은 아름다워";
        review[1] = abouttime;

        for(MovieReview i : review){
            System.out.println("제목은 " + i.title +"리뷰는" + i.review);
        }
    }
}
