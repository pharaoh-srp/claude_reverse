package defpackage;

import android.graphics.Bitmap;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class j52 {
    public final kie a;
    public final h52 b;
    public final Date c;
    public final String d;
    public final Date e;
    public final String f;
    public final Date g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;

    public j52(kie kieVar, h52 h52Var) {
        int i;
        this.a = kieVar;
        this.b = h52Var;
        this.k = -1;
        if (h52Var != null) {
            this.h = h52Var.c;
            this.i = h52Var.d;
            wg8 wg8Var = h52Var.f;
            int size = wg8Var.size();
            for (int i2 = 0; i2 < size; i2++) {
                String strE = wg8Var.e(i2);
                if (strE.equalsIgnoreCase("Date")) {
                    String strA = wg8Var.a("Date");
                    this.c = strA != null ? ml5.a(strA) : null;
                    this.d = wg8Var.k(i2);
                } else if (strE.equalsIgnoreCase("Expires")) {
                    String strA2 = wg8Var.a("Expires");
                    this.g = strA2 != null ? ml5.a(strA2) : null;
                } else if (strE.equalsIgnoreCase("Last-Modified")) {
                    String strA3 = wg8Var.a("Last-Modified");
                    this.e = strA3 != null ? ml5.a(strA3) : null;
                    this.f = wg8Var.k(i2);
                } else if (strE.equalsIgnoreCase("ETag")) {
                    this.j = wg8Var.k(i2);
                } else if (strE.equalsIgnoreCase("Age")) {
                    String strK = wg8Var.k(i2);
                    Bitmap.Config[] configArr = l.a;
                    Long lT0 = isg.t0(strK);
                    if (lT0 != null) {
                        long jLongValue = lT0.longValue();
                        i = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                    } else {
                        i = -1;
                    }
                    this.k = i;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n52 a() {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j52.a():n52");
    }
}
