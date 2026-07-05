package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mvc extends nvc {
    public final float c;

    public mvc(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvc) && Float.compare(this.c, ((mvc) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return ebh.o(new StringBuilder("VerticalTo(y="), this.c, ')');
    }
}
