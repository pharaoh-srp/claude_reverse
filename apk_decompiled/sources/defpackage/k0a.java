package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class k0a implements kz9 {
    public final x0a a;
    public final j0a b;
    public final px9 c;
    public final l94 d;

    public k0a(x0a x0aVar, j0a j0aVar, px9 px9Var, l94 l94Var) {
        this.a = x0aVar;
        this.b = j0aVar;
        this.c = px9Var;
        this.d = l94Var;
    }

    @Override // defpackage.kz9
    public final int a() {
        return this.b.w().b;
    }

    @Override // defpackage.kz9
    public final void b(int i, Object obj, ld4 ld4Var, int i2) {
        int i3;
        Object obj2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-462424778);
        int i4 = 2;
        int i5 = (e18Var.d(i) ? 4 : 2) | i2 | (e18Var.h(obj) ? 32 : 16) | (e18Var.f(this) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i5 & 1, (i5 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            zh4.c(obj2, i3, this.a.s, fd9.q0(-824725566, new aw1(this, i, i4), e18Var), e18Var, ((i5 >> 3) & 14) | 3072 | ((i5 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kb2(this, i3, obj2, i2);
        }
    }

    @Override // defpackage.kz9
    public final Object c(int i) {
        Object objE = this.d.e(i);
        return objE == null ? this.b.x(i) : objE;
    }

    @Override // defpackage.kz9
    public final Object d(int i) {
        return this.b.u(i);
    }

    @Override // defpackage.kz9
    public final int e(Object obj) {
        return this.d.d(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0a)) {
            return false;
        }
        return x44.r(this.b, ((k0a) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
