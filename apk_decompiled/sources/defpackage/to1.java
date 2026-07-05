package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class to1 implements qt {
    public final float a;

    public to1(float f) {
        this.a = f;
    }

    @Override // defpackage.qt
    public final int a(int i, int i2, fu9 fu9Var) {
        return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof to1) && Float.compare(this.a, ((to1) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ebh.o(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
