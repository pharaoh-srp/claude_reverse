package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yhj implements zhj {
    public final int a;
    public final String b;

    public yhj(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhj)) {
            return false;
        }
        yhj yhjVar = (yhj) obj;
        return this.a == yhjVar.a && x44.r(this.b, yhjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Phase(index=" + this.a + ", title=" + this.b + ")";
    }
}
