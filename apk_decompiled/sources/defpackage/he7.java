package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class he7 {
    public final float a;
    public final kl7 b;

    public he7(float f, kl7 kl7Var) {
        this.a = f;
        this.b = kl7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he7)) {
            return false;
        }
        he7 he7Var = (he7) obj;
        return Float.compare(this.a, he7Var.a) == 0 && x44.r(this.b, he7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
