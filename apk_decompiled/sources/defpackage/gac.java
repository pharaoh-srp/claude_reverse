package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gac implements hac {
    public final String a;

    public gac(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gac) && this.a.equals(((gac) obj).a);
    }

    @Override // defpackage.hac
    public final String getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Plain(text=", this.a, ")");
    }
}
