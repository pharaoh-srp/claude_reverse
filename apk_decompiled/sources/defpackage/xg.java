package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class xg extends of {
    public final int c;
    public final int d;
    public final int e;
    public final wg f;

    public xg(int i, int i2, int i3, wg wgVar) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = wgVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xg)) {
            return false;
        }
        xg xgVar = (xg) obj;
        return xgVar.c == this.c && xgVar.d == this.d && xgVar.e == this.e && xgVar.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.d);
        sb.append("-byte IV, ");
        sb.append(this.e);
        sb.append("-byte tag, and ");
        return vb7.l(this.c, "-byte key)", sb);
    }
}
