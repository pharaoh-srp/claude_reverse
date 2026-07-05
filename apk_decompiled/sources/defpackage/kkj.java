package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kkj extends ts9 implements pz7 {
    public final /* synthetic */ boolean F;
    public final /* synthetic */ r10 G;
    public final /* synthetic */ o9d H;
    public final /* synthetic */ z9e I;
    public final /* synthetic */ dae J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkj(boolean z, r10 r10Var, o9d o9dVar, z9e z9eVar, dae daeVar) {
        super(2);
        this.F = z;
        this.G = r10Var;
        this.H = o9dVar;
        this.I = z9eVar;
        this.J = daeVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        t7d t7dVar = (t7d) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        t7dVar.getClass();
        List list = t7dVar.a;
        z9e z9eVar = this.I;
        if (zBooleanValue) {
            if (this.F) {
                float fG = (fcc.g(gvk.e(t7dVar)) * 0.004f) + 1.0f;
                if (fG != 1.0f) {
                    long jC = gvk.c(t7dVar, true);
                    long j = ((z7d) list.get(0)).b;
                    if (((Boolean) this.G.invoke(new fcc(0L), Float.valueOf(fG))).booleanValue()) {
                        qkj qkjVar = (qkj) this.H.G;
                        if (qkjVar.V) {
                            gb9.D(qkjVar.d1(), null, null, new okj(qkjVar, 0L, fG, jC, j, null), 3);
                        }
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            z7d z7dVar = (z7d) list.get(i);
                            if (!fcc.c(hvj.r(z7dVar, false), 0L)) {
                                z7dVar.a();
                            }
                        }
                    }
                }
            }
            z9eVar.E = false;
        }
        if (list.size() > 1) {
            z9eVar.E = false;
        }
        this.J.E = list.get(0);
        return iei.a;
    }
}
