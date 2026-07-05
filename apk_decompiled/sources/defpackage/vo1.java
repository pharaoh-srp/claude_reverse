package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vo1 implements qt {
    public final float a;

    public vo1(float f) {
        this.a = f;
    }

    @Override // defpackage.qt
    public final int a(int i, int i2, fu9 fu9Var) {
        float f = (i2 - i) / 2.0f;
        fu9 fu9Var2 = fu9.E;
        float f2 = this.a;
        if (fu9Var != fu9Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vo1) && Float.compare(this.a, ((vo1) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ebh.o(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
