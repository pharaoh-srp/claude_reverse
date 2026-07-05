package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f5i {
    public final zb0 a;
    public final occ b;

    public f5i(zb0 zb0Var, occ occVar) {
        this.a = zb0Var;
        this.b = occVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5i)) {
            return false;
        }
        f5i f5iVar = (f5i) obj;
        return x44.r(this.a, f5iVar.a) && x44.r(this.b, f5iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
