package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hy0 implements iy0 {
    public final m7f a;

    public hy0(m7f m7fVar) {
        this.a = m7fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy0) && this.a == ((hy0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Ready(userScope=", "ScopeHandle(raw=" + this.a + ")", ")");
    }
}
