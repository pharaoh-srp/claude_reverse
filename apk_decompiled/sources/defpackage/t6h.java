package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t6h {
    public final int a;
    public final String b;

    public t6h(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6h)) {
            return false;
        }
        t6h t6hVar = (t6h) obj;
        return this.a == t6hVar.a && x44.r(this.b, t6hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TaskProposeCardStep(position=" + this.a + ", title=" + this.b + ")";
    }
}
