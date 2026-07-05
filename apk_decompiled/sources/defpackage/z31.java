package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z31 implements Comparator {
    public final /* synthetic */ int E;

    public /* synthetic */ z31(int i) {
        this.E = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 1:
                return ((jw7) obj2).j - ((jw7) obj).j;
            case 2:
                return Integer.compare(((bg2) obj2).b, ((bg2) obj).b);
            case 3:
                if (obj == null) {
                    return obj2 == null ? 0 : 1;
                }
                if (obj2 == null) {
                    return -1;
                }
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 4:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 5:
                return Integer.compare(((yu5) ((List) obj).get(0)).J, ((yu5) ((List) obj2).get(0)).J);
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i = 9;
                int i2 = 10;
                return q84.f(fv5.c((fv5) Collections.max(list, new z31(i)), (fv5) Collections.max(list2, new z31(i)))).a(list.size(), list2.size()).b((fv5) Collections.max(list, new z31(i2)), (fv5) Collections.max(list2, new z31(i2)), new z31(i2)).e();
            case 7:
                return ((xu5) Collections.max((List) obj)).compareTo((xu5) Collections.max((List) obj2));
            case 8:
                return ((cv5) ((List) obj).get(0)).compareTo((cv5) ((List) obj2).get(0));
            case 9:
                return fv5.c((fv5) obj, (fv5) obj2);
            case 10:
                fv5 fv5Var = (fv5) obj;
                fv5 fv5Var2 = (fv5) obj2;
                boolean z = fv5Var.I;
                int i3 = fv5Var.N;
                wjc wjcVarA = (z && fv5Var.L) ? gv5.k : gv5.k.a();
                fv5Var.J.getClass();
                s84 s84VarB = s84.a.c(fv5Var.c0, fv5Var2.c0).b(Integer.valueOf(fv5Var.O), Integer.valueOf(fv5Var2.O), wjcVarA);
                if (fv5Var.Y && fv5Var.a0) {
                    s84VarB = s84VarB.a(fv5Var.b0, fv5Var2.b0);
                }
                return s84VarB.c(fv5Var.Z, fv5Var2.Z).b(Integer.valueOf(i3), Integer.valueOf(fv5Var2.N), wjcVarA).e();
            case 11:
                return ((String) obj2).length() - ((String) obj).length();
            case 12:
                return ((Number) c0.X.invoke(obj, obj2)).intValue();
            case 13:
                return ((Number) c0.W.invoke(obj, obj2)).intValue();
            case 14:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    byte b = bArr[i4];
                    byte b2 = bArr2[i4];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ((q9g) obj).a.compareTo(((q9g) obj2).a);
            case 16:
                return ((nag) obj).a - ((nag) obj2).a;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return Float.compare(((nag) obj).c, ((nag) obj2).c);
            case g.AVG_FIELD_NUMBER /* 18 */:
                b79 b79Var = (b79) obj;
                b79 b79Var2 = (b79) obj2;
                int i5 = b79Var.E;
                int i6 = b79Var2.E;
                return i5 == i6 ? x44.z(b79Var.F, b79Var2.F) : x44.z(i5, i6);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Integer.compare(((w8j) obj).a.b, ((w8j) obj2).a.b);
            default:
                return Long.compare(((v8j) obj).b, ((v8j) obj2).b);
        }
    }
}
