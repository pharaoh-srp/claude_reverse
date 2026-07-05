package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wuc extends nvc {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public wuc(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wuc)) {
            return false;
        }
        wuc wucVar = (wuc) obj;
        return Float.compare(this.c, wucVar.c) == 0 && Float.compare(this.d, wucVar.d) == 0 && Float.compare(this.e, wucVar.e) == 0 && Float.compare(this.f, wucVar.f) == 0 && Float.compare(this.g, wucVar.g) == 0 && Float.compare(this.h, wucVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + vb7.b(this.g, vb7.b(this.f, vb7.b(this.e, vb7.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        sb.append(this.f);
        sb.append(", x3=");
        sb.append(this.g);
        sb.append(", y3=");
        return ebh.o(sb, this.h, ')');
    }
}
