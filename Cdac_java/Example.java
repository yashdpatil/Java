class Example {
    private static Example s = null;

    private Example() {
        System.out.println(" Inside Examplee");
    }

    private static Example getReference() {
        if (s == null)
            s = new Example();
        return s;
    }

    static class Singleton {
        public static void main(String[] args) {
            // if (s != null) {
            // System.out.println(s.hashCode());
            // }
            System.out.println(s.hashCode());
            Example s1 = Example.getReference();
            System.out.println(s1.hashCode());
            Example ss = Example.getReference();
            System.out.println(ss.hashCode());
            Example sss = Example.getReference();
            System.out.println(sss.hashCode());
            Example ssss = new Example();
            Example sssss = new Example();
        }
    }
}
