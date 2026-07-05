package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m15 {
    public final List a;
    public final boolean b;
    public final String c;
    public final int d;
    public final sfb e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Integer j;
    public final boolean k;
    public final Map l;

    public /* synthetic */ m15(ArrayList arrayList, boolean z, String str, int i, sfb sfbVar, String str2, boolean z2, boolean z3, boolean z4, Map map, int i2) {
        this((i2 & 1) != 0 ? lm6.E : arrayList, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? sfb.E : sfbVar, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? false : z2, (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? false : z3, (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? false : z4, null, false, (i2 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? nm6.E : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m15)) {
            return false;
        }
        m15 m15Var = (m15) obj;
        return x44.r(this.a, m15Var.a) && this.b == m15Var.b && x44.r(this.c, m15Var.c) && this.d == m15Var.d && this.e == m15Var.e && x44.r(this.f, m15Var.f) && this.g == m15Var.g && this.h == m15Var.h && this.i == m15Var.i && x44.r(this.j, m15Var.j) && this.k == m15Var.k && x44.r(this.l, m15Var.l);
    }

    public final int hashCode() {
        int iP = fsh.p(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iP2 = fsh.p(fsh.p(fsh.p(kgh.l((this.e.hashCode() + vb7.c(this.d, (iP + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        Integer num = this.j;
        return this.l.hashCode() + fsh.p((iP2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConwayUiState(entries=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", statusLine=");
        sb.append(this.c);
        sb.append(", deliveryCheckIdx=");
        sb.append(this.d);
        sb.append(", deliveryState=");
        sb.append(this.e);
        sb.append(", proxyPrefix=");
        sb.append(this.f);
        sb.append(", pinBottom=");
        ij0.A(sb, this.g, ", isLoadingOlder=", this.h, ", hasMoreHistory=");
        sb.append(this.i);
        sb.append(", forkBoundaryIdx=");
        sb.append(this.j);
        sb.append(", isLoadingForkPrefix=");
        sb.append(this.k);
        sb.append(", debugUnknownFrames=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }

    public m15(List list, boolean z, String str, int i, sfb sfbVar, String str2, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, Map map) {
        list.getClass();
        sfbVar.getClass();
        str2.getClass();
        map.getClass();
        this.a = list;
        this.b = z;
        this.c = str;
        this.d = i;
        this.e = sfbVar;
        this.f = str2;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = num;
        this.k = z5;
        this.l = map;
    }
}
