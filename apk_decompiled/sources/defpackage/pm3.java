package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pm3 implements i4a {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ pm3(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // defpackage.i4a
    public final void d(m4a m4aVar, y3a y3aVar) {
        int i = this.E;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                nwb nwbVar = (nwb) obj2;
                v77 v77Var = (v77) obj;
                int i2 = sm3.a[y3aVar.ordinal()];
                if (i2 == 1) {
                    nwbVar.setValue(Boolean.valueOf(v77Var.m()));
                    v77Var.F();
                    v77Var.C(1, false);
                    break;
                } else if (i2 == 2) {
                    Boolean bool = (Boolean) nwbVar.getValue();
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        v77Var.F();
                        v77Var.C(1, zBooleanValue);
                    }
                    nwbVar.setValue(null);
                    break;
                }
                break;
            case 1:
                nwb nwbVar2 = (nwb) obj2;
                if (y3aVar == ((y3a) obj)) {
                    ((zy7) nwbVar2.getValue()).a();
                }
                break;
            case 2:
                aya ayaVar = ((vza) obj).a;
                nwb nwbVar3 = (nwb) obj2;
                int i3 = nza.a[y3aVar.ordinal()];
                sfa sfaVar = sfa.DEBUG;
                if (i3 == 1) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj3)).getClass();
                            arrayList.add(obj3);
                        }
                        if (!arrayList.isEmpty()) {
                            zfa.a.getClass();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfaVar, "McpAppViewHost", "Lifecycle ON_PAUSE - pausing WebView");
                            }
                        }
                    }
                    ayaVar.onPause();
                    nwbVar3.setValue(Boolean.TRUE);
                    break;
                } else if (i3 == 2) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : copyOnWriteArrayList2) {
                            ((n30) ((zfa) obj4)).getClass();
                            arrayList2.add(obj4);
                        }
                        if (!arrayList2.isEmpty()) {
                            zfa.a.getClass();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                ((n30) ((zfa) it2.next())).b(sfaVar, "McpAppViewHost", "Lifecycle ON_RESUME - resuming WebView");
                            }
                        }
                    }
                    if (((Boolean) nwbVar3.getValue()).booleanValue()) {
                        ayaVar.onResume();
                        nwbVar3.setValue(Boolean.FALSE);
                    }
                    break;
                }
                break;
            default:
                List<wvb> list = (List) obj;
                if (y3aVar == ((y3a) obj2)) {
                    for (wvb wvbVar : list) {
                        if (!x44.r(wvbVar.e(), yxc.a)) {
                            wvbVar.b();
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ pm3(Object obj, nwb nwbVar, int i) {
        this.E = i;
        this.G = obj;
        this.F = nwbVar;
    }
}
