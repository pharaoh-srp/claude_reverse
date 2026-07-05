package defpackage;

import com.anthropic.claude.code.remote.i;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a24 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ i G;
    public final /* synthetic */ String H;
    public final /* synthetic */ List I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a24(i iVar, String str, List list, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = iVar;
        this.H = str;
        this.I = list;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new a24(this.G, this.H, this.I, tp4Var, 0);
            default:
                return new a24(this.G, this.H, this.I, tp4Var, 1);
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
        return ((a24) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        List list = this.I;
        String str = this.H;
        i iVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    psf psfVar = iVar.z;
                    this.F = 1;
                    if (psfVar.e(str, list, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    psf psfVar2 = iVar.z;
                    this.F = 1;
                    if (psfVar2.e(str, list, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
