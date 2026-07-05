package defpackage;

import com.anthropic.claude.sessions.types.RepoWithStatus;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gt0 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ gt0(pz7 pz7Var, String str, boolean z, nwb nwbVar) {
        this.E = 2;
        this.G = pz7Var;
        this.H = str;
        this.F = z;
        this.I = nwbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    @Override // defpackage.zy7
    public final Object a() {
        ?? C;
        Object next;
        mlg mlgVar;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj = this.I;
        Object obj2 = this.H;
        boolean z = this.F;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                bz7 bz7Var = (bz7) obj3;
                yt0 yt0Var = (yt0) obj2;
                zy7 zy7Var = (zy7) obj;
                if (!z) {
                    bz7Var.invoke(yt0Var);
                }
                zy7Var.a();
                break;
            case 1:
                bz7 bz7Var2 = (bz7) obj3;
                s51 s51Var = (s51) obj2;
                ((nwb) obj).setValue(Boolean.FALSE);
                if (!z) {
                    bz7Var2.invoke(s51Var);
                }
                break;
            case 2:
                nwb nwbVar = (nwb) obj;
                ((pz7) obj3).invoke((String) obj2, Boolean.valueOf(z));
                if (!z) {
                    nwbVar.setValue(Boolean.TRUE);
                }
                break;
            case 3:
                xhe xheVar = (xhe) obj2;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                String string = ((yih) obj3).d().G.toString();
                if (!z || bsg.I0(string)) {
                    C = xheVar.c();
                } else {
                    List listC = xheVar.c();
                    C = new ArrayList();
                    for (Object obj4 : listC) {
                        if (bsg.u0(((RepoWithStatus) obj4).getRepo().getId(), string, true)) {
                            C.add(obj4);
                        }
                    }
                }
                if (!linkedHashSet.isEmpty()) {
                    if (!z || bsg.I0(string)) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : (Iterable) C) {
                            if (linkedHashSet.contains(((RepoWithStatus) obj5).getRepo().getId())) {
                                arrayList.add(obj5);
                            } else {
                                arrayList2.add(obj5);
                            }
                        }
                    }
                }
                break;
            case 4:
                ((nwb) obj2).setValue(new rb7((String) obj));
                ((bz7) obj3).invoke(Boolean.valueOf(!z));
                break;
            case 5:
                bz7 bz7Var3 = (bz7) obj3;
                nwb nwbVar2 = (nwb) obj2;
                nwb nwbVar3 = (nwb) obj;
                if (z) {
                    List list = nlg.a;
                    String string2 = bsg.k1((String) nwbVar2.getValue()).toString();
                    string2.getClass();
                    mlgVar = new mlg("custom", "❓", 0, string2);
                } else {
                    Iterator it = nlg.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((mlg) next).a.equals((String) nwbVar3.getValue())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    mlgVar = (mlg) next;
                    if (mlgVar != null) {
                    }
                }
                bz7Var3.invoke(mlgVar);
                break;
            default:
                Set set = (Set) obj2;
                String str = (String) obj;
                ((bz7) obj3).invoke(z ? dxf.q0(set, str) : dxf.n0(set, str));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ gt0(Object obj, boolean z, Object obj2, Serializable serializable, int i) {
        this.E = i;
        this.G = obj;
        this.F = z;
        this.H = obj2;
        this.I = serializable;
    }

    public /* synthetic */ gt0(boolean z, bz7 bz7Var, Object obj, Object obj2, int i) {
        this.E = i;
        this.F = z;
        this.G = bz7Var;
        this.H = obj;
        this.I = obj2;
    }

    public /* synthetic */ gt0(boolean z, bz7 bz7Var, String str, nwb nwbVar) {
        this.E = 4;
        this.H = nwbVar;
        this.I = str;
        this.G = bz7Var;
        this.F = z;
    }
}
