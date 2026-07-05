package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: loaded from: classes.dex */
public final class bs5 implements i4a {
    public final /* synthetic */ int E = 0;
    public final Object F;
    public final Object G;

    public bs5(DefaultLifecycleObserver defaultLifecycleObserver, i4a i4aVar) {
        defaultLifecycleObserver.getClass();
        this.F = defaultLifecycleObserver;
        this.G = i4aVar;
    }

    @Override // defpackage.i4a
    public final void d(m4a m4aVar, y3a y3aVar) {
        int i = this.E;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) obj2;
                switch (as5.a[y3aVar.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.onCreate(m4aVar);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(m4aVar);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(m4aVar);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(m4aVar);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(m4aVar);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(m4aVar);
                        break;
                    case 7:
                        sz6.p("ON_ANY must not been send by anybody");
                        break;
                    default:
                        mr9.b();
                        break;
                }
                i4a i4aVar = (i4a) obj;
                if (i4aVar != null) {
                    i4aVar.d(m4aVar, y3aVar);
                }
                break;
            default:
                pdc pdcVar = (pdc) obj2;
                int i2 = udc.a[y3aVar.ordinal()];
                if (i2 == 1) {
                    pdcVar.g(true);
                    break;
                } else if (i2 == 2) {
                    pdcVar.g(false);
                    break;
                } else if (i2 == 3) {
                    pdcVar.e();
                    ((c4a) obj).c(this);
                    break;
                }
                break;
        }
    }

    public bs5(pdc pdcVar, vdc vdcVar, c4a c4aVar) {
        this.F = pdcVar;
        this.G = c4aVar;
    }
}
