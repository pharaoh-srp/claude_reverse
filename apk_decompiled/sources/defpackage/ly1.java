package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ly1 implements ejh {
    public final rzf a;
    public final float b;

    public ly1(rzf rzfVar, float f) {
        this.a = rzfVar;
        this.b = f;
    }

    @Override // defpackage.ejh
    public final float a() {
        return this.b;
    }

    @Override // defpackage.ejh
    public final long b() {
        int i = d54.i;
        return d54.h;
    }

    @Override // defpackage.ejh
    public final jy1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly1)) {
            return false;
        }
        ly1 ly1Var = (ly1) obj;
        return x44.r(this.a, ly1Var.a) && Float.compare(this.b, ly1Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return ebh.o(sb, this.b, ')');
    }
}
