package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class tx9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ vx9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tx9(vx9 vx9Var, int i) {
        super(0);
        this.F = i;
        this.G = vx9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        vx9 vx9Var = this.G;
        switch (i) {
            case 0:
                return sf5.q(vx9Var);
            case 1:
                vd9 vd9Var = vx9Var.L;
                ArrayList<ybe> typeParameters = ((jbe) vd9Var).getTypeParameters();
                ArrayList arrayList = new ArrayList(x44.y(typeParameters, 10));
                for (ybe ybeVar : typeParameters) {
                    qai qaiVarJ = ((tai) vx9Var.N.F).j(ybeVar);
                    if (qaiVarJ == null) {
                        throw new AssertionError("Parameter " + ybeVar + " surely belongs to class " + vd9Var + ", so it must be resolved");
                    }
                    arrayList.add(qaiVarJ);
                }
                return arrayList;
            default:
                if (o06.f(vx9Var) == null) {
                    return null;
                }
                ((ke9) vx9Var.K.E).w.getClass();
                return null;
        }
    }
}
