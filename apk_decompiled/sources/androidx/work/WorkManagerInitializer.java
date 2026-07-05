package androidx.work;

import android.content.Context;
import defpackage.bgj;
import defpackage.efe;
import defpackage.fg4;
import defpackage.nga;
import defpackage.u29;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkManagerInitializer implements u29 {
    static {
        nga.e("WrkMgrInitializer");
    }

    @Override // defpackage.u29
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.u29
    public final Object b(Context context) {
        nga.c().getClass();
        fg4 fg4Var = new fg4(new efe(9, (char) 0));
        context.getClass();
        bgj.e(context, fg4Var);
        bgj bgjVarD = bgj.d(context);
        bgjVarD.getClass();
        return bgjVarD;
    }
}
