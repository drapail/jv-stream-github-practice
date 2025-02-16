package practice;

import java.util.function.Predicate;
import model.Candidate;

public class CandidateValidator implements Predicate<Candidate> {
    private static final String NATIONALITY = "Ukrainian";
    private static final int MIN_AGE = 35;
    private static final int TIME_IN_UKRAINE = 10;
    //write your code here

    @Override
    public boolean test(Candidate candidate) {
        return candidate.getNationality().equals(NATIONALITY)
                && candidate.getAge() >= MIN_AGE
                && candidate.isAllowedToVote()
                && Integer.parseInt(candidate.getPeriodsInUkr().split("-")[1])
                - Integer.parseInt(candidate.getPeriodsInUkr().split("-")[0]) >= TIME_IN_UKRAINE;
    }
}
