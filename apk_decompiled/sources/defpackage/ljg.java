package defpackage;

import java.io.BufferedWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ljg implements AutoCloseable {
    public final BufferedWriter E;
    public final long F = System.nanoTime();

    public ljg(BufferedWriter bufferedWriter) {
        this.E = bufferedWriter;
    }

    public final void c(String str, String str2) throws IOException {
        BufferedWriter bufferedWriter = this.E;
        bufferedWriter.write(": t=");
        bufferedWriter.write(String.valueOf((System.nanoTime() - this.F) / 1000000));
        bufferedWriter.write("\n");
        if (str != null) {
            bufferedWriter.write("event: ");
            bufferedWriter.write(str);
            bufferedWriter.write("\n");
        }
        bufferedWriter.write("data: ");
        bufferedWriter.write(str2);
        bufferedWriter.write("\n\n");
        bufferedWriter.flush();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.E.close();
    }
}
