package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class st2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ hw2 F;

    public /* synthetic */ st2(hw2 hw2Var, int i) {
        this.E = i;
        this.F = hw2Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        sn8 sn8VarZ;
        int i = this.E;
        iei ieiVar = iei.a;
        hw2 hw2Var = this.F;
        switch (i) {
            case 0:
                fcc fccVar = (fcc) obj;
                sn8 sn8VarZ2 = hw2Var.Z();
                if ((sn8VarZ2 != null ? sn8VarZ2.a() : null) == null && (sn8VarZ = hw2Var.Z()) != null) {
                    grc.x(fccVar.a, sn8VarZ.c);
                }
                break;
            case 1:
                aig aigVar = (aig) obj;
                aigVar.getClass();
                if (aigVar instanceof zhg) {
                    hw2Var.R(((zhg) aigVar).a);
                } else if (aigVar instanceof yhg) {
                    hw2Var.R(((yhg) aigVar).a);
                } else if (!(aigVar instanceof xhg)) {
                    wg6.i();
                }
                hw2Var.K.setValue(Boolean.FALSE);
                break;
            case 2:
                if (!((Boolean) obj).booleanValue()) {
                    hw2Var.i0();
                }
                break;
            case 3:
                fcc fccVar2 = (fcc) obj;
                sn8 sn8VarZ3 = hw2Var.Z();
                if (sn8VarZ3 != null) {
                    long j = fccVar2.a;
                    if (sn8VarZ3.a() == null) {
                        grc.x(j, sn8VarZ3.c);
                        sn8VarZ3.d.setValue(((Boolean) sn8VarZ3.e.getValue()).booleanValue() ? qn8.F : qn8.E);
                    }
                }
                break;
            default:
                List list = (List) obj;
                list.getClass();
                hw2Var.P(list, ChatEvents$AttachmentSource.PASTE);
                break;
        }
        return ieiVar;
    }
}
