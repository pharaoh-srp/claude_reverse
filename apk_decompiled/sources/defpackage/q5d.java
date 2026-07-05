package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class q5d {
    public static final umg a = new umg(new oob(28));
    public static final ej3 b = new ej3(4);

    public static final void a(ydh ydhVar, Context context, boolean z, CharSequence charSequence, kkh kkhVar, p5d p5dVar, bz7 bz7Var) {
        if (Build.VERSION.SDK_INT < 28 || charSequence == null || kkhVar == null || p5dVar == null || !(p5dVar instanceof p5d)) {
            bz7Var.invoke(ydhVar);
            if (charSequence == null || kkhVar == null) {
                return;
            }
            xwj.a(ydhVar, context, z, charSequence, kkhVar.a);
            return;
        }
        long j = kkhVar.a;
        Object obj = p5dVar.h;
        jxb jxbVar = p5dVar.e;
        TextClassification textClassification = null;
        if (jxbVar.h()) {
            tdh tdhVar = (tdh) p5dVar.g.getValue();
            TextClassification textClassificationC = (tdhVar != null && kkh.c(j, tdhVar.a()) && x44.r(charSequence, tdhVar.b())) ? tdhVar.c() : null;
            jxbVar.d(null);
            textClassification = textClassificationC;
        }
        if (textClassification == null) {
            bz7Var.invoke(ydhVar);
        } else {
            if (!textClassification.getActions().isEmpty()) {
                tnk.j(ydhVar, obj, textClassification, 0);
            } else if (pnk.h(textClassification)) {
                tnk.j(ydhVar, obj, textClassification, -1);
            }
            bz7Var.invoke(ydhVar);
            List actions = textClassification.getActions();
            int size = actions.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    tnk.j(ydhVar, obj, textClassification, i);
                }
            }
        }
        xwj.a(ydhVar, context, z, charSequence, kkhVar.a);
    }

    public static final p5d b(mhf mhfVar, gea geaVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            e18Var.p(false);
            return null;
        }
        Context context = (Context) e18Var.j(w00.b);
        c45 c45Var = (c45) e18Var.j(a);
        boolean zF = ((((i & 112) ^ 48) > 32 && e18Var.f(geaVar)) || (i & 48) == 32) | e18Var.f(c45Var) | e18Var.f(context);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            b.getClass();
            objN = new p5d(c45Var, context, mhfVar, geaVar);
            e18Var.k0(objN);
        }
        p5d p5dVar = (p5d) objN;
        e18Var.p(false);
        return p5dVar;
    }
}
