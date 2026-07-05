package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o7f {
    public final m7f a;

    public /* synthetic */ o7f(m7f m7fVar) {
        this.a = m7fVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o7f) {
            return this.a == ((o7f) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScopeHandle(raw=" + this.a + ")";
    }
}
