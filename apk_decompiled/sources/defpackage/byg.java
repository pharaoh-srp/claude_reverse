package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class byg {
    public final String a;

    public byg(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byg) && x44.r(this.a, ((byg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("GenericToolPermission(toolName=", this.a, ")");
    }
}
