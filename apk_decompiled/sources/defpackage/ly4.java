package defpackage;

import com.anthropic.claude.bell.tts.f;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ly4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ c61 G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ly4(c61 c61Var, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = c61Var;
        this.H = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.H;
        c61 c61Var = this.G;
        switch (i) {
            case 0:
                return new ly4(c61Var, str, tp4Var, 0);
            default:
                return new ly4(c61Var, str, tp4Var, 1);
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
        return ((ly4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object objF;
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.H;
        c61 c61Var = this.G;
        m45 m45Var = m45.E;
        tp4 tp4Var = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    f fVar = (f) c61Var.F;
                    if (bsg.I0(str)) {
                        objF = ieiVar;
                    } else if (x44.r(fVar.c(), str)) {
                        objF = fVar.d() ? fVar.f(this) : fVar.e(this);
                    } else {
                        gb9.D((l45) c61Var.G, null, null, new ly4(c61Var, str, tp4Var, i2), 3);
                        objF = ieiVar;
                    }
                    if (objF == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    f fVar2 = (f) c61Var.F;
                    pj4 pj4Var = new pj4(1, str);
                    this.F = 1;
                    Set set = f.y;
                    if (fVar2.h(str, pj4Var, null, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
