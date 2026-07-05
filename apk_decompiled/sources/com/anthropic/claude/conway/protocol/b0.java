package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.conway.protocol.StreamMessage;
import defpackage.a4e;
import defpackage.aid;
import defpackage.amg;
import defpackage.bmg;
import defpackage.bqg;
import defpackage.bsg;
import defpackage.cqg;
import defpackage.ex4;
import defpackage.f4e;
import defpackage.fkg;
import defpackage.gb9;
import defpackage.grc;
import defpackage.gsk;
import defpackage.h86;
import defpackage.hdc;
import defpackage.hre;
import defpackage.ide;
import defpackage.ih9;
import defpackage.ij0;
import defpackage.iuj;
import defpackage.j8;
import defpackage.jie;
import defpackage.kie;
import defpackage.knk;
import defpackage.mt4;
import defpackage.n30;
import defpackage.n61;
import defpackage.nai;
import defpackage.p8b;
import defpackage.pqe;
import defpackage.py3;
import defpackage.qq0;
import defpackage.sfa;
import defpackage.t74;
import defpackage.tp4;
import defpackage.vb7;
import defpackage.vn4;
import defpackage.vp4;
import defpackage.x44;
import defpackage.xh6;
import defpackage.yfa;
import defpackage.zfa;
import defpackage.zn;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {
    public static final p8b q;
    public final String a;
    public final Map b;
    public final hdc c;
    public final h86 d;
    public final String e;
    public final List f;
    public final String g;
    public final AtomicLong h;
    public final AtomicReference i;
    public final amg j;
    public int k;
    public final amg l;
    public final a4e m;
    public long n;
    public volatile boolean o;
    public final a4e p;

    static {
        ide ideVar = p8b.e;
        q = nai.D("application/json");
    }

    public b0(String str, Map map, hdc hdcVar, h86 h86Var, ArrayList arrayList, String str2, String str3) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = map;
        this.c = hdcVar;
        this.d = h86Var;
        this.e = "claude-android";
        this.f = arrayList;
        this.g = str3;
        this.h = new AtomicLong(0L);
        this.i = new AtomicReference(str2);
        Boolean bool = Boolean.FALSE;
        amg amgVarA = bmg.a(bool);
        this.j = amgVarA;
        amg amgVarA2 = bmg.a(bool);
        this.l = amgVarA2;
        this.m = j8.k(amgVarA2);
        this.p = j8.k(amgVarA);
    }

    public static final f4e a(b0 b0Var, String str) {
        hdc hdcVar = b0Var.c;
        jie jieVar = new jie();
        jieVar.g(b0Var.a + "/stream?client_id=" + str);
        jieVar.d("Accept", "application/x-ndjson");
        jieVar.d("X-Client-Id", str);
        b0Var.f(jieVar);
        jieVar.c();
        return new f4e(hdcVar, new kie(jieVar), false);
    }

    public static final void b(b0 b0Var, aid aidVar, f4e f4eVar, py3 py3Var, vn4 vn4Var) throws IOException {
        String line;
        Object hreVar;
        pqe pqeVarF = f4eVar.f();
        boolean z = true;
        CancellationException cancellationException = null;
        boolean z2 = false;
        if (!pqeVarF.U) {
            if (pqeVarF.H != 410) {
                pqeVarF.close();
                xh6.c(grc.p(pqeVarF.H, "Stream open rejected: HTTP "));
                return;
            }
            String strF = pqeVarF.K.f();
            pqeVarF.close();
            try {
                ih9 ih9Var = ex4.a;
                ih9Var.getClass();
                hreVar = ((ContainerGoneBody) ih9Var.b(strF, ContainerGoneBody.Companion.serializer())).getCurrentContainerId();
            } catch (Throwable th) {
                hreVar = new hre(th);
            }
            String str = (String) (hreVar instanceof hre ? null : hreVar);
            py3Var.invoke(new bqg(str));
            b0Var.o = true;
            xh6.c(ij0.i("Container gone (410); new=", str));
            return;
        }
        AtomicLong atomicLong = new AtomicLong(System.currentTimeMillis());
        fkg fkgVarD = gb9.D(aidVar, null, null, new t74((Object) atomicLong, (Object) f4eVar, (tp4) (z2 ? 1 : 0), 12), 3);
        try {
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(pqeVarF.K.G0().M0()));
                    while (knk.B(vn4Var.getContext()) && (line = bufferedReader.readLine()) != null) {
                        try {
                            if (!bsg.I0(line)) {
                                atomicLong.set(System.currentTimeMillis());
                                if (z) {
                                    sfa sfaVar = sfa.INFO;
                                    zfa.a.getClass();
                                    if (yfa.b()) {
                                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj : copyOnWriteArrayList) {
                                            ((n30) ((zfa) obj)).getClass();
                                            arrayList.add(obj);
                                        }
                                        if (!arrayList.isEmpty()) {
                                            zfa.a.getClass();
                                            String str2 = "✓ First stream message: " + bsg.j1(200, line);
                                            Iterator it = arrayList.iterator();
                                            while (it.hasNext()) {
                                                ((n30) ((zfa) it.next())).b(sfaVar, "Conway", str2);
                                            }
                                        }
                                    }
                                    z = false;
                                }
                                b0Var.j(aidVar, line, py3Var);
                            }
                        } finally {
                        }
                    }
                    bufferedReader.close();
                    pqeVarF.close();
                } finally {
                    fkgVarD.d(null);
                }
            } finally {
            }
        } catch (SocketTimeoutException e) {
            throw new IOException("Stream socket timeout", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.anthropic.claude.conway.protocol.b0 r13, defpackage.vp4 r14) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.protocol.b0.c(com.anthropic.claude.conway.protocol.b0, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.anthropic.claude.conway.protocol.b0 r6, java.lang.String r7, defpackage.vp4 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.uz4
            if (r0 == 0) goto L13
            r0 = r8
            uz4 r0 = (defpackage.uz4) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            uz4 r0 = new uz4
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.sf5.h0(r8)
            goto L58
        L26:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r3
        L2c:
            defpackage.sf5.h0(r8)
            ih9 r8 = defpackage.ex4.a
            com.anthropic.claude.conway.protocol.HealthResponse r1 = new com.anthropic.claude.conway.protocol.HealthResponse
            com.anthropic.claude.conway.protocol.HealthResponse$Result r4 = new com.anthropic.claude.conway.protocol.HealthResponse$Result
            r5 = 2
            r4.<init>(r2, r3, r5, r3)
            r1.<init>(r7, r4)
            r8.getClass()
            nl8 r7 = com.anthropic.claude.conway.protocol.HealthResponse.Companion
            kotlinx.serialization.KSerializer r7 = r7.serializer()
            znf r7 = (defpackage.znf) r7
            java.lang.String r7 = r8.d(r1, r7)
            r0.G = r2
            java.lang.String r8 = "/health_response"
            java.lang.Object r6 = m(r6, r8, r7, r0)
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L58
            return r7
        L58:
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.protocol.b0.d(com.anthropic.claude.conway.protocol.b0, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.anthropic.claude.conway.protocol.b0 r14, long r15, defpackage.vp4 r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof defpackage.vz4
            if (r1 == 0) goto L15
            r1 = r0
            vz4 r1 = (defpackage.vz4) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.G = r2
            goto L1a
        L15:
            vz4 r1 = new vz4
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.E
            int r2 = r1.G
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.sf5.h0(r0)
            goto L62
        L27:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r14)
            r14 = 0
            return r14
        L2e:
            defpackage.sf5.h0(r0)
            ih9 r0 = defpackage.ex4.a
            com.anthropic.claude.conway.protocol.PongMessage r4 = new com.anthropic.claude.conway.protocol.PongMessage
            java.util.concurrent.atomic.AtomicLong r2 = r14.h
            long r6 = r2.incrementAndGet()
            long r8 = java.lang.System.currentTimeMillis()
            r12 = 1
            r13 = 0
            r5 = 0
            r10 = r15
            r4.<init>(r5, r6, r8, r10, r12, r13)
            r0.getClass()
            a9d r2 = com.anthropic.claude.conway.protocol.PongMessage.Companion
            kotlinx.serialization.KSerializer r2 = r2.serializer()
            znf r2 = (defpackage.znf) r2
            java.lang.String r0 = r0.d(r4, r2)
            r1.G = r3
            java.lang.String r2 = "/pong"
            java.lang.Object r14 = m(r14, r2, r0, r1)
            m45 r0 = defpackage.m45.E
            if (r14 != r0) goto L62
            return r0
        L62:
            iei r14 = defpackage.iei.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.protocol.b0.e(com.anthropic.claude.conway.protocol.b0, long, vp4):java.lang.Object");
    }

    public static Object i(b0 b0Var, long j, defpackage.p0 p0Var) {
        return gb9.c0(b0Var.d.b(), new n61(b0Var, j, null, 1), p0Var);
    }

    public static Object m(b0 b0Var, String str, String str2, vp4 vp4Var) {
        return gb9.c0(b0Var.d.b(), new qq0(b0Var, str, str2, (String) null, (tp4) null), vp4Var);
    }

    public final void f(jie jieVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            jieVar.d((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r6, defpackage.vp4 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.kz4
            if (r0 == 0) goto L13
            r0 = r7
            kz4 r0 = (defpackage.kz4) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            kz4 r0 = new kz4
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.G
            int r1 = r0.I
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            s06 r5 = r0.F
            s06 r5 = (defpackage.s06) r5
            ih9 r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L6a
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L32:
            defpackage.sf5.h0(r7)
            ih9 r7 = defpackage.ex4.a
            a75 r1 = com.anthropic.claude.conway.protocol.CreateForkResponse.Companion
            kotlinx.serialization.KSerializer r1 = r1.serializer()
            s06 r1 = (defpackage.s06) r1
            com.anthropic.claude.conway.protocol.CreateForkRequest r4 = new com.anthropic.claude.conway.protocol.CreateForkRequest
            r4.<init>(r2, r6)
            r7.getClass()
            y65 r6 = com.anthropic.claude.conway.protocol.CreateForkRequest.Companion
            kotlinx.serialization.KSerializer r6 = r6.serializer()
            znf r6 = (defpackage.znf) r6
            java.lang.String r6 = r7.d(r4, r6)
            r0.E = r7
            r2 = r1
            s06 r2 = (defpackage.s06) r2
            r0.F = r2
            r0.I = r3
            java.lang.String r2 = "/sandbox/fork"
            java.lang.Object r5 = m(r5, r2, r6, r0)
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L67
            return r6
        L67:
            r6 = r7
            r7 = r5
            r5 = r1
        L6a:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r6.b(r7, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.protocol.b0.g(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r7, defpackage.vp4 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.nz4
            if (r0 == 0) goto L13
            r0 = r8
            nz4 r0 = (defpackage.nz4) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            nz4 r0 = new nz4
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.G
            int r1 = r0.I
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            s06 r6 = r0.F
            s06 r6 = (defpackage.s06) r6
            ih9 r7 = r0.E
            defpackage.sf5.h0(r8)
            goto L68
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r2
        L32:
            defpackage.sf5.h0(r8)
            ih9 r8 = defpackage.ex4.a
            ew7 r1 = com.anthropic.claude.conway.protocol.ForkPrefixResponse.Companion
            kotlinx.serialization.KSerializer r1 = r1.serializer()
            s06 r1 = (defpackage.s06) r1
            java.lang.String r4 = "/sandbox/fork/"
            java.lang.String r5 = "/prefix"
            java.lang.String r7 = defpackage.ij0.j(r4, r7, r5)
            r0.E = r8
            r4 = r1
            s06 r4 = (defpackage.s06) r4
            r0.F = r4
            r0.I = r3
            h86 r3 = r6.d
            e45 r3 = r3.b()
            lz4 r4 = new lz4
            r5 = 0
            r4.<init>(r6, r7, r2, r5)
            java.lang.Object r6 = defpackage.gb9.c0(r3, r4, r0)
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L65
            return r7
        L65:
            r7 = r8
            r8 = r6
            r6 = r1
        L68:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r7.b(r8, r6)
            com.anthropic.claude.conway.protocol.ForkPrefixResponse r6 = (com.anthropic.claude.conway.protocol.ForkPrefixResponse) r6
            java.util.List r6 = r6.getMessages()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.protocol.b0.h(java.lang.String, vp4):java.lang.Object");
    }

    public final void j(aid aidVar, String str, py3 py3Var) {
        sfa sfaVar = sfa.INFO;
        sfa sfaVar2 = sfa.WARN;
        try {
            ih9 ih9Var = ex4.a;
            ih9Var.getClass();
            StreamMessage streamMessage = (StreamMessage) ih9Var.b(str, StreamMessage.Companion.serializer());
            if (!(streamMessage instanceof StreamMessage.Connected) && streamMessage.getSeq() != this.n + 1) {
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(aidVar);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        long j = this.n + 1;
                        long seq = streamMessage.getSeq();
                        StringBuilder sbW = grc.w(j, "Seq gap: expected ", ", got ");
                        sbW.append(seq);
                        String string = sbW.toString();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar2, strE, string);
                        }
                    }
                }
                py3Var.invoke(new cqg(this.n + 1, streamMessage.getSeq()));
            }
            this.n = streamMessage.getSeq();
            if (streamMessage instanceof StreamMessage.Heartbeat) {
                gb9.D(aidVar, null, null, new z(this, streamMessage, null), 3);
                return;
            }
            if (streamMessage instanceof StreamMessage.HealthProbe) {
                gb9.D(aidVar, null, null, new a0(this, streamMessage, null), 3);
                return;
            }
            if (streamMessage instanceof StreamMessage.Goodbye) {
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE2 = iuj.E(aidVar);
                    CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : copyOnWriteArrayList2) {
                        ((n30) ((zfa) obj2)).getClass();
                        arrayList2.add(obj2);
                    }
                    if (!arrayList2.isEmpty()) {
                        zfa.a.getClass();
                        String strI = ij0.i("Server goodbye: ", ((StreamMessage.Goodbye) streamMessage).getReason());
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfaVar, strE2, strI);
                        }
                    }
                }
                if (x44.r(((StreamMessage.Goodbye) streamMessage).getReason(), "replaced_by_same_host")) {
                    this.o = true;
                }
                py3Var.invoke(streamMessage);
                return;
            }
            if (!(streamMessage instanceof StreamMessage.Shutdown)) {
                if (!(streamMessage instanceof StreamMessage.Connected)) {
                    py3Var.invoke(streamMessage);
                    return;
                }
                this.k = 0;
                amg amgVar = this.l;
                Boolean bool = Boolean.FALSE;
                amgVar.getClass();
                amgVar.n(null, bool);
                amg amgVar2 = this.j;
                Boolean bool2 = Boolean.TRUE;
                amgVar2.getClass();
                amgVar2.n(null, bool2);
                py3Var.invoke(streamMessage);
                return;
            }
            zfa.a.getClass();
            if (yfa.b()) {
                String strE3 = iuj.E(aidVar);
                CopyOnWriteArrayList copyOnWriteArrayList3 = yfa.b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : copyOnWriteArrayList3) {
                    ((n30) ((zfa) obj3)).getClass();
                    arrayList3.add(obj3);
                }
                if (!arrayList3.isEmpty()) {
                    zfa.a.getClass();
                    StreamMessage.Shutdown shutdown = (StreamMessage.Shutdown) streamMessage;
                    StringBuilder sbW2 = vb7.w("Server shutdown: ", shutdown.getReason(), " (wait ", shutdown.getWaitMs());
                    sbW2.append("ms)");
                    String string2 = sbW2.toString();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        ((n30) ((zfa) it3.next())).b(sfaVar, strE3, string2);
                    }
                }
            }
            py3Var.invoke(streamMessage);
        } catch (Exception e) {
            zfa.a.getClass();
            if (yfa.b()) {
                String strE4 = iuj.E(aidVar);
                CopyOnWriteArrayList copyOnWriteArrayList4 = yfa.b;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : copyOnWriteArrayList4) {
                    ((n30) ((zfa) obj4)).getClass();
                    arrayList4.add(obj4);
                }
                if (arrayList4.isEmpty()) {
                    return;
                }
                zfa.a.getClass();
                String strK = ij0.k("Dropped unparseable line (", bsg.j1(120, str), "): ", gsk.c(e));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    ((n30) ((zfa) it4.next())).b(sfaVar2, strE4, strK);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.oz4
            if (r0 == 0) goto L13
            r0 = r6
            oz4 r0 = (defpackage.oz4) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            oz4 r0 = new oz4
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r6)
            goto L4f
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "/sandbox/fork/"
            r6.<init>(r1)
            r6.append(r5)
            java.lang.String r5 = "/join"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.G = r2
            java.lang.String r6 = "{}"
            java.lang.Object r4 = m(r4, r5, r6, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L4f
            return r5
        L4f:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.protocol.b0.k(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.vp4 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.pz4
            if (r0 == 0) goto L13
            r0 = r8
            pz4 r0 = (defpackage.pz4) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            pz4 r0 = new pz4
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.G
            int r1 = r0.I
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            uo0 r7 = r0.F
            ih9 r0 = r0.E
            defpackage.sf5.h0(r8)
            goto L5f
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L30:
            defpackage.sf5.h0(r8)
            ih9 r8 = defpackage.ex4.a
            yv4 r1 = com.anthropic.claude.conway.protocol.ConwayForkMeta.Companion
            kotlinx.serialization.KSerializer r1 = r1.serializer()
            uo0 r1 = defpackage.d4c.t(r1)
            r0.E = r8
            r0.F = r1
            r0.I = r3
            h86 r3 = r7.d
            e45 r3 = r3.b()
            lz4 r4 = new lz4
            r5 = 0
            java.lang.String r6 = "/sandbox/fork"
            r4.<init>(r7, r6, r2, r5)
            java.lang.Object r7 = defpackage.gb9.c0(r3, r4, r0)
            m45 r0 = defpackage.m45.E
            if (r7 != r0) goto L5c
            return r0
        L5c:
            r0 = r8
            r8 = r7
            r7 = r1
        L5f:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.b(r8, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.protocol.b0.l(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r5, java.lang.String r6, defpackage.vp4 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.rz4
            if (r0 == 0) goto L13
            r0 = r7
            rz4 r0 = (defpackage.rz4) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            rz4 r0 = new rz4
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r7)
            goto L52
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r7)
            ih9 r7 = defpackage.ex4.a
            com.anthropic.claude.conway.protocol.ResolveClientPermissionRequest r1 = new com.anthropic.claude.conway.protocol.ResolveClientPermissionRequest
            r1.<init>(r5, r6)
            r7.getClass()
            fne r5 = com.anthropic.claude.conway.protocol.ResolveClientPermissionRequest.Companion
            kotlinx.serialization.KSerializer r5 = r5.serializer()
            znf r5 = (defpackage.znf) r5
            java.lang.String r5 = r7.d(r1, r5)
            r0.G = r2
            java.lang.String r6 = "/client-permission"
            java.lang.Object r4 = m(r4, r6, r5, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L52
            return r5
        L52:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.protocol.b0.n(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r11, defpackage.vp4 r12) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.protocol.b0.o(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.util.List r5, boolean r6, java.lang.String r7, defpackage.vp4 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.tz4
            if (r0 == 0) goto L13
            r0 = r8
            tz4 r0 = (defpackage.tz4) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            tz4 r0 = new tz4
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.sf5.h0(r8)
            goto L55
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2c:
            defpackage.sf5.h0(r8)
            ih9 r8 = defpackage.ex4.a
            com.anthropic.claude.conway.protocol.ChatSendRequest r1 = new com.anthropic.claude.conway.protocol.ChatSendRequest
            if (r7 != 0) goto L36
            r7 = r3
        L36:
            r1.<init>(r5, r6, r7)
            r8.getClass()
            ra3 r5 = com.anthropic.claude.conway.protocol.ChatSendRequest.Companion
            kotlinx.serialization.KSerializer r5 = r5.serializer()
            znf r5 = (defpackage.znf) r5
            java.lang.String r5 = r8.d(r1, r5)
            r0.G = r2
            java.lang.String r6 = "/sandbox/chat"
            java.lang.Object r4 = m(r4, r6, r5, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L55
            return r5
        L55:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.protocol.b0.p(java.util.List, boolean, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r14, boolean r15, java.lang.String r16, java.lang.String r17, defpackage.vp4 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.protocol.b0.q(java.lang.String, boolean, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.String r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.xz4
            if (r0 == 0) goto L13
            r0 = r6
            xz4 r0 = (defpackage.xz4) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            xz4 r0 = new xz4
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.sf5.h0(r6)
            goto L52
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2c:
            defpackage.sf5.h0(r6)
            ih9 r6 = defpackage.ex4.a
            com.anthropic.claude.conway.protocol.SetModelRequest r1 = new com.anthropic.claude.conway.protocol.SetModelRequest
            r1.<init>(r5, r3)
            r6.getClass()
            twf r5 = com.anthropic.claude.conway.protocol.SetModelRequest.Companion
            kotlinx.serialization.KSerializer r5 = r5.serializer()
            znf r5 = (defpackage.znf) r5
            java.lang.String r5 = r6.d(r1, r5)
            r0.G = r2
            java.lang.String r6 = "/sandbox/model"
            java.lang.Object r4 = m(r4, r6, r5, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L52
            return r5
        L52:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.protocol.b0.r(java.lang.String, vp4):java.lang.Object");
    }

    public final Object s(String str, byte[] bArr, mt4 mt4Var) {
        return gb9.c0(this.d.b(), new zn(bArr, this, str, null, 12), mt4Var);
    }
}
