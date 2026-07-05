package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n81 {
    public final Object a;
    public final agd b;
    public final bid c;

    public n81(Object obj, agd agdVar, b91 b91Var) {
        if (obj == null) {
            mr9.h("Null payload");
            throw null;
        }
        this.a = obj;
        this.b = agdVar;
        this.c = b91Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n81)) {
            return false;
        }
        n81 n81Var = (n81) obj;
        if (!this.a.equals(n81Var.a) || !this.b.equals(n81Var.b)) {
            return false;
        }
        bid bidVar = n81Var.c;
        bid bidVar2 = this.c;
        return bidVar2 == null ? bidVar == null : bidVar2.equals(bidVar);
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        bid bidVar = this.c;
        return (bidVar == null ? 0 : bidVar.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + "}";
    }
}
