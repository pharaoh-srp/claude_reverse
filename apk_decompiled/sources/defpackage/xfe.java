package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xfe {
    public final float a;
    public final float b;
    public final float c;
    public final long d;
    public final long e;
    public final List f;
    public final float g;
    public final jy1 h;
    public final int i;

    public xfe(float f, float f2, float f3, long j, long j2, List list, float f4, jy1 jy1Var, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = j;
        this.e = j2;
        this.f = list;
        this.g = f4;
        this.h = jy1Var;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfe)) {
            return false;
        }
        xfe xfeVar = (xfe) obj;
        return va6.b(this.a, xfeVar.a) && Float.compare(this.b, xfeVar.b) == 0 && Float.compare(this.c, xfeVar.c) == 0 && k8g.b(this.d, xfeVar.d) && fcc.c(this.e, xfeVar.e) && this.f.equals(xfeVar.f) && Float.compare(this.g, xfeVar.g) == 0 && x44.r(this.h, xfeVar.h) && this.i == xfeVar.i;
    }

    public final int hashCode() {
        int iB = vb7.b(this.g, kgh.m(vb7.e(vb7.e(vb7.b(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31);
        jy1 jy1Var = this.h;
        return Integer.hashCode(this.i) + ((iB + (jy1Var == null ? 0 : jy1Var.hashCode())) * 961);
    }

    public final String toString() {
        String strC = va6.c(this.a);
        String strH = k8g.h(this.d);
        String strK = fcc.k(this.e);
        String strI = hsk.i(this.i);
        StringBuilder sb = new StringBuilder("RenderEffectParams(blurRadius=");
        sb.append(strC);
        sb.append(", noiseFactor=");
        sb.append(this.b);
        sb.append(", scale=");
        sb.append(this.c);
        sb.append(", contentSize=");
        sb.append(strH);
        sb.append(", contentOffset=");
        qy1.p(strK, ", tints=", ", tintAlphaModulate=", sb, this.f);
        sb.append(this.g);
        sb.append(", mask=");
        sb.append(this.h);
        sb.append(", progressive=null, blurTileMode=");
        return ij0.m(sb, strI, ")");
    }
}
