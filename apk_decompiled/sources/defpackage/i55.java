package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$SessionPrimerOutcome;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class i55 {
    public static final long n;
    public static final long o;
    public final jwf a;
    public final qi3 b;
    public final String c;
    public final l45 d;
    public final mn5 e;
    public final long f;
    public boolean g;
    public fkg h;
    public lf9 i;
    public boolean j;
    public String k;
    public UUID l;
    public d55 m;

    static {
        lz1 lz1Var = uh6.F;
        n = v40.Q(5, zh6.MINUTES);
        o = v40.Q(2, zh6.SECONDS);
    }

    public i55(jwf jwfVar, qi3 qi3Var, String str, mp4 mp4Var, mn5 mn5Var) {
        lz1 lz1Var = uh6.F;
        long jQ = v40.Q(1, zh6.SECONDS);
        jwfVar.getClass();
        qi3Var.getClass();
        str.getClass();
        mp4Var.getClass();
        mn5Var.getClass();
        this.a = jwfVar;
        this.b = qi3Var;
        this.c = str;
        this.d = mp4Var;
        this.e = mn5Var;
        this.f = jQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.i55 r28, defpackage.d55 r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.util.List r33, defpackage.vp4 r34) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i55.a(i55, d55, java.lang.String, java.lang.String, java.lang.String, java.util.List, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.i55 r10, defpackage.vp4 r11) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i55.b(i55, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        if (r0 == r12) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.vp4 r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i55.c(vp4, java.lang.String, java.lang.String, java.lang.String, java.util.List):java.lang.Object");
    }

    public final void d(String str, c55 c55Var) {
        this.b.e(new CodeEvents$SessionPrimerOutcome(this.c, str, "discarded_".concat(c55Var.E), null, null), CodeEvents$SessionPrimerOutcome.Companion.serializer());
        trk.h(this.d, b6c.F, new t74(this, str, (tp4) null, 15));
    }
}
