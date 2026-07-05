package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class u67 extends q67 {
    public u67(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.E.mark(Integer.MAX_VALUE);
        } else {
            sz6.p("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void d(long j) throws IOException {
        int i = this.F;
        if (i > j) {
            this.F = 0;
            this.E.reset();
        } else {
            j -= (long) i;
        }
        c((int) j);
    }

    public u67(byte[] bArr) {
        super(bArr);
        this.E.mark(Integer.MAX_VALUE);
    }
}
