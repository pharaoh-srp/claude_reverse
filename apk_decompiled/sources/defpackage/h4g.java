package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h4g implements ltb {
    public final /* synthetic */ cb9 a;

    public h4g(cb9 cb9Var) {
        this.a = cb9Var;
    }

    @Override // defpackage.ltb
    public final p5b b(q5b q5bVar, List list, long j) {
        q5bVar.getClass();
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        int iG = rl4.g(j);
        int iL = mwa.L(iG * 0.5f);
        h5b h5bVar = (h5b) w44.N0(list2);
        c3d c3dVarU = h5bVar != null ? h5bVar.u(rl4.a(0, 0, 0, 0, 11, j)) : null;
        int i = c3dVarU != null ? c3dVarU.F : 0;
        int i2 = iG - i;
        int i3 = i2 < 0 ? 0 : i2;
        c3d c3dVarU2 = ((h5b) w44.e1(list3)).u(rl4.a(0, 0, wd6.e0(iL - i, 0, i3), i3, 3, j));
        int i4 = c3dVarU2.F + i;
        if (i4 > iG) {
            i4 = iG;
        }
        cb9 cb9Var = this.a;
        if (cb9Var != null) {
            int i5 = iG - iL;
            float f = iG - i4;
            cb9Var.a = new bb9(f, d4c.W(MTTypesetterKt.kLineSkipLimitMultiplier, q5bVar.q0(k4g.c), wd6.d0((i4 - iL) / (i5 >= 1 ? i5 : 1), MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f)) + f);
        }
        return q5bVar.U(rl4.h(j), i4, nm6.E, new oh6(c3dVarU2, c3dVarU, i4, i));
    }
}
