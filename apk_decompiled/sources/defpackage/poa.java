package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.LoginEvents$ManagedLoginBlocked;

/* JADX INFO: loaded from: classes3.dex */
public final class poa extends iwe {
    public final tga b;
    public final fja c;
    public final qi3 d;
    public final id e;
    public final q79 f;
    public final hj g;
    public final zpa h;
    public final hl8 i;
    public final zy1 j;
    public final zy1 k;
    public final lsc l;
    public final lsc m;
    public final lsc n;

    public poa(String str, tga tgaVar, fja fjaVar, qi3 qi3Var, id idVar, q79 q79Var, hj hjVar, zpa zpaVar, hl8 hl8Var, h86 h86Var) {
        super(h86Var);
        this.b = tgaVar;
        this.c = fjaVar;
        this.d = qi3Var;
        this.e = idVar;
        this.f = q79Var;
        this.g = hjVar;
        this.h = zpaVar;
        this.i = hl8Var;
        q79Var.d(str);
        this.j = x44.a();
        this.k = x44.a();
        this.l = mpk.P(Boolean.FALSE);
        this.m = mpk.P("");
        this.n = mpk.P(null);
    }

    public final void O(String str) {
        str.getClass();
        boolean zA = this.h.a();
        lsc lscVar = this.n;
        if (zA) {
            lscVar.setValue(null);
            gb9.D(this.a, null, null, new ooa(this, str, null), 3);
        } else {
            this.d.e(new LoginEvents$ManagedLoginBlocked("magic_link"), LoginEvents$ManagedLoginBlocked.Companion.serializer());
            lscVar.setValue(new ut6(R.string.login_managed_email_not_allowed));
        }
    }
}
