package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qb {
    public final String a;

    public qb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qb) {
            return x44.r(this.a, ((qb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
