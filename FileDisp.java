class FileDisp {
    public static void main(String args[]) {
        int i, n;
        n = args.length;

        // Ensure there are command-line arguments
        if (n == 0) {
            System.out.println("No files provided.");
            return;
        }

        for (i = 0; i < n; i++) {
            // Check if the argument ends with ".java"
            if (args[i].endsWith(".java")) {
                System.out.println(args[i]);
            }
        }
    }
}
