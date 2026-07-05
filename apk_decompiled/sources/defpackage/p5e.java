package defpackage;

import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okio.Base64;
import okio.Buffer;
import okio.ByteString;
import okio.Socket;

/* JADX INFO: loaded from: classes3.dex */
public final class p5e implements y6j, b7j {
    public static final List y = x44.W(bvd.HTTP_1_1);
    public final kie a;
    public final rkk b;
    public final Random c;
    public final long d;
    public z6j e;
    public final long f;
    public final long g;
    public final String h;
    public f4e i;
    public o5e j;
    public c7j k;
    public e7j l;
    public final m7h m;
    public String n;
    public fj0 o;
    public final ArrayDeque p;
    public final ArrayDeque q;
    public long r;
    public boolean s;
    public int t;
    public String u;
    public boolean v;
    public int w;
    public boolean x;

    public p5e(q7h q7hVar, kie kieVar, rkk rkkVar, Random random, long j, long j2, long j3) {
        q7hVar.getClass();
        kieVar.getClass();
        rkkVar.getClass();
        this.a = kieVar;
        this.b = rkkVar;
        this.c = random;
        this.d = j;
        this.e = null;
        this.f = j2;
        this.g = j3;
        this.m = q7hVar.d();
        this.p = new ArrayDeque();
        this.q = new ArrayDeque();
        this.t = -1;
        String str = kieVar.b;
        if (!"GET".equals(str)) {
            mr9.q(ij0.i("Request must be GET: ", str));
            throw null;
        }
        ByteString byteString = ByteString.H;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.h = Base64.b(ByteString.Companion.c(bArr).E);
    }

