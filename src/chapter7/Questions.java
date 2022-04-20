package chapter7;

public class Questions {
    private int options = 2;
    private char response = 'A' ;

    String[] questionnaire = {
            "A. expend energy, enjoy groups.  OR  B. conserve energy, enjoy one-on-one",
            "A. more outgoing, think out loud. OR  B. more reserved, think to yourself",
            "A. seek many tasks, public activities, interaction with others. OR  B. seek private, solitary activities with quiet to concentrate",
            "A.external, communicative, express yourself. OR  B. internal, reticent, keep to yourself",
            "A. active, initiate. OR  B. reflective, deliberate",
            "A. interpret literally. B. look for meaning and possibilities",
            "A. practical, realistic, experiential. B. imaginative, innovative, theoretical",
            "A. standard, usual, conventional. B. different, novel, unique",
            "A. focus on here-and-now .B.look to the future, global perspective,big picture ",
            "A. facts, things, what is . B. ideas, dreams, what could be, philosophical",
            "A. logical, thinking, questioning. B. empathetic, feeling, accommodating",
            "B. candid, straight forward, frank. B.tactful, kind, encouraging",
            "A. firm, tend to criticize, hold the line. B. gentle, tend to appreciate, conciliate",
            "A. tough-minded, just B.tender-hearted, merciful",
            "A. matter of fact, issue-oriented B. sensitive, people-oriented, compassionate",
            };


    public Questions(String option1, String option2){
        option1 = "Good";
        option2 = "Bad";
    }

    public int getOptions() {
        return options;
    }

    public void respondWith(char response) {
        this.response = response;
    }

    public char getResponse() {

        return response;
    }
}
