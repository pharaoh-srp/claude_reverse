package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p5f implements s5f {
    public final q28 a;
    public boolean b;
    public Bundle c;
    public final u0h d;

    public p5f(q28 q28Var, eyi eyiVar) {
        q28Var.getClass();
        this.a = q28Var;
        this.d = new u0h(new p3f(3, eyiVar));
    }

    @Override // defpackage.s5f
    public final Bundle a() {
        Bundle bundleM = eve.m((cpc[]) Arrays.copyOf(new cpc[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleM.putAll(bundle);
        }
        for (Map.Entry entry : ((q5f) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((k5f) entry.getValue()).a().a();
            if (!ytk.l(bundleA)) {
                str.getClass();
                bundleM.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleM;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleI = this.a.i("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleM = eve.m((cpc[]) Arrays.copyOf(new cpc[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleM.putAll(bundle);
        }
        if (bundleI != null) {
            bundleM.putAll(bundleI);
        }
        this.c = bundleM;
        this.b = true;
    }
}
