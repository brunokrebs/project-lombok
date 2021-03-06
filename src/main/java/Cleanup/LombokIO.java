package Cleanup;

import lombok.Cleanup;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * This is example is an adaption of the example on the lombok site
 * (https://projectlombok.org/features/Cleanup)
 */
public class LombokIO {

    public LombokIO() throws IOException {

        @Cleanup InputStream in = new FileInputStream("input.txt");
        @Cleanup OutputStream out = new FileOutputStream("output.txt");
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }
    }
}