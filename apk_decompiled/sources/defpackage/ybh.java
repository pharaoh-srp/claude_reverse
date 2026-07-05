package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ybh {
    public final String a;

    public ybh(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ybh) && x44.r(this.a, ((ybh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("View(id=", this.a, ")");
    }
}
