package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yuc extends nvc {
    public final float c;
    public final float d;

    public yuc(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yuc)) {
            return false;
        }
        yuc yucVar = (yuc) obj;
        return Float.compare(this.c, yucVar.c) == 0 && Float.compare(this.d, yucVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return ebh.o(sb, this.d, ')');
    }
}
