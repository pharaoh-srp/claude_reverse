package defpackage;

import com.anthropic.claude.core.telemetry.SilentException;

/* JADX INFO: loaded from: classes.dex */
public final class al3 extends e1 implements f45 {
    public final /* synthetic */ int F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al3(b45 b45Var, int i) {
        super(b45Var);
        this.F = i;
    }

    private final void O0(c45 c45Var, Throwable th) {
    }

    private final void P0(c45 c45Var, Throwable th) {
    }

    @Override // defpackage.f45
    public final void x(c45 c45Var, Throwable th) {
        switch (this.F) {
            case 0:
                SilentException.a(new SilentException("Async app initializer failed", th), null, false, 3);
                break;
            case 1:
            case 2:
                break;
            case 3:
                bjk.e(null, th, "Caught Exception in Analytics Scope", "analytics_mobile.invoke.error", mwa.N(th), new u3a(12, th));
                break;
            default:
                vah vahVar = wah.I;
                if (vahVar != null) {
                    vahVar.invoke(new Exception("Caught Exception in Telemetry Scope: " + th.getMessage(), th));
                }
                break;
        }
    }
}
