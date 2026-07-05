package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jb6 implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ArrayList F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ jb6(ArrayList arrayList, nwb nwbVar, int i) {
        this.E = i;
        this.F = arrayList;
        this.G = nwbVar;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.G;
        ArrayList arrayList = this.F;
        switch (i) {
            case 0:
                v79 v79Var = (v79) obj;
                if (v79Var instanceof hb6) {
                    arrayList.add(v79Var);
                } else if (v79Var instanceof ib6) {
                    arrayList.remove(((ib6) v79Var).a());
                }
                nwbVar.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                v79 v79Var2 = (v79) obj;
                if (v79Var2 instanceof ad6) {
                    arrayList.add(v79Var2);
                } else if (v79Var2 instanceof bd6) {
                    arrayList.remove(((bd6) v79Var2).a());
                } else if (v79Var2 instanceof zc6) {
                    arrayList.remove(((zc6) v79Var2).a());
                }
                nwbVar.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                v79 v79Var3 = (v79) obj;
                if (v79Var3 instanceof ks7) {
                    arrayList.add(v79Var3);
                } else if (v79Var3 instanceof ls7) {
                    arrayList.remove(((ls7) v79Var3).a());
                }
                nwbVar.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return ieiVar;
    }
}
