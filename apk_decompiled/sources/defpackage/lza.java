package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.glance.session.TimeoutCancellationException;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.trusteddevice.ReattestChallengeResponse;
import com.anthropic.claude.api.trusteddevice.ReattestVerifyRequest;
import com.anthropic.claude.bell.tts.d;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;
import com.anthropic.claude.sessions.types.SessionFileContent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class lza extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lza(drh drhVar, poc pocVar, l45 l45Var, pz7 pz7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 24;
        this.G = drhVar;
        this.H = pocVar;
        this.J = l45Var;
        this.I = pz7Var;
    }

    private final Object d(Object obj) {
        int i = this.F;
        tp4 tp4Var = null;
        iei ieiVar = iei.a;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                sf5.h0(obj);
                return ieiVar;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        vfh vfhVar = (vfh) this.G;
        zub zubVar = vfhVar.a0;
        sih sihVar = (sih) this.H;
        e8d e8dVar = (e8d) this.I;
        ytf ytfVar = (ytf) this.J;
        qfh qfhVar = new qfh(vfhVar, 3);
        this.F = 1;
        sihVar.getClass();
        Object objE = x4h.e(e8dVar, new kag(zubVar, sihVar, tp4Var, i2), new f2d(ytfVar, sihVar, qfhVar, 23), this);
        m45 m45Var = m45.E;
        if (objE != m45Var) {
            objE = ieiVar;
        }
        if (objE != m45Var) {
            objE = ieiVar;
        }
        if (objE != m45Var) {
            objE = ieiVar;
        }
        return objE == m45Var ? m45Var : ieiVar;
    }

    private final Object n(Object obj) {
        Object objL;
        m45 m45Var;
        drh drhVar = (drh) this.G;
        int i = this.F;
        if (i != 0 && i != 1) {
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        do {
            Object obj2 = drhVar.F.get();
            obj2.getClass();
            long jLongValue = ((Number) obj2).longValue();
            ((poc) this.H).getClass();
            if (jLongValue <= System.currentTimeMillis()) {
                fd9.z((l45) this.J, new TimeoutCancellationException("Timed out of executing block.", ((pz7) this.I).hashCode()));
                return iei.a;
            }
            long jA = drhVar.a();
            this.F = 1;
            objL = d4c.L(jA, this);
            m45Var = m45.E;
        } while (objL != m45Var);
        return m45Var;
    }

    private final Object p(Object obj) {
        nwb nwbVar = (nwb) this.J;
        int i = this.F;
        q3e q3eVar = null;
        if (i == 0) {
            sf5.h0(obj);
            pz7 pz7Var = (pz7) this.I;
            String str = (String) this.G;
            this.F = 1;
            obj = pz7Var.invoke(str, this);
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
        i3e i3eVar = (i3e) obj;
        if (i3eVar instanceof h3e) {
            nwb nwbVar2 = (nwb) this.H;
            SessionFileContent sessionFileContent = ((h3e) i3eVar).a;
            nwbVar2.setValue(sessionFileContent.getContents());
            if (sessionFileContent.getTruncated()) {
                byte[] bytes = sessionFileContent.getContents().getBytes(dj2.a);
                bytes.getClass();
                q3eVar = new q3e(bytes.length);
            }
            nwbVar.setValue(q3eVar);
        } else if (i3eVar instanceof f3e) {
            nwbVar.setValue(new o3e(((f3e) i3eVar).a));
        } else {
            if (!x44.r(i3eVar, g3e.a)) {
                wg6.i();
                return null;
            }
            nwbVar.setValue(s3e.a);
        }
        return iei.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006d -> B:17:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.J
            p4i r0 = (defpackage.p4i) r0
            int r1 = r8.F
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L32
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1c
            java.lang.Object r1 = r8.I
            l45 r1 = (defpackage.l45) r1
            defpackage.sf5.h0(r9)     // Catch: java.lang.Throwable -> L1a
            r9 = r1
            goto L39
        L1a:
            r8 = move-exception
            goto L74
        L1c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r4
        L22:
            java.lang.Object r1 = r8.H
            raf r1 = (defpackage.raf) r1
            java.lang.Object r6 = r8.G
            p4i r6 = (defpackage.p4i) r6
            java.lang.Object r7 = r8.I
            l45 r7 = (defpackage.l45) r7
            defpackage.sf5.h0(r9)     // Catch: java.lang.Throwable -> L1a
            goto L5c
        L32:
            defpackage.sf5.h0(r9)
            java.lang.Object r9 = r8.I
            l45 r9 = (defpackage.l45) r9
        L39:
            c45 r1 = r9.getCoroutineContext()     // Catch: java.lang.Throwable -> L1a
            boolean r1 = defpackage.knk.B(r1)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L6f
            raf r1 = r0.a     // Catch: java.lang.Throwable -> L1a
            zy1 r6 = r0.f     // Catch: java.lang.Throwable -> L1a
            r8.I = r9     // Catch: java.lang.Throwable -> L1a
            r8.G = r0     // Catch: java.lang.Throwable -> L1a
            r8.H = r1     // Catch: java.lang.Throwable -> L1a
            r8.F = r3     // Catch: java.lang.Throwable -> L1a
            r6.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r6 = defpackage.zy1.J(r6, r8)     // Catch: java.lang.Throwable -> L1a
            if (r6 != r5) goto L59
            goto L6c
        L59:
            r7 = r9
            r9 = r6
            r6 = r0
        L5c:
            n4i r9 = (defpackage.n4i) r9     // Catch: java.lang.Throwable -> L1a
            r8.I = r7     // Catch: java.lang.Throwable -> L1a
            r8.G = r4     // Catch: java.lang.Throwable -> L1a
            r8.H = r4     // Catch: java.lang.Throwable -> L1a
            r8.F = r2     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r9 = defpackage.p4i.d(r6, r1, r9, r8)     // Catch: java.lang.Throwable -> L1a
            if (r9 != r5) goto L6d
        L6c:
            return r5
        L6d:
            r9 = r7
            goto L39
        L6f:
            r0.g = r4
            iei r8 = defpackage.iei.a
            return r8
        L74:
            r0.g = r4
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lza.r(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj) {
        String str = (String) this.H;
        j8i j8iVar = (j8i) this.G;
        int i = this.F;
        if (i != 0) {
            if (i == 1) {
                sf5.h0(obj);
                return obj;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        ptf ptfVar = j8iVar.b;
        long jA = j8iVar.j.a() / 1000;
        byte[] bArrK = j8iVar.d.k(z5e.a(jA, "POST", "api/auth/session_reattest/device_key"));
        Map<String, String> mapC = bArrK == null ? nm6.E : z5e.c(str, jA, bArrK);
        String challenge_id = ((ReattestChallengeResponse) this.I).getChallenge_id();
        byte[] bArr = (byte[]) this.J;
        bArr.getClass();
        String strEncodeToString = z5e.d.encodeToString(bArr);
        strEncodeToString.getClass();
        ReattestVerifyRequest reattestVerifyRequest = new ReattestVerifyRequest(challenge_id, str, strEncodeToString, j8iVar.c.e());
        this.F = 1;
        Object objB = ptfVar.b(mapC, reattestVerifyRequest, this);
        m45 m45Var = m45.E;
        return objB == m45Var ? m45Var : objB;
    }

    private final Object t(Object obj) {
        fk0 fk0Var;
        String str;
        int i = this.F;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        if (i == 0) {
            sf5.h0(obj);
            u4j u4jVar = (u4j) this.I;
            fk0 fk0Var2 = u4jVar.d;
            String str2 = (String) this.J;
            f9 f9Var = u4jVar.b;
            this.G = fk0Var2;
            this.H = str2;
            this.F = 1;
            obj = f9Var.k(str2, this);
            if (obj != m45Var) {
                fk0Var = fk0Var2;
                str = str2;
            }
        }
        if (i != 1) {
            if (i == 2) {
                sf5.h0(obj);
                return ieiVar;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = (String) this.H;
        fk0Var = (fk0) this.G;
        sf5.h0(obj);
        this.G = null;
        this.H = null;
        this.F = 2;
        pik.g(fk0Var, str, (ApiResult) obj);
        return ieiVar == m45Var ? m45Var : ieiVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.J;
        switch (i) {
            case 0:
                return new lza((vza) this.G, (vya) this.H, (pz7) this.I, (bg9) obj2, tp4Var, 0);
            case 1:
                return new lza((o32) this.H, (u3c) this.I, (Uri) obj2, tp4Var, 1);
            case 2:
                return new lza((zqc) this.G, (ec) this.H, this.I, this.J, tp4Var, 2);
            case 3:
                return new lza((rwe) this.G, (ec) this.H, this.I, (tmf) obj2, tp4Var, 3);
            case 4:
                lza lzaVar = new lza((q1d) this.H, (String) this.I, (String) obj2, this.F, tp4Var);
                lzaVar.G = obj;
                return lzaVar;
            case 5:
                return new lza((y49) this.H, (float[]) this.I, (List) obj2, tp4Var, 5);
            case 6:
                return new lza((p5d) obj2, (pz7) this.I, tp4Var);
            case 7:
                return new lza((hed) this.G, (MessageDocumentFile) this.H, (String) this.I, (cj7) obj2, tp4Var, 7);
            case 8:
                lza lzaVar2 = new lza((hed) this.H, (String) this.I, (String) obj2, tp4Var, 8);
                lzaVar2.G = obj;
                return lzaVar2;
            case 9:
                return new lza((zy7) this.H, (nwb) this.I, (zy7) obj2, tp4Var, 9);
            case 10:
                lza lzaVar3 = new lza((cve) this.H, (ua2) this.I, (jq4) obj2, tp4Var, 10);
                lzaVar3.G = obj;
                return lzaVar3;
            case 11:
                lza lzaVar4 = new lza((a0f) this.I, (lp7) obj2, tp4Var, 11);
                lzaVar4.H = obj;
                return lzaVar4;
            case 12:
                return new lza((mif) this.G, (dae) this.H, (dae) this.I, (cae) obj2, tp4Var, 12);
            case 13:
                return new lza((wm0) this.G, (Context) this.H, (Throwable) this.I, (drh) obj2, tp4Var, 13);
            case 14:
                return new lza((w1g) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new lza((w1g) this.G, (op3) this.H, (ChatMessageActionEvents$ActionSource) this.I, (whd) obj2, tp4Var, 15);
            case 16:
                return new lza((s2g) this.H, (m0h) this.I, (nwb) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new lza((m6b) this.H, (whg) this.I, (a0f) obj2, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                lza lzaVar5 = new lza((nrg) this.H, (ArrayList) this.I, (np5) obj2, tp4Var, 18);
                lzaVar5.G = obj;
                return lzaVar5;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new lza((ptg) this.I, (String) obj2, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                lza lzaVar6 = new lza((d) this.I, (lp7) obj2, tp4Var, 20);
                lzaVar6.H = obj;
                return lzaVar6;
            case 21:
                return new lza((nfb) this.G, (String) this.H, (nwb) this.I, (lvh) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new lza((pz7) this.I, this.G, (nwb) this.H, (nwb) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new lza((vfh) this.G, (sih) this.H, (e8d) this.I, (ytf) obj2, tp4Var, 23);
            case 24:
                return new lza((drh) this.G, (poc) this.H, (l45) obj2, (pz7) this.I, tp4Var);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new lza((pz7) this.I, this.G, (nwb) this.H, (nwb) obj2, tp4Var, 25);
            case 26:
                lza lzaVar7 = new lza((p4i) obj2, tp4Var, 26);
                lzaVar7.I = obj;
                return lzaVar7;
            case 27:
                return new lza((j8i) this.G, (String) this.H, (ReattestChallengeResponse) this.I, (byte[]) obj2, tp4Var, 27);
            case 28:
                return new lza((u4j) this.I, (String) obj2, tp4Var, 28);
            default:
                return new lza((w4j) this.I, (SttSupportedLanguage) obj2, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 5:
                ((lza) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ((lza) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x02d2, code lost:
    
        if (r0 == r9) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02ff, code lost:
    
        if (r0 == r9) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0656, code lost:
    
        if (r0 == r9) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x066c, code lost:
    
        if (r0 == r9) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x06d1, code lost:
    
        if (r2.b(r19, defpackage.ied.F) == r9) goto L350;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:519:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:525:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:545:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:564:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v111, types: [l45] */
    /* JADX WARN: Type inference failed for: r1v112, types: [lf9] */
    /* JADX WARN: Type inference failed for: r1v114, types: [lf9] */
    /* JADX WARN: Type inference failed for: r1v134 */
    /* JADX WARN: Type inference failed for: r1v135 */
    /* JADX WARN: Type inference failed for: r1v136 */
    /* JADX WARN: Type inference failed for: r1v137 */
    /* JADX WARN: Type inference failed for: r1v61, types: [l45] */
    /* JADX WARN: Type inference failed for: r1v62, types: [lf9] */
    /* JADX WARN: Type inference failed for: r1v64, types: [lf9] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lza.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lza(q1d q1dVar, String str, String str2, int i, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 4;
        this.H = q1dVar;
        this.I = str;
        this.J = str2;
        this.F = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lza(p5d p5dVar, pz7 pz7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 6;
        this.J = p5dVar;
        this.I = pz7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lza(pz7 pz7Var, Object obj, nwb nwbVar, nwb nwbVar2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = pz7Var;
        this.G = obj;
        this.H = nwbVar;
        this.J = nwbVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lza(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lza(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
        this.J = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lza(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lza(Object obj, Object obj2, Object obj3, Object obj4, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
    }
}
