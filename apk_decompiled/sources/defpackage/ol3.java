package defpackage;

import com.anthropic.claude.core.telemetry.SilentException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ol3 implements ps7 {
    public final ps7 a;

    public ol3(ps7 ps7Var) {
        ps7Var.getClass();
        this.a = ps7Var;
    }

    public static void c(String str, Exception exc) {
        SilentException.a(new SilentException(ij0.j("FocusManager.", str, " failed"), exc), ozf.F, false, 2);
    }

    @Override // defpackage.ps7
    public final boolean a(int i) {
        try {
            return this.a.a(i);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            c("moveFocus", e2);
            return false;
        }
    }

    @Override // defpackage.ps7
    public final void b(boolean z) {
        try {
            this.a.b(false);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            c("clearFocus", e2);
        }
    }
}
