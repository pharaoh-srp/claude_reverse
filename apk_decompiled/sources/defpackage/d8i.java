package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d8i extends xzg implements pz7 {
    public final /* synthetic */ boolean E;
    public final /* synthetic */ j8i F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8i(boolean z, j8i j8iVar, boolean z2, boolean z3, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = z;
        this.F = j8iVar;
        this.G = z2;
        this.H = z3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new d8i(this.E, this.F, this.G, this.H, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        d8i d8iVar = (d8i) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        d8iVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        j8i j8iVar = this.F;
        u5e u5eVar = j8iVar.d;
        sf5.h0(obj);
        if (this.E && j8iVar.c.f() != null) {
            j8iVar.f.e();
        }
        boolean z = this.H;
        boolean z2 = this.G;
        if (!z2 || !z) {
            if (z2) {
                try {
                    u5eVar.i().deleteEntry("trusted_device_binding");
                } catch (Throwable unused) {
                }
            } else if (z) {
                u5eVar.b();
            } else {
                u5eVar.a();
            }
        }
        return iei.a;
    }
}
