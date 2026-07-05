package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ug3 {
    public final txb a;
    public final esd b;
    public final wp1 c;
    public final neg d;

    public ug3(txb txbVar, esd esdVar, wp1 wp1Var, neg negVar) {
        txbVar.getClass();
        esdVar.getClass();
        negVar.getClass();
        this.a = txbVar;
        this.b = esdVar;
        this.c = wp1Var;
        this.d = negVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug3)) {
            return false;
        }
        ug3 ug3Var = (ug3) obj;
        return x44.r(this.a, ug3Var.a) && x44.r(this.b, ug3Var.b) && this.c.equals(ug3Var.c) && x44.r(this.d, ug3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}
