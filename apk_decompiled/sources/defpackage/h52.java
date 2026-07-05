package defpackage;

import android.graphics.Bitmap;
import java.io.EOFException;
import okio.RealBufferedSink;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public final class h52 {
    public final kw9 a;
    public final kw9 b;
    public final long c;
    public final long d;
    public final boolean e;
    public final wg8 f;

    public h52(RealBufferedSource realBufferedSource) throws EOFException {
        g52 g52Var = new g52(this, 0);
        w1a w1aVar = w1a.G;
        this.a = yb5.w(w1aVar, g52Var);
        this.b = yb5.w(w1aVar, new g52(this, 1 == true ? 1 : 0));
        this.c = Long.parseLong(realBufferedSource.O(Long.MAX_VALUE));
        this.d = Long.parseLong(realBufferedSource.O(Long.MAX_VALUE));
        this.e = Integer.parseInt(realBufferedSource.O(Long.MAX_VALUE)) > 0;
        int i = Integer.parseInt(realBufferedSource.O(Long.MAX_VALUE));
        gmf gmfVar = new gmf(16);
        for (int i2 = 0; i2 < i; i2++) {
            String strO = realBufferedSource.O(Long.MAX_VALUE);
            Bitmap.Config[] configArr = l.a;
            int iF0 = bsg.F0(strO, ':', 0, 6);
            if (iF0 == -1) {
                mr9.q("Unexpected header: ".concat(strO));
                throw null;
            }
            gmfVar.u(bsg.k1(strO.substring(0, iF0)).toString(), strO.substring(iF0 + 1));
        }
        this.f = gmfVar.v();
    }

    public final void a(RealBufferedSink realBufferedSink) {
        realBufferedSink.d(this.c);
        realBufferedSink.writeByte(10);
        realBufferedSink.d(this.d);
        realBufferedSink.writeByte(10);
        realBufferedSink.d(this.e ? 1L : 0L);
        realBufferedSink.writeByte(10);
        wg8 wg8Var = this.f;
        realBufferedSink.d(wg8Var.size());
        realBufferedSink.writeByte(10);
        int size = wg8Var.size();
        for (int i = 0; i < size; i++) {
            realBufferedSink.W(wg8Var.e(i));
            realBufferedSink.W(": ");
            realBufferedSink.W(wg8Var.k(i));
            realBufferedSink.writeByte(10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h52(pqe pqeVar) {
        g52 g52Var = new g52(this, 0 == true ? 1 : 0);
        w1a w1aVar = w1a.G;
        this.a = yb5.w(w1aVar, g52Var);
        this.b = yb5.w(w1aVar, new g52(this, 1));
        this.c = pqeVar.P;
        this.d = pqeVar.Q;
        this.e = pqeVar.I != null;
        this.f = pqeVar.J;
    }
}
