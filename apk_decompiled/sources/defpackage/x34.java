package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x34 implements z34 {
    public final boolean a;

    public x34(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x34) && this.a == ((x34) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qy1.g("Bullet(isActive=", ")", this.a);
    }
}
