package defpackage;

import android.os.Trace;
import com.anthropic.claude.R;
import com.anthropic.claude.types.strings.ChatId;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p60 implements uy8, rzh {
    public Object E;
    public Object F;
    public final Object G;
    public Object H;
    public Object I;
    public final Object J;
    public final Object K;
    public Object L;
    public Object M;
    public Object N;
    public Object O;

    public p60() {
        wwb wwbVar = new wwb(0, new i18[16]);
        this.G = wwbVar;
        fwb fwbVar = v6f.a;
        this.H = new fwb();
        this.I = wwbVar;
        this.J = new wwb(0, new Object[16]);
        this.K = new wwb(0, new zy7[16]);
    }

    public static final boolean o(i18 i18Var, wwb wwbVar) {
        Object[] objArr = wwbVar.E;
        int i = wwbVar.G;
        for (int i2 = 0; i2 < i; i2++) {
            mee meeVar = ((i18) objArr[i2]).a;
            if (meeVar instanceof svc) {
                wwb wwbVarC = ((svc) meeVar).c();
                if (wwbVarC.l(i18Var) || o(i18Var, wwbVarC)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.uy8
    public int b() {
        return ((zu2) this.F).b();
    }

    @Override // defpackage.rzh
    public boolean c(String str, znb znbVar) {
        Boolean bool;
        zy7 zy7Var = (zy7) this.M;
        znbVar.getClass();
        if (e(str, znbVar) != 0) {
            return false;
        }
        if (str != null && (bool = (Boolean) ((bz7) this.J).invoke(ChatId.m978boximpl(str))) != null) {
            return bool.booleanValue();
        }
        return ((Boolean) zy7Var.a()).booleanValue();
    }

    @Override // defpackage.uy8
    public long d(long j) {
        return ((zu2) this.E).d(j);
    }

    @Override // defpackage.rzh
    public int e(String str, znb znbVar) {
        znbVar.getClass();
        int i = ((Boolean) ((zy7) this.H).a()).booleanValue() ? R.string.tool_setting_disabled_by_organization : !((Boolean) ((zy7) this.K).a()).booleanValue() ? R.string.connect_your_account_on_claude_ai : (!(znbVar instanceof xnb) || ((Boolean) ((bz7) this.I).invoke(znbVar)).booleanValue()) ? 0 : R.string.tool_setting_not_supported_for_model;
        if (i != 0) {
            return i;
        }
        pz7 pz7Var = (pz7) this.L;
        if (pz7Var != null) {
            return ((Number) pz7Var.invoke(str != null ? ChatId.m978boximpl(str) : null, znbVar)).intValue();
        }
        return 0;
    }

    @Override // defpackage.uy8
    public void f(bz7 bz7Var) {
        ((zu2) this.E).f(bz7Var);
    }

    @Override // defpackage.rzh
    public boolean g() {
        return ((Boolean) ((zy7) this.G).a()).booleanValue();
    }

    @Override // defpackage.uy8
    public long i(long j) {
        return ((zu2) this.E).i(j);
    }

    @Override // defpackage.rzh
    public boolean isVisible() {
        return ((Boolean) ((zy7) this.N).a()).booleanValue();
    }

    public void j() {
        this.E = null;
        this.F = null;
        wwb wwbVar = (wwb) this.G;
        wwbVar.h();
        ((fwb) this.H).b();
        this.I = wwbVar;
        ((wwb) this.J).h();
        ((wwb) this.K).h();
        this.L = null;
        this.M = null;
        this.N = null;
    }

    public void k() {
        Set set = (Set) this.E;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                mee meeVar = (mee) it.next();
                it.remove();
                meeVar.a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void l() {
        wwb wwbVar = (wwb) this.G;
        wwb wwbVar2 = (wwb) this.J;
        Set set = (Set) this.E;
        if (set == null) {
            return;
        }
        this.O = null;
        int i = 2;
        if (wwbVar2.G != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                fwb fwbVar = (fwb) this.L;
                int i2 = wwbVar2.G;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = wwbVar2.E[i2];
                    try {
                        if (obj instanceof i18) {
                            mee meeVar = ((i18) obj).a;
                            set.remove(meeVar);
                            meeVar.b();
                        }
                        if (obj instanceof tc4) {
                            if (fwbVar == null || !fwbVar.c(obj)) {
                                ((tc4) obj).c();
                            } else {
                                ((tc4) obj).b();
                            }
                        }
                    } catch (Throwable th) {
                        je4 je4Var = (je4) this.F;
                        if (je4Var != null) {
                            kpk.j(th, new d44(je4Var, i, obj));
                        }
                        throw th;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (wwbVar.G != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.E;
                if (set2 != null) {
                    Object[] objArr = wwbVar.E;
                    int i3 = wwbVar.G;
                    for (int i4 = 0; i4 < i3; i4++) {
                        i18 i18Var = (i18) objArr[i4];
                        mee meeVar2 = i18Var.a;
                        set2.remove(meeVar2);
                        try {
                            meeVar2.g();
                        } catch (Throwable th2) {
                            je4 je4Var2 = (je4) this.F;
                            if (je4Var2 != null) {
                                kpk.j(th2, new d44(je4Var2, i, i18Var));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void m() {
        wwb wwbVar = (wwb) this.K;
        if (wwbVar.G != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = wwbVar.E;
                int i = wwbVar.G;
                for (int i2 = 0; i2 < i; i2++) {
                    ((zy7) objArr[i2]).a();
                }
                wwbVar.h();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void n(i18 i18Var) {
        wwb wwbVar = (wwb) this.G;
        if (!((fwb) this.H).c(i18Var)) {
            fwb fwbVar = (fwb) this.O;
            if (fwbVar == null || !fwbVar.c(i18Var)) {
                ((wwb) this.J).b(i18Var);
                return;
            }
            return;
        }
        ((fwb) this.H).m(i18Var);
        if (!((wwb) this.I).l(i18Var) && !wwbVar.l(i18Var)) {
            o(i18Var, wwbVar);
        }
        Set set = (Set) this.E;
        if (set == null) {
            return;
        }
        set.add(i18Var.a);
    }

    public void p(Set set, je4 je4Var) {
        j();
        this.E = set;
        this.F = je4Var;
    }

    public Object q(String str, boolean z, xzg xzgVar) {
        ((bz7) this.O).invoke(Boolean.valueOf(z));
        return w3c.j((w3c) this.F, str, Boolean.valueOf(z), xzgVar, 12);
    }

    public p60(zu2 zu2Var, i5i i5iVar, eb1 eb1Var, bz7 bz7Var, mi6 mi6Var, nd5 nd5Var, akh akhVar, zy7 zy7Var, ovi oviVar, bz7 bz7Var2) {
        this.F = zu2Var;
        this.G = i5iVar;
        this.H = eb1Var;
        this.I = bz7Var;
        this.K = mi6Var;
        this.L = nd5Var;
        this.M = akhVar;
        this.N = zy7Var;
        this.O = oviVar;
        this.J = bz7Var2;
        this.E = zu2Var;
    }

    public p60(w3c w3cVar, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, bz7 bz7Var, pz7 pz7Var, bz7 bz7Var2, zy7 zy7Var5, bz7 bz7Var3) {
        this.F = w3cVar;
        this.N = zy7Var;
        this.G = zy7Var2;
        this.H = zy7Var3;
        this.K = zy7Var4;
        this.I = bz7Var;
        this.L = pz7Var;
        this.J = bz7Var2;
        this.M = zy7Var5;
        this.O = bz7Var3;
        this.E = w3cVar;
    }
}
