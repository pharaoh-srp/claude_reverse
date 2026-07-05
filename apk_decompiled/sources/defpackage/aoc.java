package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class aoc implements kz9 {
    public final koc a;
    public final u00 b;
    public final l94 c;

    public aoc(koc kocVar, znc zncVar, l94 l94Var) {
        this.a = kocVar;
        this.b = zncVar;
        this.c = l94Var;
    }

    @Override // defpackage.kz9
    public final int a() {
        return this.b.w().b;
    }

    @Override // defpackage.kz9
    public final void b(int i, Object obj, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1201380429);
        int i3 = 4;
        int i4 = (e18Var.d(i) ? 4 : 2) | i2 | (e18Var.h(obj) ? 32 : 16) | (e18Var.f(this) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            zh4.c(obj, i, this.a.A, fd9.q0(1142237095, new ay3(this, i, i3), e18Var), e18Var, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(i, i2, 25, this, obj);
        }
    }

    @Override // defpackage.kz9
    public final Object c(int i) {
        Object objE = this.c.e(i);
        return objE == null ? this.b.x(i) : objE;
    }

    @Override // defpackage.kz9
    public final int e(Object obj) {
        return this.c.d(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoc)) {
            return false;
        }
        return x44.r(this.b, ((aoc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
