package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class u0e {
    public final String a;
    public final dg3 b;
    public final int c;
    public final int d;
    public final boolean e;
    public String f;
    public int g;
    public final AtomicReference h = new AtomicReference();

    public u0e(String str, dg3 dg3Var, int i, boolean z) {
        this.a = str;
        this.b = dg3Var;
        this.d = i;
        int i2 = dg3Var.c;
        int i3 = 0;
        while (true) {
            s59 s59Var = ((s59[]) dg3Var.e)[i2];
            int i4 = s59Var.a;
            if (i4 != 3) {
                if (i4 == 4) {
                    i3 |= s59Var.c;
                } else if (i4 == 5) {
                    i3 = -1;
                    break;
                } else if (i4 != 7) {
                    break;
                }
            }
            i2 = s59Var.b;
        }
        this.c = i3;
        this.e = z;
    }

    public final String toString() {
        return this.a;
    }
}
