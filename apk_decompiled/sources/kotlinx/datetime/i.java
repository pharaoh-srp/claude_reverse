package kotlinx.datetime;

import defpackage.hq3;
import defpackage.mjj;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends mjj implements hq3 {
    public static final i H = new i(new YearMonth(0, 2), new YearMonth(0, 1));

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
