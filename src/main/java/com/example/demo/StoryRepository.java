package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Repository
public class StoryRepository {

    private static Chapter[] chapters = {
            new Chapter(1, "<p>Chapter 1 text: Cras sollicitudin orci ac velit adipiscing, ut faucibus urna auctor. Pellentesque in sem nec sem molestie malesuada. Sed aliquam mi sit amet sollicitudin luctus. Aenean quis tempus sem, in viverra metus. Maecenas sed urna bibendum, cursus lectus sed, ultricies risus.</p>"),
            new Chapter(2, "<p>Chapter 2 text: Curabitur laoreet cursus lectus, id tempus massa volutpat a. Vivamus placerat diam risus, ut rutrum neque consectetur ac. Sed ullamcorper porttitor diam, sit amet sollicitudin velit fermentum in. Praesent aliquet dui ac lorem molestie, non luctus lacus porta. Nullam risus justo, aliquam sit amet neque at, fringilla pharetra mi. Curabitur tincidunt dictum magna, vitae faucibus urna vehicula sit amet. Donec ornare malesuada nisi. Pellentesque tincidunt ultrices quam, ac laoreet risus convallis in. Ut consequat justo dolor, ac venenatis mi aliquam nec. Ut quis accumsan est, non pulvinar orci. Ut hendrerit nunc et laoreet rutrum. Nulla et libero fringilla, sodales risus in, euismod libero.</p>"),
            new Chapter(3, "<p>Chapter 3 text: Duis ac lobortis mi. Vestibulum non augue pellentesque, convallis diam vitae, sollicitudin nulla. Aenean et pharetra erat, lobortis tincidunt tellus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum gravida ligula justo, vitae ullamcorper metus scelerisque non. Vestibulum commodo vel metus eget vestibulum. Phasellus porttitor, nunc nec rutrum vulputate, quam lorem dapibus urna, vel accumsan purus mauris id urna. Morbi vitae rutrum nisl, sit amet cursus est. Donec ipsum dui, aliquam non metus at, ultrices accumsan odio. Morbi pretium eros eu lorem commodo pulvinar.</p><p>Donec quis elementum orci. Aenean viverra, nisl eget tempus sodales, velit elit pretium dui, eu ultrices tellus lectus rhoncus orci. Praesent arcu sem, lacinia sit amet tempus ultrices, malesuada eu odio. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Proin tincidunt dictum posuere. Ut pretium lacinia tortor sit amet consequat. Phasellus ac velit pharetra, fringilla mi ut, porta neque. Donec non urna dolor. Sed sem erat, mattis non risus et, lobortis fringilla dui.</p>"),
            new Chapter(4, "<p>Chapter 4 text: Maecenas nec ipsum viverra erat tincidunt convallis. Morbi nec varius lectus. Vivamus vestibulum massa vitae sapien vestibulum, eu pretium felis consectetur. Nulla sagittis sem sapien. Integer quis imperdiet ipsum, a luctus sem. Duis aliquet feugiat mauris, sed posuere diam aliquam eu. Phasellus vel turpis ac nunc blandit blandit. Sed hendrerit risus nec odio egestas gravida. Vestibulum eget purus vel nulla gravida vulputate eu auctor turpis. Integer laoreet cursus consectetur. Integer laoreet sapien a urna sollicitudin blandit. Curabitur commodo quam ut erat suscipit, ac elementum quam adipiscing. Fusce id venenatis dui. Sed vel diam vel est ullamcorper lacinia. Curabitur sollicitudin diam pharetra tincidunt scelerisque.</p>"),
            new Chapter(5, "<p>Chapter 5 text: Vivamus dignissim enim vel dolor commodo, in vehicula est facilisis. Aliquam ac ipsum sem. Sed justo risus, tincidunt ac lectus nec, molestie elementum urna. Aenean quis velit nec sapien dignissim tincidunt. Aenean venenatis faucibus ultricies. Maecenas eu libero molestie, luctus diam ac, molestie urna. Aliquam erat volutpat. Cras eu augue vitae massa lobortis euismod id nec lacus. Cras gravida bibendum turpis at varius.</p>")
    };

    public Story getStory() {
        Story story = new Story();
        story.setHeading("<h1>A story about something</h1>");
        story.setChapterUrls(Arrays.asList(
                "api/chapter-1.json",
                "api/chapter-2.json",
                "api/chapter-3.json",
                "api/chapter-4.json",
                "api/chapter-5.json"
        ));
        return story;
    }

    public Chapter getChapter(int id) {
        return chapters[id - 1];
    }
}
