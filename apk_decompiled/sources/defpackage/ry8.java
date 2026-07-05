package defpackage;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class ry8 {
    public final Resources.Theme a;
    public final int b;

    public ry8(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry8)) {
            return false;
        }
        ry8 ry8Var = (ry8) obj;
        return x44.r(this.a, ry8Var.a) && this.b == ry8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.a);
        sb.append(", id=");
        return vb7.r(sb, this.b, ')');
    }
}
