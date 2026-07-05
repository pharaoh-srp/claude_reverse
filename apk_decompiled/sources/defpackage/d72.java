package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.EventUpdateV0Output;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateError;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateErrorErrorType;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResult;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class d72 extends dxh {
    public final String e;
    public final mc f;
    public final v72 g;
    public final String h;
    public final ewh i;

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 ewh, still in use, count: 2, list:
          (r2v5 ewh) from 0x0562: MOVE (r34v0 ewh) = (r2v5 ewh)
          (r2v5 ewh) from 0x01aa: MOVE (r34v2 ewh) = (r2v5 ewh)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public d72(com.anthropic.claude.models.organization.configtypes.EventUpdateInputDescriptions r44, defpackage.mwh r45, java.lang.String r46, defpackage.mc r47, defpackage.v72 r48) {
        /*
            Method dump skipped, instruction units count: 1397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d72.<init>(com.anthropic.claude.models.organization.configtypes.EventUpdateInputDescriptions, mwh, java.lang.String, mc, v72):void");
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z4;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1492810274);
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
            boolean zF = e18Var.f((EventUpdateV0Output) dlbVar.b());
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new e72((EventUpdateV0Output) dlbVar.b());
                e18Var.k0(objN);
            }
            e72 e72Var = (e72) objN;
            p();
            Object objB = dlbVar.b();
            EventUpdateV0OutputEventUpdateError eventUpdateV0OutputEventUpdateError = objB instanceof EventUpdateV0OutputEventUpdateError ? (EventUpdateV0OutputEventUpdateError) objB : null;
            int i3 = i2 >> 6;
            qvj.a(true, e72Var, z2, z4, (eventUpdateV0OutputEventUpdateError != null ? eventUpdateV0OutputEventUpdateError.getError_type() : null) == EventUpdateV0OutputEventUpdateErrorErrorType.SYSTEM_PERMISSION_DENIED, lvhVar.d, iqbVar, e18Var, (i3 & 57344) | (i3 & 7168) | 6 | (i2 & 29360128));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 4);
        }
    }

    @Override // defpackage.dxh
    public final Object g() {
        return new EventUpdateV0OutputEventUpdateError(EventUpdateV0OutputEventUpdateErrorErrorType.APP_PERMISSION_DENIED, "User denied calendar access in app.");
    }

    @Override // defpackage.dxh
    public final axh j(Object obj) {
        EventUpdateV0Output eventUpdateV0Output = (EventUpdateV0Output) obj;
        eventUpdateV0Output.getClass();
        if (!(eventUpdateV0Output instanceof EventUpdateV0OutputEventUpdateError)) {
            if (eventUpdateV0Output instanceof EventUpdateV0OutputEventUpdateResult) {
                return dxh.e(((EventUpdateV0OutputEventUpdateResult) eventUpdateV0Output).getUpdate_results(), new c32(8), new c32(9), new c32(10));
            }
            mr9.b();
            return null;
        }
        EventUpdateV0OutputEventUpdateError eventUpdateV0OutputEventUpdateError = (EventUpdateV0OutputEventUpdateError) eventUpdateV0Output;
        String loggingName = eventUpdateV0OutputEventUpdateError.getError_type().getLoggingName();
        String message = eventUpdateV0OutputEventUpdateError.getMessage();
        if (message == null) {
            message = "";
        }
        return new xwh(loggingName, message);
    }

    @Override // defpackage.dxh
    public final bxh k(Object obj) {
        EventUpdateV0Output eventUpdateV0Output = (EventUpdateV0Output) obj;
        eventUpdateV0Output.getClass();
        if (!(eventUpdateV0Output instanceof EventUpdateV0OutputEventUpdateError)) {
            return null;
        }
        EventUpdateV0OutputEventUpdateError eventUpdateV0OutputEventUpdateError = (EventUpdateV0OutputEventUpdateError) eventUpdateV0Output;
        return new bxh(eventUpdateV0OutputEventUpdateError.getError_type().getLoggingName(), eventUpdateV0OutputEventUpdateError.getMessage());
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
    public final java.lang.Object m(defpackage.tp4 r6, android.content.Context r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d72.m(tp4, android.content.Context, java.lang.String):java.lang.Object");
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
