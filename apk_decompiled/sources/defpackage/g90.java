package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class g90 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ h90 G;
    public final /* synthetic */ long H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g90(h90 h90Var, long j, int i) {
        super(1);
        this.F = i;
        this.G = h90Var;
        this.H = j;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        kl7 kl7Var;
        int i = this.F;
        long j = this.H;
        h90 h90Var = this.G;
        switch (i) {
            case 0:
                t5i t5iVar = (t5i) obj;
                if (!x44.r(t5iVar.b(), h90Var.U.b())) {
                    wlg wlgVar = (wlg) h90Var.U.d.g(t5iVar.b());
                    j = wlgVar != null ? ((g79) wlgVar.getValue()).a : 0L;
                } else if (!g79.b(h90Var.V, -9223372034707292160L)) {
                    j = h90Var.V;
                }
                wlg wlgVar2 = (wlg) h90Var.U.d.g(t5iVar.c());
                j = wlgVar2 != null ? ((g79) wlgVar2.getValue()).a : 0L;
                a9g a9gVar = (a9g) h90Var.T.getValue();
                return (a9gVar == null || (kl7Var = (kl7) a9gVar.b.invoke(new g79(j), new g79(j))) == null) ? kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, null, 5) : kl7Var;
            default:
                if (x44.r(obj, h90Var.U.b())) {
                    j = g79.b(h90Var.V, -9223372034707292160L) ? j : h90Var.V;
                } else {
                    wlg wlgVar3 = (wlg) h90Var.U.d.g(obj);
                    if (wlgVar3 != null) {
                        j = ((g79) wlgVar3.getValue()).a;
                    }
                }
                return new g79(j);
        }
    }
}
