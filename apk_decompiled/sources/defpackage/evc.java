package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class evc extends nvc {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public evc(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final float a() {
        return this.c;
    }

    public final float b() {
        return this.e;
    }

    public final float c() {
        return this.g;
    }

    public final float d() {
        return this.d;
    }

    public final float e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evc)) {
            return false;
        }
        evc evcVar = (evc) obj;
        return Float.compare(this.c, evcVar.c) == 0 && Float.compare(this.d, evcVar.d) == 0 && Float.compare(this.e, evcVar.e) == 0 && Float.compare(this.f, evcVar.f) == 0 && Float.compare(this.g, evcVar.g) == 0 && Float.compare(this.h, evcVar.h) == 0;
    }

    public final float f() {
        return this.h;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + vb7.b(this.g, vb7.b(this.f, vb7.b(this.e, vb7.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        sb.append(this.f);
        sb.append(", dx3=");
        sb.append(this.g);
        sb.append(", dy3=");
        return ebh.o(sb, this.h, ')');
    }
}
