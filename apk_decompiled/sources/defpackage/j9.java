package defpackage;

import android.content.Context;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class j9 {
    public final Context a;
    public final String b;
    public final fk0 c;
    public final d8a d;

    public j9(Context context, String str, fk0 fk0Var) {
        str.getClass();
        this.a = context;
        this.b = str;
        this.c = fk0Var;
        d8a d8aVarE = x44.E();
        final int i = 0;
        d8aVarE.add(new zy7(this) { // from class: i9
            public final /* synthetic */ j9 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                iei ieiVar = iei.a;
                j9 j9Var = this.F;
                switch (i2) {
                    case 0:
                        bgj bgjVarD = bgj.d(j9Var.a);
                        bgjVarD.getClass();
                        String strJ = nkk.j(j9Var.b);
                        zp3 zp3Var = bgjVarD.b.m;
                        String strConcat = "CancelWorkByTag_".concat(strJ);
                        knf knfVar = bgjVarD.d.a;
                        knfVar.getClass();
                        nai.R(zp3Var, strConcat, knfVar, new sa2(bgjVarD, strJ));
                        break;
                    default:
                        j9Var.c.v(false);
                        break;
                }
                return ieiVar;
            }
        });
        d8aVarE.add(new j7(3));
        final int i2 = 1;
        d8aVarE.add(new zy7(this) { // from class: i9
            public final /* synthetic */ j9 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                iei ieiVar = iei.a;
                j9 j9Var = this.F;
                switch (i22) {
                    case 0:
                        bgj bgjVarD = bgj.d(j9Var.a);
                        bgjVarD.getClass();
                        String strJ = nkk.j(j9Var.b);
                        zp3 zp3Var = bgjVarD.b.m;
                        String strConcat = "CancelWorkByTag_".concat(strJ);
                        knf knfVar = bgjVarD.d.a;
                        knfVar.getClass();
                        nai.R(zp3Var, strConcat, knfVar, new sa2(bgjVarD, strJ));
                        break;
                    default:
                        j9Var.c.v(false);
                        break;
                }
                return ieiVar;
            }
        });
        this.d = x44.v(d8aVarE);
    }

    public final void a() {
        ListIterator listIterator = this.d.listIterator(0);
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                return;
            } else {
                ((zy7) c8aVar.next()).a();
            }
        }
    }
}
