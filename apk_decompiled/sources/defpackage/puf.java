package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class puf implements fvf {
    public final List a;
    public final nf0 b;
    public final ouf c;

    public /* synthetic */ puf(List list, nf0 nf0Var, int i) {
        this(list, (i & 2) != 0 ? null : nf0Var, (i & 4) != 0 ? ouf.E : ouf.G);
    }

    public static puf a(puf pufVar) {
        List list = pufVar.a;
        nf0 nf0Var = pufVar.b;
        pufVar.getClass();
        list.getClass();
        return new puf(list, nf0Var, ouf.F);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puf)) {
            return false;
        }
        puf pufVar = (puf) obj;
        return x44.r(this.a, pufVar.a) && x44.r(this.b, pufVar.b) && this.c == pufVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nf0 nf0Var = this.b;
        return this.c.hashCode() + ((iHashCode + (nf0Var == null ? 0 : nf0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Initialize(events=" + this.a + ", partialLoadError=" + this.b + ", source=" + this.c + ")";
    }

    public puf(List list, nf0 nf0Var, ouf oufVar) {
        oufVar.getClass();
        this.a = list;
        this.b = nf0Var;
        this.c = oufVar;
    }
}
