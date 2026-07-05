package defpackage;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i99 implements dsb {
    public boolean E;
    public Object F;
    public Object G;

    public static void i(BufferedInputStream bufferedInputStream, long j) throws IOException {
        while (j > 0) {
            long jSkip = bufferedInputStream.skip(j);
            if (jSkip != 0) {
                j -= jSkip;
            } else {
                if (bufferedInputStream.read() == -1) {
                    throw new EOFException("Unexpected end of stream while skipping bytes");
                }
                j--;
            }
        }
    }

    @Override // defpackage.dsb
    public boolean a(long j) {
        m2a m2aVar;
        zhh zhhVar = (zhh) this.G;
        if (!zhhVar.q() || zhhVar.t().a.F.length() == 0 || (m2aVar = zhhVar.d) == null || m2aVar.d() == null) {
            return false;
        }
        j(zhhVar.t(), j, false, unb.M);
        return true;
    }

    @Override // defpackage.dsb
    public void b() {
        if (this.E) {
            zhh.b((zhh) this.G, (kkh) this.F);
        }
    }

    @Override // defpackage.dsb
    public boolean c(long j, phf phfVar, int i) {
        m2a m2aVar;
        zhh zhhVar = (zhh) this.G;
        if (!zhhVar.q() || zhhVar.t().a.F.length() == 0 || (m2aVar = zhhVar.d) == null || m2aVar.d() == null) {
            return false;
        }
        bt7 bt7Var = zhhVar.m;
        if (bt7Var != null) {
            bt7.a(bt7Var);
        }
        zhhVar.p = j;
        zhhVar.u = -1;
        zhhVar.m(true);
        long j2 = j(zhhVar.t(), zhhVar.p, true, phfVar);
        if (i >= 2) {
            this.E = true;
            this.F = new kkh(j2);
        }
        return true;
    }

    public boolean d(long j) {
        Object obj;
        List listL0 = ((i49) this.G).L0();
        int size = listL0.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = listL0.get(i);
            if (csg.u(((b8d) obj).d(), j)) {
                break;
            }
            i++;
        }
        b8d b8dVar = (b8d) obj;
        if (b8dVar != null) {
            return b8dVar.a();
        }
        return false;
    }

    @Override // defpackage.dsb
    public boolean e(long j, phf phfVar) {
        m2a m2aVar;
        zhh zhhVar = (zhh) this.G;
        if (!zhhVar.q() || zhhVar.t().a.F.length() == 0 || (m2aVar = zhhVar.d) == null || m2aVar.d() == null) {
            return false;
        }
        j(zhhVar.t(), j, false, phfVar);
        return true;
    }

    @Override // defpackage.dsb
    public boolean f(long j) {
        zhh zhhVar = (zhh) this.G;
        m2a m2aVar = zhhVar.d;
        if (m2aVar == null || m2aVar.d() == null || !zhhVar.q()) {
            return false;
        }
        zhhVar.u = -1;
        bt7 bt7Var = zhhVar.m;
        if (bt7Var != null) {
            bt7.a(bt7Var);
        }
        j(zhhVar.t(), j, false, unb.M);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:5:0x0011, B:6:0x001b, B:8:0x0023, B:21:0x0056, B:13:0x0036, B:15:0x003e, B:18:0x0045, B:20:0x004d, B:24:0x005d, B:27:0x0067), top: B:50:0x0011, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.sentry.android.core.c1 g(java.io.BufferedInputStream r8, int r9, java.io.File r10) {
        /*
            r7 = this;
            java.lang.Object r7 = r7.F
            io.sentry.android.core.SentryAndroidOptions r7 = (io.sentry.android.core.SentryAndroidOptions) r7
            r0 = 0
            io.sentry.android.core.b1 r1 = new io.sentry.android.core.b1     // Catch: java.lang.Throwable -> L78
            r1.<init>(r8, r9)     // Catch: java.lang.Throwable -> L78
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L7a
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L7a
            r8.<init>(r1, r9)     // Catch: java.lang.Throwable -> L7a
            io.sentry.l2 r9 = new io.sentry.l2     // Catch: java.lang.Throwable -> L43
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L43
            r9.beginObject()     // Catch: java.lang.Throwable -> L43
            r2 = r0
            r3 = r2
        L1b:
            io.sentry.vendor.gson.stream.b r4 = r9.peek()     // Catch: java.lang.Throwable -> L43
            io.sentry.vendor.gson.stream.b r5 = io.sentry.vendor.gson.stream.b.NAME     // Catch: java.lang.Throwable -> L43
            if (r4 != r5) goto L5d
            java.lang.String r4 = r9.nextName()     // Catch: java.lang.Throwable -> L43
            int r5 = r4.hashCode()     // Catch: java.lang.Throwable -> L43
            r6 = 55126294(0x3492916, float:5.9115755E-37)
            if (r5 == r6) goto L45
            r6 = 1874684019(0x6fbd6873, float:1.1723788E29)
            if (r5 == r6) goto L36
            goto L56
        L36:
            java.lang.String r5 = "platform"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L56
            java.lang.String r2 = r9.I()     // Catch: java.lang.Throwable -> L43
            goto L59
        L43:
            r9 = move-exception
            goto L7c
        L45:
            java.lang.String r5 = "timestamp"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L56
            io.sentry.a1 r3 = r7.getLogger()     // Catch: java.lang.Throwable -> L43
            java.util.Date r3 = r9.a0(r3)     // Catch: java.lang.Throwable -> L43
            goto L59
        L56:
            r9.skipValue()     // Catch: java.lang.Throwable -> L43
        L59:
            if (r2 == 0) goto L1b
            if (r3 == 0) goto L1b
        L5d:
            java.lang.String r9 = "native"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> L43
            if (r9 == 0) goto L71
            if (r3 == 0) goto L71
            io.sentry.android.core.c1 r9 = new io.sentry.android.core.c1     // Catch: java.lang.Throwable -> L43
            long r2 = r3.getTime()     // Catch: java.lang.Throwable -> L43
            r9.<init>(r10, r2)     // Catch: java.lang.Throwable -> L43
            r0 = r9
        L71:
            r8.close()     // Catch: java.lang.Throwable -> L7a
            r1.close()     // Catch: java.lang.Throwable -> L78
            return r0
        L78:
            r8 = move-exception
            goto L8e
        L7a:
            r8 = move-exception
            goto L85
        L7c:
            r8.close()     // Catch: java.lang.Throwable -> L80
            goto L84
        L80:
            r8 = move-exception
            r9.addSuppressed(r8)     // Catch: java.lang.Throwable -> L7a
        L84:
            throw r9     // Catch: java.lang.Throwable -> L7a
        L85:
            r1.close()     // Catch: java.lang.Throwable -> L89
            goto L8d
        L89:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L78
        L8d:
            throw r8     // Catch: java.lang.Throwable -> L78
        L8e:
            io.sentry.a1 r7 = r7.getLogger()
            io.sentry.t5 r9 = io.sentry.t5.DEBUG
            java.lang.String r10 = r10.getName()
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r1 = "Error parsing event JSON from: %s"
            r7.b(r9, r8, r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i99.g(java.io.BufferedInputStream, int, java.io.File):io.sentry.android.core.c1");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0011, B:5:0x001b, B:7:0x0023, B:20:0x0052, B:12:0x0036, B:14:0x003e, B:17:0x0045, B:19:0x004d, B:24:0x005b), top: B:38:0x0011, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ep1 h(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L64
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L64
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L64
            byte[] r8 = r8.getBytes(r3)     // Catch: java.lang.Throwable -> L64
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L64
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L64
            io.sentry.l2 r8 = new io.sentry.l2     // Catch: java.lang.Throwable -> L43
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L43
            r8.beginObject()     // Catch: java.lang.Throwable -> L43
            r2 = -1
            r3 = r0
        L1b:
            io.sentry.vendor.gson.stream.b r4 = r8.peek()     // Catch: java.lang.Throwable -> L43
            io.sentry.vendor.gson.stream.b r5 = io.sentry.vendor.gson.stream.b.NAME     // Catch: java.lang.Throwable -> L43
            if (r4 != r5) goto L59
            java.lang.String r4 = r8.nextName()     // Catch: java.lang.Throwable -> L43
            int r5 = r4.hashCode()     // Catch: java.lang.Throwable -> L43
            r6 = -1106363674(0xffffffffbe0e3ae6, float:-0.13889655)
            if (r5 == r6) goto L45
            r6 = 3575610(0x368f3a, float:5.010497E-39)
            if (r5 == r6) goto L36
            goto L52
        L36:
            java.lang.String r5 = "type"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L52
            java.lang.String r3 = r8.I()     // Catch: java.lang.Throwable -> L43
            goto L55
        L43:
            r8 = move-exception
            goto L6a
        L45:
            java.lang.String r5 = "length"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L52
            int r2 = r8.nextInt()     // Catch: java.lang.Throwable -> L43
            goto L55
        L52:
            r8.skipValue()     // Catch: java.lang.Throwable -> L43
        L55:
            if (r3 == 0) goto L1b
            if (r2 < 0) goto L1b
        L59:
            if (r2 < 0) goto L66
            ep1 r8 = new ep1     // Catch: java.lang.Throwable -> L43
            r8.<init>(r3, r2)     // Catch: java.lang.Throwable -> L43
            r1.close()     // Catch: java.lang.Throwable -> L64
            return r8
        L64:
            r8 = move-exception
            goto L73
        L66:
            r1.close()     // Catch: java.lang.Throwable -> L64
            return r0
        L6a:
            r1.close()     // Catch: java.lang.Throwable -> L6e
            goto L72
        L6e:
            r1 = move-exception
            r8.addSuppressed(r1)     // Catch: java.lang.Throwable -> L64
        L72:
            throw r8     // Catch: java.lang.Throwable -> L64
        L73:
            java.lang.Object r7 = r7.F
            io.sentry.android.core.SentryAndroidOptions r7 = (io.sentry.android.core.SentryAndroidOptions) r7
            io.sentry.a1 r7 = r7.getLogger()
            io.sentry.t5 r1 = io.sentry.t5.DEBUG
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Error parsing item header"
            r7.b(r1, r8, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i99.h(java.lang.String):ep1");
    }

    public long j(cjh cjhVar, long j, boolean z, phf phfVar) {
        zhh zhhVar = (zhh) this.G;
        long jC = zhh.c(zhhVar, cjhVar, j, z, false, phfVar, false, null);
        if (!kkh.b(jC, (kkh) this.F)) {
            this.E = false;
        }
        zhhVar.x(kkh.d(jC) ? we8.G : we8.F);
        return jC;
    }

    public void k(m2l m2lVar) {
        synchronized (this.F) {
            try {
                if (((ArrayDeque) this.G) == null) {
                    this.G = new ArrayDeque();
                }
                ((ArrayDeque) this.G).add(m2lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(d5h d5hVar) {
        m2l m2lVar;
        synchronized (this.F) {
            if (((ArrayDeque) this.G) != null && !this.E) {
                this.E = true;
                while (true) {
                    synchronized (this.F) {
                        try {
                            m2lVar = (m2l) ((ArrayDeque) this.G).poll();
                            if (m2lVar == null) {
                                this.E = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    m2lVar.b(d5hVar);
                }
            }
        }
    }
}
