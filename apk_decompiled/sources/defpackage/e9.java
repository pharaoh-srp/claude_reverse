package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.account.VillageWeaverConsentState;

/* JADX INFO: loaded from: classes2.dex */
public final class e9 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ long G;
    public /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(long j, a80 a80Var, hsc hscVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 2;
        this.G = j;
        this.H = a80Var;
        this.I = hscVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                return new e9((f9) this.H, this.G, (VillageWeaverConsentState) obj2, tp4Var, 0);
            case 1:
                e9 e9Var = new e9((t53) this.H, (cae) obj2, tp4Var);
                e9Var.G = ((Number) obj).longValue();
                return e9Var;
            case 2:
                return new e9(this.G, (a80) this.H, (hsc) obj2, tp4Var);
            case 3:
                e9 e9Var2 = new e9((od6) obj2, this.G, tp4Var);
                e9Var2.H = obj;
                return e9Var2;
            case 4:
                return new e9((a80) this.H, this.G, (a80) obj2, tp4Var, 4);
            default:
                return new e9((m8g) this.H, this.G, (o8g) obj2, tp4Var, 5);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 1:
                break;
        }
        return ((e9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object objB;
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        Object obj2 = this.I;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                f9 f9Var = (f9) this.H;
                long j = this.G;
                VillageWeaverConsentState villageWeaverConsentState = (VillageWeaverConsentState) obj2;
                this.F = 1;
                if (f9Var.g == j) {
                    f9Var.d(new w8(villageWeaverConsentState, 1));
                    objB = f9Var.b(this);
                } else {
                    objB = ieiVar;
                }
                return objB == m45Var ? m45Var : ieiVar;
            case 1:
                long j2 = this.G;
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
                nn1 nn1Var = new nn1((t53) this.H, (cae) obj2, tp4Var, 21);
                this.G = j2;
                this.F = 1;
                return iuj.Q(j2, nn1Var, this) == m45Var ? m45Var : ieiVar;
            case 2:
                long j3 = this.G;
                hsc hscVar = (hsc) obj2;
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    if (j3 <= 0) {
                        return ieiVar;
                    }
                    hscVar.i(MTTypesetterKt.kLineSkipLimitMultiplier);
                    a80 a80Var = (a80) this.H;
                    Float f = new Float(MTTypesetterKt.kLineSkipLimitMultiplier);
                    this.F = 1;
                    if (a80Var.g(this, f) != m45Var) {
                    }
                    return m45Var;
                }
                if (i4 != 1 && i4 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                while (hscVar.h() < 0.95f) {
                    hscVar.i(Math.min(0.95f, (float) (1.0d - Math.exp((-((d69.a.c().b() - j3) / 1000.0d)) / 25.0d))));
                    this.F = 2;
                    if (d4c.K(100L, this) == m45Var) {
                        return m45Var;
                    }
                }
                return ieiVar;
            case 3:
                int i5 = this.F;
                if (i5 != 0) {
                    if (i5 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                l45 l45Var = (l45) this.H;
                rz7 rz7Var = ((od6) obj2).q0;
                fcc fccVar = new fcc(this.G);
                this.F = 1;
                return rz7Var.invoke(l45Var, fccVar, this) == m45Var ? m45Var : ieiVar;
            case 4:
                long j4 = this.G;
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    a80 a80Var2 = (a80) this.H;
                    Float f2 = new Float(Float.intBitsToFloat((int) (j4 >> 32)) + ((Number) a80Var2.e()).floatValue());
                    this.F = 1;
                    if (a80Var2.g(this, f2) != m45Var) {
                    }
                    return m45Var;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                a80 a80Var3 = (a80) obj2;
                Float f3 = new Float(Float.intBitsToFloat((int) (4294967295L & j4)) + ((Number) a80Var3.e()).floatValue());
                this.F = 2;
                if (a80Var3.g(this, f3) != m45Var) {
                    return ieiVar;
                }
                return m45Var;
            default:
                o8g o8gVar = (o8g) obj2;
                m8g m8gVar = (m8g) this.H;
                int i7 = this.F;
                if (i7 == 0) {
                    sf5.h0(obj);
                    a80 a80Var4 = m8gVar.a;
                    g79 g79Var = new g79(this.G);
                    mb0 mb0Var = o8gVar.S;
                    this.F = 1;
                    obj = a80.c(a80Var4, g79Var, mb0Var, null, this, 12);
                    if (obj == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i7 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                hb0 hb0Var = ((kb0) obj).b;
                return ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(t53 t53Var, cae caeVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 1;
        this.H = t53Var;
        this.I = caeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(od6 od6Var, long j, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 3;
        this.I = od6Var;
        this.G = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9(Object obj, long j, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.G = j;
        this.I = obj2;
    }
}
