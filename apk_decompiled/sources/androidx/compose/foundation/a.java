package androidx.compose.foundation;

import defpackage.d19;
import defpackage.e18;
import defpackage.fqb;
import defpackage.h19;
import defpackage.iqb;
import defpackage.jd4;
import defpackage.ld4;
import defpackage.rz7;
import defpackage.vb7;
import defpackage.vue;
import defpackage.zub;
import defpackage.zy7;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements rz7 {
    public final /* synthetic */ h19 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ String G;
    public final /* synthetic */ vue H;
    public final /* synthetic */ zy7 I;

    public a(h19 h19Var, boolean z, String str, vue vueVar, zy7 zy7Var) {
        this.E = h19Var;
        this.F = z;
        this.G = str;
        this.H = vueVar;
        this.I = zy7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        e18 e18Var = (e18) ((ld4) obj2);
        e18Var.a0(-1525724089);
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = vb7.f(e18Var);
        }
        zub zubVar = (zub) objN;
        iqb iqbVarB = d19.a(fqb.E, zubVar, this.E).B(new ClickableElement(zubVar, null, false, this.F, this.G, this.H, this.I));
        e18Var.p(false);
        return iqbVarB;
    }
}
