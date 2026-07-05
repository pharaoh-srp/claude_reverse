package defpackage;

import com.anthropic.claude.bell.BellModeService;

/* JADX INFO: loaded from: classes2.dex */
public final class g83 implements w4a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g83(v4a v4aVar, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.w4a
    public final void a() {
        Long ptt_background_stop_delay_ms;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                xc3 xc3Var = (xc3) obj;
                en1 en1Var = xc3Var.h;
                gj1 gj1Var = xc3Var.a;
                gj1Var.getClass();
                lz1 lz1Var = uh6.F;
                BellConfig bellConfigB = gj1Var.b();
                long jR = v40.R((bellConfigB == null || (ptt_background_stop_delay_ms = bellConfigB.getPtt_background_stop_delay_ms()) == null) ? 30000L : ptt_background_stop_delay_ms.longValue(), zh6.MILLISECONDS);
                boolean zBooleanValue = ((Boolean) gj1Var.i.getValue()).booleanValue();
                fn1 fn1Var = (fn1) en1Var.q.getValue();
                if (fn1Var != null) {
                    tn1 tn1Var = (tn1) fn1Var;
                    en1Var.s = tn1Var.l();
                    en1Var.t = tn1Var.c0;
                }
                BellModeService bellModeService = en1Var.m;
                if (bellModeService != null) {
                    bellModeService.b(o1j.E, jR, zBooleanValue);
                }
                en1Var.b();
                break;
            case 1:
                a09 a09Var = (a09) obj;
                fkg fkgVar = a09Var.g;
                if (fkgVar != null) {
                    fkgVar.d(null);
                }
                a09Var.d.d(new ll1(10));
                break;
            default:
                ((l5j) obj).O();
                break;
        }
    }
}
