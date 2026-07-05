package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jjb {
    public final q28 a;
    public final fj0 b;
    public final HashMap c;

    public jjb(Context context, fj0 fj0Var) {
        q28 q28Var = new q28(context);
        this.c = new HashMap();
        this.a = q28Var;
        this.b = fj0Var;
    }

    public final synchronized j6i a(String str) {
        if (this.c.containsKey(str)) {
            return (j6i) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryN = this.a.n(str);
        if (cctBackendFactoryN == null) {
            return null;
        }
        fj0 fj0Var = this.b;
        j6i j6iVarCreate = cctBackendFactoryN.create(new m81((Context) fj0Var.G, (wp3) fj0Var.E, (wp3) fj0Var.F, str));
        this.c.put(str, j6iVarCreate);
        return j6iVarCreate;
    }
}
