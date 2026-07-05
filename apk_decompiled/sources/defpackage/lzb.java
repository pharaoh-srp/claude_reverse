package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class lzb {
    public dpf a;
    public boolean b;

    public final void a() {
        dpf dpfVar = this.a;
        if (dpfVar == null) {
            sz6.j("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            dpfVar.z(this, null);
        }
        mzb mzbVar = (mzb) dpfVar.G;
        cd cdVar = (cd) dpfVar.F;
        mzbVar.getClass();
        if (equals(mzbVar.h) && -1 == mzbVar.g) {
            jzb jzbVarC = mzbVar.f;
            if (jzbVarC == null) {
                jzbVarC = mzbVar.c(-1);
            }
            mzbVar.f = null;
            mzbVar.g = 0;
            mzbVar.h = null;
            if (jzbVarC == null) {
                ((vdc) cdVar.F).a.run();
            } else {
                jzbVarC.b();
            }
            amg amgVar = mzbVar.a;
            nzb nzbVar = nzb.f;
            amgVar.getClass();
            amgVar.n(null, nzbVar);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
