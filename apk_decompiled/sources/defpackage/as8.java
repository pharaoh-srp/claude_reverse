package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import okio.ByteString;
import okio.Sink;
import okio.Socket;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public final class as8 implements y47 {
    public static final List g = blj.l(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = blj.l(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final g4e a;
    public final v4e b;
    public final zr8 c;
    public volatile gs8 d;
    public final bvd e;
    public volatile boolean f;

    public as8(hdc hdcVar, g4e g4eVar, v4e v4eVar, zr8 zr8Var) {
        hdcVar.getClass();
        zr8Var.getClass();
        this.a = g4eVar;
        this.b = v4eVar;
        this.c = zr8Var;
        List list = hdcVar.r;
        bvd bvdVar = bvd.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(bvdVar) ? bvdVar : bvd.HTTP_2;
    }

    @Override // defpackage.y47
    public final Source a(pqe pqeVar) {
        gs8 gs8Var = this.d;
        gs8Var.getClass();
        return gs8Var.L;
    }

    @Override // defpackage.y47
    public final void b(kie kieVar) throws IOException {
        int i;
        gs8 gs8Var;
        boolean z;
        kieVar.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = kieVar.d != null;
        wg8 wg8Var = kieVar.c;
        ArrayList arrayList = new ArrayList(wg8Var.size() + 4);
        arrayList.add(new tg8(kieVar.b, tg8.f));
        ByteString byteString = tg8.g;
        vs8 vs8Var = kieVar.a;
        vs8Var.getClass();
        String strB = vs8Var.b();
        String strD = vs8Var.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new tg8(strB, byteString));
        String strA = wg8Var.a("Host");
        if (strA != null) {
            arrayList.add(new tg8(strA, tg8.i));
        }
        arrayList.add(new tg8(vs8Var.a, tg8.h));
        int size = wg8Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strE = wg8Var.e(i2);
            Locale locale = Locale.US;
            String strN = ij0.n(locale, strE, locale);
            if (!g.contains(strN) || (strN.equals("te") && wg8Var.k(i2).equals("trailers"))) {
                arrayList.add(new tg8(strN, wg8Var.k(i2)));
            }
        }
        zr8 zr8Var = this.c;
        zr8Var.getClass();
        boolean z3 = !z2;
        synchronized (zr8Var.b0) {
            synchronized (zr8Var) {
                try {
                    if (zr8Var.I > 1073741823) {
                        zr8Var.f(xr6.REFUSED_STREAM);
                    }
                    if (zr8Var.J) {
                        throw new ConnectionShutdownException();
                    }
                    i = zr8Var.I;
                    zr8Var.I = i + 2;
                    gs8Var = new gs8(i, zr8Var, z3, false, null);
                    z = !z2 || zr8Var.Y >= zr8Var.Z || gs8Var.H >= gs8Var.I;
                    if (gs8Var.i()) {
                        zr8Var.F.put(Integer.valueOf(i), gs8Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zr8Var.b0.i(z3, i, arrayList);
        }
        if (z) {
            zr8Var.b0.flush();
        }
        this.d = gs8Var;
        boolean z4 = this.f;
        gs8 gs8Var2 = this.d;
        if (z4) {
            gs8Var2.getClass();
            gs8Var2.f(xr6.CANCEL);
            xh6.c("Canceled");
            return;
        }
        gs8Var2.getClass();
        fs8 fs8Var = gs8Var2.N;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fs8Var.i(j, timeUnit);
        gs8 gs8Var3 = this.d;
        gs8Var3.getClass();
        gs8Var3.O.i(this.b.h, timeUnit);
    }

    @Override // defpackage.y47
    public final void c() {
        gs8 gs8Var = this.d;
        gs8Var.getClass();
        gs8Var.M.close();
    }

    @Override // defpackage.y47
    public final void cancel() {
        this.f = true;
        gs8 gs8Var = this.d;
        if (gs8Var != null) {
            gs8Var.f(xr6.CANCEL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // defpackage.y47
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            r4 = this;
            gs8 r4 = r4.d
            r0 = 0
            if (r4 == 0) goto L20
            monitor-enter(r4)
            es8 r1 = r4.L     // Catch: java.lang.Throwable -> L17
            boolean r2 = r1.F     // Catch: java.lang.Throwable -> L17
            r3 = 1
            if (r2 == 0) goto L19
            okio.Buffer r1 = r1.H     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.F()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            r1 = r3
            goto L1a
        L17:
            r0 = move-exception
            goto L1e
        L19:
            r1 = r0
        L1a:
            monitor-exit(r4)
            if (r1 != r3) goto L20
            return r3
        L1e:
            monitor-exit(r4)
            throw r0
        L20:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as8.d():boolean");
    }

    @Override // defpackage.y47
    public final long e(pqe pqeVar) {
        if (js8.a(pqeVar)) {
            return blj.f(pqeVar);
        }
        return 0L;
    }

    @Override // defpackage.y47
    public final Sink f(kie kieVar, long j) {
        kieVar.getClass();
        gs8 gs8Var = this.d;
        gs8Var.getClass();
        return gs8Var.M;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    @Override // defpackage.y47
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nqe g(boolean r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as8.g(boolean):nqe");
    }

    @Override // defpackage.y47
    public final wg8 h() throws IOException {
        gs8 gs8Var = this.d;
        gs8Var.getClass();
        synchronized (gs8Var) {
            es8 es8Var = gs8Var.L;
            if (es8Var.F && es8Var.G.F() && gs8Var.L.H.F()) {
                wg8 wg8Var = gs8Var.L.I;
                if (wg8Var == null) {
                    wg8Var = wg8.F;
                }
                return wg8Var;
            }
            if (gs8Var.g() == null) {
                return null;
            }
            IOException iOException = gs8Var.Q;
            if (iOException != null) {
                throw iOException;
            }
            xr6 xr6VarG = gs8Var.g();
            xr6VarG.getClass();
            throw new StreamResetException(xr6VarG);
        }
    }

    @Override // defpackage.y47
    public final void i() {
        this.c.flush();
    }

    @Override // defpackage.y47
    public final Socket j() {
        gs8 gs8Var = this.d;
        gs8Var.getClass();
        return gs8Var;
    }

    @Override // defpackage.y47
    public final x47 k() {
        return this.a;
    }
}
