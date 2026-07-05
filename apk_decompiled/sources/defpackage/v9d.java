package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class v9d {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public v9d(boolean z, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0, true, sef.E, (i & 8) != 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9d)) {
            return false;
        }
        v9d v9dVar = (v9d) obj;
        return this.a == v9dVar.a && this.b == v9dVar.b && this.c == v9dVar.c && this.d == v9dVar.d && this.e == v9dVar.e && this.f == v9dVar.f;
    }

    public final int hashCode() {
        return (fsh.p(fsh.p(fsh.p(fsh.p(fsh.p(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }

    public v9d(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = true;
        this.f = 1002;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v9d(boolean z, boolean z2, boolean z3, sef sefVar, boolean z4) {
        xe4 xe4Var = u40.a;
        int i = !z ? 262152 : 262144;
        i = sefVar == sef.F ? i | FreeTypeConstants.FT_LOAD_LINEAR_DESIGN : i;
        this(z4 ? i : i | 512, sefVar == sef.E, z2, z3);
    }
}
