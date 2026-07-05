package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y21 implements c31 {
    public final String a;
    public final c21 b;

    public y21(String str, c21 c21Var) {
        this.a = str;
        this.b = c21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y21)) {
            return false;
        }
        y21 y21Var = (y21) obj;
        return this.a.equals(y21Var.a) && this.b.equals(y21Var.b);
    }

    @Override // defpackage.c31
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Action(key=" + this.a + ", button=" + this.b + ")";
    }
}
