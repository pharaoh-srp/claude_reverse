package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h8k {
    protected transient int zza;

    public abstract void a(xak xakVar);

    public final byte[] b() {
        try {
            int iD = d();
            byte[] bArr = new byte[iD];
            xak xakVar = new xak(bArr, iD);
            a(xakVar);
            if (iD - xakVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            xh6.f(ij0.j("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public abstract int c(klk klkVar);

    public abstract int d();
}
