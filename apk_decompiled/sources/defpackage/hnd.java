package defpackage;

import com.anthropic.claude.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hnd {
    public static final List a = x44.X(gnd.F, gnd.G, gnd.H, gnd.I);

    public static final ud0 a(gnd gndVar) {
        gndVar.getClass();
        int iOrdinal = gndVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            ud0 ud0Var = ud0.d;
            return ud0.E1;
        }
        if (iOrdinal == 2) {
            ud0 ud0Var2 = ud0.d;
            return ud0.x1;
        }
        if (iOrdinal == 3) {
            ud0 ud0Var3 = ud0.d;
            return ud0.o1;
        }
        if (iOrdinal == 4) {
            ud0 ud0Var4 = ud0.d;
            return ud0.h;
        }
        wg6.i();
        return null;
    }

    public static final int b(gnd gndVar) {
        gndVar.getClass();
        int iOrdinal = gndVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return R.string.project_filter_creator;
        }
        if (iOrdinal == 2) {
            return R.string.project_filter_team;
        }
        if (iOrdinal == 3) {
            return R.string.project_filter_shared;
        }
        if (iOrdinal == 4) {
            return R.string.project_filter_archived;
        }
        wg6.i();
        return 0;
    }
}
