package practice;

import java.util.function.Predicate;
import model.Candidate;

public class CandidateValidator implements Predicate<Candidate> {
    //write your code here

    @Override
    public boolean test(Candidate candidate) {
        return candidate.getNationality().equals("Ukrainian")
                && candidate.getAge() >= 35
                && candidate.isAllowedToVote()
                && Integer.parseInt(candidate.getPeriodsInUkr().split("-")[1])
                - Integer.parseInt(candidate.getPeriodsInUkr().split("-")[0]) >= 10;
    }
}
