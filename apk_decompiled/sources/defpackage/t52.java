package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t52 implements bz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ List G;

    public /* synthetic */ t52(String str, List list) {
        this.F = str;
        this.G = list;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        int i = this.E;
        int i2 = 1;
        List list = this.G;
        String str = this.F;
        lze lzeVar = (lze) obj;
        switch (i) {
            case 0:
                lzeVar.getClass();
                tze tzeVarL0 = lzeVar.L0(str);
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        tzeVarL0.N(i2, (String) it.next());
                        i2++;
                    }
                    tzeVarL0.H0();
                    tzeVarL0.close();
                    return iei.a;
                } catch (Throwable th) {
                    tzeVarL0.close();
                    throw th;
                }
            default:
                lzeVar.getClass();
                tze tzeVarL02 = lzeVar.L0(str);
                try {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        tzeVarL02.N(i2, (String) it2.next());
                        i2++;
                    }
                    int iV = iv1.v(tzeVarL02, "uuid");
                    int iV2 = iv1.v(tzeVarL02, "updated_at");
                    int iV3 = iv1.v(tzeVarL02, "project_json");
                    ArrayList arrayList = new ArrayList();
                    while (tzeVarL02.H0()) {
                        arrayList.add(new g62(tzeVarL02.g0(iV), new Date(tzeVarL02.getLong(iV2)), tzeVarL02.g0(iV3)));
                        break;
                    }
                    tzeVarL02.close();
                    return arrayList;
                } catch (Throwable th2) {
                    tzeVarL02.close();
                    throw th2;
                }
        }
    }

    public /* synthetic */ t52(String str, List list, h62 h62Var) {
        this.F = str;
        this.G = list;
    }
}
