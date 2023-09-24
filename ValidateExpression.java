public class ValidateExpression {
    
    String state;

    public Boolean ValidateRegularExpression (String text){

        char[] entrys = text.toCharArray();

        state = "q0";

        for (char entry: entrys) {
            switch (state) {
                case "q0":
                    switch (entry) {
                        case 'G':
                            state = "q1";
                        break;
                        case 'H':
                            state = "q3";
                        break;
                        default:
                            return false;
                    }
                    break;
                case "q1":
                    if (entry >= 'X' && entry <= 'Z') {
                        state = "q2";
                    } else {
                        return false;
                    }
                    break;
                case "q2":
                    if (entry == '-') {
                        state = "q5";
                    } else {
                        return false;
                    }
                    break;
                case "q3":
                    if (entry >= 'A' && entry <= 'G') {
                        state = "q4";
                    } else {
                        return false;
                    }
                    break;
                case "q4":
                    if (entry == '-') {
                        state = "q5";
                    } else {
                        return false;
                    }
                    break;
                case "q5":
                    if (entry == '0'){
                        state = "q6";
                    } else if (entry >= '1' && entry <='9') {
                        state = "q17";
                    } else {
                        return false;
                    }
                    break;
                case "q6":
                    if (entry == '0'){
                        state = "q7";
                    } else if (entry >= '1' && entry <='9') {
                        state = "q14";
                    } else {
                        return false;
                    }
                    break;
                case "q7":
                    if (entry == '0'){
                        state = "q8";
                    } else if (entry >= '1' && entry <='9') {
                        state = "q12";
                    } else {
                        return false;
                    }
                    break;
                case "q8":
                    if (entry >= '1' && entry <='9'){
                        state = "q9";
                    } else {
                        return false;
                    }
                    break;
                case "q9":
                    if (entry == '-') {
                        state = "q10";
                    } else {
                        return false;
                    }
                    break;
                case "q10":
                    if (entry >= 'A' && entry <= 'Z') {
                        return true;
                    }
                    return false;
                case "q12":
                    if (entry >= '0' && entry <='9'){
                        state = "q13";
                    } else {
                        return false;
                    }
                    break;
                case "q13":
                    if (entry == '-') {
                        state = "q10";
                    } else {
                        return false;
                    }
                    break;
                case "q14":
                    if (entry >= '0' && entry <='9'){
                        state = "q15";
                    } else {
                        return false;
                    }
                    break;
                case "q15":
                    if (entry >= '0' && entry <='9'){
                        state = "q16";
                    } else {
                        return false;
                    }
                    break;
                case "q16":
                    if (entry == '-'){
                        state = "q10";
                    } else {
                        return false;
                    }
                    break;
                case "q17":
                    if (entry >= '0' && entry <='9'){
                        state = "q18";
                    } else {
                        return false;
                    }
                    break;
                case "q18":
                    if (entry >= '0' && entry <='9'){
                        state = "q19";
                    } else {
                        return false;
                    }
                    break;
                case "q19":
                    if (entry >= '0' && entry <='9'){
                        state = "q20";
                    } else {
                        return false;
                    }
                    break;
                case "q20":
                    if (entry == '-'){
                        state = "q10";
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return false;
    }
}
