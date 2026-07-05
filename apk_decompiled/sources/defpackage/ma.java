package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ma {
    public final xa a;
    public final na b;
    public final int c;

    public ma(xa xaVar, na naVar, int i) {
        this.a = xaVar;
        this.b = naVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma)) {
            return false;
        }
        ma maVar = (ma) obj;
        return x44.r(this.a, maVar.a) && x44.r(this.b, maVar.b) && this.c == maVar.c;
    }

    public final int hashCode() {
        xa xaVar = this.a;
        int iHashCode = (xaVar == null ? 0 : xaVar.hashCode()) * 31;
        na naVar = this.b;
        int iHashCode2 = (iHashCode + (naVar == null ? 0 : naVar.hashCode())) * 31;
        int i = this.c;
        return iHashCode2 + (i != 0 ? sq6.F(i) : 0);
    }

    public final String toString() {
        return "DdAction(position=" + this.a + ", target=" + this.b + ", nameSource=" + ebh.G(this.c) + ")";
    }
}
