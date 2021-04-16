package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.UtestRegisterPage3;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nextButton = Text.of(UtestRegisterPage3.NEXT_BUTTON4).viewedBy(actor).asString();
        if (question.equals(nextButton)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


}


