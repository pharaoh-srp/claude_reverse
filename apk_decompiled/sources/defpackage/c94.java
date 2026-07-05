package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c94 {
    public final Object a;
    public final pa2 b;
    public final rz7 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ c94(Object obj, pa2 pa2Var, rz7 rz7Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : pa2Var, (i & 4) != 0 ? null : rz7Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static c94 a(c94 c94Var, pa2 pa2Var, Throwable th, int i) {
        Object obj = c94Var.a;
        if ((i & 2) != 0) {
            pa2Var = c94Var.b;
        }
        pa2 pa2Var2 = pa2Var;
        rz7 rz7Var = c94Var.c;
        Object obj2 = c94Var.d;
        if ((i & 16) != 0) {
            th = c94Var.e;
        }
        return new c94(obj, pa2Var2, rz7Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c94)) {
            return false;
        }
        c94 c94Var = (c94) obj;
        return x44.r(this.a, c94Var.a) && x44.r(this.b, c94Var.b) && x44.r(this.c, c94Var.c) && x44.r(this.d, c94Var.d) && x44.r(this.e, c94Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        pa2 pa2Var = this.b;
        int iHashCode2 = (iHashCode + (pa2Var == null ? 0 : pa2Var.hashCode())) * 31;
        rz7 rz7Var = this.c;
        int iHashCode3 = (iHashCode2 + (rz7Var == null ? 0 : rz7Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public c94(Object obj, pa2 pa2Var, rz7 rz7Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = pa2Var;
        this.c = rz7Var;
        this.d = obj2;
        this.e = th;
    }
}
