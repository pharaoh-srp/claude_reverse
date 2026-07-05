package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pye extends ts9 implements zy7 {
    public final /* synthetic */ qye F;
    public final /* synthetic */ uye G;
    public final /* synthetic */ lj5 H;
    public final /* synthetic */ Map I;
    public final /* synthetic */ sxe J;
    public final /* synthetic */ long K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pye(qye qyeVar, uye uyeVar, lj5 lj5Var, Map map, sxe sxeVar, long j) {
        super(0);
        this.F = qyeVar;
        this.G = uyeVar;
        this.H = lj5Var;
        this.I = map;
        this.J = sxeVar;
        this.K = j;
    }

    @Override // defpackage.zy7
    public final Object a() {
        qye qyeVar = this.F;
        return qyeVar.a.a(this.G.c().a + qyeVar.b.a().d, this.H, this.I, this.J, this.K, this.G, 2, 0);
    }
}
