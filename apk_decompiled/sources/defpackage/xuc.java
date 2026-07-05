package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xuc extends nvc {
    public final float c;

    public xuc(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xuc) && Float.compare(this.c, ((xuc) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return ebh.o(new StringBuilder("HorizontalTo(x="), this.c, ')');
    }
}
