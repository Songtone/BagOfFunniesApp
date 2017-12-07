package com.example.songt.bagoffunnies;

/**
 * Created by songt on 2017-12-06.
 */

public class KnockKnockJokeLibrary {

    private String mKnockKnockJokes[] = {
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Canoe.\n" +
                    "Canoe who?\n" +
                    "Canoe help me with my homework?",
            "Knock, knock\n" +
                    "Who’s there?\n" +
                    "Merry.\n" +
                    "Merry who?\n" +
                    "Merry Christmas!",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Orange.\n" +
                    "Orange who?\n" +
                    "Orange you going to let me in?",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Anee.\n" +
                    "Anee,who?\n" +
                    "Anee one you like!",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Dozen.\n" +
                    "Dozen who?\n" +
                    "Dozen anybody want to let me in?",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Needle.\n" +
                    "Needle who?\n" +
                    "Needle little money for the movies.",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Harry.\n" +
                    "Harry who?\n" +
                    "Harry up, it’s cold out here!",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "A herd.\n" +
                    "A herd who?\n" +
                    "A herd you were home, so I came over!",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Adore.\n" +
                    "Adore who?\n" +
                    "Adore is between us. Open up!",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Otto.\n" +
                    "Otto who?\n" +
                    "Otto know. I’ve got amnesia.",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Lettuce.\n" +
                    "Lettuce who?\n" +
                    "Lettuce in it’s cold out here.",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Noah.\n" +
                    "Noah who?\n" +
                    "Noah good place we can get something to eat?",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Dwayne.\n" +
                    "Dwayne who?\n" +
                    "Dwayne the bathtub, It’s overflowing!",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Boo.\n" +
                    "Boo who?\n" +
                    "Gosh, don’t cry it’s just a knock knock joke.",
            "Knock, knock\n" +
                    "Who’s there?\n" +
                    "A little old lady.\n" +
                    "A little old lady who?\n" +
                    "I didn’t know you could yodel.",
            "Knock, knock,\n" +
                    "Who’s there?\n" +
                    "Olive.\n" +
                    "Olive who?\n" +
                    "Olive you!",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Justin.\n" +
                    "Justin who?\n" +
                    "Justin time for dinner.",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Luke.\n" +
                    "Luke who?\n" +
                    "Luke through the the peep hole and find out.",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Claire.\n" +
                    "Claire who?\n" +
                    "Claire the way, I’m coming through!",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Abby.\n" +
                    "Abby who?\n" +
                    "Abby birthday to you!",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Nana.\n" +
                    "Nana who?\n" +
                    "Nana your business.",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Ya.\n" +
                    "Ya who?\n" +
                    "Wow. You sure are excited to see me!",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Roach.\n" +
                    "Roach who?\n" +
                    "Roach you a letter, did you get it?",
            "Knock, knock\n" +
                    "Who’s there?\n" +
                    "Ben.\n" +
                    "Ben who?\n" +
                    "Ben knocking For 10 minutes.",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Hoo.\n" +
                    "Hoo who?\n" +
                    "Are you a owl?",
            "Knock, knock.\n" +
                    "Who’s there?\n" +
                    "Tank.\n" +
                    "Tank who?\n" +
                    "Your welcome!",
            "Knock, knock\n" +
                    "Who’s there?\n" +
                    "Alex.\n" +
                    "Alex who?\n" +
                    "Alex-plain later!",
            "Knock, knock!\n" +
                    "Who’s there?\n" +
                    "Annie.\n" +
                    "Annie who?\n" +
                    "Annie body home?",
            "Knock, knock!\n" +
                    "Who’s there?\n" +
                    "Spell.\n" +
                    "Spell who?\n" +
                    "W-H-O"

    };

    public String getKnockKnockJoke(int a){
        String knockKnockJoke = mKnockKnockJokes[a];
        return knockKnockJoke;
    }
    public int getKnockKnockLibraryLength(){
        int knockKnockLibraryLength = mKnockKnockJokes.length;
        return knockKnockLibraryLength;
    }
}
