package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cyg {
    public final String a;

    public cyg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyg) && this.a.equals(((cyg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Text(text=", this.a, ")");
    }
}
