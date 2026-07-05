package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kag extends xzg implements rz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ long G;
    public final /* synthetic */ zub H;
    public /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kag(zub zubVar, Object obj, tp4 tp4Var, int i) {
        super(3, tp4Var);
        this.E = i;
        this.H = zubVar;
        this.J = obj;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj4 = this.J;
        zub zubVar = this.H;
        hdd hddVar = (hdd) obj;
        fcc fccVar = (fcc) obj2;
        switch (i) {
            case 0:
                long j = fccVar.a;
                kag kagVar = new kag(zubVar, (mag) obj4, (tp4) obj3, 0);
                kagVar.I = hddVar;
                kagVar.G = j;
                return kagVar.invokeSuspend(ieiVar);
            default:
                long j2 = fccVar.a;
                kag kagVar2 = new kag(zubVar, (sih) obj4, (tp4) obj3, 1);
                kagVar2.I = hddVar;
                kagVar2.G = j2;
                return kagVar2.invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Throwable th2;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.J;
        m45 m45Var = m45.E;
        odd oddVar = null;
        switch (i) {
            case 0:
                int i2 = this.F;
                zub zubVar = this.H;
                try {
                } catch (Throwable th3) {
                    th = th3;
                }
                if (i2 == 0) {
                    sf5.h0(obj);
                    hdd hddVar = (hdd) this.I;
                    long j = this.G;
                    odd oddVar2 = new odd(j);
                    try {
                        zubVar.c(oddVar2);
                        mag magVar = (mag) obj2;
                        magVar.q.i((magVar.m == ukc.E ? Float.intBitsToFloat((int) (j & 4294967295L)) : magVar.j ? magVar.h.h() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32))) - magVar.p.h());
                        this.I = oddVar2;
                        this.F = 1;
                        obj = hddVar.E(this);
                        if (obj != m45Var) {
                            oddVar = oddVar2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        oddVar = oddVar2;
                        if (oddVar == null) {
                            throw th;
                        }
                        ndd nddVar = new ndd(oddVar);
                        this.I = th;
                        this.F = 3;
                        if (zubVar.b(nddVar, this) != m45Var) {
                            th2 = th;
                            throw th2;
                        }
                    }
                    return m45Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    if (i2 != 3) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th2 = (Throwable) this.I;
                    sf5.h0(obj);
                    throw th2;
                }
                oddVar = (odd) this.I;
                sf5.h0(obj);
                zubVar.c(((Boolean) obj).booleanValue() ? new pdd(oddVar) : new ndd(oddVar));
                return ieiVar;
            default:
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                hdd hddVar2 = (hdd) this.I;
                long j2 = this.G;
                zub zubVar2 = this.H;
                if (zubVar2 == null) {
                    return ieiVar;
                }
                vn4 vn4Var = new vn4(hddVar2, (sih) obj2, j2, zubVar2, (tp4) null);
                this.F = 1;
                return fd9.N(vn4Var, this) == m45Var ? m45Var : ieiVar;
        }
    }
}
