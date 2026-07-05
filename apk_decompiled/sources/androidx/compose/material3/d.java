package androidx.compose.material3;

import defpackage.d54;
import defpackage.e0g;
import defpackage.fsh;
import defpackage.h19;
import defpackage.nw5;
import defpackage.que;
import defpackage.va6;
import defpackage.vb7;
import defpackage.w79;
import defpackage.x44;
import defpackage.xve;
import defpackage.zni;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h19 {
    public final boolean a;
    public final float b;
    public final long c;
    public final e0g d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public d(boolean z, float f, long j, e0g e0gVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (e0gVar == null) {
            va6 va6Var = va6.b(f, Float.NaN) ? null : new va6(f);
            e0gVar = va6Var != null ? xve.b(va6Var.E) : null;
            if (e0gVar == null) {
                e0gVar = zni.b;
            }
        }
        this.a = z;
        this.b = f;
        this.c = j;
        this.d = e0gVar;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    @Override // defpackage.h19
    public final nw5 a(w79 w79Var) {
        return new DelegatingThemeAwareRippleNode(w79Var, this.a, this.b, new que(this), this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && va6.b(this.b, dVar.b) && d54.c(this.c, dVar.c) && x44.r(this.d, dVar.d) && this.e == dVar.e && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h;
    }

    @Override // defpackage.h19
    public final int hashCode() {
        int iB = vb7.b(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = d54.i;
        return Boolean.hashCode(this.h) + fsh.p(fsh.p(fsh.p((this.d.hashCode() + vb7.e(iB, 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }
}
