package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qkb extends hqb implements oe4, pu9 {
    public LinkedHashMap S;

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        float f = ((va6) yb5.o(this, z79.c)).E;
        if (f < MTTypesetterKt.kLineSkipLimitMultiplier) {
            f = 0.0f;
        }
        c3d c3dVarU = h5bVar.u(j);
        boolean z = this.R && !Float.isNaN(f) && va6.a(f, MTTypesetterKt.kLineSkipLimitMultiplier) > 0;
        int iM0 = !Float.isNaN(f) ? q5bVar.M0(f) : 0;
        int iMax = c3dVarU.E;
        if (z) {
            iMax = Math.max(iMax, iM0);
        }
        int iMax2 = c3dVarU.F;
        if (z) {
            iMax2 = Math.max(iMax2, iM0);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.S;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.S = linkedHashMap;
            }
            uti utiVar = z79.b;
            int iRound = Math.round((iM0 - c3dVarU.E) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(utiVar, Integer.valueOf(iRound));
            mo8 mo8Var = z79.a;
            int iRound2 = Math.round((iM0 - c3dVarU.F) / 2.0f);
            linkedHashMap.put(mo8Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.S;
        if (map == null) {
            map = nm6.E;
        }
        return q5bVar.U(iMax, iMax2, map, new l59(iMax, iMax2, c3dVarU));
    }
}
