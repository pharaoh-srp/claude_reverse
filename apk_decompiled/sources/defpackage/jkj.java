package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jkj extends ts9 implements pz7 {
    public final /* synthetic */ r10 F;
    public final /* synthetic */ o9d G;
    public final /* synthetic */ z9e H;
    public final /* synthetic */ z9e I;
    public final /* synthetic */ dae J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkj(r10 r10Var, o9d o9dVar, z9e z9eVar, z9e z9eVar2, dae daeVar) {
        super(2);
        this.F = r10Var;
        this.G = o9dVar;
        this.H = z9eVar;
        this.I = z9eVar2;
        this.J = daeVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        t7d t7dVar = (t7d) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        t7dVar.getClass();
        List list = t7dVar.a;
        if (zBooleanValue) {
            float fD = gvk.d(t7dVar, true);
            float fD2 = gvk.d(t7dVar, false);
            float f = (fD == MTTypesetterKt.kLineSkipLimitMultiplier || fD2 == MTTypesetterKt.kLineSkipLimitMultiplier) ? 1.0f : fD / fD2;
            long jE = gvk.e(t7dVar);
            if (f != 1.0f || !fcc.c(jE, 0L)) {
                long jC = gvk.c(t7dVar, true);
                long j = ((z7d) list.get(0)).b;
                if (((Boolean) this.F.invoke(new fcc(jE), Float.valueOf(f))).booleanValue()) {
                    qkj qkjVar = (qkj) this.G.G;
                    if (qkjVar.V) {
                        gb9.D(qkjVar.d1(), null, null, new okj(qkjVar, jE, f, jC, j, null), 3);
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
            this.H.E = true;
        }
        if (list.size() > 1) {
            this.I.E = true;
        }
        this.J.E = list.get(0);
        return iei.a;
    }
}
