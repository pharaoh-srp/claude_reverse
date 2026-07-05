package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class to5 {
    public final String a;
    public final jw7 b;
    public final jw7 c;
    public final int d;
    public final int e;

    public to5(String str, jw7 jw7Var, jw7 jw7Var2, int i, int i2) {
        fd9.E(i == 0 || i2 == 0);
        fd9.E(true ^ TextUtils.isEmpty(str));
        this.a = str;
        jw7Var.getClass();
        this.b = jw7Var;
        jw7Var2.getClass();
        this.c = jw7Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && to5.class == obj.getClass()) {
            to5 to5Var = (to5) obj;
            if (this.d == to5Var.d && this.e == to5Var.e && this.a.equals(to5Var.a) && this.b.equals(to5Var.b) && this.c.equals(to5Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + kgh.l((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
