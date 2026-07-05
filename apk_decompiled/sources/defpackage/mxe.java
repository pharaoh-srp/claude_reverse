package defpackage;

import com.datadog.android.rum.internal.domain.scope.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class mxe extends ts9 implements zy7 {
    public final /* synthetic */ lj5 F;
    public final /* synthetic */ a G;
    public final /* synthetic */ sxe H;
    public final /* synthetic */ oxe I;
    public final /* synthetic */ String J;
    public final /* synthetic */ long K;
    public final /* synthetic */ long L;
    public final /* synthetic */ long M;
    public final /* synthetic */ long N;
    public final /* synthetic */ ArrayList O;
    public final /* synthetic */ long P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ za R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxe(lj5 lj5Var, a aVar, sxe sxeVar, oxe oxeVar, String str, long j, long j2, long j3, long j4, ArrayList arrayList, long j5, int i, za zaVar) {
        super(0);
        this.F = lj5Var;
        this.G = aVar;
        this.H = sxeVar;
        this.I = oxeVar;
        this.J = str;
        this.K = j;
        this.L = j2;
        this.M = j3;
        this.N = j4;
        this.O = arrayList;
        this.P = j5;
        this.Q = i;
        this.R = zaVar;
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Number, wa] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // defpackage.zy7
    public final Object a() {
        int i;
        int i2;
        ?? r10;
        int i3;
        da daVar;
        List listW;
        int i4;
        lj5 lj5Var = this.F;
        xmi xmiVar = lj5Var.n;
        p26 p26Var = lj5Var.m;
        sxe sxeVar = this.H;
        String str = sxeVar.d;
        boolean zQ = lja.q(lj5Var, str == null ? "" : str);
        a aVar = this.G;
        aVar.f.getClass();
        long j = aVar.i;
        z9 z9VarT = dgj.T(this.I);
        String str2 = aVar.j;
        String str3 = this.J;
        str3.getClass();
        y9 y9Var = new y9();
        y9Var.a = str3;
        ra raVar = new ra(this.K);
        ka kaVar = new ka(this.L);
        ua uaVar = new ua(this.M);
        ya yaVar = new ya(this.N);
        ArrayList arrayList = this.O;
        x9 x9Var = new x9(z9VarT, str2, Long.valueOf(this.P), y9Var, !arrayList.isEmpty() ? new sa(arrayList) : null, raVar, kaVar, uaVar, yaVar);
        String str4 = str == null ? "" : str;
        String str5 = sxeVar.e;
        String str6 = sxeVar.f;
        ba baVar = new ba(str4, null, str6 == null ? "" : str6, str5, null);
        ca caVar = new ca(sxeVar.a, p26Var.k.b);
        aa aaVar = new aa(sxeVar.b, this.Q, Boolean.valueOf(zQ));
        String str7 = lj5Var.h;
        h99 h99VarT = aVar.b.t();
        str7.getClass();
        h99VarT.getClass();
        try {
        } catch (NoSuchElementException e) {
            dch.H(h99VarT, 5, g99.E, new rb1(str7, 26), e, false, 48);
            i = 0;
        }
        for (int i5 : sq6.H(11)) {
            if (sq6.f(i5).equals(str7)) {
                i = i5;
                bb bbVar = j8.Q(xmiVar) ? new bb(xmiVar.b, xmiVar.c, xmiVar.d, xmiVar.a, sta.t0(xmiVar.e)) : null;
                va vaVar = new va(p26Var.f, p26Var.h, null, p26Var.g);
                t26 t26Var = p26Var.d;
                t26Var.getClass();
                switch (t26Var.ordinal()) {
                    case 0:
                        i2 = 1;
                        break;
                    case 1:
                        i2 = 3;
                        break;
                    case 2:
                        i2 = 4;
                        break;
                    case 3:
                        i2 = 2;
                        break;
                    case 4:
                        i2 = 5;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    default:
                        mr9.b();
                        return null;
                }
                String str8 = p26Var.a;
                String str9 = p26Var.c;
                String str10 = p26Var.b;
                String str11 = p26Var.i;
                fea feaVar = p26Var.k;
                pa paVar = new pa(i2, str8, str9, str10, str11, null, feaVar.a, feaVar.c, null, null, null, Integer.valueOf(p26Var.l), p26Var.m, p26Var.n);
                ja jaVar = new ja(new LinkedHashMap(aVar.b()));
                int i6 = sxeVar.n;
                sq6.a(i6);
                switch (sq6.F(i6)) {
                    case 0:
                        r10 = 0;
                        i3 = 1;
                        break;
                    case 1:
                        r10 = 0;
                        i3 = 2;
                        break;
                    case 2:
                        r10 = 0;
                        i3 = 3;
                        break;
                    case 3:
                        r10 = 0;
                        i3 = 4;
                        break;
                    case 4:
                        r10 = 0;
                        i3 = 5;
                        break;
                    case 5:
                        r10 = 0;
                        i3 = 6;
                        break;
                    case 6:
                        r10 = 0;
                        i3 = 7;
                        break;
                    default:
                        mr9.b();
                        return null;
                }
                la laVar = new la(new oa(r10, i3), new fa(Float.valueOf(aVar.e), r10, r10, r10), null, null, null);
                a1c a1cVar = aVar.p;
                a1cVar.getClass();
                String str12 = a1cVar.b;
                int i7 = dgj.I(a1cVar) ? 1 : 2;
                switch (sq6.F(a1cVar.a)) {
                    case 0:
                        daVar = null;
                        listW = lm6.E;
                        break;
                    case 1:
                        daVar = null;
                        listW = x44.W(ta.ETHERNET);
                        break;
                    case 2:
                        daVar = null;
                        listW = x44.W(ta.WIFI);
                        break;
                    case 3:
                        daVar = null;
                        listW = x44.W(ta.WIMAX);
                        break;
                    case 4:
                        daVar = null;
                        listW = x44.W(ta.BLUETOOTH);
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        daVar = null;
                        listW = x44.W(ta.CELLULAR);
                        break;
                    case 11:
                        daVar = null;
                        listW = x44.W(ta.OTHER);
                        break;
                    default:
                        mr9.b();
                        return null;
                }
                String str13 = a1cVar.g;
                return new db(j, caVar, lj5Var.c, lj5Var.e, String.valueOf(lj5Var.f), lj5Var.p, kxk.k(lj5Var), aaVar, i, baVar, bbVar, null, new ga(i7, listW, 0, (str13 == null && str12 == null) ? daVar : new da(str13, str12)), null, this.R, null, vaVar, paVar, laVar, jaVar, null, x9Var);
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
