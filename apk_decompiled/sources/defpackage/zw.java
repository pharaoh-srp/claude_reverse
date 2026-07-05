package defpackage;

import android.content.Context;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.chat.ChatScreenParams;
import com.segment.analytics.kotlin.core.Settings;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zw extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw(Object obj, Object obj2, Object obj3, Object obj4, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r2.a(r3, r9) == r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r2.a(r3, r9) != r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (defpackage.j8.u(r10, r1, r9) == r8) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.H
            r2 = r0
            kp7 r2 = (defpackage.kp7) r2
            java.lang.Object r0 = r9.I
            r3 = r0
            amg r3 = (defpackage.amg) r3
            int r0 = r9.F
            r7 = 4
            r1 = 3
            r4 = 2
            r5 = 1
            m45 r8 = defpackage.m45.E
            if (r0 == 0) goto L2c
            if (r0 == r5) goto L28
            if (r0 == r4) goto L24
            if (r0 == r1) goto L28
            if (r0 != r7) goto L1d
            goto L28
        L1d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            r9 = 0
            return r9
        L24:
            defpackage.sf5.h0(r10)
            goto L56
        L28:
            defpackage.sf5.h0(r10)
            goto L7e
        L2c:
            defpackage.sf5.h0(r10)
            java.lang.Object r10 = r9.G
            w3g r10 = (defpackage.w3g) r10
            ql8 r0 = defpackage.v3g.a
            if (r10 != r0) goto L40
            r9.F = r5
            java.lang.Object r9 = r2.a(r3, r9)
            if (r9 != r8) goto L7e
            goto L7d
        L40:
            vz8 r0 = defpackage.v3g.b
            if (r10 != r0) goto L5f
            nvg r10 = r3.k()
            f41 r0 = new f41
            r0.<init>()
            r9.F = r4
            java.lang.Object r10 = defpackage.j8.H(r10, r0, r9)
            if (r10 != r8) goto L56
            goto L7d
        L56:
            r9.F = r1
            java.lang.Object r9 = r2.a(r3, r9)
            if (r9 != r8) goto L7e
            goto L7d
        L5f:
            nvg r0 = r3.k()
            kp7 r10 = r10.f(r0)
            kp7 r10 = defpackage.j8.A(r10)
            zw r1 = new zw
            java.lang.Object r4 = r9.J
            r6 = 13
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r9.F = r7
            java.lang.Object r9 = defpackage.j8.u(r10, r1, r9)
            if (r9 != r8) goto L7e
        L7d:
            return r8
        L7e:
            iei r9 = defpackage.iei.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw.d(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Path cross not found for [B:11:0x0041, B:16:0x0065], limit reached: 18 */
    /* JADX WARN: Path cross not found for [B:16:0x0065, B:11:0x0041], limit reached: 18 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[PHI: r8 r9
      0x005e: PHI (r8v1 aae) = (r8v2 aae), (r8v3 aae) binds: [B:12:0x005b, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r9v1 l45) = (r9v2 l45), (r9v3 l45) binds: [B:12:0x005b, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0063 -> B:11:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:11:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.F
            r1 = 2
            r2 = 1
            m45 r3 = defpackage.m45.E
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L21
            if (r0 != r1) goto L1a
            java.lang.Object r0 = r11.G
            aae r0 = (defpackage.aae) r0
            java.lang.Object r4 = r11.H
            l45 r4 = (defpackage.l45) r4
            defpackage.sf5.h0(r12)
            r8 = r0
            r9 = r4
            goto L41
        L1a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            r11 = 0
            return r11
        L21:
            java.lang.Object r0 = r11.G
            aae r0 = (defpackage.aae) r0
            java.lang.Object r4 = r11.H
            l45 r4 = (defpackage.l45) r4
            defpackage.sf5.h0(r12)
            r8 = r0
            r9 = r4
            goto L5e
        L2f:
            defpackage.sf5.h0(r12)
            java.lang.Object r12 = r11.H
            l45 r12 = (defpackage.l45) r12
            aae r0 = new aae
            r0.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.E = r4
            r9 = r12
            r8 = r0
        L41:
            java.lang.Object r12 = r11.I
            r6 = r12
            nwb r6 = (defpackage.nwb) r6
            java.lang.Object r12 = r11.J
            r7 = r12
            b29 r7 = (defpackage.b29) r7
            x70 r5 = new x70
            r10 = 6
            r5.<init>(r6, r7, r8, r9, r10)
            r11.H = r9
            r11.G = r8
            r11.F = r2
            java.lang.Object r12 = defpackage.oq5.W(r5, r11)
            if (r12 != r3) goto L5e
            goto L80
        L5e:
            float r12 = r8.E
            r0 = 0
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 != 0) goto L41
            dg8 r12 = new dg8
            r0 = 7
            r12.<init>(r0, r9)
            b3f r12 = defpackage.mpk.d0(r12)
            a29 r0 = new a29
            r0.<init>()
            r11.H = r9
            r11.G = r8
            r11.F = r1
            java.lang.Object r12 = defpackage.j8.H(r12, r0, r11)
            if (r12 != r3) goto L41
        L80:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw.n(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj) throws Throwable {
        zhd zhdVar = (zhd) this.H;
        int i = this.F;
        tp4 tp4Var = null;
        if (i == 0) {
            sf5.h0(obj);
            if (zhdVar.E.getValue() == null) {
                e45 e45VarB = ((h86) this.I).b();
                i30 i30Var = new i30((Context) this.J, tp4Var, 5);
                this.H = null;
                this.G = zhdVar;
                this.F = 1;
                obj = gb9.c0(e45VarB, i30Var, this);
                m45 m45Var = m45.E;
                if (obj == m45Var) {
                    return m45Var;
                }
            }
            return iei.a;
        }
        if (i != 1) {
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zhdVar = (zhd) this.G;
        sf5.h0(obj);
        zhdVar.setValue(obj);
        return iei.a;
    }

    private final Object r(Object obj) throws Throwable {
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            l45 l45Var = (l45) this.G;
            ft5 ft5Var = g86.a;
            ye8 ye8Var = tpa.a.J;
            m80 m80Var = new m80((c4a) this.H, (a4a) this.I, l45Var, (pz7) this.J, null, 5);
            this.F = 1;
            Object objC0 = gb9.c0(ye8Var, m80Var, this);
            m45 m45Var = m45.E;
            if (objC0 == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [pz7] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private final Object s(Object obj) throws Throwable {
        hxb hxbVar;
        ?? r0;
        Throwable th;
        hxb hxbVar2;
        int i = this.F;
        int i2 = 2;
        tp4 tp4Var = null;
        m45 m45Var = m45.E;
        try {
            if (i == 0) {
                sf5.h0(obj);
                hxbVar = (jxb) this.I;
                Object obj2 = (pz7) this.J;
                this.G = hxbVar;
                this.H = (xzg) obj2;
                this.F = 1;
                r0 = obj2;
                if (hxbVar.c(this) != m45Var) {
                }
                return m45Var;
            }
            if (i != 1) {
                if (i != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hxbVar2 = (hxb) this.G;
                try {
                    sf5.h0(obj);
                    hxbVar2.d(null);
                    return iei.a;
                } catch (Throwable th2) {
                    th = th2;
                    hxbVar2.d(null);
                    throw th;
                }
            }
            pz7 pz7Var = (pz7) ((xzg) this.H);
            hxb hxbVar3 = (hxb) this.G;
            sf5.h0(obj);
            hxbVar = hxbVar3;
            r0 = pz7Var;
            ue8 ue8Var = new ue8(r0, tp4Var, i2);
            this.G = hxbVar;
            this.H = null;
            this.F = 2;
            if (fd9.N(ue8Var, this) != m45Var) {
                hxbVar2 = hxbVar;
                hxbVar2.d(null);
                return iei.a;
            }
            return m45Var;
        } catch (Throwable th3) {
            hxb hxbVar4 = hxbVar;
            th = th3;
            hxbVar2 = hxbVar4;
            hxbVar2.d(null);
            throw th;
        }
    }

    private final Object t(Object obj) throws Throwable {
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            c45 c45Var = (c45) this.G;
            m80 m80Var = new m80((b4a) this.H, (z3a) this.I, (h30) this.J, (tp4) null);
            this.F = 1;
            Object objC0 = gb9.c0(c45Var, m80Var, this);
            m45 m45Var = m45.E;
            if (objC0 == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }

    private final Object v(Object obj) throws Throwable {
        ftf ftfVar;
        Throwable th;
        ftf ftfVar2;
        pz7 pz7Var;
        AtomicReference atomicReference = (AtomicReference) this.I;
        int i = this.F;
        m45 m45Var = m45.E;
        try {
            try {
                if (i == 0) {
                    sf5.h0(obj);
                    l45 l45Var = (l45) this.G;
                    ftfVar = new ftf(knk.z(l45Var.getCoroutineContext()), ((bz7) this.H).invoke(l45Var));
                    ftf ftfVar3 = (ftf) atomicReference.getAndSet(ftfVar);
                    if (ftfVar3 != null) {
                        lf9 lf9Var = ftfVar3.a;
                        this.G = ftfVar;
                        this.F = 1;
                        if (knk.p(lf9Var, this) != m45Var) {
                        }
                        return m45Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ftfVar2 = (ftf) this.G;
                        try {
                            sf5.h0(obj);
                            while (!atomicReference.compareAndSet(ftfVar2, null) && atomicReference.get() == ftfVar2) {
                            }
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            while (!atomicReference.compareAndSet(ftfVar2, null) && atomicReference.get() == ftfVar2) {
                            }
                            throw th;
                        }
                    }
                    ftfVar = (ftf) this.G;
                    sf5.h0(obj);
                }
                Object obj2 = ftfVar.b;
                this.G = ftfVar;
                this.F = 2;
                obj = pz7Var.invoke(obj2, this);
                if (obj != m45Var) {
                    ftfVar2 = ftfVar;
                    while (!atomicReference.compareAndSet(ftfVar2, null)) {
                    }
                    return obj;
                }
                return m45Var;
            } catch (Throwable th3) {
                th = th3;
                ftfVar2 = ftfVar;
                while (!atomicReference.compareAndSet(ftfVar2, null)) {
                }
                throw th;
            }
            pz7Var = (pz7) this.J;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        if (r12.b(r0, r1, r11) != r8) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.J
            gx r0 = (defpackage.gx) r0
            el5 r1 = r0.F
            int r2 = r11.F
            java.lang.Class<a1h> r3 = defpackage.a1h.class
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            m45 r8 = defpackage.m45.E
            if (r2 == 0) goto L35
            if (r2 == r6) goto L27
            if (r2 == r5) goto L23
            if (r2 != r4) goto L1d
            defpackage.sf5.h0(r12)
            goto L9a
        L1d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            return r7
        L23:
            defpackage.sf5.h0(r12)
            goto L82
        L27:
            java.lang.Object r0 = r11.G
            com.segment.analytics.kotlin.core.Settings r0 = (com.segment.analytics.kotlin.core.Settings) r0
            java.lang.Object r2 = r11.I
            gx r2 = (defpackage.gx) r2
            defpackage.sf5.h0(r12)
            r12 = r0
            r0 = r2
            goto L75
        L35:
            defpackage.sf5.h0(r12)
            java.lang.Object r12 = r11.H
            com.segment.analytics.kotlin.core.Settings r12 = (com.segment.analytics.kotlin.core.Settings) r12
            if (r12 == 0) goto L82
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r9 = "Dispatching update settings on "
            r2.<init>(r9)
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            defpackage.yb5.z(r0, r2)
            java.lang.Object r2 = r1.E
            lpg r2 = (defpackage.lpg) r2
            y0h r9 = new y0h
            r9.<init>(r6)
            r9.b = r12
            kce r10 = defpackage.jce.a
            pl9 r10 = r10.b(r3)
            r11.I = r0
            r11.G = r12
            r11.F = r6
            java.lang.Object r2 = r2.b(r9, r10, r11)
            if (r2 != r8) goto L75
            goto L99
        L75:
            r11.I = r7
            r11.G = r7
            r11.F = r5
            java.lang.Object r12 = com.segment.analytics.kotlin.core.b.b(r0, r12, r11)
            if (r12 != r8) goto L82
            goto L99
        L82:
            java.lang.Object r12 = r1.E
            lpg r12 = (defpackage.lpg) r12
            z0h r0 = new z0h
            r0.<init>(r6, r6)
            kce r1 = defpackage.jce.a
            pl9 r1 = r1.b(r3)
            r11.F = r4
            java.lang.Object r11 = r12.b(r0, r1, r11)
            if (r11 != r8) goto L9a
        L99:
            return r8
        L9a:
            iei r11 = defpackage.iei.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw.w(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        if (defpackage.gb9.c0((defpackage.c45) r5, r6, r24) != r3) goto L67;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw.x(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.J;
        switch (i) {
            case 0:
                return new zw((mff) obj2, tp4Var, 0);
            case 1:
                return new zw(this.G, (a80) this.H, (nwb) this.I, (nwb) obj2, tp4Var, 1);
            case 2:
                zw zwVar = new zw((t53) this.H, (Context) this.I, (c4a) obj2, tp4Var, 2);
                zwVar.G = obj;
                return zwVar;
            case 3:
                zw zwVar2 = new zw((t53) this.H, (hw2) this.I, (ChatScreenParams) obj2, tp4Var, 3);
                zwVar2.G = obj;
                return zwVar2;
            case 4:
                zw zwVar3 = new zw((qzb) this.I, (zf6) obj2, tp4Var, 4);
                zwVar3.H = obj;
                return zwVar3;
            case 5:
                return new zw((yk3) obj2, tp4Var, 5);
            case 6:
                zw zwVar4 = new zw(tp4Var, (bz7) obj2, (cve) this.I);
                zwVar4.H = obj;
                return zwVar4;
            case 7:
                return new zw((kq4) this.G, (ArrayList) this.H, (ft2) this.I, (ArrayList) obj2, tp4Var, 7);
            case 8:
                return new zw((jj5) this.G, (ArrayList) this.H, (kmd) this.I, (ArrayList) obj2, tp4Var, 8);
            case 9:
                return new zw((sa6) this.H, (String) this.I, (Context) obj2, tp4Var, 9);
            case 10:
                return new zw((m4a) this.G, (sa6) this.H, (String) this.I, (Context) obj2, tp4Var, 10);
            case 11:
                return new zw((h07) obj2, tp4Var, 11);
            case 12:
                zw zwVar5 = new zw((dae) this.I, (lp7) obj2, tp4Var, 12);
                zwVar5.H = ((ai2) obj).a;
                return zwVar5;
            case 13:
                zw zwVar6 = new zw((kp7) this.H, (amg) this.I, this.J, tp4Var, 13);
                zwVar6.G = obj;
                return zwVar6;
            case 14:
                return new zw((w3g) this.G, (kp7) this.H, (amg) this.I, this.J, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                zw zwVar7 = new zw((xne) this.I, (ou7) obj2, tp4Var, 15);
                zwVar7.H = obj;
                return zwVar7;
            case 16:
                zw zwVar8 = new zw((nwb) this.I, (b29) obj2, tp4Var, 16);
                zwVar8.H = obj;
                return zwVar8;
            case g.MAX_FIELD_NUMBER /* 17 */:
                zw zwVar9 = new zw((h86) this.I, (Context) obj2, tp4Var, 17);
                zwVar9.H = obj;
                return zwVar9;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new zw((jxb) this.I, (pz7) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                zw zwVar10 = new zw((c4a) this.H, (a4a) this.I, (pz7) obj2, tp4Var, 19);
                zwVar10.G = obj;
                return zwVar10;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new zw((c45) this.G, (b4a) this.H, (z3a) this.I, (h30) obj2, tp4Var, 20);
            case 21:
                zw zwVar11 = new zw((bz7) this.H, (AtomicReference) this.I, (pz7) obj2, tp4Var, 21);
                zwVar11.G = obj;
                return zwVar11;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new zw((Settings) this.H, (gx) obj2, tp4Var);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                zw zwVar12 = new zw((o7i) this.H, (int[]) this.I, (String[]) obj2, tp4Var, 23);
                zwVar12.G = obj;
                return zwVar12;
            default:
                return new zw((dae) this.G, (x7e) this.H, (m4a) this.I, (aej) obj2, tp4Var, 24);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((zw) create((iwc) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                return ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 4:
                return ((zw) create((zhd) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 5:
                return ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 6:
                return ((zw) create((y4i) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                return ((zw) create((guc) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 8:
                return ((zw) create((guc) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 9:
                return ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 10:
                return ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 11:
                return ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 12:
                Object obj3 = ((ai2) obj).a;
                zw zwVar = new zw((dae) this.I, (lp7) this.J, (tp4) obj2, 12);
                zwVar.H = obj3;
                return zwVar.invokeSuspend(ieiVar);
            case 13:
                return ((zw) create((t3g) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 14:
                return ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ((zw) create((zhd) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 16:
                ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45Var;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ((zw) create((zhd) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 21:
                return ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((zw) create((lp7) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45Var;
            default:
                return ((zw) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f5, code lost:
    
        if (defpackage.gb9.c0(r3, r5, r4) == r10) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04d5, code lost:
    
        if (r1 != r10) goto L256;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b6 A[Catch: all -> 0x017a, PHI: r0 r1 r3 r11
      0x01b6: PHI (r0v115 sy1) = (r0v116 sy1), (r0v143 sy1) binds: [B:113:0x01b3, B:109:0x0194] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r1v93 ??) = (r1v126 ??), (r1v127 ??) binds: [B:113:0x01b3, B:109:0x0194] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r3v47 java.lang.Object) = (r3v58 java.lang.Object), (r3v62 java.lang.Object) binds: [B:113:0x01b3, B:109:0x0194] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r11v12 h07) = (r11v13 h07), (r11v15 h07) binds: [B:113:0x01b3, B:109:0x0194] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {all -> 0x017a, blocks: (B:100:0x0172, B:112:0x01a7, B:115:0x01b6, B:117:0x01be, B:108:0x0191, B:111:0x019f), top: B:468:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01be A[Catch: all -> 0x017a, TRY_LEAVE, TryCatch #5 {all -> 0x017a, blocks: (B:100:0x0172, B:112:0x01a7, B:115:0x01b6, B:117:0x01be, B:108:0x0191, B:111:0x019f), top: B:468:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04cd A[PHI: r2 r3
      0x04cd: PHI (r2v59 y4i) = (r2v58 y4i), (r2v66 y4i) binds: [B:251:0x04ca, B:238:0x045e] A[DONT_GENERATE, DONT_INLINE]
      0x04cd: PHI (r3v31 java.lang.Object) = (r3v29 java.lang.Object), (r3v37 java.lang.Object) binds: [B:251:0x04ca, B:238:0x045e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0988 A[PHI: r0 r2
      0x0988: PHI (r0v9 gx) = (r0v8 gx), (r0v23 gx) binds: [B:445:0x0985, B:424:0x0882] A[DONT_GENERATE, DONT_INLINE]
      0x0988: PHI (r2v7 lpg) = (r2v6 lpg), (r2v16 lpg) binds: [B:445:0x0985, B:424:0x0882] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x09c5 A[PHI: r4
      0x09c5: PHI (r4v3 zw) = (r4v2 zw), (r4v0 zw) binds: [B:451:0x09c2, B:423:0x087d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:503:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:506:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:516:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:534:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v123 */
    /* JADX WARN: Type inference failed for: r1v124 */
    /* JADX WARN: Type inference failed for: r1v125 */
    /* JADX WARN: Type inference failed for: r1v126 */
    /* JADX WARN: Type inference failed for: r1v127 */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v93, types: [d6e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v94, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46, types: [d6e] */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x01f5 -> B:102:0x0176). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x031e -> B:174:0x0322). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(Settings settings, gx gxVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 22;
        this.H = settings;
        this.J = gxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
        this.J = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(tp4 tp4Var, bz7 bz7Var, cve cveVar) {
        super(2, tp4Var);
        this.E = 6;
        this.I = cveVar;
        this.J = bz7Var;
    }
}
