package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class mph implements o29 {
    public final long E = TimeUnit.MILLISECONDS.toNanos(100);

    @Override // defpackage.o29
    public final boolean d(o1c o1cVar) {
        Long l = o1cVar.c;
        if (l != null) {
            return o1cVar.b - l.longValue() < this.E;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mph.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.E == ((mph) obj).E;
    }

    public final int hashCode() {
        return Long.hashCode(this.E);
    }
}
