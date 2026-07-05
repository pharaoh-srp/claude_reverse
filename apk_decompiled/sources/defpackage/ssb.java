package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ssb {
    public final int a;
    public final int b;
    public final float c;

    public ssb(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static ssb a(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new ssb(((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f, i2, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ssb)) {
            return false;
        }
        ssb ssbVar = (ssb) obj;
        return this.a == ssbVar.a && this.b == ssbVar.b && Float.compare(this.c, ssbVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GainField{name=");
        sb.append(this.a);
        sb.append(", originator=");
        sb.append(this.b);
        sb.append(", gain=");
        return ebh.o(sb, this.c, '}');
    }
}
