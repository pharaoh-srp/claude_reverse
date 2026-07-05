package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cv0 implements bz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ List F;
    public final /* synthetic */ bz7 G;
    public final /* synthetic */ nwb H;
    public final /* synthetic */ nwb I;

    public /* synthetic */ cv0(bz7 bz7Var, List list, nwb nwbVar, nwb nwbVar2) {
        this.G = bz7Var;
        this.F = list;
        this.H = nwbVar;
        this.I = nwbVar2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.I;
        nwb nwbVar2 = this.H;
        bz7 bz7Var = this.G;
        List list = this.F;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                nwbVar2.setValue(bool);
                if (zBooleanValue && !bsg.I0((String) nwbVar.getValue())) {
                    bz7Var.invoke(w44.b1(list, (String) nwbVar.getValue()));
                } else {
                    bz7Var.invoke(w44.X0(list, (String) nwbVar.getValue()));
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                String str2 = (String) nwbVar2.getValue();
                nwbVar2.setValue(str);
                if (((Boolean) nwbVar.getValue()).booleanValue()) {
                    ArrayList arrayListX0 = w44.X0(list, str2);
                    if (!bsg.I0(str)) {
                        arrayListX0 = w44.b1(arrayListX0, str);
                    }
                    bz7Var.invoke(arrayListX0);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ cv0(List list, bz7 bz7Var, nwb nwbVar, nwb nwbVar2) {
        this.F = list;
        this.G = bz7Var;
        this.H = nwbVar;
        this.I = nwbVar2;
    }
}
