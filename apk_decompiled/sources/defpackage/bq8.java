package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bq8 implements dq8 {
    public final String a;

    public bq8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bq8) && this.a.equals(((bq8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Loaded(html=", this.a, ")");
    }
}
