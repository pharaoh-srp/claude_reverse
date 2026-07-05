package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s56 {
    public final ud0 a;
    public final String b;
    public final zy7 c;

    public s56(ud0 ud0Var, String str, zy7 zy7Var) {
        str.getClass();
        zy7Var.getClass();
        this.a = ud0Var;
        this.b = str;
        this.c = zy7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s56) {
            s56 s56Var = (s56) obj;
            if (this.a == s56Var.a && x44.r(this.b, s56Var.b) && x44.r(this.c, s56Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "DisclaimerAction(icon=" + this.a + ", label=" + this.b + ", onClick=" + this.c + ")";
    }
}
