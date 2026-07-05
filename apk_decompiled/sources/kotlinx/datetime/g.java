package kotlinx.datetime;

import defpackage.dda;
import defpackage.hq3;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends dda implements hq3 {
    public static final g H = new g(new LocalDate(1970, 1, 2), new LocalDate(1970, 1, 1));

    @Override // defpackage.hq3
    public final Comparable e() {
        return this.F;
    }

    @Override // defpackage.hq3
    public final Comparable g() {
        return this.G;
    }

    @Override // java.util.Collection, defpackage.hq3
    public final boolean isEmpty() {
        return this.F.compareTo(this.G) > 0;
    }

    public final String toString() {
        return this.F + ".." + this.G;
    }
}