    public static void e(p5e p5eVar, Exception exc, pqe pqeVar, int i) {
        e7j e7jVar;
        if ((i & 2) != 0) {
            pqeVar = null;
        }
        int i2 = 0;
        boolean z = (i & 4) == 0;
        p5eVar.getClass();
        dae daeVar = new dae();
        synchronized (p5eVar) {
            try {
                if (p5eVar.v) {
                    return;
                }
                p5eVar.v = true;
                fj0 fj0Var = p5eVar.o;
                e7j e7jVar2 = p5eVar.l;
                daeVar.E = e7jVar2;
                p5eVar.l = null;
                if (!z && e7jVar2 != null) {
                    m7h.b(p5eVar.m, p5eVar.n + " writer close", 0L, new l5e(i2, daeVar), 2);
                }
                p5eVar.m.e();
                try {
                    p5eVar.b.l(p5eVar, exc, pqeVar);
                    if (fj0Var != null) {
                        fj0Var.cancel();
                    }
                    if (!z || (e7jVar = (e7j) daeVar.E) == null) {
                        return;
                    }
                    zkj.b(e7jVar);
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        f4e f4eVar = this.i;
        f4eVar.getClass();
        f4eVar.cancel();
    }

    public final Socket b(pqe pqeVar) {
        wg8 wg8Var = pqeVar.J;
        int i = pqeVar.H;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(vb7.s(sb, pqeVar.G, '\''));
        }
        String strA = wg8Var.a("Connection");
        if (strA == null) {
            strA = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strA)) {
            throw new ProtocolException(grc.n('\'', "Expected 'Connection' header value 'Upgrade' but was '", strA));
        }
        String strA2 = wg8Var.a("Upgrade");
        if (strA2 == null) {
            strA2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strA2)) {
            throw new ProtocolException(grc.n('\'', "Expected 'Upgrade' header value 'websocket' but was '", strA2));
        }
        String strA3 = wg8Var.a("Sec-WebSocket-Accept");
        if (strA3 == null) {
            strA3 = null;
        }
        ByteString byteString = ByteString.H;
        String strB = Base64.b(ByteString.Companion.b(this.h + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").d("SHA-1").E);
        if (strB.equals(strA3)) {
            Socket socket = pqeVar.L;
            if (socket != null) {
                return socket;
            }
            mr9.s("Web Socket socket missing: bad interceptor?");
            return null;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strB + "' but was '" + strA3 + '\'');
    }

    public final boolean c(int i, String str) {
        String str2;
        long j = this.g;
        synchronized (this) {
            ByteString byteStringB = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    ByteString byteString = ByteString.H;
                    byteStringB = ByteString.Companion.b(str);
                    if (byteStringB.E.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.v && !this.s) {
                    this.s = true;
                    this.q.add(new m5e(i, j, byteStringB));
                    g();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public final void d(hdc hdcVar) {
        kie kieVar = this.a;
        kieVar.getClass();
        if (kieVar.c.a("Sec-WebSocket-Extensions") != null) {
            e(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
            return;
        }
        gdc gdcVarB = hdcVar.b();
        TimeZone timeZone = blj.a;
        gdcVarB.e = new cd(17, tz6.a);
        gdcVarB.b(y);
        hdc hdcVar2 = new hdc(gdcVarB);
        jie jieVarB = kieVar.b();
        jieVarB.d("Upgrade", "websocket");
        jieVarB.d("Connection", "Upgrade");
        jieVarB.d("Sec-WebSocket-Key", this.h);
        jieVarB.d("Sec-WebSocket-Version", "13");
        jieVarB.d("Sec-WebSocket-Extensions", "permessage-deflate");
        kie kieVar2 = new kie(jieVarB);
        f4e f4eVar = new f4e(hdcVar2, kieVar2, true);
        this.i = f4eVar;
        f4eVar.d(new mvd(this, 1, kieVar2));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r11 = this;
            monitor-enter(r11)
            int r0 = r11.t     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r11.u     // Catch: java.lang.Throwable -> L3f
            c7j r2 = r11.k     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            r11.k = r3     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r11.s     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L46
            java.util.ArrayDeque r4 = r11.q     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L46
            e7j r4 = r11.l     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L41
            r11.l = r3     // Catch: java.lang.Throwable -> L3f
            m7h r5 = r11.m     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r3.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r11.n     // Catch: java.lang.Throwable -> L3f
            r3.append(r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = " writer close"
            r3.append(r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L3f
            pza r9 = new pza     // Catch: java.lang.Throwable -> L3f
            r3 = 16
            r9.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3f
            r10 = 2
            r7 = 0
            defpackage.m7h.b(r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r0 = move-exception
            goto L67
        L41:
            m7h r3 = r11.m     // Catch: java.lang.Throwable -> L3f
            r3.e()     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r3 = r11.v     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L55
            e7j r3 = r11.l     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L55
            int r3 = r11.t     // Catch: java.lang.Throwable -> L3f
            r4 = -1
            if (r3 == r4) goto L55
            r3 = 1
            goto L56
        L55:
            r3 = 0
        L56:
            monitor-exit(r11)
            if (r3 == 0) goto L61
            rkk r3 = r11.b
            r1.getClass()
            r3.j(r11, r0, r1)
        L61:
            if (r2 == 0) goto L66
            defpackage.zkj.b(r2)
        L66:
            return
        L67:
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p5e.f():void");
    }

    public final void g() {
        TimeZone timeZone = blj.a;
        o5e o5eVar = this.j;
        if (o5eVar != null) {
            this.m.c(o5eVar, 0L);
        }
    }

    public final synchronized boolean h(int i, ByteString byteString) {
        if (!this.v && !this.s) {
            long j = this.r;
            byte[] bArr = byteString.E;
            if (((long) bArr.length) + j > 16777216) {
                c(1001, null);
                return false;
            }
            this.r = j + ((long) bArr.length);
            this.q.add(new n5e(i, byteString));
            g();
            return true;
        }
        return false;
    }

    public final boolean i(String str) {
        ByteString byteString = ByteString.H;
        return h(1, ByteString.Companion.b(str));
    }

    public final boolean j() {
        e7j e7jVar;
        Object obj;
        String str;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.v) {
                    return false;
                }
                e7j e7jVar2 = this.l;
                Object objPoll = this.p.poll();
                String str2 = null;
                int i = -1;
                if (objPoll == null) {
                    Object objPoll2 = this.q.poll();
                    if (objPoll2 instanceof m5e) {
                        int i2 = this.t;
                        str = this.u;
                        if (i2 != -1) {
                            e7j e7jVar3 = this.l;
                            this.l = null;
                            if (e7jVar3 != null && this.k == null) {
                                z = true;
                            }
                            this.m.e();
                            e7jVar = e7jVar3;
                            i = i2;
                            obj = objPoll2;
                        } else {
                            long j = ((m5e) objPoll2).c;
                            m7h.b(this.m, this.n + " cancel", TimeUnit.MILLISECONDS.toNanos(j), new pza(17, this), 4);
                            i = i2;
                            obj = objPoll2;
                            e7jVar = null;
                        }
                    } else {
                        if (objPoll2 == null) {
                            return false;
                        }
                        str = null;
                        obj = objPoll2;
                        e7jVar = null;
                    }
                } else {
                    e7jVar = null;
                    obj = null;
                    str = null;
                }
                try {
                    if (objPoll != null) {
                        e7jVar2.getClass();
                        e7jVar2.c(10, (ByteString) objPoll);
                    } else if (obj instanceof n5e) {
                        e7jVar2.getClass();
                        e7jVar2.d(((n5e) obj).a, ((n5e) obj).b);
                        synchronized (this) {
                            this.r -= (long) ((n5e) obj).b.E.length;
                        }
                    } else {
                        if (!(obj instanceof m5e)) {
                            throw new AssertionError();
                        }
                        e7jVar2.getClass();
                        int i3 = ((m5e) obj).a;
                        ByteString byteString = ((m5e) obj).b;
                        ByteString byteStringT = ByteString.H;
                        if (i3 != 0 || byteString != null) {
                            if (i3 != 0) {
                                if (i3 < 1000 || i3 >= 5000) {
                                    str2 = "Code must be in range [1000,5000): " + i3;
                                } else if ((1004 <= i3 && i3 < 1007) || (1015 <= i3 && i3 < 3000)) {
                                    str2 = "Code " + i3 + " is reserved and may not be used.";
                                }
                                if (str2 != null) {
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            Buffer buffer = new Buffer();
                            buffer.R0(i3);
                            if (byteString != null) {
                                buffer.r0(byteString);
                            }
                            byteStringT = buffer.t(buffer.F);
                        }
                        try {
                            e7jVar2.c(8, byteStringT);
                            if (z) {
                                rkk rkkVar = this.b;
                                str.getClass();
                                rkkVar.j(this, i, str);
                            }
                        } finally {
                            e7jVar2.L = true;
                        }
                    }
                    return true;
                } finally {
                    if (e7jVar != null) {
                        zkj.b(e7jVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
