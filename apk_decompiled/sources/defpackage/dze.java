package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class dze {
    public final i29 a;
    public final i29 b;
    public final float c;
    public final h99 d;

    public dze(i29 i29Var, i29 i29Var2, float f, h99 h99Var) {
        i29Var.getClass();
        i29Var2.getClass();
        h99Var.getClass();
        this.a = i29Var;
        this.b = i29Var2;
        this.c = f;
        this.d = h99Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v2, types: [int] */
    /* JADX WARN: Type inference failed for: r35v3 */
    public final h0j a(long j, lj5 lj5Var, Map map, sxe sxeVar, long j2, uye uyeVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        List listW;
        boolean z;
        String str;
        ?? r35;
        int[] iArrH;
        int length;
        int i6;
        String str2 = sxeVar.i;
        lj5Var.getClass();
        p26 p26Var = lj5Var.m;
        fea feaVar = p26Var.k;
        uyeVar.getClass();
        sq6.a(i);
        String str3 = sxeVar.h;
        c0j c0jVar = (str3 == null || bsg.I0(str3) || str2 == null || bsg.I0(str2)) ? null : new c0j(str3, str2);
        int i7 = c0jVar == null ? 1 : 2;
        nh1 nh1Var = (nh1) this.a.a();
        k86 k86Var = (k86) this.b.a();
        xmi xmiVar = lj5Var.n;
        String str4 = sxeVar.d;
        if (str4 == null) {
            str4 = sxe.p;
        }
        String str5 = sxeVar.f;
        if (str5 == null) {
            str5 = "";
        }
        g0j g0jVar = new g0j(str4, str5, sxeVar.e);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(nm6.E);
        vzi vziVar = new vzi(linkedHashMap);
        int i8 = sxeVar.n;
        sq6.a(i8);
        switch (sq6.F(i8)) {
            case 0:
                i3 = 1;
                break;
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 4;
                break;
            case 4:
                i3 = 5;
                break;
            case 5:
                i3 = 6;
                break;
            case 6:
                i3 = 7;
                break;
            default:
                mr9.b();
                return null;
        }
        wzi wziVar = new wzi(new xzi(i3), new tzi(Float.valueOf(this.c)), new b0j(i2));
        rzi rziVar = new rzi(sxeVar.a, feaVar.b);
        f0j f0jVar = new f0j(sxeVar.b, i7);
        String str6 = lj5Var.h;
        str6.getClass();
        h99 h99Var = this.d;
        h99Var.getClass();
        try {
            iArrH = sq6.H(11);
            length = iArrH.length;
            i6 = 0;
        } catch (NoSuchElementException e) {
            dch.H(h99Var, 5, g99.E, new rb1(str6, 28), e, false, 48);
            i4 = 0;
        }
        while (i6 < length) {
            int i9 = iArrH[i6];
            int[] iArr = iArrH;
            if (kgh.e(i9).equals(str6)) {
                i4 = i9;
                d0j d0jVar = j8.Q(xmiVar) ? new d0j(xmiVar.b, xmiVar.c, xmiVar.d, xmiVar.a, sta.t0(xmiVar.e)) : null;
                t26 t26Var = p26Var.d;
                t26Var.getClass();
                switch (t26Var.ordinal()) {
                    case 0:
                        i5 = 1;
                        break;
                    case 1:
                        i5 = 3;
                        break;
                    case 2:
                        i5 = 4;
                        break;
                    case 3:
                        i5 = 2;
                        break;
                    case 4:
                        i5 = 5;
                        break;
                    case 5:
                        i5 = 6;
                        break;
                    case 6:
                        i5 = 7;
                        break;
                    default:
                        mr9.b();
                        return null;
                }
                yzi yziVar = new yzi(i5, p26Var.a, p26Var.c, p26Var.b, p26Var.i, feaVar.a, feaVar.c, nh1Var.a, nh1Var.b, k86Var.a, Integer.valueOf(p26Var.l), p26Var.m, p26Var.n);
                a0j a0jVar = new a0j(p26Var.f, p26Var.h, p26Var.g);
                a1c a1cVar = lj5Var.l;
                a1cVar.getClass();
                String str7 = a1cVar.b;
                int i10 = dgj.I(a1cVar) ? 1 : 2;
                switch (sq6.F(a1cVar.a)) {
                    case 0:
                        listW = lm6.E;
                        break;
                    case 1:
                        listW = x44.W(zzi.ETHERNET);
                        break;
                    case 2:
                        listW = x44.W(zzi.WIFI);
                        break;
                    case 3:
                        listW = x44.W(zzi.WIMAX);
                        break;
                    case 4:
                        listW = x44.W(zzi.BLUETOOTH);
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        listW = x44.W(zzi.CELLULAR);
                        break;
                    case 11:
                        listW = x44.W(zzi.OTHER);
                        break;
                    default:
                        mr9.b();
                        return null;
                }
                String str8 = a1cVar.g;
                uzi uziVar = new uzi(i10, listW, (str8 == null && str7 == null) ? null : new szi(str8, str7));
                String str9 = lj5Var.e;
                String str10 = lj5Var.c;
                String strK = kxk.k(lj5Var);
                String strI = vb7.i();
                int iF = sq6.F(i);
                if (iF != 0) {
                    z = true;
                    if (iF != 1) {
                        mr9.b();
                        return null;
                    }
                    str = "time_to_full_display";
                } else {
                    z = true;
                    str = "time_to_initial_display";
                }
                String str11 = str;
                Long lValueOf = Long.valueOf(j2);
                if (uyeVar instanceof rye) {
                    r35 = z;
                } else {
                    if (!(uyeVar instanceof sye)) {
                        z = uyeVar instanceof tye;
                    }
                    if (!z) {
                        mr9.b();
                        return null;
                    }
                    r35 = 2;
                }
                return new h0j(j, rziVar, str10, str9, null, null, strK, f0jVar, i4, g0jVar, d0jVar, null, uziVar, c0jVar, a0jVar, yziVar, wziVar, vziVar, new e0j(strI, str11, i, lValueOf, r35, Boolean.valueOf(uyeVar.a())));
            }
            i6++;
            iArrH = iArr;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
