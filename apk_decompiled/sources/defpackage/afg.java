package defpackage;

import java.io.IOException;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes3.dex */
public final class afg implements AutoCloseable {
    public final BufferedSource E;

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.E.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof afg) {
            return this.E.equals(((afg) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.E + ")";
    }
}
