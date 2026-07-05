package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ag extends of {
    public final int c;
    public final int d;
    public final zf e;

    public ag(int i, int i2, zf zfVar) {
        this.c = i;
        this.d = i2;
        this.e = zfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return agVar.c == this.c && agVar.j() == j() && agVar.e == this.e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.d), this.e);
    }

    public final int j() {
        zf zfVar = zf.J;
        int i = this.d;
        zf zfVar2 = this.e;
        if (zfVar2 == zfVar) {
            return i;
        }
        if (zfVar2 != zf.G && zfVar2 != zf.H && zfVar2 != zf.I) {
            sz6.j("Unknown variant");
            return 0;
        }
        return i + 5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.d);
        sb.append("-byte tags, and ");
        return vb7.l(this.c, "-byte key)", sb);
    }
}
