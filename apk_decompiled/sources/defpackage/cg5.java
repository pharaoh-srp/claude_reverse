package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cg5 {
    public final String a;

    public cg5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cg5) {
            return this.a.equals(((cg5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.m(new StringBuilder("DataOrigin(packageName='"), this.a, "')");
    }
}
