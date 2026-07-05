package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lu7 implements hm4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lu7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hm4
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                mu7 mu7Var = (mu7) obj;
                if (mu7Var == null) {
                    mu7Var = new mu7(-3);
                }
                ((qb5) this.b).u(mu7Var);
                return;
            case 1:
                mu7 mu7Var2 = (mu7) obj;
                synchronized (nu7.c) {
                    try {
                        w6g w6gVar = nu7.d;
                        ArrayList arrayList = (ArrayList) w6gVar.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        w6gVar.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((hm4) arrayList.get(i)).accept(mu7Var2);
                        }
                        return;
                    } finally {
                    }
                }
            default:
                hp1 hp1Var = (hp1) obj;
                ArrayList arrayList2 = new ArrayList();
                new ArrayList();
                v84 v84Var = ((ap1) this.b).a;
                hp1Var.getClass();
                v84Var.c0(new hid(hp1Var, arrayList2));
                return;
        }
    }
}
