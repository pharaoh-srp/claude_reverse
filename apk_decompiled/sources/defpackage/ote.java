package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class ote {
    public static final ote i = new ote((clh) null, (mk4) null, (oaa) null, (rr1) null, (zq3) null, (w3h) null, (nte) null, 255);
    public final clh a;
    public final pz7 b;
    public final oaa c;
    public final rr1 d;
    public final zq3 e;
    public final w3h f;
    public final g29 g;
    public final nte h;

    public /* synthetic */ ote(clh clhVar, mk4 mk4Var, oaa oaaVar, rr1 rr1Var, zq3 zq3Var, w3h w3hVar, nte nteVar, int i2) {
        this((i2 & 1) != 0 ? null : clhVar, (i2 & 2) != 0 ? null : mk4Var, (i2 & 4) != 0 ? null : oaaVar, (i2 & 8) != 0 ? null : rr1Var, (i2 & 16) != 0 ? null : zq3Var, (i2 & 32) != 0 ? null : w3hVar, (g29) null, (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : nteVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ote)) {
            return false;
        }
        ote oteVar = (ote) obj;
        return x44.r(this.a, oteVar.a) && x44.r(this.b, oteVar.b) && x44.r(this.c, oteVar.c) && x44.r(this.d, oteVar.d) && x44.r(this.e, oteVar.e) && x44.r(this.f, oteVar.f) && x44.r(this.g, oteVar.g) && x44.r(this.h, oteVar.h);
    }

    public final int hashCode() {
        clh clhVar = this.a;
        int iHashCode = (clhVar == null ? 0 : Long.hashCode(clhVar.a)) * 31;
        pz7 pz7Var = this.b;
        int iHashCode2 = (iHashCode + (pz7Var == null ? 0 : pz7Var.hashCode())) * 31;
        oaa oaaVar = this.c;
        int iHashCode3 = (iHashCode2 + (oaaVar == null ? 0 : oaaVar.hashCode())) * 31;
        rr1 rr1Var = this.d;
        int iHashCode4 = (iHashCode3 + (rr1Var == null ? 0 : rr1Var.hashCode())) * 31;
        zq3 zq3Var = this.e;
        int iHashCode5 = (iHashCode4 + (zq3Var == null ? 0 : zq3Var.hashCode())) * 31;
        w3h w3hVar = this.f;
        int iHashCode6 = (iHashCode5 + (w3hVar == null ? 0 : w3hVar.hashCode())) * 31;
        g29 g29Var = this.g;
        int iHashCode7 = (iHashCode6 + (g29Var == null ? 0 : g29Var.hashCode())) * 31;
        nte nteVar = this.h;
        return iHashCode7 + (nteVar != null ? nteVar.hashCode() : 0);
    }

    public final String toString() {
        return "RichTextStyle(paragraphSpacing=" + this.a + ", headingStyle=" + this.b + ", listStyle=" + this.c + ", blockQuoteGutter=" + this.d + ", codeBlockStyle=" + this.e + ", tableStyle=" + this.f + ", infoPanelStyle=" + this.g + ", stringStyle=" + this.h + ")";
    }

    public ote(clh clhVar, pz7 pz7Var, oaa oaaVar, rr1 rr1Var, zq3 zq3Var, w3h w3hVar, g29 g29Var, nte nteVar) {
        this.a = clhVar;
        this.b = pz7Var;
        this.c = oaaVar;
        this.d = rr1Var;
        this.e = zq3Var;
        this.f = w3hVar;
        this.g = g29Var;
        this.h = nteVar;
    }
}
