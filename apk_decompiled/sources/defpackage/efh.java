package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class efh implements CharSequence {
    public final List E;
    public final List F;
    public final CharSequence G;
    public final long H;
    public final kkh I;
    public final cpc J;

    public efh(CharSequence charSequence, long j, kkh kkhVar, cpc cpcVar, List list, List list2, int i) {
        kkhVar = (i & 4) != 0 ? null : kkhVar;
        cpcVar = (i & 8) != 0 ? null : cpcVar;
        list = (i & 16) != 0 ? null : list;
        list2 = (i & 32) != 0 ? null : list2;
        this.E = list;
        this.F = list2;
        this.G = charSequence instanceof efh ? ((efh) charSequence).G : charSequence;
        this.H = mwa.u(charSequence.length(), j);
        this.I = kkhVar != null ? new kkh(mwa.u(charSequence.length(), kkhVar.a)) : null;
        this.J = cpcVar != null ? new cpc(cpcVar.E, new kkh(mwa.u(charSequence.length(), ((kkh) cpcVar.F).a))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.G.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || efh.class != obj.getClass()) {
            return false;
        }
        efh efhVar = (efh) obj;
        if (kkh.c(this.H, efhVar.H) && x44.r(this.I, efhVar.I) && x44.r(this.J, efhVar.J) && x44.r(this.E, efhVar.E)) {
            return isg.d0(this.G, efhVar.G);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.G.hashCode() * 31;
        int i = kkh.c;
        int iE = vb7.e(iHashCode, 31, this.H);
        kkh kkhVar = this.I;
        int iHashCode2 = (iE + (kkhVar != null ? Long.hashCode(kkhVar.a) : 0)) * 31;
        cpc cpcVar = this.J;
        int iHashCode3 = (iHashCode2 + (cpcVar != null ? cpcVar.hashCode() : 0)) * 31;
        List list = this.E;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.G.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.G.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.G.toString();
    }
}
