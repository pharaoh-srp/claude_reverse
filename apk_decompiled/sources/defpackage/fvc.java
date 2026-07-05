package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fvc extends nvc {
    public final float c;

    public fvc(float f) {
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
        return (obj instanceof fvc) && Float.compare(this.c, ((fvc) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return ebh.o(new StringBuilder("RelativeHorizontalTo(dx="), this.c, ')');
    }
}
