package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yui {
    public static final yui d = new yui(0, 0);
    public final int a;
    public final int b;
    public final float c;

    static {
        tpi.w(0);
        tpi.w(1);
        tpi.w(3);
    }

    public yui(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yui) {
            yui yuiVar = (yui) obj;
            if (this.a == yuiVar.a && this.b == yuiVar.b && this.c == yuiVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }

    public yui(int i, int i2) {
        this(1.0f, i, i2);
    }
}
