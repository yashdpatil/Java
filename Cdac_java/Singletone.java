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
            Example s1 = Example.getReference();
            Example ss = Example.getReference();
            Example sss = Example.getReference();
            // Example ssss = new Example();
            // Example sssss = new Example();
        }
    }
}
