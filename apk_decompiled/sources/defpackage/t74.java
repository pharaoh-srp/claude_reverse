package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.ads.GooglePlayReferrer;
import com.anthropic.claude.code.remote.stores.b;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.ConwayExtensionMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class t74 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public Object F;
    public int G;
    public Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t74(pz7 pz7Var, zy7 zy7Var, nwb nwbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 5;
        this.H = pz7Var;
        this.I = zy7Var;
        this.F = nwbVar;
    }

    private final Object d(Object obj) throws Throwable {
        t88 t88Var;
        hxb hxbVar;
        hxb hxbVar2;
        String str;
        t88 t88Var2;
        m45 m45Var = m45.E;
        int i = this.G;
        try {
            if (i == 0) {
                sf5.h0(obj);
                t88Var = (t88) this.I;
                hxbVar = t88Var.d;
                this.F = hxbVar;
                this.H = t88Var;
                this.G = 1;
                if (hxbVar.c(this) != m45Var) {
                }
                return m45Var;
            }
            if (i != 1) {
                if (i != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t88Var2 = (t88) this.H;
                hxbVar2 = (hxb) this.F;
                try {
                    sf5.h0(obj);
                    t88Var2.c = (String) obj;
                    str = (String) obj;
                    hxbVar = hxbVar2;
                    hxbVar.d(null);
                    return str;
                } catch (Throwable th) {
                    th = th;
                    hxbVar2.d(null);
                    throw th;
                }
            }
            t88 t88Var3 = (t88) this.H;
            hxb hxbVar3 = (hxb) this.F;
            sf5.h0(obj);
            t88Var = t88Var3;
            hxbVar = hxbVar3;
            str = t88Var.c;
            if (str == null) {
                this.F = hxbVar;
                this.H = t88Var;
                this.G = 2;
                Object objA = t88.a(t88Var, this);
                if (objA != m45Var) {
                    t88Var2 = t88Var;
                    obj = objA;
                    hxbVar2 = hxbVar;
                    t88Var2.c = (String) obj;
                    str = (String) obj;
                    hxbVar = hxbVar2;
                }
                return m45Var;
            }
            hxbVar.d(null);
            return str;
        } catch (Throwable th2) {
            th = th2;
            hxbVar2 = hxbVar;
            hxbVar2.d(null);
            throw th;
        }
    }

    private final Object n(Object obj) throws Throwable {
        v88 v88Var;
        hxb hxbVar;
        hxb hxbVar2;
        GooglePlayReferrer googlePlayReferrer;
        v88 v88Var2;
        int i = this.G;
        tp4 tp4Var = null;
        m45 m45Var = m45.E;
        try {
            if (i == 0) {
                sf5.h0(obj);
                v88Var = (v88) this.I;
                hxbVar = v88Var.d;
                this.F = hxbVar;
                this.H = v88Var;
                this.G = 1;
                if (hxbVar.c(this) != m45Var) {
                }
                return m45Var;
            }
            if (i == 1) {
                v88 v88Var3 = (v88) this.H;
                hxb hxbVar3 = (hxb) this.F;
                sf5.h0(obj);
                v88Var = v88Var3;
                hxbVar = hxbVar3;
            } else {
                if (i != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v88Var2 = (v88) this.H;
                hxbVar2 = (hxb) this.F;
                try {
                    sf5.h0(obj);
                    v88Var2.c = (GooglePlayReferrer) obj;
                    googlePlayReferrer = (GooglePlayReferrer) obj;
                    hxbVar = hxbVar2;
                    hxbVar.d(null);
                    return googlePlayReferrer;
                } catch (Throwable th) {
                    th = th;
                }
            }
            googlePlayReferrer = v88Var.c;
            if (googlePlayReferrer != null) {
                hxbVar.d(null);
                return googlePlayReferrer;
            }
            this.F = hxbVar;
            this.H = v88Var;
            this.G = 2;
            try {
                Object objC0 = gb9.c0(v88Var.b.getDefault(), new ix5(v88Var, tp4Var, 13), this);
                if (objC0 != m45Var) {
                    v88 v88Var4 = v88Var;
                    obj = objC0;
                    hxbVar2 = hxbVar;
                    v88Var2 = v88Var4;
                    v88Var2.c = (GooglePlayReferrer) obj;
                    googlePlayReferrer = (GooglePlayReferrer) obj;
                    hxbVar = hxbVar2;
                    hxbVar.d(null);
                    return googlePlayReferrer;
                }
                return m45Var;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        hxbVar2 = hxbVar;
        hxbVar2.d(null);
        throw th;
    }

    private final Object p(Object obj) {
        Object hreVar;
        q79 q79Var = (q79) this.H;
        amg amgVar = q79Var.c;
        int i = this.G;
        try {
            if (i == 0) {
                sf5.h0(obj);
                String str = (String) this.I;
                this.F = null;
                this.G = 1;
                obj = q79.b(q79Var, str, this);
                m45 m45Var = m45.E;
                if (obj == m45Var) {
                    return m45Var;
                }
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
            }
            hreVar = (String) obj;
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        if (!(hreVar instanceof hre)) {
            f01 f01Var = new f01((String) hreVar);
            amgVar.getClass();
            amgVar.n(null, f01Var);
        }
        Throwable thA = jre.a(hreVar);
        if (thA != null) {
            d01 d01Var = new d01(thA);
            amgVar.getClass();
            amgVar.n(null, d01Var);
        }
        return iei.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (r10.g(r9, r1) == r4) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.H
            fcc r0 = (defpackage.fcc) r0
            int r1 = r9.G
            r2 = 2
            r3 = 1
            m45 r4 = defpackage.m45.E
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L14
            defpackage.sf5.h0(r10)
            goto L73
        L14:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            r9 = 0
            return r9
        L1b:
            defpackage.sf5.h0(r10)
            goto L49
        L1f:
            defpackage.sf5.h0(r10)
            java.lang.Object r10 = r9.F
            a80 r10 = (defpackage.a80) r10
            java.lang.Object r1 = r10.e()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            long r5 = r0.a
            r7 = 32
            long r5 = r5 >> r7
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r5 = r5 + r1
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r5)
            r9.G = r3
            java.lang.Object r10 = r10.g(r9, r1)
            if (r10 != r4) goto L49
            goto L72
        L49:
            java.lang.Object r10 = r9.I
            a80 r10 = (defpackage.a80) r10
            java.lang.Object r1 = r10.e()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            long r5 = r0.a
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            int r0 = (int) r5
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r0 + r1
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            r9.G = r2
            java.lang.Object r9 = r10.g(r9, r1)
            if (r9 != r4) goto L73
        L72:
            return r4
        L73:
            iei r9 = defpackage.iei.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t74.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                return new t74((nwb) this.H, (zhh) obj2, tp4Var, 0);
            case 1:
                return new t74((nwb) this.H, (sih) obj2, tp4Var, 1);
            case 2:
                return new t74((v84) this.H, (dae) obj2, tp4Var, 2);
            case 3:
                return new t74((ij4) this.F, (List) this.H, (g56) obj2, tp4Var, 3);
            case 4:
                return new t74((ij4) this.F, (cj4) this.H, (String) obj2, tp4Var, 4);
            case 5:
                return new t74((pz7) this.H, (zy7) obj2, (nwb) this.F, tp4Var);
            case 6:
                return new t74((f) obj2, (nwb) this.F, tp4Var);
            case 7:
                t74 t74Var = new t74((bz7) this.H, (bz7) obj2, tp4Var, 7);
                t74Var.F = obj;
                return t74Var;
            case 8:
                t74 t74Var2 = new t74((Context) this.H, (mc) obj2, tp4Var, 8);
                t74Var2.F = obj;
                return t74Var2;
            case 9:
                t74 t74Var3 = new t74((f15) this.H, (us4) obj2, tp4Var, 9);
                t74Var3.F = obj;
                return t74Var3;
            case 10:
                return new t74((m15) this.F, (x0a) this.H, (wlg) obj2, tp4Var, 10);
            case 11:
                return new t74((p05) this.F, (ConwayExtensionMeta) this.H, (Context) obj2, tp4Var, 11);
            case 12:
                t74 t74Var4 = new t74((AtomicLong) this.H, (f4e) obj2, tp4Var, 12);
                t74Var4.F = obj;
                return t74Var4;
            case 13:
                return new t74((p05) this.F, (hsf) this.H, (ewc) obj2, tp4Var, 13);
            case 14:
                return new t74((mp4) this.F, (BroadcastReceiver.PendingResult) this.H, (pz7) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                t74 t74Var5 = new t74((i55) this.H, (String) obj2, tp4Var, 15);
                t74Var5.F = obj;
                return t74Var5;
            case 16:
                t74 t74Var6 = new t74((List) this.H, (kq4) obj2, tp4Var, 16);
                t74Var6.F = obj;
                return t74Var6;
            case g.MAX_FIELD_NUMBER /* 17 */:
                t74 t74Var7 = new t74((jj5) this.H, (String) obj2, tp4Var, 17);
                t74Var7.F = obj;
                return t74Var7;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new t74((fb6) this.F, (String) this.H, (String) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                t74 t74Var8 = new t74((sc6) this.H, (od6) obj2, tp4Var, 19);
                t74Var8.F = obj;
                return t74Var8;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                t74 t74Var9 = new t74((od6) this.H, (cc6) obj2, tp4Var, 20);
                t74Var9.F = obj;
                return t74Var9;
            case 21:
                return new t74((rp6) this.H, (ArrayList) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                t74 t74Var10 = new t74((b) this.H, (dae) obj2, tp4Var, 22);
                t74Var10.F = obj;
                return t74Var10;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                t74 t74Var11 = new t74((w79) this.H, (ap7) obj2, tp4Var, 23);
                t74Var11.F = obj;
                return t74Var11;
            case 24:
                return new t74((c45) this.F, (kp7) this.H, (zhd) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new t74((t88) obj2, tp4Var, 25);
            case 26:
                return new t74((v88) obj2, tp4Var, 26);
            case 27:
                t74 t74Var12 = new t74((q79) this.H, (String) obj2, tp4Var, 27);
                t74Var12.F = obj;
                return t74Var12;
            case 28:
                return new t74((a80) this.F, (fcc) this.H, (a80) obj2, tp4Var, 28);
            default:
                return new t74((fe) this.H, (ca9) obj2, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((t74) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0276, code lost:
    
        if (r3.b(r24, r5) == r13) goto L111;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0224 A[Catch: all -> 0x01b2, PHI: r0
      0x0224: PHI (r0v151 java.lang.Object) = (r0v147 java.lang.Object), (r0v158 java.lang.Object) binds: [B:105:0x0221, B:88:0x01bb] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x01b2, blocks: (B:83:0x01ad, B:114:0x027e, B:116:0x0282, B:118:0x0286, B:119:0x02a7, B:120:0x02ac, B:121:0x02ad, B:88:0x01bb, B:107:0x0224, B:109:0x022a, B:112:0x027a, B:124:0x02ba, B:125:0x02bf, B:89:0x01c1, B:101:0x0205, B:104:0x0210, B:96:0x01f2, B:98:0x01f8), top: B:483:0x019f }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022a A[Catch: all -> 0x01b2, TryCatch #3 {all -> 0x01b2, blocks: (B:83:0x01ad, B:114:0x027e, B:116:0x0282, B:118:0x0286, B:119:0x02a7, B:120:0x02ac, B:121:0x02ad, B:88:0x01bb, B:107:0x0224, B:109:0x022a, B:112:0x027a, B:124:0x02ba, B:125:0x02bf, B:89:0x01c1, B:101:0x0205, B:104:0x0210, B:96:0x01f2, B:98:0x01f8), top: B:483:0x019f }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027a A[Catch: all -> 0x01b2, TryCatch #3 {all -> 0x01b2, blocks: (B:83:0x01ad, B:114:0x027e, B:116:0x0282, B:118:0x0286, B:119:0x02a7, B:120:0x02ac, B:121:0x02ad, B:88:0x01bb, B:107:0x0224, B:109:0x022a, B:112:0x027a, B:124:0x02ba, B:125:0x02bf, B:89:0x01c1, B:101:0x0205, B:104:0x0210, B:96:0x01f2, B:98:0x01f8), top: B:483:0x019f }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0282 A[Catch: all -> 0x01b2, TryCatch #3 {all -> 0x01b2, blocks: (B:83:0x01ad, B:114:0x027e, B:116:0x0282, B:118:0x0286, B:119:0x02a7, B:120:0x02ac, B:121:0x02ad, B:88:0x01bb, B:107:0x0224, B:109:0x022a, B:112:0x027a, B:124:0x02ba, B:125:0x02bf, B:89:0x01c1, B:101:0x0205, B:104:0x0210, B:96:0x01f2, B:98:0x01f8), top: B:483:0x019f }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:544:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:564:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:292:0x05bc -> B:294:0x05c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:408:0x081b -> B:410:0x081f). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t74.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t74(f fVar, nwb nwbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 6;
        this.I = fVar;
        this.F = nwbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t74(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t74(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t74(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = obj;
        this.H = obj2;
        this.I = obj3;
    }
}
