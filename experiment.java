public class experiment {
    public static void main(String[] args) {
        System.out.println("a");
    }
    class instance {
        Boolean ins(instance a) {
            if (a instanceof instance) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
