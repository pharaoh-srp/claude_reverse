package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class p05 extends iwe {
    public final Context b;
    public final er4 c;
    public final String d;
    public final ov4 e;
    public final h86 f;
    public final lsc g;
    public zy7 h;
    public final lsc i;
    public final lsc j;
    public final lsc k;
    public final lsc l;
    public final lsc m;
    public final lsc n;
    public final lsc o;
    public final lsc p;
    public final LinkedHashMap q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p05(Context context, er4 er4Var, String str, ov4 ov4Var, qi3 qi3Var, h86 h86Var) {
        super(h86Var);
        context.getClass();
        str.getClass();
        this.b = context;
        this.c = er4Var;
        this.d = str;
        this.e = ov4Var;
        this.f = h86Var;
        this.g = mpk.P(null);
        this.h = new oob(19);
        ez4 ez4Var = ez4.a;
        this.i = mpk.P(ez4Var);
        this.j = mpk.P(null);
        this.k = mpk.P(null);
        this.l = mpk.P(null);
        this.m = mpk.P(null);
        this.n = mpk.P(ez4Var);
        this.o = mpk.P(ez4Var);
        this.p = mpk.P(null);
        this.q = new LinkedHashMap();
    }

    public static final String O(p05 p05Var, Throwable th) {
        Context context = p05Var.b;
        if ((th instanceof ConnectException) || (th instanceof SocketTimeoutException)) {
            String string = context.getString(R.string.conway_ext_error_unreachable);
            string.getClass();
            return string;
        }
        String message = th.getMessage();
        if (message != null) {
            return message;
        }
        String string2 = context.getString(R.string.conway_ext_error_title);
        string2.getClass();
        return string2;
    }

    public final void P(ewc ewcVar) {
        hsf hsfVarR = R();
        tp4 tp4Var = null;
        if (hsfVarR == null) {
            V(null);
            W(null);
            U(this.b.getString(R.string.conway_ext_error_no_session));
        } else {
            V(null);
            W(null);
            gb9.D(this.a, null, null, new t74(this, hsfVarR, ewcVar, tp4Var, 13), 3);
        }
    }

    public final fz4 Q() {
        return (fz4) this.o.getValue();
    }

    public final hsf R() {
        return (hsf) this.g.getValue();
    }

    public final void S() {
        hsf hsfVarR = R();
        if (hsfVarR == null) {
            this.i.setValue(ez4.a);
        } else {
            gb9.D(this.a, null, null, new w14(this, hsfVarR, (tp4) null, 14), 3);
        }
    }

    public final void T() {
        gb9.D(this.a, null, null, new m05(this, null, 1), 3);
    }

    public final void U(String str) {
        this.l.setValue(str);
    }

    public final void V(ewc ewcVar) {
        this.j.setValue(ewcVar);
    }

    public final void W(ewc ewcVar) {
        this.k.setValue(ewcVar);
    }

    public final void X(fz4 fz4Var) {
        this.o.setValue(fz4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(java.lang.String r15, java.lang.String r16, java.lang.String r17, defpackage.vp4 r18) {
        /*
            r14 = this;
            r0 = r18
            boolean r1 = r0 instanceof defpackage.o05
            if (r1 == 0) goto L15
            r1 = r0
            o05 r1 = (defpackage.o05) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.H = r2
            goto L1a
        L15:
            o05 r1 = new o05
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.F
            int r2 = r1.H
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            dae r1 = r1.E
            defpackage.sf5.h0(r0)
            goto L63
        L2a:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r14)
            return r3
        L30:
            dae r0 = defpackage.vb7.h(r0)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r5 = "unreachable"
            r2.<init>(r5)
            hre r5 = new hre
            r5.<init>(r2)
            r0.E = r5
            com.anthropic.claude.api.conway.UpdateWebhookRequest r6 = new com.anthropic.claude.api.conway.UpdateWebhookRequest
            r11 = 3
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = r16
            r10 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r1.E = r0
            r1.H = r4
            er4 r2 = r14.c
            java.lang.String r4 = r14.d
            java.lang.Object r1 = r2.d(r4, r15, r6, r1)
            m45 r2 = defpackage.m45.E
            if (r1 != r2) goto L60
            return r2
        L60:
            r13 = r1
            r1 = r0
            r0 = r13
        L63:
            com.anthropic.claude.api.result.ApiResult r0 = (com.anthropic.claude.api.result.ApiResult) r0
            boolean r2 = r0 instanceof defpackage.of0
            if (r2 == 0) goto L9b
            r4 = r0
            of0 r4 = (defpackage.of0) r4
            java.lang.Object r4 = r4.b
            com.anthropic.claude.api.conway.UpdateWebhookResponse r4 = (com.anthropic.claude.api.conway.UpdateWebhookResponse) r4
            r14.T()
            java.lang.String r14 = r4.getSigning_secret()
            if (r14 == 0) goto L8e
            int r5 = r14.length()
            if (r5 != 0) goto L80
            goto L8e
        L80:
            b25 r5 = new b25
            java.lang.String r4 = r4.getSecret_header()
            if (r4 != 0) goto L8a
            java.lang.String r4 = "X-Webhook-Secret"
        L8a:
            r5.<init>(r14, r4)
            goto L98
        L8e:
            com.anthropic.claude.conway.system.ConwayWebhookAlreadyVerified r14 = new com.anthropic.claude.conway.system.ConwayWebhookAlreadyVerified
            r14.<init>()
            hre r5 = new hre
            r5.<init>(r14)
        L98:
            r1.E = r5
            goto L9f
        L9b:
            boolean r14 = r0 instanceof defpackage.nf0
            if (r14 == 0) goto Lbf
        L9f:
            if (r2 != 0) goto Lbc
            boolean r14 = r0 instanceof defpackage.nf0
            if (r14 == 0) goto Lb8
            nf0 r0 = (defpackage.nf0) r0
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            hre r0 = new hre
            r0.<init>(r14)
            r1.E = r0
            goto Lbc
        Lb8:
            defpackage.wg6.i()
            return r3
        Lbc:
            java.lang.Object r14 = r1.E
            return r14
        Lbf:
            defpackage.wg6.i()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p05.Y(java.lang.String, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }
}
