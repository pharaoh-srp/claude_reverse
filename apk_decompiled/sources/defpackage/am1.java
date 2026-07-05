package defpackage;

import android.view.View;
import com.anthropic.claude.bell.BellModeService;

/* JADX INFO: loaded from: classes2.dex */
public final class am1 implements w4a {
    public final /* synthetic */ mj1 a;
    public final /* synthetic */ View b;

    public am1(v4a v4aVar, mj1 mj1Var, View view) {
        this.a = mj1Var;
        this.b = view;
    }

    @Override // defpackage.w4a
    public final void a() {
        Long ptt_background_stop_delay_ms;
        mj1 mj1Var = this.a;
        gj1 gj1Var = mj1Var.m;
        BellModeService bellModeService = mj1Var.I;
        if (bellModeService != null) {
            o1j o1jVar = mj1Var.e;
            gj1Var.getClass();
            lz1 lz1Var = uh6.F;
            BellConfig bellConfigB = gj1Var.b();
            bellModeService.b(o1jVar, v40.R((bellConfigB == null || (ptt_background_stop_delay_ms = bellConfigB.getPtt_background_stop_delay_ms()) == null) ? 30000L : ptt_background_stop_delay_ms.longValue(), zh6.MILLISECONDS), ((Boolean) gj1Var.i.getValue()).booleanValue());
        }
        lj1 lj1Var = mj1Var.H;
        if (lj1Var != null) {
            mj1Var.j.unbindService(lj1Var);
            mj1Var.K.m(null);
            mj1Var.I = null;
            mj1Var.H = null;
        }
        mj1Var.Y();
        this.b.setKeepScreenOn(false);
    }
}
