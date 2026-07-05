package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.tasks.TaskStatus;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hah {
    public static final List a = x44.X(TaskStatus.NEEDS_ATTENTION, TaskStatus.ACTIVE, TaskStatus.COMPLETED);

    public static final void a(List list, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        list.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1340368723);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var = e18Var2;
            pzg.c(zy7Var, jvk.k(iqbVar, d4c.j0(R.string.task_pill_click_label, e18Var2)), false, xve.a, gm3.a(e18Var2).n, gm3.a(e18Var2).M, MTTypesetterKt.kLineSkipLimitMultiplier, 2.0f, null, null, fd9.q0(967746360, new ss2(list, i3), e18Var2), e18Var, ((i2 >> 3) & 14) | 12582912, 836);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new c3g(list, i, zy7Var, iqbVar, 4);
        }
    }
}
