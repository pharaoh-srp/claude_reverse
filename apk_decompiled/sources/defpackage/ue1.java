package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ue1 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof ue1) {
            return Float.compare(this.a, ((ue1) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
