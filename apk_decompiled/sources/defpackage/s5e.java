package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s5e {
    public final String a;
    public final String b;

    public s5e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5e)) {
            return false;
        }
        s5e s5eVar = (s5e) obj;
        return this.a.equals(s5eVar.a) && x44.r(this.b, s5eVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ij0.l("EnrollPublicKeys(deviceBindingSpki=", this.a, ", reattestSpki=", this.b, ")");
    }
}
