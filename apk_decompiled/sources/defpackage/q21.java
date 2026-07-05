package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class q21 {
    public final bpc a;
    public final String b;
    public final zy7 c;
    public final pz7 d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final zy7 i;

    public q21(bpc bpcVar, String str, zy7 zy7Var, ta4 ta4Var, String str2, boolean z, boolean z2, boolean z3, zy7 zy7Var2, int i) {
        ta4Var = (i & 8) != 0 ? null : ta4Var;
        str2 = (i & 16) != 0 ? null : str2;
        z = (i & 64) != 0 ? false : z;
        z2 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? true : z2;
        z3 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? false : z3;
        zy7Var2 = (i & 512) != 0 ? null : zy7Var2;
        bpcVar.getClass();
        str.getClass();
        zy7Var.getClass();
        this.a = bpcVar;
        this.b = str;
        this.c = zy7Var;
        this.d = ta4Var;
        this.e = str2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = zy7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q21)) {
            return false;
        }
        q21 q21Var = (q21) obj;
        return x44.r(this.a, q21Var.a) && x44.r(this.b, q21Var.b) && x44.r(this.c, q21Var.c) && x44.r(this.d, q21Var.d) && x44.r(this.e, q21Var.e) && this.f == q21Var.f && this.g == q21Var.g && this.h == q21Var.h && x44.r(this.i, q21Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b)) * 31;
        pz7 pz7Var = this.d;
        int iHashCode2 = (iHashCode + (pz7Var == null ? 0 : pz7Var.hashCode())) * 31;
        String str = this.e;
        int iP = fsh.p(fsh.p(fsh.p(fsh.p((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, true), 31, this.f), 31, this.g), 31, this.h);
        zy7 zy7Var = this.i;
        return iP + (zy7Var != null ? zy7Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachmentSelectionRowState(icon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", onClick=");
        sb.append(this.c);
        sb.append(", badge=");
        sb.append(this.d);
        sb.append(", subtitle=");
        gid.t(sb, this.e, ", visible=true, selected=", this.f, ", enabled=");
        ij0.A(sb, this.g, ", isLoading=", this.h, ", onClickWhenDisabled=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
