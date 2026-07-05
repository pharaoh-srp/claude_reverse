package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ig1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;

    public /* synthetic */ ig1(int i, nwb nwbVar) {
        this.E = i;
        this.F = nwbVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.F;
        switch (i) {
            case 0:
                jdh jdhVar = (jdh) obj;
                nwbVar.setValue(jdhVar.d() ? jdhVar.c() : jdhVar.b());
                return ieiVar;
            case 1:
                List list = (List) obj;
                if (nwbVar != null) {
                    nwbVar.setValue(list);
                }
                return ieiVar;
            case 2:
                cu9 cu9Var = (cu9) obj;
                cu9Var.getClass();
                nwbVar.setValue(cu9Var);
                return ieiVar;
            case 3:
                Map map = (Map) obj;
                map.getClass();
                nwbVar.setValue(map);
                return ieiVar;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                nwbVar.setValue(bool);
                return ieiVar;
            case 5:
                ((Boolean) obj).booleanValue();
                nwbVar.setValue(null);
                return ieiVar;
            case 6:
                pf6 pf6Var = (pf6) obj;
                pf6Var.getClass();
                ((bz7) nwbVar.getValue()).invoke(pf6Var);
                return ieiVar;
            default:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((bz7) nwbVar.getValue()).invoke(f)).floatValue());
        }
    }
}
