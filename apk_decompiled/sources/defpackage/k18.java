package defpackage;

import com.anthropic.claude.settings.internal.growthbook.GateKind;

/* JADX INFO: loaded from: classes3.dex */
public final class k18 {
    public final String a;
    public final /* synthetic */ l18 b;

    public k18(l18 l18Var, String str) {
        this.b = l18Var;
        this.a = str;
    }

    public final void a(GateKind gateKind, String[] strArr) {
        for (String str : strArr) {
            l18 l18Var = this.b;
            l18Var.a.add(str);
            l18Var.c.put(str, this.a);
            if (gateKind != null) {
                l18Var.b.put(str, gateKind);
            }
        }
    }
}
