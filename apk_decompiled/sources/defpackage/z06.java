package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class z06 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ c16 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z06(c16 c16Var, int i) {
        super(0);
        this.F = i;
        this.G = c16Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        Object next;
        int i = this.F;
        int i2 = 0;
        int i3 = 1;
        c16 c16Var = this.G;
        switch (i) {
            case 0:
                return sf5.q(c16Var);
            case 1:
                return w44.p1(((r06) c16Var.P.d).e.y(c16Var.Z));
            case 2:
                esd esdVar = c16Var.I;
                if ((esdVar.G & 4) != 4) {
                    return null;
                }
                xh3 xh3VarE = c16Var.v0().e(iv1.w((txb) c16Var.P.e, esdVar.J), 18);
                if (xh3VarE instanceof qqb) {
                    return (qqb) xh3VarE;
                }
                return null;
            case 3:
                wk wkVar = c16Var.P;
                List list = c16Var.I.T;
                list.getClass();
                ArrayList<gsd> arrayList = new ArrayList();
                for (Object obj : list) {
                    if (on7.m.e(((gsd) obj).H).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
                for (gsd gsdVar : arrayList) {
                    bab babVar = (bab) wkVar.i;
                    gsdVar.getClass();
                    arrayList2.add(babVar.d(gsdVar, false));
                }
                return w44.a1(w44.a1(arrayList2, x44.Y(c16Var.n0())), ((r06) wkVar.d).n.f(c16Var));
            case 4:
                if (qy1.a(c16Var.O)) {
                    xz5 xz5VarW = xzk.w(c16Var);
                    xz5VarW.K = c16Var.W();
                    return xz5VarW;
                }
                List list2 = c16Var.I.T;
                list2.getClass();
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (!on7.m.e(((gsd) next).H).booleanValue()) {
                        }
                    } else {
                        next = null;
                    }
                }
                gsd gsdVar2 = (gsd) next;
                if (gsdVar2 != null) {
                    return ((bab) c16Var.P.i).d(gsdVar2, true);
                }
                return null;
            case 5:
                if (c16Var.M != 2) {
                    return lm6.E;
                }
                List<Integer> list3 = c16Var.I.Y;
                list3.getClass();
                if (list3.isEmpty()) {
                    return rlk.g(c16Var);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Integer num : list3) {
                    wk wkVar2 = c16Var.P;
                    r06 r06Var = (r06) wkVar2.d;
                    txb txbVar = (txb) wkVar2.e;
                    num.getClass();
                    gh3 gh3VarU = iv1.u(txbVar, num.intValue());
                    bh3 bh3Var = r06Var.t;
                    Set set = bh3.c;
                    qqb qqbVarA = bh3Var.a(gh3VarU, null);
                    if (qqbVarA != null) {
                        arrayList3.add(qqbVarA);
                    }
                }
                return arrayList3;
            default:
                wk wkVar3 = c16Var.P;
                if (!c16Var.isInline() && !c16Var.s0()) {
                    return null;
                }
                sqi sqiVarC = gvj.c(c16Var.I, (txb) wkVar3.e, (cbi) wkVar3.f, new b16(i2, (aai) wkVar3.c), new b16(i3, c16Var));
                if (sqiVarC != null) {
                    return sqiVarC;
                }
                if (c16Var.J.a(1, 5, 1)) {
                    return null;
                }
                tg3 tg3VarN0 = c16Var.n0();
                if (tg3VarN0 == null) {
                    xh6.d("Inline class has no primary constructor: ", c16Var);
                    return null;
                }
                List listI = tg3VarN0.I();
                listI.getClass();
                sxb name = ((eri) w44.L0(listI)).getName();
                name.getClass();
                j7g j7gVarW0 = c16Var.w0(name);
                if (j7gVarW0 != null) {
                    return new f39(name, j7gVarW0);
                }
                xh6.d("Value class has no underlying property: ", c16Var);
                return null;
        }
    }
}
