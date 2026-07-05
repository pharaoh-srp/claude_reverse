package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ab1 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public ab1(hzb hzbVar) {
        hzbVar.getClass();
        float f = hzbVar.c;
        float f2 = hzbVar.d;
        float f3 = hzbVar.b;
        int i = hzbVar.a;
        long j = hzbVar.e;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final float a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final float c() {
        return this.a;
    }

    public final float d() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat(touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        sb.append(this.d);
        sb.append(", frameTimeMillis=");
        return ebh.p(sb, this.e, ')');
    }
}
