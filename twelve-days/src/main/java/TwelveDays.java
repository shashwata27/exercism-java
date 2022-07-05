import java.util.List;
import java.util.Map;

class TwelveDays {
    private static final Map<Integer, List<String>> days = Map.ofEntries(
            Map.entry(1, List.of("first", "and a Partridge in a Pear Tree.")),
            Map.entry(2, List.of("second", "two Turtle Doves")),
            Map.entry(3, List.of("third", "three French Hens")),
            Map.entry(4, List.of("fourth", "four Calling Birds")),
            Map.entry(5, List.of("fifth", "five Gold Rings")),
            Map.entry(6, List.of("sixth", "six Geese-a-Laying")),
            Map.entry(7, List.of("seventh", "seven Swans-a-Swimming")),
            Map.entry(8, List.of("eighth", "eight Maids-a-Milking")),
            Map.entry(9, List.of("ninth", "nine Ladies Dancing")),
            Map.entry(10, List.of("tenth", "ten Lords-a-Leaping")),
            Map.entry(11, List.of("eleventh", "eleven Pipers Piping")),
            Map.entry(12, List.of("twelfth", "twelve Drummers Drumming")));

    String verse(int verseNumber) {
        if(verseNumber==1){
            return "On the first day of Christmas my true love gave to me: " +
                    "a Partridge in a Pear Tree.\n";
        }else {
            String first = "", second = "";
            for (int i = verseNumber; i >= 1; i--) {
                if (i == verseNumber) {
                    second += days.get(i).get(1) + ", ";
                    first = "On the " + days.get(i).get(0) + " day of Christmas my true love gave to me: ";
                }else {
                    second += days.get(i).get(1) + ", ";
                }
            }
            second=second.substring(0,second.length()-2);
            return first + second+"\n";
        }
    }

    String verses(int startVerse, int endVerse) {
        TwelveDays gen=new TwelveDays();
        String ret="";
        for(int i=startVerse;i<=endVerse;i++){
            ret+=gen.verse(i);
            if(i!=endVerse){
                ret+="\n";
            }
        }
        return ret;
    }
    
    String sing() {
        TwelveDays song=new TwelveDays();
        return song.verses(1,12);
    }
}
