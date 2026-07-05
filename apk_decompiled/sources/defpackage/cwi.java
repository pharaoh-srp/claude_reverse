package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cwi {
    public final ewi a;
    public final vvi b;
    public final String c;
    public final String d;
    public final long e;
    public final List f;
    public final dxi g;
    public final dwi h;
    public final cxi i;

    public cwi(ewi ewiVar, vvi vviVar, String str, String str2, long j, List list, dxi dxiVar, dwi dwiVar, cxi cxiVar) {
        this.a = ewiVar;
        this.b = vviVar;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = list;
        this.g = dxiVar;
        this.h = dwiVar;
        this.i = cxiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwi)) {
            return false;
        }
        cwi cwiVar = (cwi) obj;
        return x44.r(this.a, cwiVar.a) && x44.r(this.b, cwiVar.b) && x44.r(this.c, cwiVar.c) && x44.r(this.d, cwiVar.d) && this.e == cwiVar.e && x44.r(this.f, cwiVar.f) && x44.r(this.g, cwiVar.g) && x44.r(this.h, cwiVar.h) && x44.r(this.i, cwiVar.i);
    }

    public final int hashCode() {
        ewi ewiVar = this.a;
        int iHashCode = (ewiVar == null ? 0 : ewiVar.hashCode()) * 31;
        vvi vviVar = this.b;
        int iHashCode2 = (iHashCode + (vviVar == null ? 0 : vviVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iE = vb7.e((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        List list = this.f;
        int iHashCode4 = (iE + (list == null ? 0 : list.hashCode())) * 31;
        dxi dxiVar = this.g;
        int iHashCode5 = (iHashCode4 + (dxiVar == null ? 0 : dxiVar.hashCode())) * 31;
        dwi dwiVar = this.h;
        int iHashCode6 = (iHashCode5 + (dwiVar == null ? 0 : dwiVar.hashCode())) * 31;
        cxi cxiVar = this.i;
        return iHashCode6 + (cxiVar != null ? cxiVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dd(session=");
        sb.append(this.a);
        sb.append(", configuration=");
        sb.append(this.b);
        sb.append(", browserSdkVersion=");
        kgh.u(sb, this.c, ", sdkName=", this.d, ", documentVersion=");
        sb.append(this.e);
        sb.append(", pageStates=");
        sb.append(this.f);
        sb.append(", replayStats=");
        sb.append(this.g);
        sb.append(", cls=");
        sb.append(this.h);
        sb.append(", profiling=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
