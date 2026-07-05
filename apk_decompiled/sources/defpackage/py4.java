package defpackage;

import com.anthropic.claude.analytics.events.ConwayEvents$ConwaySearchOpened;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.ModelInfo;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class py4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ f F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ py4(f fVar, nwb nwbVar, int i) {
        this.E = i;
        this.F = fVar;
        this.G = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.G;
        f fVar = this.F;
        switch (i) {
            case 0:
                fVar.j0();
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 1:
                fVar.l.e(new ConwayEvents$ConwaySearchOpened(), ConwayEvents$ConwaySearchOpened.Companion.serializer());
                nwbVar.setValue(Boolean.TRUE);
                break;
            default:
                fz4 fz4Var = (fz4) fVar.U.getValue();
                dz4 dz4Var = fz4Var instanceof dz4 ? (dz4) fz4Var : null;
                if (dz4Var != null) {
                    nwbVar.setValue((ModelInfo) dz4Var.a);
                }
                break;
        }
        return ieiVar;
    }
}
