package defpackage;

import com.anthropic.claude.bell.api.BellApiClientMessage;
import com.anthropic.claude.bell.api.a1;

/* JADX INFO: loaded from: classes2.dex */
public final class ej1 {
    public static final long l;
    public static final long m;
    public static final /* synthetic */ int n = 0;
    public final v0 a;
    public final un1 b;
    public final h86 c;
    public final h1e d;
    public final zy1 e;
    public volatile yn1 f;
    public volatile boolean g;
    public final amg h;
    public final a4e i;
    public final zy1 j;
    public final ih2 k;

    static {
        lz1 lz1Var = uh6.F;
        l = v40.Q(500, zh6.MILLISECONDS);
        m = v40.Q(2, zh6.SECONDS);
    }

    public ej1(v0 v0Var, un1 un1Var, h86 h86Var) {
        g1e g1eVar = h1e.E;
        this.a = v0Var;
        this.b = un1Var;
        this.c = h86Var;
        this.d = g1eVar;
        this.e = wd6.P(-2, 6, null);
        amg amgVarA = bmg.a(fj1.E);
        this.h = amgVarA;
        this.i = j8.k(amgVarA);
        zy1 zy1VarP = wd6.P(Integer.MAX_VALUE, 6, null);
        this.j = zy1VarP;
        this.k = j8.b0(zy1VarP);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0046 -> B:18:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ej1 r4, defpackage.vp4 r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.zi1
            if (r0 == 0) goto L13
            r0 = r5
            zi1 r0 = (defpackage.zi1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            zi1 r0 = new zi1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r5)
            goto L49
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r5)
            amg r5 = r4.h
            r5.getClass()
            fj1 r1 = defpackage.fj1.I
            r5.n(r2, r1)
        L39:
            zy1 r5 = r4.e
            r0.G = r3
            r5.getClass()
            java.lang.Object r5 = defpackage.zy1.J(r5, r0)
            m45 r1 = defpackage.m45.E
            if (r5 != r1) goto L49
            return r1
        L49:
            yi1 r5 = (defpackage.yi1) r5
            ti1 r1 = defpackage.ti1.a
            boolean r1 = defpackage.x44.r(r5, r1)
            if (r1 == 0) goto L56
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L56:
            wi1 r1 = defpackage.wi1.a
            boolean r1 = defpackage.x44.r(r5, r1)
            if (r1 != 0) goto L7c
            xi1 r1 = defpackage.xi1.a
            boolean r1 = defpackage.x44.r(r5, r1)
            if (r1 == 0) goto L67
            goto L7c
        L67:
            ui1 r1 = defpackage.ui1.a
            boolean r1 = defpackage.x44.r(r5, r1)
            if (r1 != 0) goto L39
            vi1 r1 = defpackage.vi1.a
            boolean r5 = defpackage.x44.r(r5, r1)
            if (r5 == 0) goto L78
            goto L39
        L78:
            defpackage.wg6.i()
            return r2
        L7c:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej1.a(ej1, vp4):java.lang.Object");
    }

    public final void b(BellApiClientMessage bellApiClientMessage) {
        bellApiClientMessage.getClass();
        yn1 yn1Var = this.f;
        if (yn1Var != null) {
            a1 a1Var = (a1) yn1Var;
            String strD = a1Var.d.d(bellApiClientMessage, BellApiClientMessage.Companion.serializer());
            p5e p5eVar = a1Var.e;
            if (p5eVar != null) {
                p5eVar.i(strD);
            } else {
                x44.o0("ws");
                throw null;
            }
        }
    }
}
