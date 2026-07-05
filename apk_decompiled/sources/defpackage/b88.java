package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class b88 extends fe1 implements ge0 {
    public final Set c0;

    /* JADX WARN: Illegal instructions before constructor call */
    public b88(Context context, Looper looper, int i, rl rlVar, h88 h88Var, i88 i88Var, int i2) {
        o2l o2lVarA = o2l.a(context);
        f88 f88Var = f88.d;
        dgj.v(h88Var);
        dgj.v(i88Var);
        super(context, looper, o2lVarA, f88Var, i, new hsi(1, h88Var), new w9h(i88Var), (String) rlVar.H);
        Set set = (Set) rlVar.G;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                sz6.j("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.c0 = set;
    }

    @Override // defpackage.ge0
    public final Set b() {
        return l() ? this.c0 : Collections.EMPTY_SET;
    }

    @Override // defpackage.fe1
    public final Account p() {
        return null;
    }

    @Override // defpackage.fe1
    public final Set s() {
        return this.c0;
    }
}
