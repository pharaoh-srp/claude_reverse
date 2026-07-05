package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rb6 implements h6e {
    public final /* synthetic */ nwb a;
    public final /* synthetic */ nwb b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ nwb d;
    public final /* synthetic */ nwb e;
    public final /* synthetic */ nwb f;
    public final /* synthetic */ nwb g;

    public rb6(nwb nwbVar, nwb nwbVar2, Context context, nwb nwbVar3, nwb nwbVar4, nwb nwbVar5, nwb nwbVar6) {
        this.a = nwbVar;
        this.b = nwbVar2;
        this.c = context;
        this.d = nwbVar3;
        this.e = nwbVar4;
        this.f = nwbVar5;
        this.g = nwbVar6;
    }

    @Override // defpackage.h6e
    public final o5l a(o5l o5lVar) {
        pz7 pz7Var;
        pz7 pz7Var2;
        bz7 bz7Var;
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final dae daeVar = new dae();
        daeVar.E = "";
        int iF = o5lVar.f();
        final go4 go4Var = bvk.g(iF, 1) ? go4.E : bvk.g(iF, 0) ? go4.F : bvk.g(iF, 2) ? go4.G : go4.H;
        final Context context = this.c;
        final nwb nwbVar = this.d;
        final nwb nwbVar2 = this.e;
        final nwb nwbVar3 = this.f;
        final nwb nwbVar4 = this.g;
        o5l o5lVarK = cvk.k(o5lVar, new bz7() { // from class: qb6
            /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
            @Override // defpackage.bz7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r14) {
                /*
                    Method dump skipped, instruction units count: 448
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qb6.invoke(java.lang.Object):java.lang.Object");
            }
        });
        if (((CharSequence) daeVar.E).length() > 0 && (bz7Var = (bz7) nwbVar3.getValue()) != null) {
            bz7Var.invoke(daeVar.E);
        }
        if (!arrayList.isEmpty() && (pz7Var2 = (pz7) nwbVar2.getValue()) != null) {
            pz7Var2.invoke(arrayList, go4Var);
        }
        if (!arrayList2.isEmpty() && (pz7Var = (pz7) nwbVar4.getValue()) != null) {
            pz7Var.invoke(arrayList2, go4Var);
        }
        return o5lVarK;
    }

    @Override // defpackage.h6e
    public final void c() {
        ((bz7) this.a.getValue()).invoke(Boolean.FALSE);
    }

    @Override // defpackage.h6e
    public final void d() {
        ((bz7) this.a.getValue()).invoke(Boolean.TRUE);
    }

    @Override // defpackage.h6e
    public final void e() {
        bz7 bz7Var = (bz7) this.a.getValue();
        Boolean bool = Boolean.FALSE;
        bz7Var.invoke(bool);
        ((bz7) this.b.getValue()).invoke(bool);
    }
}
