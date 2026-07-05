package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class odc implements OnBackAnimationCallback {
    public final /* synthetic */ mdc a;

    public odc(mdc mdcVar) {
        this.a = mdcVar;
    }

    public final void onBackCancelled() {
        mdc mdcVar = this.a;
        dpf dpfVar = mdcVar.a;
        if (dpfVar == null) {
            sz6.j("This input is not added to any dispatcher.");
            return;
        }
        if (!mdcVar.b) {
            dpfVar.z(mdcVar, null);
        }
        mzb mzbVar = (mzb) dpfVar.G;
        mzbVar.getClass();
        if (mdcVar.equals(mzbVar.h) && -1 == mzbVar.g) {
            jzb jzbVarC = mzbVar.f;
            if (jzbVarC == null) {
                jzbVarC = mzbVar.c(-1);
            }
            mzbVar.f = null;
            mzbVar.g = 0;
            mzbVar.h = null;
            if (jzbVarC != null) {
                jzbVarC.a();
            }
            amg amgVar = mzbVar.a;
            nzb nzbVar = nzb.f;
            amgVar.getClass();
            amgVar.n(null, nzbVar);
        }
        mdcVar.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        hzb hzbVarB = rtk.b(backEvent);
        mdc mdcVar = this.a;
        dpf dpfVar = mdcVar.a;
        if (dpfVar == null) {
            sz6.j("This input is not added to any dispatcher.");
            return;
        }
        if (mdcVar.b) {
            mzb mzbVar = (mzb) dpfVar.G;
            mzbVar.getClass();
            if (mdcVar.equals(mzbVar.h) && -1 == mzbVar.g) {
                jzb jzbVarC = mzbVar.f;
                if (jzbVarC == null) {
                    jzbVarC = mzbVar.c(-1);
                }
                if (jzbVarC != null) {
                    jzbVarC.c(hzbVarB);
                }
                amg amgVar = mzbVar.a;
                ozb ozbVar = new ozb(hzbVarB);
                amgVar.getClass();
                amgVar.n(null, ozbVar);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        hzb hzbVarB = rtk.b(backEvent);
        mdc mdcVar = this.a;
        dpf dpfVar = mdcVar.a;
        if (dpfVar == null) {
            sz6.j("This input is not added to any dispatcher.");
        } else {
            if (mdcVar.b) {
                return;
            }
            dpfVar.z(mdcVar, hzbVarB);
            mdcVar.b = true;
        }
    }
}
