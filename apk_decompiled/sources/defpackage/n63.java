package defpackage;

import android.content.Context;
import com.anthropic.claude.chat.bottomsheet.f;
import com.anthropic.claude.chat.bottomsheet.x0;
import com.anthropic.claude.tool.model.KnowledgeSource;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n63 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ n63(ze0 ze0Var, rwe rweVar, eli eliVar, KnowledgeSource knowledgeSource, t53 t53Var) {
        this.E = 1;
        this.H = ze0Var;
        this.F = rweVar;
        this.I = eliVar;
        this.J = knowledgeSource;
        this.G = t53Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj = this.J;
        Object obj2 = this.G;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.F;
        switch (i) {
            case 0:
                f.c((rwe) obj5);
                break;
            case 1:
                x0.f((ze0) obj4, (rwe) obj5, (eli) obj3, (KnowledgeSource) obj, (t53) obj2);
                break;
            case 2:
                fk0 fk0Var = (fk0) obj5;
                koi koiVar = (koi) obj4;
                ul7 ul7Var = (ul7) obj3;
                zy7 zy7Var = (zy7) obj2;
                bz7 bz7Var = (bz7) obj;
                List list = xah.a;
                xah.e(6, "Handling logout", null, null);
                fk0Var.p(koiVar.d);
                if (!fk0Var.l(koiVar.d)) {
                    ul7Var.a();
                }
                zy7Var.a();
                bz7Var.invoke(xja.E);
                break;
            default:
                ft5 ft5Var = g86.a;
                gb9.D(fd9.c(tpa.a), null, null, new mt4((oke) obj5, (qi3) obj4, (Context) obj3, (g6d) obj2, (xpa) obj, (tp4) null, 21), 3);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ n63(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.E = i;
        this.F = obj;
        this.H = obj2;
        this.I = obj3;
        this.G = obj4;
        this.J = obj5;
    }
}
