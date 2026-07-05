package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zoe extends ape {
    public final String a;

    public zoe(String str) {
        this.a = str;
    }

    @Override // defpackage.ape
    public final vh9 a() {
        return new vh9(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoe) && this.a.equals(((zoe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("String(item=", this.a, ")");
    }
}
