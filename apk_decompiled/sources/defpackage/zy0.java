package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zy0 extends ty0 {
    public final int a;

    public zy0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zy0) && this.a == ((zy0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return grc.u("AstHeading(level=", this.a, ")");
    }
}
