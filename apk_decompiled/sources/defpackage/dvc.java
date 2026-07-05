package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dvc extends nvc {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public dvc(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final float a() {
        return this.h;
    }

    public final float b() {
        return this.i;
    }

    public final float c() {
        return this.c;
    }

    public final float d() {
        return this.e;
    }

    public final float e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvc)) {
            return false;
        }
        dvc dvcVar = (dvc) obj;
        return Float.compare(this.c, dvcVar.c) == 0 && Float.compare(this.d, dvcVar.d) == 0 && Float.compare(this.e, dvcVar.e) == 0 && this.f == dvcVar.f && this.g == dvcVar.g && Float.compare(this.h, dvcVar.h) == 0 && Float.compare(this.i, dvcVar.i) == 0;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + vb7.b(this.h, fsh.p(fsh.p(vb7.b(this.e, vb7.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartDx=");
        sb.append(this.h);
        sb.append(", arcStartDy=");
        return ebh.o(sb, this.i, ')');
    }
}
