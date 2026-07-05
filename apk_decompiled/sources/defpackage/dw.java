package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dw implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ uv F;

    public /* synthetic */ dw(uv uvVar, int i) {
        this.E = i;
        this.F = uvVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        uv uvVar = this.F;
        switch (i) {
            case 0:
                ((r4a) obj).getClass();
                uvVar.getClass();
                uvVar.t.setValue(new Date());
                gb9.D(uvVar.a, null, null, new pv(uvVar, null, 3), 3);
                return new le(3);
            default:
                gnd gndVar = (gnd) obj;
                gndVar.getClass();
                uvVar.p.setValue(gndVar);
                return iei.a;
        }
    }
}
