package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hve extends wu9 {
    public static final hve c = new hve("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hve(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                nm6 nm6Var = nm6.E;
                if (size == 0) {
                    return q5bVar.U(rl4.j(j), rl4.i(j), nm6Var, p9d.Z);
                }
                if (size == 1) {
                    c3d c3dVarU = ((h5b) list.get(0)).u(j);
                    return q5bVar.U(sl4.g(c3dVarU.E, j), sl4.f(c3dVarU.F, j), nm6Var, new sz(c3dVarU, 4));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    c3d c3dVarU2 = ((h5b) list.get(i)).u(j);
                    iMax = Math.max(c3dVarU2.E, iMax);
                    iMax2 = Math.max(c3dVarU2.F, iMax2);
                    arrayList.add(c3dVarU2);
                }
                return q5bVar.U(sl4.g(iMax, j), sl4.f(iMax2, j), nm6Var, new s10(2, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
