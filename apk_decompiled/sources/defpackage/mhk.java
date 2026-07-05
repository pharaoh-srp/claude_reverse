package defpackage;

import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.internal.measurement.z;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mhk extends nxk {
    public final void f(z zVar) {
        c();
        x.v((x) this.F, zVar);
    }

    public final void g(nhk nhkVar) {
        c();
        x.v((x) this.F, (z) nhkVar.b());
    }

    public final z h(int i) {
        return ((x) this.F).q(i);
    }

    public final long i() {
        return ((x) this.F).B();
    }

    public final String j() {
        return ((x) this.F).D();
    }

    public final List k() {
        return Collections.unmodifiableList(((x) this.F).E());
    }
}
