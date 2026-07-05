package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class st {
    public static final st c = new st(0, 0);
    public static final st d = new st(1, 1);
    public final int a;
    public final int b;

    public st(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!st.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        st stVar = (st) obj;
        return this.a == stVar.a && this.b == stVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) pt.b(this.a)) + ", vertical=" + ((Object) rt.b(this.b)) + ')';
    }
}
