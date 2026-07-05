package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class uuk extends qtj {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uuk(Object obj, jrk jrkVar, int i) {
        super(jrkVar);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.qtj
    public final void c() throws Throwable {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((jsk) obj).k1();
                break;
            case 1:
                e5e e5eVar = (e5e) obj;
                yzk yzkVar = (yzk) e5eVar.H;
                yzkVar.K0();
                umk umkVar = (umk) yzkVar.E;
                umkVar.R.getClass();
                e5eVar.j(SystemClock.elapsedRealtime(), false, false);
                xoj xojVarH = umkVar.h();
                umkVar.R.getClass();
                xojVarH.O0(SystemClock.elapsedRealtime());
                break;
            default:
                h0l h0lVar = (h0l) obj;
                h0lVar.R0();
                h0lVar.b0().R.b("Starting upload from DelayedRunnable");
                h0lVar.F.c0();
                break;
        }
    }
}
