package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class na4 {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final u0h f;
    public final u0h g;

    public na4(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final int i = 0;
        this.f = new u0h(new zy7(this) { // from class: la4
            public final /* synthetic */ na4 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                lm6 lm6Var = lm6.E;
                int i3 = 0;
                na4 na4Var = this.F;
                switch (i2) {
                    case 0:
                        List list6 = na4Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            b54.t0(arrayList, (List) ((zy7) list6.get(i3)).a());
                            i3++;
                        }
                        na4Var.d = lm6Var;
                        return arrayList;
                    default:
                        List list7 = na4Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            b54.t0(arrayList2, (List) ((zy7) list7.get(i3)).a());
                            i3++;
                        }
                        na4Var.e = lm6Var;
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.g = new u0h(new zy7(this) { // from class: la4
            public final /* synthetic */ na4 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                lm6 lm6Var = lm6.E;
                int i3 = 0;
                na4 na4Var = this.F;
                switch (i22) {
                    case 0:
                        List list6 = na4Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            b54.t0(arrayList, (List) ((zy7) list6.get(i3)).a());
                            i3++;
                        }
                        na4Var.d = lm6Var;
                        return arrayList;
                    default:
                        List list7 = na4Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            b54.t0(arrayList2, (List) ((zy7) list7.get(i3)).a());
                            i3++;
                        }
                        na4Var.e = lm6Var;
                        return arrayList2;
                }
            }
        });
    }
}
