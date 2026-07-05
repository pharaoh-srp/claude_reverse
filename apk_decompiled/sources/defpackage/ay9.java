package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ay9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ by9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay9(by9 by9Var, int i) {
        super(0);
        this.F = i;
        this.G = by9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        by9 by9Var = this.G;
        switch (i) {
            case 0:
                efk efkVar = ((ke9) by9Var.L.E).l;
                by9Var.I.b();
                efkVar.getClass();
                return sta.p0(new ArrayList());
            case 1:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) wd6.s0(by9Var.M, by9.Q[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    bce bceVar = (bce) entry.getValue();
                    zj9 zj9VarD = zj9.d(str);
                    z81 z81Var = bceVar.b;
                    pr9 pr9Var = (pr9) z81Var.d;
                    int iOrdinal = pr9Var.ordinal();
                    if (iOrdinal == 2) {
                        map.put(zj9VarD, zj9VarD);
                    } else if (iOrdinal == 5) {
                        String str2 = z81Var.b;
                        if (pr9Var != pr9.MULTIFILE_CLASS_PART) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            map.put(zj9VarD, zj9.d(str2));
                        }
                    }
                }
                return map;
            default:
                by9Var.K.getClass();
                return new ArrayList(x44.y(lm6.E, 10));
        }
    }
}
