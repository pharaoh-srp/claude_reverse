package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class nph implements bt9 {
    public final long E = TimeUnit.MILLISECONDS.toNanos(3000);

    @Override // defpackage.bt9
    public final boolean d(bfd bfdVar) {
        return bfdVar.a().longValue() - bfdVar.b() < this.E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!nph.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.E == ((nph) obj).E;
    }

    public final int hashCode() {
        return Long.hashCode(this.E);
    }
}
