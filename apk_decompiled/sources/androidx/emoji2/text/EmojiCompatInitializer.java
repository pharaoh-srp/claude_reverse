package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.c4a;
import defpackage.fj0;
import defpackage.gl6;
import defpackage.hl6;
import defpackage.il6;
import defpackage.kf5;
import defpackage.m4a;
import defpackage.u29;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements u29 {
    @Override // defpackage.u29
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.u29
    public final Object b(Context context) {
        Object objM;
        il6 il6Var = new il6(new kf5(context, 1));
        il6Var.a = 1;
        if (gl6.k == null) {
            synchronized (gl6.j) {
                try {
                    if (gl6.k == null) {
                        gl6.k = new gl6(il6Var);
                    }
                } finally {
                }
            }
        }
        fj0 fj0VarT = fj0.t(context);
        fj0VarT.getClass();
        synchronized (fj0.I) {
            try {
                objM = ((HashMap) fj0VarT.E).get(ProcessLifecycleInitializer.class);
                if (objM == null) {
                    objM = fj0VarT.m(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        c4a c4aVarA = ((m4a) objM).a();
        c4aVarA.a(new hl6(this, c4aVarA));
        return Boolean.TRUE;
    }
}
