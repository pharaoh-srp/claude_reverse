package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bnc implements sg3 {
    public final Class E;

    public bnc(Class cls, String str) {
        cls.getClass();
        this.E = cls;
    }

    @Override // defpackage.sg3
    public final Class a() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnc) {
            return x44.r(this.E, ((bnc) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return this.E.toString() + " (Kotlin reflection is not available)";
    }
}
