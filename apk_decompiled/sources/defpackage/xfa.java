package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public final class xfa extends Writer {
    public final StringBuilder E = new StringBuilder(FreeTypeConstants.FT_LOAD_PEDANTIC);

    public final void c() {
        StringBuilder sb = this.E;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        c();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                c();
            } else {
                this.E.append(c);
            }
        }
    }
}
