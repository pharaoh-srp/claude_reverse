package defpackage;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class t31 {
    public static final t31 d;
    public final int a;
    public final int b;
    public final qz8 c;

    static {
        t31 t31Var;
        if (Build.VERSION.SDK_INT >= 33) {
            pz8 pz8Var = new pz8(4);
            for (int i = 1; i <= 10; i++) {
                pz8Var.f(Integer.valueOf(tpi.m(i)));
            }
            t31Var = new t31(2, pz8Var.h());
        } else {
            t31Var = new t31(2, 10);
        }
        d = t31Var;
    }

    public t31(int i, Set set) {
        this.a = i;
        qz8 qz8VarP = qz8.p(set);
        this.c = qz8VarP;
        efi it = qz8VarP.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t31)) {
            return false;
        }
        t31 t31Var = (t31) obj;
        return this.a == t31Var.a && this.b == t31Var.b && Objects.equals(this.c, t31Var.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        qz8 qz8Var = this.c;
        return i + (qz8Var == null ? 0 : qz8Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public t31(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
