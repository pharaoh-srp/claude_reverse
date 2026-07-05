package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class kwe {
    public final String a;
    public final z4g b;
    public final a5g c;
    public final pz7 d;
    public final pz7 e;
    public final pz7 f;
    public final sz7 g;
    public final boolean h;
    public final ta4 i;

    public kwe(String str, ta4 ta4Var, ta4 ta4Var2, ta4 ta4Var3, ta4 ta4Var4, boolean z, ta4 ta4Var5, int i) {
        z4g z4gVar = k4g.l;
        a5g a5gVar = k4g.j;
        ta4Var = (i & 8) != 0 ? str != null ? new ta4(-1415887923, true, new yi7(str, 29)) : null : ta4Var;
        ta4Var2 = (i & 16) != 0 ? null : ta4Var2;
        ta4Var3 = (i & 32) != 0 ? null : ta4Var3;
        ta4Var4 = (i & 64) != 0 ? null : ta4Var4;
        z = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? true : z;
        z4gVar.getClass();
        a5gVar.getClass();
        this.a = str;
        this.b = z4gVar;
        this.c = a5gVar;
        this.d = ta4Var;
        this.e = ta4Var2;
        this.f = ta4Var3;
        this.g = ta4Var4;
        this.h = z;
        this.i = ta4Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwe)) {
            return false;
        }
        kwe kweVar = (kwe) obj;
        return x44.r(this.a, kweVar.a) && this.b == kweVar.b && this.c == kweVar.c && x44.r(this.d, kweVar.d) && x44.r(this.e, kweVar.e) && x44.r(this.f, kweVar.f) && x44.r(this.g, kweVar.g) && this.h == kweVar.h && x44.r(this.i, kweVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        pz7 pz7Var = this.d;
        int iHashCode2 = (iHashCode + (pz7Var == null ? 0 : pz7Var.hashCode())) * 31;
        pz7 pz7Var2 = this.e;
        int iHashCode3 = (iHashCode2 + (pz7Var2 == null ? 0 : pz7Var2.hashCode())) * 31;
        pz7 pz7Var3 = this.f;
        int iHashCode4 = (iHashCode3 + (pz7Var3 == null ? 0 : pz7Var3.hashCode())) * 31;
        sz7 sz7Var = this.g;
        return this.i.hashCode() + fsh.p((iHashCode4 + (sz7Var != null ? sz7Var.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        return "RoutedSheetDestination(paneTitle=" + this.a + ", titleAlignment=" + this.b + ", titleBarPlacement=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", titleBarButton=" + this.f + ", fixedBottomContent=" + this.g + ", contentScrollable=" + this.h + ", content=" + this.i + ")";
    }
}
