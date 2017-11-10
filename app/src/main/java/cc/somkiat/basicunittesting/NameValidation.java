package cc.somkiat.basicunittesting;

/**
 * Created by student on 11/10/2017 AD.
 */

class NameValidation {

    public String validate(String name){
        String dd = "";

        if( isEmpty(name)){
            View.displayEmpty("em");
        }
        if(สัญญาลักษ์()){
            dd="Sym";
        }

    }

    private boolean สัญญาลักษ์() {
        return false;
    }

    public boolean isEmpty(String name) {
        return !name.equals("");
    }

    public boolean isNull(String name) {
        return !name.equals(null);
    }

    interface View{
        void displayEmpty(String em);

    }
}
