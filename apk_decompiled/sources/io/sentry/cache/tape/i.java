package io.sentry.cache.tape;

import defpackage.pmf;
import defpackage.sz6;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Iterator {
    public int E = 0;
    public long F;
    public int G;
    public final /* synthetic */ j H;

    public i(j jVar) {
        this.H = jVar;
        this.F = jVar.I.a;
        this.G = jVar.L;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        j jVar = this.H;
        if (jVar.N) {
            sz6.j("closed");
            return false;
        }
        if (jVar.L == this.G) {
            return this.E != jVar.H;
        }
        sz6.c();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() throws IOException {
        byte[] bArr = j.O;
        j jVar = this.H;
        if (jVar.N) {
            sz6.j("closed");
            return null;
        }
        if (jVar.L != this.G) {
            sz6.c();
            return null;
        }
        int i = jVar.H;
        if (i == 0) {
            pmf.d();
            return null;
        }
        if (this.E >= i) {
            pmf.d();
            return null;
        }
        try {
            h hVarL0 = jVar.l0(this.F);
            int i2 = hVarL0.b;
            long j = hVarL0.a;
            byte[] bArr2 = new byte[i2];
            long j2 = j + 4;
            long jS0 = jVar.S0(j2);
            this.F = jS0;
            if (!jVar.Q0(jS0, i2, bArr2)) {
                this.E = jVar.H;
                return bArr;
            }
            this.F = jVar.S0(j2 + ((long) i2));
            this.E++;
            return bArr2;
        } catch (IOException e) {
            throw e;
        } catch (OutOfMemoryError unused) {
            jVar.P0();
            this.E = jVar.H;
            return bArr;
        }
    }

    @Override // java.util.Iterator
    public final void remove() throws IOException {
        j jVar = this.H;
        if (jVar.L != this.G) {
            sz6.c();
            return;
        }
        if (jVar.H == 0) {
            pmf.d();
        } else {
            if (this.E != 1) {
                pmf.n("Removal is only permitted from the head.");
                return;
            }
            jVar.O0(1);
            this.G = jVar.L;
            this.E--;
        }
    }
}
