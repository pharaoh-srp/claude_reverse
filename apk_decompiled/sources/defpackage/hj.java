package defpackage;

import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsApiError;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsCheckCompleted;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsErrorType;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsResult;

/* JADX INFO: loaded from: classes.dex */
public final class hj {
    public final qi3 a;
    public final w9h b;
    public final g78 c;
    public final h1e d;
    public final mp4 e;
    public volatile fkg f;
    public final amg g;

    public hj(qi3 qi3Var, fk0 fk0Var, w9h w9hVar, g78 g78Var, h86 h86Var) {
        g1e g1eVar = h1e.E;
        this.a = qi3Var;
        this.b = w9hVar;
        this.c = g78Var;
        this.d = g1eVar;
        this.e = fd9.c(h86Var.b().R0(1, "AgeSignals"));
        this.g = bmg.a(new yi(0, jj.E));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:39|40|177|42|43|179|44|45|173|46|175|48) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:39|40|177|42|43|179|44|45|173|46|47|175|48) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:(1:117)(4:(1:76)(4:193|77|78|(0)(1:112))|(1:81)(5:191|82|83|(0)|95)|(3:188|88|(4:90|(1:(1:105)(1:104))(1:94)|187|95))|107)|195|118|95) */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e6, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ea, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01f8, code lost:
    
        r20 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0201, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0202, code lost:
    
        r20 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0205, code lost:
    
        r9 = r2;
        r11 = r4;
        r2 = r6;
        r10 = 0;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x020c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x020d, code lost:
    
        r20 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0226, code lost:
    
        r10 = r11;
        r5 = r3;
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0236, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0237, code lost:
    
        r10 = r11;
        r12 = null;
        r20 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x024e, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0253, code lost:
    
        r4 = com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsErrorType.RETRYABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0256, code lost:
    
        r4 = com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsErrorType.NON_RETRYABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x025e, code lost:
    
        f(r0, r1, r14, r7, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0264, code lost:
    
        r5 = r6;
        r2 = r9;
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r6 = r5;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
    
        if (r0 == r13) goto L50;
     */
    /* JADX WARN: Path cross not found for [B:155:0x0246, B:160:0x0250], limit reached: 197 */
    /* JADX WARN: Path cross not found for [B:160:0x0250, B:155:0x0246], limit reached: 197 */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x0211 -> B:146:0x0222). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f0 -> B:14:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum a(defpackage.hj r22, boolean r23, defpackage.vp4 r24) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj.a(hj, boolean, vp4):java.lang.Enum");
    }

    public static final void f(boolean z, hj hjVar, long j, jj jjVar, int i) {
        AgeSignalsEvents$AgeSignalsResult ageSignalsEvents$AgeSignalsResult;
        if (z) {
            long jF = uh6.f(dqh.a(j));
            qi3 qi3Var = hjVar.a;
            switch (jjVar.ordinal()) {
                case 0:
                case 8:
                case 9:
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.UNSPECIFIED;
                    break;
                case 1:
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.VERIFIED;
                    break;
                case 2:
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.SUPERVISED;
                    break;
                case 3:
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.DECLARED_ADULT;
                    break;
                case 4:
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.DECLARED_MINOR;
                    break;
                case 5:
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.DECLARED;
                    break;
                case 6:
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.UNKNOWN;
                    break;
                case 7:
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.RETRYABLE_ERROR;
                    break;
                default:
                    mr9.b();
                    return;
            }
            qi3Var.e(new AgeSignalsEvents$AgeSignalsCheckCompleted(ageSignalsEvents$AgeSignalsResult, i, jF, false), AgeSignalsEvents$AgeSignalsCheckCompleted.Companion.serializer());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.vp4 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.zi
            if (r0 == 0) goto L13
            r0 = r8
            zi r0 = (defpackage.zi) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            zi r0 = new zi
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.E
            m45 r1 = defpackage.m45.E
            int r2 = r0.G
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3c
            if (r2 == r6) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            defpackage.sf5.h0(r8)
            return r8
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r3
        L34:
            defpackage.sf5.h0(r8)
            goto L53
        L38:
            defpackage.sf5.h0(r8)
            goto L4a
        L3c:
            defpackage.sf5.h0(r8)
            g78 r8 = r7.c
            r0.G = r6
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L4a
            goto Lad
        L4a:
            r0.G = r5
            java.lang.Enum r8 = r7.c(r0)
            if (r8 != r1) goto L53
            goto Lad
        L53:
            jj r8 = (defpackage.jj) r8
            r8.getClass()
            jj r2 = defpackage.jj.L
            if (r8 != r2) goto Laf
            r0.G = r4
            amg r8 = r7.g
            java.lang.Object r8 = r8.getValue()
            yi r8 = (defpackage.yi) r8
            jj r8 = r8.b
            r8.getClass()
            if (r8 != r2) goto La1
            qi3 r8 = r7.a
            com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsRetry r2 = new com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsRetry
            r2.<init>()
            vi r5 = com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsRetry.Companion
            kotlinx.serialization.KSerializer r5 = r5.serializer()
            znf r5 = (defpackage.znf) r5
            r8.e(r2, r5)
            amg r8 = r7.g
            java.lang.Object r8 = r8.getValue()
            yi r8 = (defpackage.yi) r8
            int r8 = r8.a
            jj r2 = defpackage.jj.E
            r7.g(r8, r2)
            mp4 r2 = r7.e
            gj r5 = new gj
            r6 = 0
            r5.<init>(r7, r8, r3, r6)
            fkg r8 = defpackage.gb9.D(r2, r3, r3, r5, r4)
            r7.f = r8
            java.lang.Enum r7 = r7.c(r0)
            goto Lab
        La1:
            amg r7 = r7.g
            java.lang.Object r7 = r7.getValue()
            yi r7 = (defpackage.yi) r7
            jj r7 = r7.b
        Lab:
            if (r7 != r1) goto Lae
        Lad:
            return r1
        Lae:
            return r7
        Laf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj.b(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum c(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aj
            if (r0 == 0) goto L13
            r0 = r5
            aj r0 = (defpackage.aj) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            aj r0 = new aj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r5)
            goto L43
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r5)
            cj r5 = new cj
            r1 = 0
            r5.<init>(r4, r2, r1)
            r0.G = r3
            r1 = 36000(0x8ca0, double:1.77864E-319)
            java.lang.Object r5 = defpackage.iuj.Q(r1, r5, r0)
            m45 r4 = defpackage.m45.E
            if (r5 != r4) goto L43
            return r4
        L43:
            jj r5 = (defpackage.jj) r5
            if (r5 != 0) goto L4a
            jj r4 = defpackage.jj.K
            return r4
        L4a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj.c(vp4):java.lang.Enum");
    }

    public final void d() {
        fkg fkgVar = this.f;
        if (fkgVar == null || !fkgVar.c()) {
            this.f = gb9.D(this.e, null, null, new dj(this, ((yi) this.g.getValue()).a, null), 3);
        }
    }

    public final void e() {
        Object value;
        fkg fkgVar = this.f;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.f = null;
        amg amgVar = this.g;
        do {
            value = amgVar.getValue();
        } while (!amgVar.l(value, new yi(((yi) value).a + 1, jj.E)));
    }

    public final void g(int i, jj jjVar) {
        amg amgVar;
        Object value;
        yi yiVar;
        do {
            amgVar = this.g;
            value = amgVar.getValue();
            yiVar = (yi) value;
            int i2 = yiVar.a;
            if (i2 == i) {
                jjVar.getClass();
                yiVar = new yi(i2, jjVar);
            }
        } while (!amgVar.l(value, yiVar));
    }

    public final void h(int i, AgeSignalsEvents$AgeSignalsErrorType ageSignalsEvents$AgeSignalsErrorType, int i2) {
        this.a.e(new AgeSignalsEvents$AgeSignalsApiError(i, ageSignalsEvents$AgeSignalsErrorType, i2), AgeSignalsEvents$AgeSignalsApiError.Companion.serializer());
    }
}
