package defpackage;

import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class tof extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ uof H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tof(long j, long j2, uof uofVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = j;
        this.G = j2;
        this.H = uofVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        tof tofVar = new tof(this.F, this.G, this.H, tp4Var);
        tofVar.E = obj;
        return tofVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        tof tofVar = (tof) create((yvb) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        tofVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        yvb yvbVar = (yvb) this.E;
        sf5.h0(obj);
        yvbVar.d(uof.c, new Long(this.F));
        yvbVar.d(uof.d, new Long(this.G));
        yvbVar.d(uof.e, new Long(Settings.Global.getLong(this.H.a.getContentResolver(), "boot_count", 0L)));
        return iei.a;
    }
}
