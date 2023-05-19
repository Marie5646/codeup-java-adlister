import models.Albums;
import models.Author;
import models.Quote;

public class BeanTest {

    public static void main(String[] args) {
        Author au1 = new Author(1,"Jackie","Chan","https://www.telegraph.co.uk/content/dam/health-fitness/2017/06/01/TELEMMGLPICT000000515610_trans_NvBQzQNjv4BqbH1477TFB5ofB6sXYxNwhApSPWm_K_hBlZ75yxnvP4M.jpeg?imwidth=960");
        Author au2 = new Author(2,"Micheal","Jordan","https://www.telegraph.co.uk/content/dam/health-fitness/2017/06/01/TELEMMGLPICT000004120962_trans_NvBQzQNjv4BqsXJ4x1hHApqw7ff8y1ZSzSI9iBUzgvlKugxzAzQHC18.jpeg?imwidth=960");
        Author au3 = new Author(3,"EarHart","Emelia","https://www.telegraph.co.uk/content/dam/health-fitness/2017/06/01/TELEMMGLPICT000006212828_trans_NvBQzQNjv4Bq9-zn32UdN-2qebTEmhS1ZchKDu3GQk7WOwEY0CqJhkw.jpeg?imwidth=960");
        Author au4 = new Author(4,"Frank","Sinatra","https://www.telegraph.co.uk/content/dam/health-fitness/2017/06/01/TELEMMGLPICT000084506319_trans_NvBQzQNjv4BqKAhRcfi2wed_XpL7VymONsFk4mKYIH-kSazUBUrJbmY.jpeg?imwidth=960");

        Quote q1 = new Quote(1,au1,"The successful warrior is the average man, with laser-like focus.");
        Quote q2 = new Quote(2,au2,"I've missed more than 9000 shots in my career. I've lost almost 300 games. 26 times I've been trusted to take the game winning shot and missed. I've failed over and over and over again in my life. And that is why I succeed.");
        Quote q3 = new Quote(3,au3,"I've missed more than 9000 shots in my career. I've lost almost 300 games. 26 times I've been trusted to take the game winning shot and missed. I've failed over and over and over again in my life. And that is why I succeed.");
        Quote q4 = new Quote(4,au4,"The best revenge is massive success.");


        Albums al1 = new Albums(123,"Beyonce","RENISSANCE","Pop",2022,3);
        Albums al2 = new Albums(325,"Harry Styles","Harry's House","Pop",2022,5);
        Albums al3 = new Albums(654,"The Weekend","After Hours","Pop",2020,6);
        Albums al4 = new Albums(949,"Taylor Swift","Red","Pop",2021,10);

    }
}

