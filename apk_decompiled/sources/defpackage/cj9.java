package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;
import java.io.IOException;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes3.dex */
public final class cj9 extends jj9 {
    public static final String[] R = new String[FreeTypeConstants.FT_LOAD_PEDANTIC];
    public final BufferedSink O;
    public String P = ":";
    public String Q;

    static {
        for (int i = 0; i <= 31; i++) {
            R[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = R;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public cj9(BufferedSink bufferedSink) {
        if (bufferedSink == null) {
            mr9.h("sink == null");
            throw null;
        }
        this.O = bufferedSink;
        R(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Q0(okio.BufferedSink r6, java.lang.String r7) {
        /*
            r0 = 34
            r6.writeByte(r0)
            int r1 = r7.length()
            r2 = 0
            r3 = r2
        Lb:
            if (r2 >= r1) goto L36
            char r4 = r7.charAt(r2)
            r5 = 128(0x80, float:1.8E-43)
            if (r4 >= r5) goto L1c
            java.lang.String[] r5 = defpackage.cj9.R
            r4 = r5[r4]
            if (r4 != 0) goto L29
            goto L33
        L1c:
            r5 = 8232(0x2028, float:1.1535E-41)
            if (r4 != r5) goto L23
            java.lang.String r4 = "\\u2028"
            goto L29
        L23:
            r5 = 8233(0x2029, float:1.1537E-41)
            if (r4 != r5) goto L33
            java.lang.String r4 = "\\u2029"
        L29:
            if (r3 >= r2) goto L2e
            r6.i0(r3, r2, r7)
        L2e:
            r6.W(r4)
            int r3 = r2 + 1
        L33:
            int r2 = r2 + 1
            goto Lb
        L36:
            if (r3 >= r1) goto L3b
            r6.i0(r3, r1, r7)
        L3b:
            r6.writeByte(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj9.Q0(okio.BufferedSink, java.lang.String):void");
    }

    public final void B0() {
        int iK = K();
        int i = 2;
        if (iK != 1) {
            BufferedSink bufferedSink = this.O;
            if (iK == 2) {
                bufferedSink.writeByte(44);
                O0();
            } else if (iK == 4) {
                bufferedSink.W(this.P);
                i = 5;
            } else {
                if (iK == 9) {
                    sz6.j("Sink from valueSink() was not closed");
                    return;
                }
                if (iK != 6) {
                    if (iK != 7) {
                        sz6.j("Nesting problem.");
                        return;
                    } else if (!this.J) {
                        sz6.j("JSON must have only one top-level value.");
                        return;
                    }
                }
                i = 7;
            }
        } else {
            O0();
        }
        this.F[this.E - 1] = i;
    }

    public final void D0(int i, int i2, char c) {
        int iK = K();
        if (iK != i2 && iK != i) {
            sz6.j("Nesting problem.");
            return;
        }
        if (this.Q != null) {
            xh6.n("Dangling name: ", this.Q);
            return;
        }
        int i3 = this.E;
        int i4 = ~this.M;
        if (i3 == i4) {
            this.M = i4;
            return;
        }
        int i5 = i3 - 1;
        this.E = i5;
        this.G[i5] = null;
        int[] iArr = this.H;
        int i6 = i3 - 2;
        iArr[i6] = iArr[i6] + 1;
        if (iK == i2) {
            O0();
        }
        this.O.writeByte(c);
    }

    public final void O0() {
        if (this.I == null) {
            return;
        }
        BufferedSink bufferedSink = this.O;
        bufferedSink.writeByte(10);
        int i = this.E;
        for (int i2 = 1; i2 < i; i2++) {
            bufferedSink.W(this.I);
        }
    }

    public final void P0(int i, int i2, char c) {
        int i3;
        int i4 = this.E;
        int i5 = this.M;
        if (i4 == i5 && ((i3 = this.F[i4 - 1]) == i || i3 == i2)) {
            this.M = ~i5;
            return;
        }
        B0();
        e();
        R(i);
        this.H[this.E - 1] = 0;
        this.O.writeByte(c);
    }

    public final void R0() {
        if (this.Q != null) {
            int iK = K();
            BufferedSink bufferedSink = this.O;
            if (iK == 5) {
                bufferedSink.writeByte(44);
            } else if (iK != 3) {
                sz6.j("Nesting problem.");
                return;
            }
            O0();
            this.F[this.E - 1] = 4;
            Q0(bufferedSink, this.Q);
            this.Q = null;
        }
    }

    @Override // defpackage.jj9
    public final void S(String str) {
        super.S(str);
        this.P = !str.isEmpty() ? ": " : ":";
    }

    @Override // defpackage.jj9
    public final jj9 T(double d) {
        if (!this.J && (Double.isNaN(d) || Double.isInfinite(d))) {
            e0.c(d, "Numeric values must be finite, but was ");
            return null;
        }
        if (this.L) {
            this.L = false;
            n(Double.toString(d));
            return this;
        }
        R0();
        B0();
        this.O.W(Double.toString(d));
        int[] iArr = this.H;
        int i = this.E - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 b0(long j) {
        if (this.L) {
            this.L = false;
            n(Long.toString(j));
            return this;
        }
        R0();
        B0();
        this.O.W(Long.toString(j));
        int[] iArr = this.H;
        int i = this.E - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 c() {
        if (this.L) {
            sz6.j("Array cannot be used as a map key in JSON at path ".concat(j()));
            return null;
        }
        R0();
        P0(1, 2, '[');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.O.close();
        int i = this.E;
        if (i > 1 || (i == 1 && this.F[i - 1] != 7)) {
            xh6.c("Incomplete document");
        } else {
            this.E = 0;
        }
    }

    @Override // defpackage.jj9
    public final jj9 d() {
        if (this.L) {
            sz6.j("Object cannot be used as a map key in JSON at path ".concat(j()));
            return null;
        }
        R0();
        P0(3, 5, '{');
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 f() {
        D0(1, 2, ']');
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.E != 0) {
            this.O.flush();
        } else {
            sz6.j("JsonWriter is closed.");
        }
    }

    @Override // defpackage.jj9
    public final jj9 i() {
        this.L = false;
        D0(3, 5, '}');
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 l0(Number number) {
        if (number == null) {
            x();
            return this;
        }
        String string = number.toString();
        if (!this.J && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            xh6.k("Numeric values must be finite, but was ", number);
            return null;
        }
        if (this.L) {
            this.L = false;
            n(string);
            return this;
        }
        R0();
        B0();
        this.O.W(string);
        int[] iArr = this.H;
        int i = this.E - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 n(String str) {
        if (str == null) {
            mr9.h("name == null");
            return null;
        }
        if (this.E == 0) {
            sz6.j("JsonWriter is closed.");
            return null;
        }
        int iK = K();
        if ((iK != 3 && iK != 5) || this.Q != null || this.L) {
            sz6.j("Nesting problem.");
            return null;
        }
        this.Q = str;
        this.G[this.E - 1] = str;
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 r0(String str) {
        if (str == null) {
            x();
            return this;
        }
        if (this.L) {
            this.L = false;
            n(str);
            return this;
        }
        R0();
        B0();
        Q0(this.O, str);
        int[] iArr = this.H;
        int i = this.E - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 x() {
        if (this.L) {
            sz6.j("null cannot be used as a map key in JSON at path ".concat(j()));
            return null;
        }
        if (this.Q != null) {
            if (!this.K) {
                this.Q = null;
                return this;
            }
            R0();
        }
        B0();
        this.O.W("null");
        int[] iArr = this.H;
        int i = this.E - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 x0(boolean z) {
        if (this.L) {
            sz6.j("Boolean cannot be used as a map key in JSON at path ".concat(j()));
            return null;
        }
        R0();
        B0();
        this.O.W(z ? "true" : "false");
        int[] iArr = this.H;
        int i = this.E - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
