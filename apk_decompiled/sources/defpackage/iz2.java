package defpackage;

import com.anthropic.claude.configs.flags.StreamSmoothingConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class iz2 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz2(nz2 nz2Var, String str, poj pojVar, boolean z, m11 m11Var, Map map, StreamSmoothingConfig streamSmoothingConfig, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = nz2Var;
        this.J = str;
        this.K = pojVar;
        this.H = z;
        this.L = m11Var;
        this.M = map;
        this.N = streamSmoothingConfig;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.N;
        Object obj3 = this.M;
        Object obj4 = this.L;
        Object obj5 = this.K;
        Object obj6 = this.J;
        Object obj7 = this.I;
        switch (i) {
            case 0:
                iz2 iz2Var = new iz2((nz2) obj7, (String) obj6, (poj) obj5, this.H, (m11) obj4, (Map) obj3, (StreamSmoothingConfig) obj2, tp4Var);
                iz2Var.G = obj;
                return iz2Var;
            default:
                iz2 iz2Var2 = new iz2(this.H, (pz7) obj7, (bz7) obj6, (nwb) obj5, (l45) obj4, (nwb) obj3, (zy7) obj2, tp4Var);
                iz2Var2.G = obj;
                return iz2Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((iz2) create((im2) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((iz2) create((e8d) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        Object obj2 = this.I;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                im2 im2Var = (im2) this.G;
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                lj2 lj2Var = new lj2((Map) obj4, 3, (StreamSmoothingConfig) obj3);
                this.G = null;
                this.F = 1;
                Object objC = nz2.c((nz2) obj2, (String) obj7, im2Var.a, im2Var.e, (poj) obj6, false, this.H, im2Var.g, (m11) obj5, lj2Var, this, 16);
                return objC == m45Var ? m45Var : objC;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    e8d e8dVar = (e8d) this.G;
                    if (this.H) {
                        nwb nwbVar = (nwb) obj6;
                        l45 l45Var = (l45) obj5;
                        nwb nwbVar2 = (nwb) obj4;
                        zy7 zy7Var = (zy7) obj3;
                        this.F = 1;
                        if (nc6.e(e8dVar, new ek5((bz7) obj7, nwbVar, l45Var, nwbVar2, 2), new ld6(zy7Var, nwbVar2, l45Var, nwbVar, 0), new ld6(zy7Var, nwbVar2, l45Var, nwbVar, 1), (pz7) obj2, this) == m45Var) {
                            return m45Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return iei.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz2(boolean z, pz7 pz7Var, bz7 bz7Var, nwb nwbVar, l45 l45Var, nwb nwbVar2, zy7 zy7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = z;
        this.I = pz7Var;
        this.J = bz7Var;
        this.K = nwbVar;
        this.L = l45Var;
        this.M = nwbVar2;
        this.N = zy7Var;
    }
}
