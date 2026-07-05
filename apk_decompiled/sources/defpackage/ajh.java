package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ajh extends qw5 implements pu9, r78, oe4 {
    public akh U;
    public boolean V;
    public final rx1 W;
    public Map X;

    public ajh(akh akhVar, i5i i5iVar, tkh tkhVar, boolean z, mp9 mp9Var) {
        this.U = akhVar;
        this.V = z;
        rx1 rx1Var = new rx1(akhVar.g);
        p1(rx1Var);
        this.W = rx1Var;
        akh akhVar2 = this.U;
        akhVar2.getClass();
        boolean z2 = this.V;
        boolean z3 = !z2;
        ahh ahhVar = akhVar2.a;
        ahhVar.getClass();
        ahhVar.E.setValue(new zgh(i5iVar, tkhVar, z2, z3, mp9Var.c == 4));
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        akh akhVar = this.U;
        fu9 layoutDirection = q5bVar.getLayoutDirection();
        wt7 wt7Var = (wt7) yb5.o(this, ve4.k);
        ahh ahhVar = akhVar.a;
        ahhVar.getClass();
        ygh yghVar = new ygh(q5bVar, layoutDirection, wt7Var, j);
        ahhVar.F.setValue(yghVar);
        zgh zghVar = (zgh) ahhVar.E.getValue();
        if (zghVar == null) {
            e39.d("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
            sz6.r();
            return null;
        }
        yjh yjhVarD = ahhVar.d(zghVar, yghVar);
        long j2 = yjhVarD.c;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        c3d c3dVarU = h5bVar.u(sf5.G(i, i, i2, i2));
        this.U.f.setValue(new va6(this.V ? q5bVar.c0(sf5.m(yjhVarD.b.b(0))) : MTTypesetterKt.kLineSkipLimitMultiplier));
        Map linkedHashMap = this.X;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap(2);
        }
        linkedHashMap.put(xt.a, Integer.valueOf(Math.round(yjhVarD.d)));
        linkedHashMap.put(xt.b, Integer.valueOf(Math.round(yjhVarD.e)));
        this.X = linkedHashMap;
        return q5bVar.U(i, i2, linkedHashMap, new mf1(c3dVarU, 8));
    }

    @Override // defpackage.r78
    public final void o0(m5c m5cVar) {
        this.U.c.setValue(m5cVar);
    }
}
