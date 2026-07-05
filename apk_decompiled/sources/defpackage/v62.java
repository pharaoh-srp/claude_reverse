package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.EventCreateV1Output;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1Error;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1ErrorErrorType;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1Result;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class v62 extends dxh {
    public final String e;
    public final mc f;
    public final v72 g;
    public final String h;
    public final ewh i;

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 ewh, still in use, count: 2, list:
          (r2v5 ewh) from 0x04cd: MOVE (r32v0 ewh) = (r2v5 ewh)
          (r2v5 ewh) from 0x02b9: MOVE (r32v3 ewh) = (r2v5 ewh)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public v62(com.anthropic.claude.models.organization.configtypes.EventCreateV1InputDescriptions r42, java.lang.String r43, defpackage.mwh r44, defpackage.mc r45, defpackage.v72 r46) {
        /*
            Method dump skipped, instruction units count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v62.<init>(com.anthropic.claude.models.organization.configtypes.EventCreateV1InputDescriptions, java.lang.String, mwh, mc, v72):void");
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z4;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-369280068);
        if ((i & 3072) == 0) {
            i2 = ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var.f(dlbVar) : e18Var.h(dlbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | i;
        } else {
            i2 = i;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? e18Var.f(lvhVar) : e18Var.h(lvhVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.g(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            z4 = z3;
            i2 |= e18Var.g(z4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            z4 = z3;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? e18Var.f(this) : e18Var.h(this) ? 67108864 : 33554432;
        }
        if (e18Var.Q(i2 & 1, (38347777 & i2) != 38347776)) {
            boolean zF = e18Var.f((EventCreateV1Output) dlbVar.b());
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new w62((EventCreateV1Output) dlbVar.b());
                e18Var.k0(objN);
            }
            w62 w62Var = (w62) objN;
            p();
            Object objB = dlbVar.b();
            EventCreateV1OutputEventCreateV1Error eventCreateV1OutputEventCreateV1Error = objB instanceof EventCreateV1OutputEventCreateV1Error ? (EventCreateV1OutputEventCreateV1Error) objB : null;
            int i3 = i2 >> 6;
            qvj.a(true, w62Var, z2, z4, (eventCreateV1OutputEventCreateV1Error != null ? eventCreateV1OutputEventCreateV1Error.getError_type() : null) == EventCreateV1OutputEventCreateV1ErrorErrorType.SYSTEM_PERMISSION_DENIED, lvhVar.d, iqbVar, e18Var, (i3 & 57344) | (i3 & 7168) | 6 | (i2 & 29360128));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 2);
        }
    }

    @Override // defpackage.dxh
    public final Object g() {
        return new EventCreateV1OutputEventCreateV1Error(EventCreateV1OutputEventCreateV1ErrorErrorType.APP_PERMISSION_DENIED, "User denied calendar access in app.");
    }

    @Override // defpackage.dxh
    public final axh j(Object obj) {
        EventCreateV1Output eventCreateV1Output = (EventCreateV1Output) obj;
        eventCreateV1Output.getClass();
        if (!(eventCreateV1Output instanceof EventCreateV1OutputEventCreateV1Error)) {
            if (eventCreateV1Output instanceof EventCreateV1OutputEventCreateV1Result) {
                return dxh.e(((EventCreateV1OutputEventCreateV1Result) eventCreateV1Output).getCreate_results(), new c32(2), new c32(3), new c32(4));
            }
            mr9.b();
            return null;
        }
        EventCreateV1OutputEventCreateV1Error eventCreateV1OutputEventCreateV1Error = (EventCreateV1OutputEventCreateV1Error) eventCreateV1Output;
        String loggingName = eventCreateV1OutputEventCreateV1Error.getError_type().getLoggingName();
        String message = eventCreateV1OutputEventCreateV1Error.getMessage();
        if (message == null) {
            message = "";
        }
        return new xwh(loggingName, message);
    }

    @Override // defpackage.dxh
    public final bxh k(Object obj) {
        EventCreateV1Output eventCreateV1Output = (EventCreateV1Output) obj;
        eventCreateV1Output.getClass();
        if (!(eventCreateV1Output instanceof EventCreateV1OutputEventCreateV1Error)) {
            return null;
        }
        EventCreateV1OutputEventCreateV1Error eventCreateV1OutputEventCreateV1Error = (EventCreateV1OutputEventCreateV1Error) eventCreateV1Output;
        return new bxh(eventCreateV1OutputEventCreateV1Error.getError_type().getLoggingName(), eventCreateV1OutputEventCreateV1Error.getMessage());
    }

    @Override // defpackage.dxh
    public final rok l() {
        return yxh.F;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dxh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.tp4 r5, android.content.Context r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.t62
            if (r0 == 0) goto L13
            r0 = r5
            t62 r0 = (defpackage.t62) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L1a
        L13:
            t62 r0 = new t62
            vp4 r5 = (defpackage.vp4) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            android.content.Context r6 = r0.E
            defpackage.sf5.h0(r5)
            goto L40
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L30:
            defpackage.sf5.h0(r5)
            r0.E = r6
            r0.H = r3
            java.lang.Object r5 = r4.u(r7, r0)
            m45 r4 = defpackage.m45.E
            if (r5 != r4) goto L40
            return r4
        L40:
            com.anthropic.claude.tool.model.EventCreateV1Input r5 = (com.anthropic.claude.tool.model.EventCreateV1Input) r5
            ud0 r4 = defpackage.ud0.d
            r4 = 2131886281(0x7f1200c9, float:1.9407136E38)
            java.lang.String r4 = r6.getString(r4)
            r4.getClass()
            r7 = 2131886280(0x7f1200c8, float:1.9407134E38)
            java.lang.String r6 = r6.getString(r7)
            r6.getClass()
            if (r5 == 0) goto L5f
            com.anthropic.claude.tool.model.CalendarCreatePreviewData r2 = new com.anthropic.claude.tool.model.CalendarCreatePreviewData
            r2.<init>(r5)
        L5f:
            com.anthropic.claude.tool.model.MobileAppToolPreviewInfo r5 = new com.anthropic.claude.tool.model.MobileAppToolPreviewInfo
            r7 = 2131230903(0x7f0800b7, float:1.8077872E38)
            r5.<init>(r7, r4, r6, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v62.m(tp4, android.content.Context, java.lang.String):java.lang.Object");
    }

    @Override // defpackage.dxh
    public final fwh n() {
        return this.i;
    }

    @Override // defpackage.dxh
    public final int p() {
        ud0 ud0Var = ud0.d;
        ud0 ud0Var2 = ud0.d;
        return R.drawable.anthropicon_calendar;
    }

    @Override // defpackage.dxh
    public final String r() {
        return this.h;
    }

    @Override // defpackage.dxh
    public final String s() {
        return this.e;
    }
}
