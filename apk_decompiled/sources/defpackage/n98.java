package defpackage;

import com.anthropic.claude.core.telemetry.SilentException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n98 {
    public static final long a;

    static {
        lz1 lz1Var = uh6.F;
        a = v40.Q(5000, zh6.MILLISECONDS);
    }

    public static final boolean a(did didVar) {
        int iF = didVar.f();
        if (iF != 1) {
            if (iF != 2) {
                if (iF != 3) {
                    SilentException.a(new SilentException(grc.p(didVar.f(), "Invalid product pricing recurrence mode: ")), null, false, 3);
                    return false;
                }
            } else if (didVar.a() > 1) {
            }
            return false;
        }
        return true;
    }
}
