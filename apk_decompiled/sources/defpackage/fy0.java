package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fy0 implements iy0 {
    public final String a;

    public fy0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fy0) && this.a.equals(((fy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Failed(reason=", this.a, ")");
    }
}
