package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zuc extends nvc {
    public final float c;
    public final float d;

    public zuc(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuc)) {
            return false;
        }
        zuc zucVar = (zuc) obj;
        return Float.compare(this.c, zucVar.c) == 0 && Float.compare(this.d, zucVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return ebh.o(sb, this.d, ')');
    }
}
