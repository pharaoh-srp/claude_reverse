package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o20 implements ComponentCallbacks2 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ o20(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    private final void a(Configuration configuration) {
    }

    private final void b() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        switch (this.E) {
            case 0:
                return;
            default:
                y50 y50Var = (y50) this.F;
                synchronized (y50Var) {
                    if (((r4e) ((WeakReference) y50Var.b).get()) == null) {
                        y50Var.c();
                        break;
                    }
                }
                return;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.E) {
            case 0:
                break;
            default:
                onTrimMemory(80);
                break;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        w4e w4eVarC;
        long jC;
        switch (this.E) {
            case 0:
                if (i >= 40) {
                    q20.d((q20) this.F);
                    return;
                }
                return;
            default:
                y50 y50Var = (y50) this.F;
                synchronized (y50Var) {
                    try {
                        r4e r4eVar = (r4e) ((WeakReference) y50Var.b).get();
                        if (r4eVar != null) {
                            n4e n4eVar = r4eVar.a;
                            if (i >= 40) {
                                w4e w4eVarC2 = r4eVar.c();
                                if (w4eVarC2 != null) {
                                    synchronized (w4eVarC2.c) {
                                        ((e5e) w4eVarC2.a.c).i(-1L);
                                        g11 g11Var = w4eVarC2.b;
                                        g11Var.F = 0;
                                        ((LinkedHashMap) g11Var.G).clear();
                                    }
                                }
                            } else if (i >= 20) {
                                ((x50) y50Var.c).a(n4eVar.a);
                            } else if (i >= 10 && (w4eVarC = r4eVar.c()) != null) {
                                synchronized (w4eVarC.c) {
                                    jC = ((e5e) w4eVarC.a.c).c();
                                }
                                long j = jC / 2;
                                synchronized (w4eVarC.c) {
                                    ((e5e) w4eVarC.a.c).i(j);
                                }
                            }
                        } else {
                            y50Var.c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
