package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class vxc {
    public final int a;
    public final int b;
    public final int c;
    public final eyh d;
    public final eyh e;
    public final boolean f;
    public final boolean g;
    public final d54 h;

    public vxc(int i, int i2, int i3, eyh eyhVar, eyh eyhVar2, boolean z, boolean z2, d54 d54Var, int i4) {
        eyhVar2 = (i4 & 16) != 0 ? null : eyhVar2;
        d54Var = (i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : d54Var;
        eyhVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = eyhVar;
        this.e = eyhVar2;
        this.f = z;
        this.g = z2;
        this.h = d54Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxc)) {
            return false;
        }
        vxc vxcVar = (vxc) obj;
        return this.a == vxcVar.a && this.b == vxcVar.b && this.c == vxcVar.c && this.d == vxcVar.d && this.e == vxcVar.e && this.f == vxcVar.f && this.g == vxcVar.g && x44.r(this.h, vxcVar.h);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + vb7.c(this.c, vb7.c(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31;
        eyh eyhVar = this.e;
        int iP = fsh.p(fsh.p((iHashCode + (eyhVar == null ? 0 : eyhVar.hashCode())) * 31, 31, this.f), 31, this.g);
        d54 d54Var = this.h;
        return iP + (d54Var != null ? Long.hashCode(d54Var.a) : 0);
    }

    public final String toString() {
        StringBuilder sbV = vb7.v("PermissionSettingUiState(titleRes=", ", descriptionRes=", this.a, this.b, ", systemDisabledRes=");
        sbV.append(this.c);
        sbV.append(", readPermission=");
        sbV.append(this.d);
        sbV.append(", writePermission=");
        sbV.append(this.e);
        sbV.append(", isSystemDisabled=");
        sbV.append(this.f);
        sbV.append(", isVisible=");
        sbV.append(this.g);
        sbV.append(", iconColorOverride=");
        sbV.append(this.h);
        sbV.append(")");
        return sbV.toString();
    }
}
