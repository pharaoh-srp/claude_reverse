package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iog implements kog {
    public final String a;

    public iog(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iog) && this.a.equals(((iog) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Unknown(raw=", this.a, ")");
    }
}
