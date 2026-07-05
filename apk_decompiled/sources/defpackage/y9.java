package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y9 {
    public String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9) && x44.r(this.a, ((y9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("ActionEventActionTarget(name=", this.a, ")");
    }
}
