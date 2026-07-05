package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cw1 implements o5b {
    public static final cw1 b = new cw1(0);
    public static final cw1 c = new cw1(1);
    public static final fg7 d = new fg7(19);
    public static final cw1 e = new cw1(2);
    public static final cw1 f = new cw1(3);
    public static final cw1 g = new cw1(4);
    public final /* synthetic */ int a;

    public /* synthetic */ cw1(int i) {
        this.a = i;
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        int i = this.a;
        nm6 nm6Var = nm6.E;
        switch (i) {
            case 0:
                return q5bVar.U(rl4.j(j), rl4.i(j), nm6Var, new fg7(19));
            case 1:
                return q5bVar.U(rl4.h(j), rl4.g(j), nm6Var, d);
            case 2:
                return q5bVar.U(rl4.j(j), rl4.i(j), nm6Var, new fg7(19));
            case 3:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iMax = 0;
                int iMax2 = 0;
                while (i < size) {
                    c3d c3dVarU = ((h5b) list.get(i)).u(j);
                    iMax = Math.max(iMax, c3dVarU.E);
                    iMax2 = Math.max(iMax2, c3dVarU.F);
                    arrayList.add(c3dVarU);
                    i++;
                }
                return q5bVar.U(iMax, iMax2, nm6Var, new tz9(26, arrayList));
            default:
                return q5bVar.U(rl4.f(j) ? rl4.h(j) : 0, rl4.e(j) ? rl4.g(j) : 0, nm6Var, new fg7(19));
        }
    }
}
