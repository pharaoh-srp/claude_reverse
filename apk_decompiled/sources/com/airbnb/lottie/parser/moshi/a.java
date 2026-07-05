package com.airbnb.lottie.parser.moshi;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.epk;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Closeable {
    public static final String[] I = new String[FreeTypeConstants.FT_LOAD_PEDANTIC];
    public int E;
    public int[] F;
    public String[] G;
    public int[] H;

    static {
        for (int i = 0; i <= 31; i++) {
            I[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = I;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void beginArray();

    public abstract void beginObject();

    public final String c() {
        int i = this.E;
        int[] iArr = this.F;
        String[] strArr = this.G;
        int[] iArr2 = this.H;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract boolean d();

    public abstract int e();

    public abstract void endArray();

    public abstract void endObject();

    public final void f(int i) {
        int i2 = this.E;
        int[] iArr = this.F;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at ".concat(c()));
            }
            this.F = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.G;
            this.G = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.H;
            this.H = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.F;
        int i3 = this.E;
        this.E = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract boolean hasNext();

    public abstract int i(epk epkVar);

    public abstract void j();

    public final void n(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + c());
    }

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract String nextString();

    public abstract void skipValue();
}
