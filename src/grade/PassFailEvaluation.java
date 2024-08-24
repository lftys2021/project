package grade;

public class PassFailEvaluation implements GradeEvaluation{
    @Override
    public String getGrade(int point) {
        if(point >= 79){
            return "P";
        } else {
            return "F";
        }
    }
}
