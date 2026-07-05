package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class nte {
    public static final nte i = new nte(null, null, null, null, null, null, 255);
    public final egg a;
    public final egg b;
    public final egg c;
    public final egg d;
    public final egg e;
    public final egg f;
    public final egg g;
    public final egg h;

    public /* synthetic */ nte(egg eggVar, egg eggVar2, egg eggVar3, egg eggVar4, egg eggVar5, egg eggVar6, int i2) {
        this((i2 & 1) != 0 ? null : eggVar, (i2 & 2) != 0 ? null : eggVar2, (i2 & 4) != 0 ? null : eggVar3, (i2 & 8) != 0 ? null : eggVar4, null, null, (i2 & 64) != 0 ? null : eggVar5, (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : eggVar6);
    }

    public final nte a() {
        egg eggVar = this.a;
        if (eggVar == null) {
            dte dteVar = dte.d;
            eggVar = dte.e;
        }
        egg eggVar2 = this.b;
        if (eggVar2 == null) {
            fte fteVar = fte.d;
            eggVar2 = fte.e;
        }
        egg eggVar3 = this.c;
        if (eggVar3 == null) {
            kte kteVar = kte.d;
            eggVar3 = kte.e;
        }
        egg eggVar4 = this.d;
        if (eggVar4 == null) {
            hte hteVar = hte.d;
            eggVar4 = hte.e;
        }
        egg eggVar5 = this.e;
        if (eggVar5 == null) {
            ite iteVar = ite.d;
            eggVar5 = ite.e;
        }
        egg eggVar6 = this.f;
        if (eggVar6 == null) {
            jte jteVar = jte.d;
            eggVar6 = jte.e;
        }
        egg eggVar7 = this.g;
        if (eggVar7 == null) {
            ete eteVar = ete.d;
            eggVar7 = ete.e;
        }
        egg eggVar8 = this.h;
        if (eggVar8 == null) {
            egg eggVar9 = gte.e;
            eggVar8 = gte.e;
        }
        return new nte(eggVar, eggVar2, eggVar3, eggVar4, eggVar5, eggVar6, eggVar7, eggVar8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nte)) {
            return false;
        }
        nte nteVar = (nte) obj;
        return x44.r(this.a, nteVar.a) && x44.r(this.b, nteVar.b) && x44.r(this.c, nteVar.c) && x44.r(this.d, nteVar.d) && x44.r(this.e, nteVar.e) && x44.r(this.f, nteVar.f) && x44.r(this.g, nteVar.g) && x44.r(this.h, nteVar.h);
    }

    public final int hashCode() {
        egg eggVar = this.a;
        int iHashCode = (eggVar == null ? 0 : eggVar.hashCode()) * 31;
        egg eggVar2 = this.b;
        int iHashCode2 = (iHashCode + (eggVar2 == null ? 0 : eggVar2.hashCode())) * 31;
        egg eggVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (eggVar3 == null ? 0 : eggVar3.hashCode())) * 31;
        egg eggVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (eggVar4 == null ? 0 : eggVar4.hashCode())) * 31;
        egg eggVar5 = this.e;
        int iHashCode5 = (iHashCode4 + (eggVar5 == null ? 0 : eggVar5.hashCode())) * 31;
        egg eggVar6 = this.f;
        int iHashCode6 = (iHashCode5 + (eggVar6 == null ? 0 : eggVar6.hashCode())) * 31;
        egg eggVar7 = this.g;
        int iHashCode7 = (iHashCode6 + (eggVar7 == null ? 0 : eggVar7.hashCode())) * 31;
        egg eggVar8 = this.h;
        return iHashCode7 + (eggVar8 != null ? eggVar8.hashCode() : 0);
    }

    public final String toString() {
        return "RichTextStringStyle(boldStyle=" + this.a + ", italicStyle=" + this.b + ", underlineStyle=" + this.c + ", strikethroughStyle=" + this.d + ", subscriptStyle=" + this.e + ", superscriptStyle=" + this.f + ", codeStyle=" + this.g + ", linkStyle=" + this.h + ")";
    }

    public nte(egg eggVar, egg eggVar2, egg eggVar3, egg eggVar4, egg eggVar5, egg eggVar6, egg eggVar7, egg eggVar8) {
        this.a = eggVar;
        this.b = eggVar2;
        this.c = eggVar3;
        this.d = eggVar4;
        this.e = eggVar5;
        this.f = eggVar6;
        this.g = eggVar7;
        this.h = eggVar8;
    }
}
