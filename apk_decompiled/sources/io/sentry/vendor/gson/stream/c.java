package io.sentry.vendor.gson.stream;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.sz6;
import defpackage.xh6;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable, Flushable {
    public static final String[] M = new String[FreeTypeConstants.FT_LOAD_PEDANTIC];
    public final Writer E;
    public int[] F;
    public int G;
    public String H;
    public String I;
    public boolean J;
    public String K;
    public final boolean L;

    static {
        for (int i = 0; i <= 31; i++) {
            M[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = M;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.F = iArr;
        this.G = 0;
        if (iArr.length == 0) {
            this.F = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.F;
        int i = this.G;
        this.G = i + 1;
        iArr2[i] = 6;
        this.I = ":";
        this.L = true;
        this.E = writer;
    }

    public final void c() {
        int i = i();
        if (i == 1) {
            this.F[this.G - 1] = 2;
            e();
            return;
        }
        Writer writer = this.E;
        if (i == 2) {
            writer.append(',');
            e();
            return;
        }
        if (i == 4) {
            writer.append((CharSequence) this.I);
            this.F[this.G - 1] = 5;
            return;
        }
        if (i != 6) {
            if (i != 7) {
                sz6.j("Nesting problem.");
                return;
            } else if (!this.J) {
                sz6.j("JSON must have only one top-level value.");
                return;
            }
        }
        this.F[this.G - 1] = 7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.E.close();
        int i = this.G;
        if (i > 1 || (i == 1 && this.F[i - 1] != 7)) {
            xh6.c("Incomplete document");
        } else {
            this.G = 0;
        }
    }

    public final void d(int i, int i2, char c) {
        int i3 = i();
        if (i3 != i2 && i3 != i) {
            sz6.j("Nesting problem.");
            return;
        }
        if (this.K != null) {
            xh6.n("Dangling name: ", this.K);
            return;
        }
        this.G--;
        if (i3 == i2) {
            e();
        }
        this.E.write(c);
    }

    public final void e() throws IOException {
        if (this.H == null) {
            return;
        }
        Writer writer = this.E;
        writer.write(10);
        int i = this.G;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.H);
        }
    }

    public final void f() {
        if (this.K != null) {
            if (!this.L) {
                this.K = null;
                return;
            }
            n();
        }
        c();
        this.E.write("null");
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.G != 0) {
            this.E.flush();
        } else {
            sz6.j("JsonWriter is closed.");
        }
    }

    public final int i() {
        int i = this.G;
        if (i != 0) {
            return this.F[i - 1];
        }
        sz6.j("JsonWriter is closed.");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            java.io.Writer r6 = r6.E
            r0 = 34
            r6.write(r0)
            int r1 = r7.length()
            r2 = 0
            r3 = r2
        Ld:
            if (r2 >= r1) goto L3a
            char r4 = r7.charAt(r2)
            r5 = 128(0x80, float:1.8E-43)
            if (r4 >= r5) goto L1e
            java.lang.String[] r5 = io.sentry.vendor.gson.stream.c.M
            r4 = r5[r4]
            if (r4 != 0) goto L2b
            goto L37
        L1e:
            r5 = 8232(0x2028, float:1.1535E-41)
            if (r4 != r5) goto L25
            java.lang.String r4 = "\\u2028"
            goto L2b
        L25:
            r5 = 8233(0x2029, float:1.1537E-41)
            if (r4 != r5) goto L37
            java.lang.String r4 = "\\u2029"
        L2b:
            if (r3 >= r2) goto L32
            int r5 = r2 - r3
            r6.write(r7, r3, r5)
        L32:
            r6.write(r4)
            int r3 = r2 + 1
        L37:
            int r2 = r2 + 1
            goto Ld
        L3a:
            if (r3 >= r1) goto L40
            int r1 = r1 - r3
            r6.write(r7, r3, r1)
        L40:
            r6.write(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.c.j(java.lang.String):void");
    }

    public final void n() {
        if (this.K != null) {
            int i = i();
            if (i == 5) {
                this.E.write(44);
            } else if (i != 3) {
                sz6.j("Nesting problem.");
                return;
            }
            e();
            this.F[this.G - 1] = 4;
            j(this.K);
            this.K = null;
        }
    }
}
