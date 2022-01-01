class TwelveDays {
    public TwelveDays() {
    }
    String verse(int verseNumber) {
        String[] number = {"first", "second", "third", "fourth",
                "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
        String[] line = {"a Partridge in a Pear Tree.\n", "two Turtle Doves, and ",
                "three French Hens, ", "four Calling Birds, ", "five Gold Rings, ", "six Geese-a-Laying, ",
                "seven Swans-a-Swimming, ", "eight Maids-a-Milking, ", "nine Ladies Dancing, ",
                "ten Lords-a-Leaping, ", "eleven Pipers Piping, ", "twelve Drummers Drumming, ", };
        String begin = "On the " + number[verseNumber - 1] + " day of Christmas my true love gave to me: ";
        String last = "";
        for (int i = verseNumber - 1; i >= 0; i--) {
            last += line[i];
        }
        return begin + last;
    }
    String verses(int start, int end) {
        String song = "";
        for (int i = start; i <= end; i++) {
            song += verse(i);
            if(i != end)
                song += "\n";
        }
        return song;
    }
    
    String sing() {
        return verses(1, 12);
    }
}