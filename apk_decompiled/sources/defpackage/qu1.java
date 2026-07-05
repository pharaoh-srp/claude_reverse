package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qu1 {
    public final float a;
    public final eeg b;

    public qu1(float f, eeg eegVar) {
        this.a = f;
        this.b = eegVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu1)) {
            return false;
        }
        qu1 qu1Var = (qu1) obj;
        return va6.b(this.a, qu1Var.a) && this.b.equals(qu1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderStroke(width=");
        ebh.v(this.a, sb, ", brush=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
