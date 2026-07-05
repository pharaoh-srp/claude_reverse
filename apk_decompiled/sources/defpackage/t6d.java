package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t6d {
    public final en7 a;

    public t6d(en7 en7Var) {
        this.a = en7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t6d) {
            return this.a.equals(((t6d) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
