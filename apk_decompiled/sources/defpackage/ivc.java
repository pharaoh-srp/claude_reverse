package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ivc extends nvc {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ivc(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final float a() {
        return this.c;
    }

    public final float b() {
        return this.e;
    }

    public final float c() {
        return this.d;
    }

    public final float d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivc)) {
            return false;
        }
        ivc ivcVar = (ivc) obj;
        return Float.compare(this.c, ivcVar.c) == 0 && Float.compare(this.d, ivcVar.d) == 0 && Float.compare(this.e, ivcVar.e) == 0 && Float.compare(this.f, ivcVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + vb7.b(this.e, vb7.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        return ebh.o(sb, this.f, ')');
    }
}
