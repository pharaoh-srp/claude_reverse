package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a16 extends j0 {
    public final dfa c;
    public final /* synthetic */ c16 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public a16(c16 c16Var) {
        this.d = c16Var;
        wk wkVar = c16Var.P;
        super(((r06) wkVar.d).a);
        gfa gfaVar = ((r06) wkVar.d).a;
        z06 z06Var = new z06(c16Var, 0);
        gfaVar.getClass();
        this.c = new dfa(gfaVar, z06Var);
    }

    @Override // defpackage.j0, defpackage.u9i
    public final xh3 a() {
        return this.d;
    }

    @Override // defpackage.u9i
    public final boolean c() {
        return true;
    }

    @Override // defpackage.m4
    public final Collection e() {
        c16 c16Var = this.d;
        esd esdVar = c16Var.I;
        wk wkVar = c16Var.P;
        List listR = ajk.r(esdVar, (cbi) wkVar.f);
        ArrayList arrayList = new ArrayList(x44.y(listR, 10));
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            arrayList.add(((aai) wkVar.c).g((ntd) it.next()));
        }
        ArrayList arrayListA1 = w44.a1(arrayList, ((r06) wkVar.d).n.t(c16Var));
        ArrayList<s6c> arrayList2 = new ArrayList();
        Iterator it2 = arrayListA1.iterator();
        while (it2.hasNext()) {
            xh3 xh3VarA = ((yr9) it2.next()).O().a();
            s6c s6cVar = xh3VarA instanceof s6c ? (s6c) xh3VarA : null;
            if (s6cVar != null) {
                arrayList2.add(s6cVar);
            }
        }
        if (!arrayList2.isEmpty()) {
            du6 du6Var = ((r06) wkVar.d).h;
            ArrayList arrayList3 = new ArrayList(x44.y(arrayList2, 10));
            for (s6c s6cVar2 : arrayList2) {
                gh3 gh3VarF = o06.f(s6cVar2);
                arrayList3.add(gh3VarF != null ? gh3VarF.b().b() : s6cVar2.getName().b());
            }
            du6Var.e(c16Var, arrayList3);
        }
        return w44.p1(arrayListA1);
    }

    @Override // defpackage.u9i
    public final List getParameters() {
        return (List) this.c.a();
    }

    @Override // defpackage.m4
    public final zp3 h() {
        return zp3.Y;
    }

    @Override // defpackage.j0
    /* JADX INFO: renamed from: m */
    public final qqb a() {
        return this.d;
    }

    public final String toString() {
        String str = this.d.getName().E;
        str.getClass();
        return str;
    }
}
