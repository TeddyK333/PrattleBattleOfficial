package com.example.prattlebattle.data;

import com.example.prattlebattle.R;
import com.example.prattlebattle.model.PracticeAction;
import com.example.prattlebattle.model.PracticeScenario;

public class PracticeScenarios {

    private final static PracticeScenario scenario1 = new PracticeScenario("Practice 1",
            "Sun random pleb messes with you! What do you do?",
            new PracticeAction[]{
                    new PracticeAction("Kill the mf", "Great choce!", true, null),
                    new PracticeAction("Make him find out", "Old meme, try again!", false, 1)
            }
    );

    private final static PracticeScenario scenario2 = new PracticeScenario("Practice 1",
            "Sun random pleb messes with you!!!! What do you do?",
            new PracticeAction[]{
                    new PracticeAction("Kill the mf", "Great choce!", true, null),
                    new PracticeAction("Make him find out", "Old meme, try again!", false, 1)
            }
    );

    public final static PracticeScenario[] practiceScenarios = {scenario1, scenario2};
}
