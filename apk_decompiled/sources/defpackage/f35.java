package defpackage;

import android.view.autofill.AutofillValue;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f35 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ g35 F;

    public /* synthetic */ f35(g35 g35Var, ekf ekfVar) {
        this.E = 3;
        this.F = g35Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws IOException {
        int i = this.E;
        boolean z = false;
        g35 g35Var = this.F;
        switch (i) {
            case 0:
                lsc lscVar = g35Var.W.t;
                Boolean bool = Boolean.TRUE;
                lscVar.setValue(bool);
                g35Var.W.s.setValue(bool);
                m2a m2aVar = g35Var.W;
                AutofillValue autofillValue = ((g20) obj).a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                g35.s1(m2aVar, (String) textValue, g35Var.X, g35Var.Y);
                return bool;
            case 1:
                List list = (List) obj;
                if (g35Var.W.d() != null) {
                    zjh zjhVarD = g35Var.W.d();
                    zjhVarD.getClass();
                    list.add(zjhVarD.a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                g35.s1(g35Var.W, ((zb0) obj).F, g35Var.X, g35Var.Y);
                return Boolean.TRUE;
            default:
                zb0 zb0Var = (zb0) obj;
                if (!g35Var.X && g35Var.Y) {
                    njh njhVar = g35Var.W.e;
                    if (njhVar != null) {
                        List listX = x44.X(new jl7(), new n74(zb0Var, 1));
                        m2a m2aVar2 = g35Var.W;
                        epk epkVar = m2aVar2.d;
                        u25 u25Var = m2aVar2.v;
                        cjh cjhVarI = epkVar.i(listX);
                        njhVar.a(null, cjhVarI);
                        u25Var.invoke(cjhVarI);
                    } else {
                        cjh cjhVar = g35Var.V;
                        String str = cjhVar.a.F;
                        long j = cjhVar.b;
                        int i2 = kkh.c;
                        String string = bsg.U0(str, (int) (j >> 32), (int) (j & 4294967295L), zb0Var).toString();
                        int length = zb0Var.F.length() + ((int) (g35Var.V.b >> 32));
                        g35Var.W.v.invoke(new cjh(string, mwa.m(length, length), 4));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ f35(g35 g35Var, int i) {
        this.E = i;
        this.F = g35Var;
    }
}
