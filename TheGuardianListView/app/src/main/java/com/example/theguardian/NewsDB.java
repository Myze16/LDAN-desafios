package com.example.theguardian;

import java.util.ArrayList;
import java.util.List;

public class NewsDB {
    private List<News> newsList;

    public NewsDB() {
        this.newsList = new ArrayList<>();

        this.newsList.add(
                new News(
                "Israeli airstrike hits front of hospital in south Beirut, spokesperson says",
                "Attack hit entrance of Rafic Hariri university hospital - the largest public hospital in Lebanon",
                "William Christou\nAn Israeli airstrike hit in front of the entrance of Rafic Hariri University hospital in south Beirut on Monday night, a spokesperson for the hospital told the Guardian.\n\nRafik Hariri hospital is the largest public hospital in Lebanon and took over the treatment of some patients which had previously been evacuated from hospitals in Dahiyeh, the southern suburbs of Beirut, due to intense Israeli bombing in the area.\n\nThe bombing near the hospital occured as Israel carried out more airstrikes in Dahiyeh. The Israeli military had issued warnings for residents to move at least five hundred meters away from certain sites in Dahiyeh, including the pier in Ouzaieh, a part of Dahiyeh that still has people living in it. After the warnings were issued, residents of Ouzaieh began to flee the area.\n\nJust two hours earlier, the Israeli military said that Hezbollah was hiding hundreds of millions of dollars of cash under a hospital in Haret Hreik, a neighbourhood in Dahiyeh. The hospital was quickly evacuated after the accusation, an accusation the hospital director has since denied.",
                "hot",
                R.drawable.israeli,
                32
                )
        );
        this.newsList.add(
                new News(
                        "El Chapo’s sons negotiating plea deal with US government, lawyer confirms",
                        "Ovidio Guzmán and Joaquín Guzmán López may become cooperating witnesses in case against drug lord El Mayo",
                        "Two of drug lord Joaquín “El Chapo” Guzmán Loera’s sons have confirmed they are negotiating for a plea deal with the US government, an attorney for the pair confirmed during a federal court status hearing in Chicago on Monday.\nThe hearing confirmed an August report from the Mexican news organization Milenio that Ovidio Guzmán and Joaquín Guzmán López were negotiating a deal for a more lenient sentence and to become cooperating witnesses for the US government.\nDuring Monday’s hearing for Ovidio Guzmán, the federal judge also allowed for him and his brother to be represented by the same attorney, Jeffrey Lichtman, who represented El Chapo during his sensational 2019 federal trial.",
                        "regular",
                        R.drawable.elchaposons,
                        33
                )
        );
        this.newsList.add(
                new News(
                        "People with depression could administer brain stimulation at home, trial shows",
                        "Findings from phase two trial suggest patients could receive treatment without having to attend a clinic",
                        "People with major depression could alleviate their symptoms by self-administering a form of electrical brain stimulation at home, according to a clinical trial of the therapy.\nPatients who took a 10-week course of the treatment were about twice as likely to see their depression go into remission than those in a control group who performed the same procedure with the current switched off.\nThe findings suggest that people with depression could receive beneficial brain stimulation without having to attend a clinic and that the treatment could become an effective alternative for those who do not want, or do not respond to, more traditional therapies.",
                        "regular",
                        R.drawable.ic_launcher_foreground,
                        39
                )
        );
        this.newsList.add(
                new News(
                        "North Korean arms more significant than troops in Russia’s war against Ukraine",
                        "Intelligence builds that members of Pyongyang’s special forces are in Russia preparing for combat as munitions are also shipped",
                        "Ukraine’s president, Volodymyr Zelenskyy, got to the point in his presidential address last night: “Another state,” he said, was “joining the war against Ukraine”. He was referring to the growing intelligence that shows elite soldiers from North Korea are in Russia preparing to join what has become a fight that, in effect, extends all the way across Asia.",
                        "hot",
                        R.drawable.korean,
                        53
                )
        );
        this.newsList.add(
                new News(
                        "What is okra water and is it good for your health?",
                        "In the world of infused water trends, okra water is having a moment, and here’s what you need to know about it",
                        "In the wellness world, it seems there’s always a new infused water promising to make us better. Lemon water is a familiar example: perhaps not transformative, but at least refreshing. Artichoke water, essentially the leftover liquid from boiling artichokes, is touted by “French girls” (them again!) as an antioxidant-packed debloating potion. Asparagus water – infamously sold for $6 at Whole Foods – was more likely an employee error than an elixir.\nNow, okra water is having its moment. Searches for the beverage have spiked by 470% on Pinterest, according to the company’s fall trend report. Across TikTok and Instagram, users claim okra water can improve digestion, regulate blood sugar, boost female fertility, increase vaginal lubrication and even ease labor for those expecting.",
                        "cold",
                        R.drawable.ic_launcher_foreground,
                        55
                )
        );
        this.newsList.add(
                new News(
                        "Sausages, beans, soups – Nigel Slater’s robust autumn recipes",
                        "The season of ‘big cooking’ means taking your time in the kitchen over mushroom bourguignon, braised tomatoes, and other gentle simmers",
                        "The changing season brings with it a need for more robust cooking. In come the bags of golden-skinned onions, the woody-stemmed herbs and the root vegetables. The fat carrots and mushrooms, the beans and sticky rice and full-bodied soups. The season turned rather quickly this year: one minute it was all melons and tomatoes, the next I was rummaging for the cast-iron casserole.\nBig cooking, by which I mean those recipes that take a little longer to cook and tend to come to the table with a ladle, has been the order of the day in this kitchen for a few weeks now. The season kicked off with a tray of late tomatoes, baked with shallots until their skins had blackened here and there, then served with a thick tahini sauce. By the time the autumn rains got stuck in I was simmering mushrooms with thyme, onions and red wine, and serving broccoli with a pungent sauce and sticky rice.",
                        "cold",
                        R.drawable.soup,
                        57
                )
        );
    }

    public List<News> getNewsList() {
        return this.newsList;
    }

    // N deu tempo de fazer o que eu queria :(
    public List<News> getNewsByImportance(String importance) {
        List<News> filteredNews = new ArrayList<>();
        for (News news : this.newsList) {
            if (news.getImportance().equals(importance)) {
                filteredNews.add(news);
            }
        }
        return filteredNews;
    }
}