package defpackage;

import android.net.Uri;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class pw2 implements rw2, sw2 {
    public final UUID a;
    public final lsc b = mpk.P(null);
    public final lsc c = mpk.P(Boolean.FALSE);
    public final lsc d = mpk.P(null);
    public final lsc e = mpk.P(null);
    public final lsc f = mpk.P(null);

    public pw2(UUID uuid) {
        this.a = uuid;
    }

    @Override // defpackage.sw2
    public final void b(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.sw2
    public final void c(Float f) {
        this.d.setValue(f);
    }

    @Override // defpackage.sw2
    public final void d(tw2 tw2Var) {
        this.f.setValue(tw2Var);
    }

    @Override // defpackage.sw2
    public final boolean e() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.sw2
    public final tw2 g() {
        return (tw2) this.f.getValue();
    }

    @Override // defpackage.sw2
    public final void h(vw2 vw2Var) {
        this.e.setValue(vw2Var);
    }

    @Override // defpackage.sw2
    public final Uri i() {
        return (Uri) this.b.getValue();
    }

    @Override // defpackage.ww2
    public final UUID j() {
        return this.a;
    }

    @Override // defpackage.sw2
    public final vw2 l() {
        return (vw2) this.e.getValue();
    }

    public final void m(Uri uri) {
        this.b.setValue(uri);
    }
}
