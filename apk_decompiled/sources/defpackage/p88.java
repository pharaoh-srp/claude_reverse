package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes2.dex */
public final class p88 implements ComponentCallbacks2 {
    public final /* synthetic */ kta E;

    public p88(kta ktaVar) {
        this.E = ktaVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.E.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.E.a();
    }
}
