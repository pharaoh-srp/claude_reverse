package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hzb {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public hzb(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hzb.class == obj.getClass()) {
            hzb hzbVar = (hzb) obj;
            return this.c == hzbVar.c && this.d == hzbVar.d && this.b == hzbVar.b && this.a == hzbVar.a && this.e == hzbVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + vb7.c(this.a, vb7.b(this.b, vb7.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEvent(touchX=");
        sb.append(this.c);
        sb.append(", touchY=");
        sb.append(this.d);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", swipeEdge=");
        sb.append(this.a);
        sb.append(", frameTimeMillis=");
        return ebh.p(sb, this.e, ')');
    }
}
