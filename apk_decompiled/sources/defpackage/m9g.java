package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m9g implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ n9g F;

    public /* synthetic */ m9g(n9g n9gVar, int i) {
        this.E = i;
        this.F = n9gVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        n9g n9gVar = this.F;
        switch (i) {
            case 0:
                yih yihVar = n9gVar.a;
                long j = yihVar.d().H;
                if (kkh.d(j)) {
                    CharSequence charSequence = yihVar.d().G;
                    int i2 = (int) (j >> 32);
                    if (i2 != 0) {
                        int i3 = i2 - 1;
                        int i4 = i3;
                        while (true) {
                            if (i4 >= 0) {
                                char cCharAt = charSequence.charAt(i4);
                                if (cCharAt == '/') {
                                    if (i4 == 0 || gb9.B(charSequence.charAt(i4 - 1))) {
                                        return new b79(i4, i3, 1);
                                    }
                                } else if (!gb9.B(cCharAt)) {
                                    i4--;
                                }
                            }
                        }
                    }
                }
                return null;
            case 1:
                lsc lscVar = n9gVar.b;
                b79 b79Var = (b79) n9gVar.d.getValue();
                if (b79Var == null || b79Var.equals((b79) n9gVar.c.getValue())) {
                    return lm6.E;
                }
                String string = n9gVar.a.d().G.subSequence(b79Var.E + 1, b79Var.F + 1).toString();
                if (string.length() == 0) {
                    return (List) lscVar.getValue();
                }
                String lowerCase = string.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                List list = (List) lscVar.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    String lowerCase2 = ((String) obj).toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    if (bsg.u0(lowerCase2, lowerCase, false)) {
                        arrayList.add(obj);
                    }
                }
                String lowerCase3 = lowerCase.toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                return w44.i1(arrayList, new pa9(9, new o9g(new pa9(8, lowerCase3), 0, lowerCase3)));
            default:
                return (b79) n9gVar.d.getValue();
        }
    }
}
