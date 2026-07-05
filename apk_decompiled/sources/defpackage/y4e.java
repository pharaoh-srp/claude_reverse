package defpackage;

import okio.BufferedSource;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class y4e extends rqe {
    public final String F;
    public final long G;
    public final RealBufferedSource H;

    public y4e(String str, long j, RealBufferedSource realBufferedSource) {
        this.F = str;
        this.G = j;
        this.H = realBufferedSource;
    }

    @Override // defpackage.rqe
    public final BufferedSource G0() {
        return this.H;
    }

    @Override // defpackage.rqe
    public final long d() {
        return this.G;
    }

    @Override // defpackage.rqe
    public final p8b e() {
        String str = this.F;
        if (str != null) {
            ide ideVar = p8b.e;
            try {
                return nai.D(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
