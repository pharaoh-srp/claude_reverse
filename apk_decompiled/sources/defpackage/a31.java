package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a31 implements b31 {
    public final int a;

    public a31(int i) {
        this.a = i;
    }

    @Override // defpackage.b31
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a31) && this.a == ((a31) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return grc.u("Loading(slot=", this.a, ")");
    }
}
