package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class ie6 extends eh7 {
    public final Drawable a;
    public final boolean b;
    public final rg5 c;

    public ie6(Drawable drawable, boolean z, rg5 rg5Var) {
        this.a = drawable;
        this.b = z;
        this.c = rg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie6)) {
            return false;
        }
        ie6 ie6Var = (ie6) obj;
        return x44.r(this.a, ie6Var.a) && this.b == ie6Var.b && this.c == ie6Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + fsh.p(this.a.hashCode() * 31, 31, this.b);
    }
}
