package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nhh extends xzg implements rz7 {
    public int E;
    public /* synthetic */ hdd F;
    public /* synthetic */ long G;
    public final /* synthetic */ l45 H;
    public final /* synthetic */ nwb I;
    public final /* synthetic */ zub J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhh(l45 l45Var, nwb nwbVar, zub zubVar, tp4 tp4Var) {
        super(3, tp4Var);
        this.H = l45Var;
        this.I = nwbVar;
        this.J = zubVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((fcc) obj2).a;
        nwb nwbVar = this.I;
        zub zubVar = this.J;
        nhh nhhVar = new nhh(this.H, nwbVar, zubVar, (tp4) obj3);
        nhhVar.F = (hdd) obj;
        nhhVar.G = j;
        return nhhVar.invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        l45 l45Var = this.H;
        if (i == 0) {
            sf5.h0(obj);
            hdd hddVar = this.F;
            gb9.D(l45Var, null, null, new p0(this.I, this.G, this.J, (tp4) null, 8), 3);
            this.E = 1;
            obj = hddVar.E(this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        gb9.D(l45Var, null, null, new jk1(this.I, ((Boolean) obj).booleanValue(), this.J, null), 3);
        return iei.a;
    }
}
