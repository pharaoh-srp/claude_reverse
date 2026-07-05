package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j67 extends ijk {
    public final h67 e;

    public j67(h67 h67Var) {
        this.e = h67Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j67)) {
            return false;
        }
        return this.e.equals(((j67) obj).e);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "Data(exerciseRoute=" + this.e + ')';
    }
}
