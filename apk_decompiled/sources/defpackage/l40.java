package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l40 implements x7d {
    public final int b;

    public l40(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l40.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((l40) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return vb7.r(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
