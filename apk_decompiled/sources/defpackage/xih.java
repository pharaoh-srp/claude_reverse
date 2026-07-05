package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xih implements x5f {
    public static final xih b = new xih(0);
    public final /* synthetic */ int a;

    public /* synthetic */ xih(int i) {
        this.a = i;
    }

    @Override // defpackage.x5f
    public final Object a(Object obj) {
        int i = this.a;
        xih xihVar = blh.i;
        switch (i) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                Object obj4 = list.get(2);
                Object obj5 = list.get(3);
                obj2.getClass();
                String str = (String) obj2;
                obj3.getClass();
                int iIntValue = ((Integer) obj3).intValue();
                obj4.getClass();
                long jM = mwa.m(iIntValue, ((Integer) obj4).intValue());
                obj5.getClass();
                List list2 = (List) obj5;
                Object obj6 = list2.get(0);
                Object obj7 = list2.get(1);
                blh blhVar = obj6 != null ? (blh) xihVar.a(obj6) : null;
                obj7.getClass();
                return new yih(str, jM, new cbf(blhVar, (zdi) alh.a.a(obj7)));
            case 1:
                List list3 = (List) obj;
                int iIntValue2 = ((Number) list3.get(0)).intValue();
                int iIntValue3 = ((Number) list3.get(1)).intValue();
                int iIntValue4 = ((Number) list3.get(2)).intValue();
                d8a d8aVarE = x44.E();
                int i2 = 3;
                while (i2 < iIntValue3 + 3) {
                    d8aVarE.add(xihVar.a(list3.get(i2)));
                    i2++;
                }
                d8a d8aVarV = x44.v(d8aVarE);
                d8a d8aVarE2 = x44.E();
                while (i2 < iIntValue3 + iIntValue4 + 3) {
                    d8aVarE2.add(xihVar.a(list3.get(i2)));
                    i2++;
                }
                return new zdi(d8aVarV, x44.v(d8aVarE2), iIntValue2);
            default:
                obj.getClass();
                List list4 = (List) obj;
                Object obj8 = list4.get(0);
                obj8.getClass();
                int iIntValue5 = ((Integer) obj8).intValue();
                Object obj9 = list4.get(1);
                obj9.getClass();
                String str2 = (String) obj9;
                Object obj10 = list4.get(2);
                obj10.getClass();
                String str3 = (String) obj10;
                Object obj11 = list4.get(3);
                obj11.getClass();
                int iIntValue6 = ((Integer) obj11).intValue();
                Object obj12 = list4.get(4);
                obj12.getClass();
                long jM2 = mwa.m(iIntValue6, ((Integer) obj12).intValue());
                Object obj13 = list4.get(5);
                obj13.getClass();
                int iIntValue7 = ((Integer) obj13).intValue();
                Object obj14 = list4.get(6);
                obj14.getClass();
                long jM3 = mwa.m(iIntValue7, ((Integer) obj14).intValue());
                Object obj15 = list4.get(7);
                obj15.getClass();
                return new blh(iIntValue5, str2, str3, jM2, jM3, ((Long) obj15).longValue(), false, 64);
        }
    }

    @Override // defpackage.x5f
    public final Object b(y4f y4fVar, Object obj) {
        String str;
        List listX;
        switch (this.a) {
            case 0:
                yih yihVar = (yih) obj;
                String string = yihVar.d().G.toString();
                long j = yihVar.d().H;
                int i = kkh.c;
                Integer numValueOf = Integer.valueOf((int) (j >> 32));
                Integer numValueOf2 = Integer.valueOf((int) (yihVar.d().H & 4294967295L));
                cbf cbfVar = yihVar.a;
                blh blhVar = (blh) ((lsc) cbfVar.G).getValue();
                if (blhVar != null) {
                    Integer numValueOf3 = Integer.valueOf(blhVar.a);
                    String str2 = blhVar.b;
                    String str3 = blhVar.c;
                    long j2 = blhVar.d;
                    int i2 = kkh.c;
                    Integer numValueOf4 = Integer.valueOf((int) (j2 >> 32));
                    Integer numValueOf5 = Integer.valueOf((int) (j2 & 4294967295L));
                    str = string;
                    long j3 = blhVar.e;
                    listX = x44.X(numValueOf3, str2, str3, numValueOf4, numValueOf5, Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (j3 & 4294967295L)), Long.valueOf(blhVar.f));
                } else {
                    str = string;
                    listX = null;
                }
                return x44.X(str, numValueOf, numValueOf2, x44.X(listX, alh.a.b(y4fVar, (zdi) cbfVar.F)));
            case 1:
                zdi zdiVar = (zdi) obj;
                d8a d8aVarE = x44.E();
                d8aVarE.add(Integer.valueOf(zdiVar.a));
                kdg kdgVar = zdiVar.b;
                d8aVarE.add(Integer.valueOf(kdgVar.size()));
                kdg kdgVar2 = zdiVar.c;
                d8aVarE.add(Integer.valueOf(kdgVar2.size()));
                int size = kdgVar.size();
                int i3 = 0;
                while (true) {
                    xih xihVar = blh.i;
                    if (i3 >= size) {
                        int size2 = kdgVar2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            d8aVarE.add(xihVar.b(y4fVar, kdgVar2.get(i4)));
                        }
                        return x44.v(d8aVarE);
                    }
                    d8aVarE.add(xihVar.b(y4fVar, kdgVar.get(i3)));
                    i3++;
                }
                break;
            default:
                blh blhVar2 = (blh) obj;
                Integer numValueOf6 = Integer.valueOf(blhVar2.a);
                String str4 = blhVar2.b;
                String str5 = blhVar2.c;
                long j4 = blhVar2.d;
                int i5 = kkh.c;
                Integer numValueOf7 = Integer.valueOf((int) (j4 >> 32));
                Integer numValueOf8 = Integer.valueOf((int) (j4 & 4294967295L));
                long j5 = blhVar2.e;
                return x44.X(numValueOf6, str4, str5, numValueOf7, numValueOf8, Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) (4294967295L & j5)), Long.valueOf(blhVar2.f));
        }
    }
}
