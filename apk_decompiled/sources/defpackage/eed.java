package defpackage;

import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionChangedSource;

/* JADX INFO: loaded from: classes3.dex */
public final class eed extends iwe {
    public final lsc b;
    public final o82 c;

    public eed(w72 w72Var, dyh dyhVar, qi3 qi3Var, h86 h86Var) {
        super(h86Var);
        this.b = mpk.P(Boolean.FALSE);
        this.c = (w72Var == null || dyhVar == null || qi3Var == null) ? null : new o82(w72Var, dyhVar, qi3Var, MobileAppUseEvents$MobileAppUsePermissionChangedSource.CHAT_PROMPT, h86Var);
    }
}
