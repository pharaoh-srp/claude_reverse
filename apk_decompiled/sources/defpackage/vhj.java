package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vhj {
    public final int a;
    public final String b;
    public final List c;
    public final thj d;
    public final uhj e;
    public final int f;
    public final Long g;

    public vhj(int i, String str, List list, thj thjVar, uhj uhjVar, int i2, Long l) {
        list.getClass();
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = thjVar;
        this.e = uhjVar;
        this.f = i2;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhj)) {
            return false;
        }
        vhj vhjVar = (vhj) obj;
        return this.a == vhjVar.a && this.b.equals(vhjVar.b) && x44.r(this.c, vhjVar.c) && this.d.equals(vhjVar.d) && this.e == vhjVar.e && this.f == vhjVar.f && x44.r(this.g, vhjVar.g);
    }

    public final int hashCode() {
        int iC = vb7.c(this.f, (this.e.hashCode() + ((this.d.hashCode() + kgh.m(kgh.l(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31);
        Long l = this.g;
        return iC + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "WorkflowPhaseSummary(index=" + this.a + ", title=" + this.b + ", agents=" + this.c + ", counts=" + this.d + ", status=" + this.e + ", totalTokens=" + this.f + ", maxDurationMs=" + this.g + ")";
    }
}
