package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class hh extends of {
    public final int c;
    public final int d;
    public final int e;
    public final zf f;

    public hh(int i, int i2, int i3, zf zfVar) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = zfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hh)) {
            return false;
        }
        hh hhVar = (hh) obj;
        return hhVar.c == this.c && hhVar.d == this.d && hhVar.e == this.e && hhVar.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.d);
        sb.append("-byte IV, ");
        sb.append(this.e);
        sb.append("-byte tag, and ");
        return vb7.l(this.c, "-byte key)", sb);
    }
}
