package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gch {
    public final String a;

    public gch(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gch) && x44.r(this.a, ((gch) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Action(id=", this.a, ")");
    }
}
