package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class z21 implements b31 {
    public final int a;
    public final Uri b;
    public final boolean c;
    public final zy7 d;

    public z21(int i, Uri uri, boolean z, zy7 zy7Var) {
        uri.getClass();
        zy7Var.getClass();
        this.a = i;
        this.b = uri;
        this.c = z;
        this.d = zy7Var;
    }

    @Override // defpackage.b31
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z21)) {
            return false;
        }
        z21 z21Var = (z21) obj;
        return this.a == z21Var.a && x44.r(this.b, z21Var.b) && this.c == z21Var.c && x44.r(this.d, z21Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fsh.p((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Loaded(slot=" + this.a + ", uri=" + this.b + ", enabled=" + this.c + ", onClick=" + this.d + ")";
    }
}
