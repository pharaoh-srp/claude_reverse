package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.bell.b;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class rl1 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fm1 F;
    public final /* synthetic */ nwb G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl1(fm1 fm1Var, nwb nwbVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = fm1Var;
        this.G = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        nwb nwbVar = this.G;
        fm1 fm1Var = this.F;
        switch (i) {
            case 0:
                return new rl1(fm1Var, nwbVar, tp4Var, 0);
            default:
                return new rl1(fm1Var, nwbVar, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((rl1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((rl1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.G;
        fm1 fm1Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                int iOrdinal = fm1Var.ordinal();
                if (iOrdinal != 2 && iOrdinal != 3) {
                    switch (iOrdinal) {
                        default:
                            Set set = b.a;
                            nwbVar.setValue(null);
                        case 16:
                        case g.MAX_FIELD_NUMBER /* 17 */:
                        case g.AVG_FIELD_NUMBER /* 18 */:
                            return ieiVar;
                    }
                }
                break;
            default:
                sf5.h0(obj);
                int iOrdinal2 = fm1Var.ordinal();
                if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                    switch (iOrdinal2) {
                        default:
                            nwbVar.setValue(null);
                        case 16:
                        case g.MAX_FIELD_NUMBER /* 17 */:
                        case g.AVG_FIELD_NUMBER /* 18 */:
                            return ieiVar;
                    }
                }
                break;
        }
        return ieiVar;
    }
}
