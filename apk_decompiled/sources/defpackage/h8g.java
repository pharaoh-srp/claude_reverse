package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h8g {
    public static final h8g c = new h8g(-1, -1);
    public final int a;
    public final int b;

    static {
        new h8g(0, 0);
        tpi.w(0);
        tpi.w(1);
    }

    public h8g(int i, int i2) {
        fd9.E((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof h8g) {
            h8g h8gVar = (h8g) obj;
            if (this.a == h8gVar.a && this.b == h8gVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
