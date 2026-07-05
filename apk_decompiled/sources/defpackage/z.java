package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public z(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Float.compare(this.a, zVar.a) == 0 && Float.compare(this.b, zVar.b) == 0 && Float.compare(this.c, zVar.c) == 0 && Float.compare(this.d, zVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + vb7.b(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbsolutePixelPadding(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", top=");
        sb.append(this.c);
        sb.append(", bottom=");
        return ebh.o(sb, this.d, ')');
    }
}
