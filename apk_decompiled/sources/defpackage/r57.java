package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r57 extends hjk {
    public final int c;

    public r57(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r57) {
            return this.c == ((r57) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }

    public final String toString() {
        return vb7.r(new StringBuilder("RepetitionsGoal(repetitions="), this.c, ')');
    }
}
