package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uai {
    public final qai a;
    public final ze9 b;

    public uai(qai qaiVar, ze9 ze9Var) {
        qaiVar.getClass();
        ze9Var.getClass();
        this.a = qaiVar;
        this.b = ze9Var;
    }

    public final ze9 a() {
        return this.b;
    }

    public final qai b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uai)) {
            return false;
        }
        uai uaiVar = (uai) obj;
        return x44.r(uaiVar.a, this.a) && x44.r(uaiVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        return this.b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
    }
}
