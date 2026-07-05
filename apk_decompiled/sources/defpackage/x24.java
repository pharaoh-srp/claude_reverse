package defpackage;

import com.anthropic.claude.code.remote.i;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x24 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ x0a F;
    public final /* synthetic */ i G;

    public /* synthetic */ x24(x0a x0aVar, i iVar, int i) {
        this.E = i;
        this.F = x0aVar;
        this.G = iVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        i iVar = this.G;
        x0a x0aVar = this.F;
        switch (i) {
            case 0:
                q0a q0aVar = (q0a) w44.V0(x0aVar.h().k);
                boolean z = false;
                if ((q0aVar != null ? q0aVar.a : 0) + 1 > r4.n - 5 && ((Boolean) iVar.U1.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                int i2 = x0aVar.h().n;
                zpf zpfVar = (zpf) w44.N0(iVar.p0());
                String id = zpfVar != null ? zpfVar.getId() : null;
                zpf zpfVar2 = (zpf) w44.V0(iVar.p0());
                return new f81(id, i2, zpfVar2 != null ? zpfVar2.getId() : null);
        }
    }
}
