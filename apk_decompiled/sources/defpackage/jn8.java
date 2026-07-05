package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class jn8 extends of {
    public final int c;
    public final int d;
    public final wg e;
    public final zf f;

    public jn8(int i, int i2, wg wgVar, zf zfVar) {
        this.c = i;
        this.d = i2;
        this.e = wgVar;
        this.f = zfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jn8)) {
            return false;
        }
        jn8 jn8Var = (jn8) obj;
        return jn8Var.c == this.c && jn8Var.j() == j() && jn8Var.e == this.e && jn8Var.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final int j() {
        wg wgVar = wg.W;
        int i = this.d;
        wg wgVar2 = this.e;
        if (wgVar2 == wgVar) {
            return i;
        }
        if (wgVar2 != wg.T && wgVar2 != wg.U && wgVar2 != wg.V) {
            sz6.j("Unknown variant");
            return 0;
        }
        return i + 5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.e);
        sb.append(", hashType: ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.d);
        sb.append("-byte tags, and ");
        return vb7.l(this.c, "-byte key)", sb);
    }
}
