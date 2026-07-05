package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gvj {
    public static final ta4 a = new ta4(-697095028, false, new ua4(5));
    public static final ta4 b = new ta4(-834002183, false, new xa4(1));
    public static final ta4 c = new ta4(-286321714, false, new ua4(6));
    public static final StackTraceElement[] d = new StackTraceElement[0];

    public static final void a(final String str, final boolean z, final boolean z2, final long j, final zy7 zy7Var, final iqb iqbVar, ld4 ld4Var, final int i) {
        e18 e18Var;
        String str2;
        long j2;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-792374528);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.e(j) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        int i3 = 1;
        byte b2 = 0;
        if (e18Var2.Q(i2 & 1, (74899 & i2) != 74898)) {
            if (z2) {
                e18Var2.a0(-489097316);
                String strK0 = d4c.k0(R.string.calendar_primary_format, new Object[]{str}, e18Var2);
                e18Var2.p(false);
                str2 = strK0;
            } else {
                e18Var2.a0(-489023474);
                e18Var2.p(false);
                str2 = str;
            }
            ta4 ta4Var = z ? gwj.a : null;
            if (z) {
                e18Var2.a0(-1262667342);
                j2 = gm3.a(e18Var2).k;
            } else {
                e18Var2.a0(-1262665977);
                j2 = gm3.a(e18Var2).N;
            }
            e18Var2.p(false);
            long j3 = j2;
            e18Var = e18Var2;
            ybi.b(fd9.q0(-819545623, new e32(j, i3, b2), e18Var2), fd9.q0(-534409720, new rq(str2, 7), e18Var2), j8.e0(iqbVar, z, false, new vue(1), zy7Var, 10), null, ta4Var, j3, new qnc(8.0f, 8.0f, 8.0f, 8.0f), MTTypesetterKt.kLineSkipLimitMultiplier, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, null, e18Var, 1575990, 0, 16256);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(str, z, z2, j, zy7Var, iqbVar, i) { // from class: i72
                public final /* synthetic */ String E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ long H;
                public final /* synthetic */ zy7 I;
                public final /* synthetic */ iqb J;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(196609);
                    gvj.a(this.E, this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final long b(int i) {
        if (!(i > 0)) {
            e39.a("The span value should be higher than 0");
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [b16] */
    public static final sqi c(esd esdVar, txb txbVar, cbi cbiVar, b16 b16Var, b16 b16Var2) {
        l7g l7gVar;
        ?? arrayList;
        esdVar.getClass();
        txbVar.getClass();
        if (esdVar.d0.size() <= 0) {
            if ((esdVar.G & 8) == 8) {
                sxb sxbVarD = sxb.d(txbVar.getString(esdVar.a0));
                int i = esdVar.G;
                ntd ntdVarB = (i & 16) == 16 ? esdVar.b0 : (i & 32) == 32 ? cbiVar.b(esdVar.c0) : null;
                if ((ntdVarB != null && (l7gVar = (l7g) b16Var.invoke(ntdVarB)) != null) || (l7gVar = (l7g) b16Var2.invoke(sxbVarD)) != null) {
                    return new f39(sxbVarD, l7gVar);
                }
                sz6.l("cannot determine underlying type for value class ", sxb.d(txbVar.getString(esdVar.I)), " with property ", sxbVarD);
            }
            return null;
        }
        List list = esdVar.d0;
        list.getClass();
        List<Integer> list2 = list;
        ArrayList arrayList2 = new ArrayList(x44.y(list2, 10));
        for (Integer num : list2) {
            num.getClass();
            arrayList2.add(sxb.d(txbVar.getString(num.intValue())));
        }
        cpc cpcVar = new cpc(Integer.valueOf(esdVar.g0.size()), Integer.valueOf(esdVar.f0.size()));
        if (cpcVar.equals(new cpc(Integer.valueOf(arrayList2.size()), 0))) {
            List list3 = esdVar.g0;
            list3.getClass();
            List<Integer> list4 = list3;
            arrayList = new ArrayList(x44.y(list4, 10));
            for (Integer num2 : list4) {
                num2.getClass();
                arrayList.add(cbiVar.b(num2.intValue()));
            }
        } else {
            if (!cpcVar.equals(new cpc(0, Integer.valueOf(arrayList2.size())))) {
                throw new IllegalStateException(("class " + sxb.d(txbVar.getString(esdVar.I)) + " has illegal multi-field value class representation").toString());
            }
            arrayList = esdVar.f0;
        }
        arrayList.getClass();
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList3 = new ArrayList(x44.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList3.add(b16Var.invoke(it.next()));
        }
        return new ntb(w44.v1(arrayList2, arrayList3));
    }

    public static kde d(kde kdeVar) {
        ArrayList arrayList;
        if (kdeVar == null) {
            return null;
        }
        int i = 0;
        switch (sq6.F(kdeVar.a)) {
            case 12:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
                kde kdeVar2 = kdeVar;
                int i2 = 0;
                while (true) {
                    kde[] kdeVarArr = kdeVar.c;
                    if (i2 >= kdeVarArr.length) {
                        return kdeVar2;
                    }
                    kde kdeVar3 = kdeVarArr[i2];
                    kde kdeVarD = d(kdeVar3);
                    if (kdeVar2 == kdeVar && kdeVarD != kdeVar3) {
                        kdeVar2 = new kde();
                        kdeVar2.a = kdeVar.a;
                        kdeVar2.b = kdeVar.b;
                        kdeVar2.c = kdeVar.c;
                        kdeVar2.e = kdeVar.e;
                        kdeVar2.f = kdeVar.f;
                        kdeVar2.g = kdeVar.g;
                        kdeVar2.h = kdeVar.h;
                        kdeVar2.i = kdeVar.i;
                        kdeVar2.d = null;
                        kde[] kdeVarArr2 = kdeVar.c;
                        kdeVar2.c = wtc.y(kdeVarArr2, 0, kdeVarArr2.length);
                    }
                    if (kdeVar2 != kdeVar) {
                        kdeVar2.c[i2] = kdeVarD;
                    }
                    i2++;
                }
                break;
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return e(kdeVar.a, kdeVar.b, d(kdeVar.c[0]), kdeVar);
            case 16:
                if (kdeVar.e == 0 && kdeVar.f == 0) {
                    return new kde(2);
                }
                kde kdeVarD2 = d(kdeVar.c[0]);
                int i3 = kdeVar.f;
                int i4 = kdeVar.e;
                if (i3 == -1) {
                    if (i4 == 0) {
                        return e(14, kdeVar.b, kdeVarD2, null);
                    }
                    if (i4 == 1) {
                        return e(15, kdeVar.b, kdeVarD2, null);
                    }
                    kde kdeVar4 = new kde(18);
                    ArrayList arrayList2 = new ArrayList();
                    while (i < kdeVar.e - 1) {
                        arrayList2.add(kdeVarD2);
                        i++;
                    }
                    arrayList2.add(e(15, kdeVar.b, kdeVarD2, null));
                    kdeVar4.c = (kde[]) arrayList2.toArray(new kde[arrayList2.size()]);
                    return kdeVar4;
                }
                if (i4 == 1 && i3 == 1) {
                    return kdeVarD2;
                }
                if (i4 > 0) {
                    arrayList = new ArrayList();
                    while (i < kdeVar.e) {
                        arrayList.add(kdeVarD2);
                        i++;
                    }
                } else {
                    arrayList = null;
                }
                if (kdeVar.f > kdeVar.e) {
                    kde kdeVarE = e(16, kdeVar.b, kdeVarD2, null);
                    for (int i5 = kdeVar.e + 1; i5 < kdeVar.f; i5++) {
                        kde kdeVar5 = new kde(18);
                        kdeVar5.c = new kde[]{kdeVarD2, kdeVarE};
                        kdeVarE = e(16, kdeVar.b, kdeVar5, null);
                    }
                    if (arrayList == null) {
                        return kdeVarE;
                    }
                    arrayList.add(kdeVarE);
                }
                if (arrayList == null) {
                    return new kde(1);
                }
                kde kdeVar6 = new kde(18);
                kdeVar6.c = (kde[]) arrayList.toArray(new kde[arrayList.size()]);
                return kdeVar6;
            default:
                return kdeVar;
        }
    }

    public static kde e(int i, int i2, kde kdeVar, kde kdeVar2) {
        int i3 = kdeVar.a;
        if (i3 == 2 || (i == i3 && (i2 & 32) == (kdeVar.b & 32))) {
            return kdeVar;
        }
        if (kdeVar2 != null && kdeVar2.a == i && (kdeVar2.b & 32) == (i2 & 32) && kdeVar == kdeVar2.c[0]) {
            return kdeVar2;
        }
        kde kdeVar3 = new kde(i);
        kdeVar3.b = i2;
        kdeVar3.c = new kde[]{kdeVar};
        return kdeVar3;
    }

    public static final void f(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(serialDescriptor.f(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(serialDescriptor.a(), arrayList);
    }

    public static final long g(long j, long j2) {
        int iE;
        int iG = kkh.g(j);
        int iF = kkh.f(j);
        if ((kkh.g(j2) < kkh.f(j)) && (kkh.g(j) < kkh.f(j2))) {
            if (kkh.a(j2, j)) {
                iG = kkh.g(j2);
                iF = iG;
            } else {
                if (kkh.a(j, j2)) {
                    iE = kkh.e(j2);
                } else {
                    int iG2 = kkh.g(j2);
                    if (iG >= kkh.f(j2) || iG2 > iG) {
                        iF = kkh.g(j2);
                    } else {
                        iG = kkh.g(j2);
                        iE = kkh.e(j2);
                    }
                }
                iF -= iE;
            }
        } else if (iF > kkh.g(j2)) {
            iG -= kkh.e(j2);
            iE = kkh.e(j2);
            iF -= iE;
        }
        return mwa.m(iG, iF);
    }
}
