package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class zv2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ hw2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zv2(hw2 hw2Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = hw2Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        hw2 hw2Var = this.G;
        switch (i) {
            case 0:
                return new zv2(hw2Var, tp4Var, 0);
            case 1:
                return new zv2(hw2Var, tp4Var, 1);
            default:
                return new zv2(hw2Var, tp4Var, 2);
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
        return ((zv2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objC0;
        int i = this.E;
        iei ieiVar = iei.a;
        hw2 hw2Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    zy1 zy1Var = hw2Var.o;
                    ot6 ot6Var = new ot6(R.string.audio_permission_required);
                    this.F = 1;
                    if (zy1Var.b(this, ot6Var) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    fb6 fb6Var = hw2Var.e;
                    String str = hw2Var.X().b;
                    String strB0 = hw2Var.b0();
                    this.F = 1;
                    fb6Var.getClass();
                    tp4 tp4Var = null;
                    if (str == null) {
                        ebh.A("DraftMessageRepository: Tried to migrate draft to the same chat", null, false, 3);
                        objC0 = Boolean.TRUE;
                    } else {
                        objC0 = gb9.c0(fb6Var.c.b(), new eb6(fb6Var, strB0, str, tp4Var, 1), this);
                    }
                    if (objC0 == m45Var) {
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
                    this.F = 1;
                    if (hw2Var.U(this) == m45Var) {
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
