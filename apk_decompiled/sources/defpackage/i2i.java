package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i2i {
    public final long a;
    public final z1i b;
    public final float c;

    public i2i(long j, z1i z1iVar, float f) {
        z1iVar.getClass();
        this.a = j;
        this.b = z1iVar;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2i)) {
            return false;
        }
        i2i i2iVar = (i2i) obj;
        return y69.b(this.a, i2iVar.a) && this.b == i2iVar.b && Float.compare(this.c, i2iVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "TooltipPosition(offset=" + y69.e(this.a) + ", alignment=" + this.b + ", centerPositionX=" + this.c + ")";
    }
}
