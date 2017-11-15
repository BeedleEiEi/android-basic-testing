package cc.somkiat.basicunittesting;

import java.util.regex.Pattern;

/**
 * Created by Beedle on 15/11/2560.
 */

class EmailValidation implements ValidateRule {
    public boolean isEmptyName(String name) {
        return name.equals("") || !name.equals("");
    }

    public boolean isNull(String name) {
        return name.equals(null) || !name.equals(null);
    }

    public boolean lessThan14(String s) {
        return s.length() < 14;
    }

    public boolean checkPattern(String s) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if (!validEmailPattern.matcher(s).matches()) {
            return false;
        }
        return true;
    }

    @Override
    public String validate(String name) {
        //boolean status = checkPattern(name) || (isEmptyName(name) && isNull(name) && lessThan14(name));
        //System.out.println(status + "SSS " + checkPattern(name) + " <---pattern");
/*        if (status == false) {
            return "Invalid";
        } else {
            return name;*/
        if (checkPattern(name) == false) {
            return "Invalid";
        }
        if (!isEmptyName(name)) {
            return "Invalid";
        }
        if (!isNull(name)) {
            return "Invalid";
        }
        if (!lessThan14(name)) {
            return "Invalid";
        }
        return name;


    }
}
