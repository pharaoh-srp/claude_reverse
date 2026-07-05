package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class haa {
    public final ArrayList a = new ArrayList();

    public static void a(haa haaVar, boolean z, ta4 ta4Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        haaVar.a.add(new pef(z, null, ta4Var));
    }
}
