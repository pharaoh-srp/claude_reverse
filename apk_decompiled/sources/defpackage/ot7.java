package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ot7 extends m08 implements pz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ot7(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        boolean zB;
        switch (this.E) {
            case 0:
                ft7 ft7Var = (ft7) obj;
                ft7 ft7Var2 = (ft7) obj2;
                pt7 pt7Var = (pt7) this.receiver;
                if (pt7Var.R && (zB = ft7Var2.b()) != ft7Var.b()) {
                    bz7 bz7Var = pt7Var.V;
                    if (bz7Var != null) {
                        bz7Var.invoke(Boolean.valueOf(zB));
                    }
                    cm4 cm4Var = qt7.S;
                    tp4 tp4Var = null;
                    if (zB) {
                        gb9.D(pt7Var.d1(), null, null, new fj(pt7Var, tp4Var, 9), 3);
                        dae daeVar = new dae();
                        d4c.a0(pt7Var, new l80(daeVar, 29, pt7Var));
                        sz9 sz9Var = (sz9) daeVar.E;
                        if (sz9Var != null) {
                            sz9Var.a();
                        } else {
                            sz9Var = null;
                        }
                        pt7Var.X = sz9Var;
                        m5c m5cVar = pt7Var.Y;
                        if (m5cVar != null && m5cVar.h1().R && pt7Var.R) {
                            j8.F(pt7Var, cm4Var);
                        }
                    } else {
                        sz9 sz9Var2 = pt7Var.X;
                        if (sz9Var2 != null) {
                            sz9Var2.b();
                        }
                        pt7Var.X = null;
                        if (pt7Var.R) {
                            j8.F(pt7Var, cm4Var);
                        }
                    }
                    yfd.W(pt7Var).V();
                    zub zubVar = pt7Var.U;
                    if (zubVar != null) {
                        ks7 ks7Var = pt7Var.W;
                        if (zB) {
                            if (ks7Var != null) {
                                pt7Var.s1(zubVar, new ls7(ks7Var));
                                pt7Var.W = null;
                            }
                            ks7 ks7Var2 = new ks7();
                            pt7Var.s1(zubVar, ks7Var2);
                            pt7Var.W = ks7Var2;
                        } else if (ks7Var != null) {
                            pt7Var.s1(zubVar, new ls7(ks7Var));
                            pt7Var.W = null;
                        }
                    }
                }
                return iei.a;
            default:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                int iIntValue = ((Number) obj2).intValue();
                serialDescriptor.getClass();
                dh9 dh9Var = (dh9) this.receiver;
                dh9Var.getClass();
                boolean z = !serialDescriptor.i(iIntValue) && serialDescriptor.h(iIntValue).c();
                dh9Var.b = z;
                return Boolean.valueOf(z);
        }
    }
}
