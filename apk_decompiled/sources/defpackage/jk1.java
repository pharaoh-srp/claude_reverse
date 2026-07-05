package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jk1 extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public nwb F;
    public int G;
    public final /* synthetic */ nwb H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ zub J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk1(boolean z, zub zubVar, nwb nwbVar, nwb nwbVar2, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = z;
        this.J = zubVar;
        this.F = nwbVar;
        this.H = nwbVar2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new jk1(this.I, this.J, this.F, this.H, tp4Var);
            default:
                return new jk1(this.H, this.I, this.J, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((jk1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        zub zubVar = this.J;
        boolean z = this.I;
        m45 m45Var = m45.E;
        nwb nwbVar = this.H;
        switch (i) {
            case 0:
                int i2 = this.G;
                if (i2 != 0) {
                    if (i2 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                if (!z) {
                    return ieiVar;
                }
                n2g n2gVar = zubVar.a;
                um umVar = new um(this.F, 2, nwbVar);
                this.G = 1;
                n2gVar.a(umVar, this);
                return m45Var;
            default:
                int i3 = this.G;
                if (i3 == 0) {
                    sf5.h0(obj);
                    odd oddVar = (odd) nwbVar.getValue();
                    if (oddVar == null) {
                        return ieiVar;
                    }
                    v79 pddVar = z ? new pdd(oddVar) : new ndd(oddVar);
                    if (zubVar != null) {
                        this.F = nwbVar;
                        this.G = 1;
                        if (zubVar.b(pddVar, this) == m45Var) {
                            return m45Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nwbVar = this.F;
                    sf5.h0(obj);
                }
                nwbVar.setValue(null);
                return ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk1(nwb nwbVar, boolean z, zub zubVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = nwbVar;
        this.I = z;
        this.J = zubVar;
    }
}
