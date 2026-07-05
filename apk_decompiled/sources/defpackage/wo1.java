package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wo1 {
    public final float a;

    public wo1(float f) {
        this.a = f;
    }

    public final int a(int i, int i2) {
        return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wo1) && Float.compare(this.a, ((wo1) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ebh.o(new StringBuilder("Vertical(bias="), this.a, ')');
    }
}
