package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bac implements ztc {
    public final List a;
    public final int b;
    public final boolean c;

    public bac(List list) {
        boolean z;
        list.getClass();
        this.a = list;
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer num = ((v9c) it.next()).a;
            if (num != null) {
                iIntValue = num.intValue();
            }
            i2 += iIntValue;
        }
        this.b = i2;
        List list2 = this.a;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((v9c) it2.next()).a == null) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        this.c = z;
        List list3 = this.a;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Integer num2 = ((v9c) it3.next()).a;
                if ((num2 != null ? num2.intValue() : Integer.MAX_VALUE) <= 0) {
                    sz6.p("Failed requirement.");
                    throw null;
                }
            }
        }
        List list4 = this.a;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                if (((v9c) it4.next()).a == null && (i = i + 1) < 0) {
                    x44.m0();
                    throw null;
                }
            }
        }
        if (i <= 1) {
            return;
        }
        List list5 = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((v9c) obj).a == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((v9c) it5.next()).b);
        }
        xh6.l(arrayList2, ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.", "At most one variable-length numeric field in a row is allowed, but got several: ");
        throw null;
    }

    @Override // defpackage.ztc
    public final Object a(l25 l25Var, String str, int i) {
        int i2 = this.b;
        if (i + i2 > str.length()) {
            return new usc(i, new pza(4, this));
        }
        bae baeVar = new bae();
        while (baeVar.E + i < str.length() && otj.k(str.charAt(baeVar.E + i))) {
            baeVar.E++;
        }
        int i3 = 0;
        if (baeVar.E < i2) {
            return new usc(i, new aac(baeVar, i3, this));
        }
        List list = this.a;
        int size = list.size();
        while (i3 < size) {
            Integer num = ((v9c) list.get(i3)).a;
            int iIntValue = (num != null ? num.intValue() : (baeVar.E - i2) + 1) + i;
            w9c w9cVarA = ((v9c) list.get(i3)).a(i, iIntValue, l25Var, str);
            if (w9cVarA != null) {
                return new usc(i, new cr4(str.subSequence(i, iIntValue).toString(), this, i3, w9cVarA));
            }
            i3++;
            i = iIntValue;
        }
        return Integer.valueOf(i);
    }

    public final String b() {
        List<v9c> list = this.a;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        for (v9c v9cVar : list) {
            StringBuilder sb = new StringBuilder();
            Integer num = v9cVar.a;
            sb.append(num == null ? "at least one digit" : num + " digits");
            sb.append(" for ");
            sb.append(v9cVar.b);
            arrayList.add(sb.toString());
        }
        boolean z = this.c;
        int i = this.b;
        if (z) {
            return "a number with at least " + i + " digits: " + arrayList;
        }
        return "a number with exactly " + i + " digits: " + arrayList;
    }

    public final String toString() {
        return b();
    }
}
