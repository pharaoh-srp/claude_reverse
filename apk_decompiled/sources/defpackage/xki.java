package defpackage;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class xki implements Runnable {
    public final LinkedList E;
    public final k99 F;
    public final gbf G;

    public xki(LinkedList linkedList, k99 k99Var, gbf gbfVar) {
        gbfVar.getClass();
        this.E = linkedList;
        this.F = k99Var;
        this.G = gbfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        um6 um6Var = um6.E;
        k99 k99Var = this.F;
        lj5 lj5VarU = k99Var.u(um6Var);
        if (lj5VarU == null) {
            return;
        }
        gbf gbfVar = this.G;
        pog pogVar = gbfVar.h;
        fi5 fi5Var = gbfVar.i;
        yg1 yg1VarM = pogVar.m();
        if (yg1VarM != null) {
            ih1 ih1Var = yg1VarM.a;
            wki wkiVarU = fi5Var.u(lj5VarU, yg1VarM.b, yg1VarM.c, ih1Var);
            pogVar.h(ih1Var, new kfe(wkiVarU.b), !wkiVarU.a);
            if (wkiVarU instanceof rki) {
                LinkedList linkedList = this.E;
                linkedList.offer(new xki(linkedList, k99Var, gbfVar));
            }
        }
    }
}
