package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lvc extends nvc {
    public final float c;

    public lvc(float f) {
        super(3);
        this.c = f;
    }

    public final float a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvc) && Float.compare(this.c, ((lvc) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return ebh.o(new StringBuilder("RelativeVerticalTo(dy="), this.c, ')');
    }
}
