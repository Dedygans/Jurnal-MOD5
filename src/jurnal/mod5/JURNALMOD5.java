/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal.mod5;

/**
 *
 * @author dedyh
 */
public class JURNALMOD5 {

  public static void main(String[] args) {
        SayaTubeVideo video1 = new SayaTubeVideo("Review Spiderman Far From Home oleh Dedy Syahputra rizki harahap");
        SayaTubeVideo video2 = new SayaTubeVideo("Review Black Panther (2018)  oleh Dedy Syahputra rizki harahap");
        SayaTubeVideo video3 = new SayaTubeVideo("Review Parasite (2019) oleh Dedy Syahputra rizki harahap");
        SayaTubeVideo video4 = new SayaTubeVideo("Review Avengers: Endgame  oleh Dedy Syahputra rizki harahap");
        SayaTubeVideo video5 = new SayaTubeVideo("Review Knives Out (2019) oleh Dedy Syahputra rizki harahap");
        SayaTubeVideo video6 = new SayaTubeVideo("Review Us (2019) oleh Dedy Syahputra rizki harahap");
        SayaTubeVideo video7 = new SayaTubeVideo("Review Toy Story 4 oleh Dedy Syahputra rizki harahap");
        SayaTubeVideo video8 = new SayaTubeVideo("Review Lady Bird (2017) oleh Dedy Syahputra rizki harahap");
        SayaTubeVideo video9 = new SayaTubeVideo("Review Spiderman Home Coming oleh Dedy Syahputra rizki harahap");
        SayaTubeVideo video10 = new SayaTubeVideo("Review Civil War oleh Dedy Syahputra rizki harahap");
        video1.increasePlayCount(25000000);
        video2.increasePlayCount(25000000);
        video3.increasePlayCount(25000000);
        video4.increasePlayCount(25000000);
        video5.increasePlayCount(25000000);
        video6.increasePlayCount(25000000);
        video7.increasePlayCount(25000000);
        video8.increasePlayCount(25000000);
        video9.increasePlayCount(25000000);
        video10.increasePlayCount(25000000);


        SayaTubeUser username = new SayaTubeUser("Dedy Syahputra Rizki Harahap");
        username.addVideo(video1);
        username.addVideo(video2);
        username.addVideo(video3);
        username.addVideo(video4);
        username.addVideo(video5);
        username.addVideo(video6);
        username.addVideo(video7);
        username.addVideo(video8);
        username.addVideo(video9);
        username.addVideo(video10);

        username.printAllVideoPlaycount();
        System.out.println("Total playcount : "+username.getTotalVideoPlayCount());
    }
    
}
