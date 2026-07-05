package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class ixg extends tx8 {
    public final Drawable a;
    public final kx8 b;
    public final rg5 c;
    public final nab d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public ixg(Drawable drawable, kx8 kx8Var, rg5 rg5Var, nab nabVar, String str, boolean z, boolean z2) {
        this.a = drawable;
        this.b = kx8Var;
        this.c = rg5Var;
        this.d = nabVar;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.tx8
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.tx8
    public final kx8 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixg)) {
            return false;
        }
        ixg ixgVar = (ixg) obj;
        return x44.r(this.a, ixgVar.a) && x44.r(this.b, ixgVar.b) && this.c == ixgVar.c && x44.r(this.d, ixgVar.d) && x44.r(this.e, ixgVar.e) && this.f == ixgVar.f && this.g == ixgVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        nab nabVar = this.d;
        int iHashCode2 = (iHashCode + (nabVar != null ? nabVar.hashCode() : 0)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + fsh.p((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }
}
