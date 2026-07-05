package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$SessionReattestResult;
import com.anthropic.claude.analytics.events.CodeEvents$SessionReattestSkipped;
import com.anthropic.claude.analytics.events.CodeEvents$TrustedDeviceEnrollmentResult;
import com.anthropic.claude.analytics.events.CodeEvents$TrustedDeviceReloginCompleted;
import com.anthropic.claude.analytics.events.CodeEvents$TrustedDeviceReloginPrompted;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j8i {
    public final v7i a;
    public final ptf b;
    public final k8i c;
    public final u5e d;
    public final owf e;
    public final x4f f;
    public final qi3 g;
    public final String h;
    public final String i;
    public final mn5 j;
    public final loi k;
    public final h86 l;
    public final lsc m;
    public final lsc n;
    public final lsc o;
    public v84 p;
    public v84 q;
    public final jxb r;
    public final lsc s;
    public boolean t;
    public boolean u;

    public j8i(v7i v7iVar, ptf ptfVar, k8i k8iVar, u5e u5eVar, owf owfVar, x4f x4fVar, qi3 qi3Var, String str, String str2, mn5 mn5Var, loi loiVar, h86 h86Var) {
        str.getClass();
        str2.getClass();
        this.a = v7iVar;
        this.b = ptfVar;
        this.c = k8iVar;
        this.d = u5eVar;
        this.e = owfVar;
        this.f = x4fVar;
        this.g = qi3Var;
        this.h = str;
        this.i = str2;
        this.j = mn5Var;
        this.k = loiVar;
        this.l = h86Var;
        this.m = mpk.P(null);
        this.n = mpk.P(null);
        this.o = mpk.P(null);
        this.r = new jxb();
        this.s = mpk.P(Boolean.FALSE);
    }

    public static /* synthetic */ void p(j8i j8iVar, String str, String str2, Long l, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        j8iVar.o(str, str2, l);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r10, defpackage.vp4 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.a8i
            if (r0 == 0) goto L14
            r0 = r11
            a8i r0 = (defpackage.a8i) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.G = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a8i r0 = new a8i
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.E
            int r0 = r6.G
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L2f
            if (r0 != r8) goto L28
            defpackage.sf5.h0(r11)
            goto L54
        L28:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            r9 = 0
            return r9
        L2f:
            defpackage.sf5.h0(r11)
            owf r11 = r9.e
            jf0 r11 = (defpackage.jf0) r11
            boolean r0 = r11.a()
            if (r0 == 0) goto L44
            boolean r11 = r11.e()
            if (r11 == 0) goto L44
            r5 = r8
            goto L45
        L44:
            r5 = r7
        L45:
            r6.G = r8
            r2 = 0
            r3 = 0
            r1 = r9
            r4 = r10
            java.lang.Enum r11 = r1.b(r2, r3, r4, r5, r6)
            m45 r9 = defpackage.m45.E
            if (r11 != r9) goto L54
            return r9
        L54:
            z7i r9 = defpackage.z7i.E
            if (r11 != r9) goto L59
            r7 = r8
        L59:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8i.a(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum b(boolean r14, defpackage.s5e r15, java.lang.String r16, boolean r17, defpackage.vp4 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8i.b(boolean, s5e, java.lang.String, boolean, vp4):java.lang.Enum");
    }

    public final yo6 c() {
        return (yo6) this.n.getValue();
    }

    public final String d() {
        if (c() != null) {
            return "already_attempted";
        }
        if (!((jf0) this.e).b()) {
            return "flag_off";
        }
        u5e u5eVar = this.d;
        if (!u5eVar.g()) {
            return "no_biometrics";
        }
        if ((!u5eVar.g() || !u5eVar.i().containsAlias("trusted_device_reattest")) && !u5eVar.h()) {
            return "no_key";
        }
        if (this.c.c() == null) {
            return "no_device_id";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018b A[Catch: all -> 0x01be, TRY_LEAVE, TryCatch #4 {all -> 0x01be, blocks: (B:61:0x0187, B:63:0x018b, B:67:0x0199, B:68:0x01a8, B:70:0x01ae, B:73:0x01c5, B:75:0x01cb, B:76:0x01d4, B:78:0x01da, B:79:0x01e6, B:81:0x01ee, B:95:0x025c, B:96:0x0261, B:84:0x01fc, B:85:0x020b, B:87:0x0211, B:88:0x0226, B:90:0x022e, B:91:0x0248, B:93:0x024e), top: B:138:0x0187 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ee A[Catch: all -> 0x01be, TryCatch #4 {all -> 0x01be, blocks: (B:61:0x0187, B:63:0x018b, B:67:0x0199, B:68:0x01a8, B:70:0x01ae, B:73:0x01c5, B:75:0x01cb, B:76:0x01d4, B:78:0x01da, B:79:0x01e6, B:81:0x01ee, B:95:0x025c, B:96:0x0261, B:84:0x01fc, B:85:0x020b, B:87:0x0211, B:88:0x0226, B:90:0x022e, B:91:0x0248, B:93:0x024e), top: B:138:0x0187 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r20, java.lang.String r21, boolean r22, defpackage.vp4 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8i.e(java.lang.String, java.lang.String, boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.vp4 r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8i.f(vp4):java.lang.Object");
    }

    public final void g(String str) {
        this.s.setValue(Boolean.TRUE);
        yo6 yo6VarC = c();
        yo6 yo6Var = yo6.F;
        boolean z = yo6VarC == yo6Var || c() == yo6.E;
        this.n.setValue(yo6Var);
        if (z) {
            return;
        }
        this.g.e(new CodeEvents$TrustedDeviceReloginPrompted(this.i, str), CodeEvents$TrustedDeviceReloginPrompted.Companion.serializer());
    }

    public final void h(y5e y5eVar) {
        y5eVar.getClass();
        v84 v84Var = this.p;
        if (v84Var != null) {
            v84Var.c0(y5eVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01dd, code lost:
    
        if (r0 == r14) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.vp4 r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8i.i(vp4):java.lang.Object");
    }

    public final void j() {
        this.u = c() == yo6.F;
        l();
        this.t = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #4 {all -> 0x0104, blocks: (B:56:0x00fd, B:58:0x0101), top: B:93:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142 A[Catch: all -> 0x0145, TRY_LEAVE, TryCatch #5 {all -> 0x0145, blocks: (B:80:0x013e, B:82:0x0142), top: B:95:0x013e }] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r12v0, types: [j8i] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.vp4 r13) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8i.k(vp4):java.lang.Object");
    }

    public final void l() {
        this.s.setValue(Boolean.FALSE);
        this.n.setValue(null);
        this.m.setValue(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da A[Catch: all -> 0x00e6, TRY_LEAVE, TryCatch #3 {all -> 0x00e6, blocks: (B:44:0x00d6, B:46:0x00da, B:52:0x00eb), top: B:134:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb A[Catch: all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00e6, blocks: (B:44:0x00d6, B:46:0x00da, B:52:0x00eb), top: B:134:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b A[Catch: all -> 0x0148, TRY_LEAVE, TryCatch #7 {all -> 0x0148, blocks: (B:58:0x0136, B:60:0x013b, B:66:0x014b, B:54:0x0116), top: B:141:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b A[Catch: all -> 0x0148, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0148, blocks: (B:58:0x0136, B:60:0x013b, B:66:0x014b, B:54:0x0116), top: B:141:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.vp4 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8i.m(vp4):java.lang.Object");
    }

    public final void n(String str, String str2, boolean z) {
        this.g.e(new CodeEvents$TrustedDeviceEnrollmentResult(this.i, z, str, str2), CodeEvents$TrustedDeviceEnrollmentResult.Companion.serializer());
    }

    public final void o(String str, String str2, Long l) {
        String strE = this.c.e();
        zfa.a.getClass();
        if (yfa.b()) {
            String strE2 = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String str3 = "Reattest outcome=" + str + " kid=" + strE + " challenge=" + str2 + " osError=" + l;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, strE2, str3);
                }
            }
        }
        this.g.e(new CodeEvents$SessionReattestResult(this.i, str.equals("ok"), str, strE, str2, l, (String) null, 64, (mq5) null), CodeEvents$SessionReattestResult.Companion.serializer());
    }

    public final void q(String str) {
        this.g.e(new CodeEvents$SessionReattestSkipped(this.i, str), CodeEvents$SessionReattestSkipped.Companion.serializer());
    }

    public final void r(String str, boolean z) {
        this.g.e(new CodeEvents$TrustedDeviceReloginCompleted(this.i, z, str), CodeEvents$TrustedDeviceReloginCompleted.Companion.serializer());
    }
}
