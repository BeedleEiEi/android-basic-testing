package cc.somkiat.basicunittesting;

class NameValidation implements ValidateRule {


    public boolean isEmptyName(String name) {
        return name.equals("") || !name.equals("");
    }

    public boolean isNull(String name) {
        return name.equals(null) || !name.equals(null);
    }

    public boolean checkLength(String a) {
        return a.length() < 2 || a.length() >= 2;
    }

    public boolean checkLength2to20(String name) {
        return name.length() <= 20 && name.length() >= 2;
    }

    public boolean checkSymbol(String s) {
        s.toCharArray();
        //System.out.println(s.length());
        String cha;
        boolean letter = true;
        for (int i = 0; i < s.length(); i++) {
            cha = String.valueOf(s.charAt(i));
            if (!cha.matches("[a-zA-Z]+")) {
                System.out.println("Falseeeee");
                letter = false;
                return false;
            }
        }
        return letter;
    }

    @Override
    public String validate(String name) {
        if (!isEmptyName(name)) {
            return "Invalid";
        }
        if (!isNull(name)) {
            return "Invalid";
        }
        if (!checkLength2to20(name)) {
            return "Invalid";
        }
        if (!checkLength(name)) {
            return "Invalid";
        }
        if (!checkSymbol(name)) {
            return "Invalid";
        }
        return name;
    }
}
