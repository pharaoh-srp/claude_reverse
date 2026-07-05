package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mw8 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ wlg F;
    public final /* synthetic */ nwb G;
    public final /* synthetic */ nwb H;

    public /* synthetic */ mw8(wlg wlgVar, nwb nwbVar, nwb nwbVar2, int i) {
        this.E = i;
        this.F = wlgVar;
        this.G = nwbVar;
        this.H = nwbVar2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        nwb nwbVar = this.H;
        nwb nwbVar2 = this.G;
        wlg wlgVar = this.F;
        switch (i) {
            case 0:
                return Boolean.valueOf((!((Boolean) wlgVar.getValue()).booleanValue() || ((Boolean) nwbVar2.getValue()).booleanValue() || ((Boolean) nwbVar.getValue()).booleanValue()) ? false : true);
            default:
                List list = (List) wlgVar.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    u7h u7hVar = (u7h) obj;
                    if (!((Set) nwbVar2.getValue()).contains(u7hVar.a()) && (bsg.I0((String) nwbVar.getValue()) || bsg.u0(u7hVar.a(), (String) nwbVar.getValue(), true) || bsg.u0(u7hVar.b(), (String) nwbVar.getValue(), true))) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }
}
