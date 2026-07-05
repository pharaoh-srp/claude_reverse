package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.material3.d;
import defpackage.d19;
import defpackage.fqb;
import defpackage.h19;
import defpackage.iqb;
import defpackage.kxk;
import defpackage.no9;
import defpackage.ssj;
import defpackage.t9e;
import defpackage.vue;
import defpackage.zub;
import defpackage.zy7;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final iqb a(iqb iqbVar, zub zubVar, h19 h19Var, boolean z, String str, vue vueVar, zy7 zy7Var) {
        iqb iqbVarB;
        if (h19Var != null) {
            iqbVarB = new ClickableElement(zubVar, h19Var, false, z, str, vueVar, zy7Var);
        } else if (h19Var == null) {
            iqbVarB = new ClickableElement(zubVar, null, false, z, str, vueVar, zy7Var);
        } else {
            fqb fqbVar = fqb.E;
            iqbVarB = zubVar != null ? d19.a(fqbVar, zubVar, h19Var).B(new ClickableElement(zubVar, null, false, z, str, vueVar, zy7Var)) : kxk.p(fqbVar, new a(h19Var, z, str, vueVar, zy7Var));
        }
        return iqbVar.B(iqbVarB);
    }

    public static /* synthetic */ iqb b(iqb iqbVar, zub zubVar, d dVar, boolean z, String str, vue vueVar, zy7 zy7Var, int i) {
        vue vueVar2;
        iqb iqbVar2;
        zub zubVar2;
        d dVar2;
        zy7 zy7Var2;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        String str2 = (i & 8) != 0 ? null : str;
        if ((i & 16) != 0) {
            vueVar2 = null;
            zubVar2 = zubVar;
            dVar2 = dVar;
            zy7Var2 = zy7Var;
            iqbVar2 = iqbVar;
        } else {
            vueVar2 = vueVar;
            iqbVar2 = iqbVar;
            zubVar2 = zubVar;
            dVar2 = dVar;
            zy7Var2 = zy7Var;
        }
        return a(iqbVar2, zubVar2, dVar2, z2, str2, vueVar2, zy7Var2);
    }

    public static iqb c(iqb iqbVar, boolean z, String str, vue vueVar, zub zubVar, zy7 zy7Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return iqbVar.B(new ClickableElement((i & 8) != 0 ? null : zubVar, null, true, z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : vueVar, zy7Var));
    }

    public static iqb d(iqb iqbVar, zub zubVar, zy7 zy7Var) {
        return iqbVar.B(new CombinedClickableElement(zy7Var, null, zubVar, null, null, null, false, true));
    }

    public static iqb e(iqb iqbVar, String str, vue vueVar, String str2, zy7 zy7Var, zy7 zy7Var2, int i) {
        return iqbVar.B(new CombinedClickableElement(zy7Var2, zy7Var, null, (i & 4) != 0 ? null : vueVar, (i & 2) != 0 ? null : str, (i & 8) != 0 ? null : str2, true, true));
    }

    public static final boolean f(KeyEvent keyEvent) {
        long jI = ssj.i(keyEvent);
        int i = no9.O;
        return no9.a(jI, t9e.d()) || no9.a(jI, t9e.i()) || no9.a(jI, t9e.m()) || no9.a(jI, t9e.p());
    }
}
