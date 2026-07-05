package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p01 {
    public static final p01 a = new p01();

    public final boolean a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof jx8) || !(obj2 instanceof jx8)) {
            return x44.r(obj, obj2);
        }
        jx8 jx8Var = (jx8) obj;
        jx8 jx8Var2 = (jx8) obj2;
        return x44.r(jx8Var.a, jx8Var2.a) && jx8Var.b.equals(jx8Var2.b) && x44.r(jx8Var.d, jx8Var2.d) && jx8Var.e.equals(jx8Var2.e) && x44.r(jx8Var.q, jx8Var2.q) && jx8Var.r == jx8Var2.r && jx8Var.s == jx8Var2.s;
    }

    public final int b(Object obj) {
        if (!(obj instanceof jx8)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        jx8 jx8Var = (jx8) obj;
        int iHashCode = (jx8Var.b.hashCode() + (jx8Var.a.hashCode() * 31)) * 31;
        String str = jx8Var.d;
        return jx8Var.s.hashCode() + ((jx8Var.r.hashCode() + ((jx8Var.q.hashCode() + ebh.g((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 961, jx8Var.e)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
