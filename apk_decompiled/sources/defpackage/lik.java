package defpackage;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class lik implements Runnable {
    public final aik E;
    public final int F;
    public final Throwable G;
    public final byte[] H;
    public final String I;
    public final Map J;

    public lik(String str, aik aikVar, int i, IOException iOException, byte[] bArr, Map map) {
        dgj.v(aikVar);
        this.E = aikVar;
        this.F = i;
        this.G = iOException;
        this.H = bArr;
        this.I = str;
        this.J = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.E.d(this.I, this.F, this.G, this.H, this.J);
    }
}
