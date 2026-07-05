package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fac implements hac {
    public final String a;

    public fac(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fac) && this.a.equals(((fac) obj).a);
    }

    @Override // defpackage.hac
    public final String getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Number(text=", this.a, ")");
    }
}
