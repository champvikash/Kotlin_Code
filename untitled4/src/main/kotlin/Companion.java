public class Companion {
    public static void main(String[] args) {
        MyObject.AnotherObj.f();

        /**
         * companion(in kotlin) == static (in java)
         * if you want access directly methods of
         * object use @JvmStatic
         *
         */
    }
}
