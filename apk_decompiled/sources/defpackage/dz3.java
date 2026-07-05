package defpackage;

import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.types.strings.SessionId;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dz3 implements bz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ nwb F;
    public final /* synthetic */ nwb G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ dz3(nl5 nl5Var, nwb nwbVar, bz7 bz7Var, o72 o72Var, Locale locale, sl5 sl5Var, nwb nwbVar2) {
        this.H = nl5Var;
        this.F = nwbVar;
        this.I = bz7Var;
        this.J = o72Var;
        this.K = locale;
        this.L = sl5Var;
        this.G = nwbVar2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Long lValueOf = null;
        Object obj2 = this.L;
        Object obj3 = this.K;
        Object obj4 = this.J;
        Object obj5 = this.I;
        Object obj6 = this.H;
        switch (i) {
            case 0:
                List list = (List) obj6;
                EnvironmentResource environmentResource = (EnvironmentResource) obj5;
                pz7 pz7Var = (pz7) obj3;
                nwb nwbVar = (nwb) obj4;
                zy7 zy7Var = (zy7) obj2;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                it2 it2Var = new it2(24);
                int size = list.size();
                kp kpVar = new kp(it2Var, 28, list);
                int i2 = 6;
                tq tqVar = new tq(list, 6);
                nwb nwbVar2 = this.F;
                nwb nwbVar3 = this.G;
                j0aVar.W(size, kpVar, tqVar, new ta4(802480018, true, new cw(list, nwbVar2, pz7Var, nwbVar3, nwbVar)));
                if (list.size() < (environmentResource != null ? gwj.h(environmentResource) : 0)) {
                    j0a.V(j0aVar, "new_session_cta", null, new ta4(70291806, true, new tu(i2, zy7Var)), 2);
                }
                SessionId sessionId = (SessionId) nwbVar3.getValue();
                if ((sessionId != null ? sessionId.m1120unboximpl() : null) != null) {
                    j0a.V(j0aVar, null, null, new ta4(25806855, true, new dl1(3, nwbVar)), 3);
                }
                break;
            default:
                bz7 bz7Var = (bz7) obj5;
                o72 o72Var = (o72) obj4;
                Locale locale = (Locale) obj3;
                sl5 sl5Var = (sl5) obj2;
                cjh cjhVar = (cjh) obj;
                String str = cjhVar.a.F;
                int length = str.length();
                String str2 = ((nl5) obj6).c;
                if (length <= str2.length()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= str.length()) {
                            this.G.setValue(cjhVar);
                            String string = bsg.k1(str).toString();
                            int length2 = string.length();
                            nwb nwbVar4 = this.F;
                            if (length2 == 0 || string.length() < str2.length()) {
                                nwbVar4.setValue("");
                                bz7Var.invoke(null);
                            } else {
                                q62 q62VarE = o72Var.e(string, str2, locale);
                                nwbVar4.setValue(sl5Var.a(q62VarE, locale));
                                if (((CharSequence) nwbVar4.getValue()).length() == 0 && q62VarE != null) {
                                    lValueOf = Long.valueOf(q62VarE.H);
                                }
                                bz7Var.invoke(lValueOf);
                            }
                        } else if (Character.isDigit(str.charAt(i3))) {
                            i3++;
                        }
                    }
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ dz3(List list, EnvironmentResource environmentResource, nwb nwbVar, pz7 pz7Var, nwb nwbVar2, nwb nwbVar3, zy7 zy7Var) {
        this.H = list;
        this.I = environmentResource;
        this.F = nwbVar;
        this.K = pz7Var;
        this.G = nwbVar2;
        this.J = nwbVar3;
        this.L = zy7Var;
    }
}
