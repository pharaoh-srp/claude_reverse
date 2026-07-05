package defpackage;

import android.net.Uri;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class kw2 implements ow2, sw2 {
    public final UUID a;
    public final lsc b = mpk.P(null);
    public final lsc c = mpk.P(null);
    public final lsc d = mpk.P(Boolean.FALSE);
    public final lsc e = mpk.P(null);
    public final lsc f = mpk.P(null);
    public final lsc g = mpk.P(null);

    public kw2(UUID uuid) {
        this.a = uuid;
    }

    @Override // defpackage.sw2
    public final void b(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.sw2
    public final void c(Float f) {
        this.e.setValue(f);
    }

    @Override // defpackage.sw2
    public final void d(tw2 tw2Var) {
        this.g.setValue(tw2Var);
    }

    @Override // defpackage.sw2
    public final boolean e() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.sw2
    public final tw2 g() {
        return (tw2) this.g.getValue();
    }

    @Override // defpackage.sw2
    public final void h(vw2 vw2Var) {
        this.f.setValue(vw2Var);
    }

    @Override // defpackage.sw2
    public final Uri i() {
        return (Uri) this.c.getValue();
    }

    @Override // defpackage.ww2
    public final UUID j() {
        return this.a;
    }

    @Override // defpackage.sw2
    public final vw2 l() {
        return (vw2) this.f.getValue();
    }

    public final void m(String str) {
        this.b.setValue(str);
    }

    public final void n(Uri uri) {
        this.c.setValue(uri);
    }
}
