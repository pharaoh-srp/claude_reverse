package defpackage;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes2.dex */
public final class s6d {
    public final en7 a;

    static {
        new SparseBooleanArray();
        fd9.M(!false);
        tpi.w(0);
    }

    public s6d(en7 en7Var) {
        this.a = en7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s6d) {
            return this.a.equals(((s6d) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
