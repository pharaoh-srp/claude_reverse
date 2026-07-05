package defpackage;

import com.datadog.android.rum.internal.domain.scope.c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class hye extends ts9 implements zy7 {
    public final /* synthetic */ lj5 F;
    public final /* synthetic */ c G;
    public final /* synthetic */ sxe H;
    public final /* synthetic */ jph I;
    public final /* synthetic */ int J;
    public final /* synthetic */ fqe K;
    public final /* synthetic */ Long L;
    public final /* synthetic */ Long M;
    public final /* synthetic */ epe N;
    public final /* synthetic */ jpe O;
    public final /* synthetic */ uoe P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ String R;
    public final /* synthetic */ String S;
    public final /* synthetic */ Number T;
    public final /* synthetic */ lpe U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hye(lj5 lj5Var, c cVar, sxe sxeVar, jph jphVar, int i, fqe fqeVar, Long l, Long l2, epe epeVar, jpe jpeVar, uoe uoeVar, int i2, String str, String str2, Number number, lpe lpeVar) {
        super(0);
        this.F = lj5Var;
        this.G = cVar;
        this.H = sxeVar;
        this.I = jphVar;
        this.J = i;
        this.K = fqeVar;
        this.L = l;
        this.M = l2;
        this.N = epeVar;
        this.O = jpeVar;
        this.P = uoeVar;
        this.Q = i2;
        this.R = str;
        this.S = str2;
        this.T = number;
        this.U = lpeVar;
    }

    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [bpe, java.lang.Number] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // defpackage.zy7
    public final Object a() {
        int i;
        String str;
        String str2;
        long j;
        qoe qoeVar;
        hoe hoeVar;
        kpe kpeVar;
        toe toeVar;
        roe roeVar;
        cpe cpeVar;
        List listW;
        int i2;
        int i3;
        ?? r11;
        int i4;
        int[] iArrH;
        int length;
        qoe qoeVar2;
        lj5 lj5Var = this.F;
        xmi xmiVar = lj5Var.n;
        p26 p26Var = lj5Var.m;
        c cVar = this.G;
        k99 k99Var = cVar.b;
        lja ljaVar = cVar.g;
        sxe sxeVar = this.H;
        String str3 = sxeVar.d;
        if (str3 == null) {
            str3 = "";
        }
        ljaVar.getClass();
        boolean zQ = lja.q(lj5Var, str3);
        long j2 = this.I.b - cVar.n;
        g99 g99Var = g99.E;
        if (j2 <= 0) {
            dch.H(k99Var.t(), 4, g99Var, new k2c(5, cVar), null, false, 56);
            j2 = 1;
        }
        cVar.i.getClass();
        long j3 = cVar.m;
        String str4 = cVar.j;
        int i5 = this.J;
        sq6.a(i5);
        int i6 = 8;
        switch (sq6.F(i5)) {
            case 0:
                i = 3;
                break;
            case 1:
                i = 4;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 1;
                break;
            case 4:
                i = 11;
                break;
            case 5:
            case 11:
                i = 10;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 5;
                break;
            case 10:
                i = 9;
                break;
            default:
                mr9.b();
                return null;
        }
        String str5 = cVar.c;
        int i7 = cVar.d;
        sq6.a(i7);
        switch (sq6.F(i7)) {
            case 0:
                i6 = 1;
                break;
            case 1:
                i6 = 2;
                break;
            case 2:
                i6 = 3;
                break;
            case 3:
                i6 = 4;
                break;
            case 4:
                i6 = 5;
                break;
            case 5:
                i6 = 6;
                break;
            case 6:
                i6 = 7;
                break;
            case 7:
                break;
            case 8:
                i6 = 9;
                break;
            default:
                mr9.b();
                return null;
        }
        fqe fqeVar = this.K;
        if (fqeVar != null) {
            if (fqeVar.d() > 0) {
                str = str4;
                str2 = "";
                j = j2;
                qoeVar2 = new qoe(fqeVar.c(), fqeVar.d());
            } else {
                str = str4;
                str2 = "";
                j = j2;
                qoeVar2 = null;
            }
            qoeVar = qoeVar2;
        } else {
            str = str4;
            str2 = "";
            j = j2;
            qoeVar = null;
        }
        if (fqeVar != null) {
            hoeVar = fqeVar.b() > 0 ? new hoe(fqeVar.a(), fqeVar.b()) : null;
        } else {
            hoeVar = null;
        }
        if (fqeVar != null) {
            kpeVar = fqeVar.j() > 0 ? new kpe(fqeVar.i(), fqeVar.j()) : null;
        } else {
            kpeVar = null;
        }
        if (fqeVar != null) {
            toeVar = (fqeVar.h() < 0 || fqeVar.g() <= 0) ? null : new toe(fqeVar.g(), fqeVar.h());
        } else {
            toeVar = null;
        }
        if (fqeVar != null) {
            roeVar = fqeVar.f() > 0 ? new roe(fqeVar.e(), fqeVar.f()) : null;
        } else {
            roeVar = null;
        }
        hr5 hr5Var = cVar.f;
        String str6 = cVar.c;
        if (hr5Var.a(str6)) {
            try {
                String host = new URL(str6).getHost();
                host.getClass();
                str6 = host;
            } catch (MalformedURLException unused) {
            }
            cpeVar = new cpe(str6);
        } else {
            cpeVar = null;
        }
        gpe gpeVar = new gpe(str, i, i6, str5, this.L, Long.valueOf(j), this.M, null, null, null, 0, null, null, qoeVar, hoeVar, kpeVar, toeVar, roeVar, null, 0, cpeVar, this.N, this.O, this.P);
        String str7 = sxeVar.g;
        coe coeVar = str7 != null ? new coe(x44.W(str7)) : null;
        String str8 = sxeVar.d;
        if (str8 == null) {
            str8 = str2;
        }
        String str9 = sxeVar.e;
        String str10 = sxeVar.f;
        if (str10 == null) {
            str10 = str2;
        }
        ipe ipeVar = new ipe(str8, null, str10, str9);
        mpe mpeVar = j8.Q(xmiVar) ? new mpe(xmiVar.b, xmiVar.c, xmiVar.d, xmiVar.a, sta.t0(xmiVar.e)) : null;
        a1c a1cVar = cVar.o;
        a1cVar.getClass();
        String str11 = a1cVar.b;
        int i8 = dgj.I(a1cVar) ? 1 : 2;
        switch (sq6.F(a1cVar.a)) {
            case 0:
                listW = lm6.E;
                break;
            case 1:
                listW = x44.W(voe.ETHERNET);
                break;
            case 2:
                listW = x44.W(voe.WIFI);
                break;
            case 3:
                listW = x44.W(voe.WIMAX);
                break;
            case 4:
                listW = x44.W(voe.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listW = x44.W(voe.CELLULAR);
                break;
            case 11:
                listW = x44.W(voe.OTHER);
                break;
            default:
                mr9.b();
                return null;
        }
        String str12 = a1cVar.g;
        int i9 = 0;
        ioe ioeVar = new ioe(i8, listW, 0, (str12 == null && str11 == null) ? null : new eoe(str12, str11));
        doe doeVar = new doe(sxeVar.a, p26Var.k.b);
        hpe hpeVar = new hpe(sxeVar.b, this.Q, Boolean.valueOf(zQ));
        String str13 = lj5Var.h;
        h99 h99VarT = k99Var.t();
        str13.getClass();
        h99VarT.getClass();
        try {
            iArrH = sq6.H(11);
            length = iArrH.length;
        } catch (NoSuchElementException e) {
            dch.H(h99VarT, 5, g99Var, new rb1(str13, 27), e, false, 48);
            i2 = 0;
        }
        while (i9 < length) {
            int i10 = iArrH[i9];
            int[] iArr = iArrH;
            if (grc.h(i10).equals(str13)) {
                i2 = i10;
                xoe xoeVar = new xoe(p26Var.f, p26Var.h, null, p26Var.g);
                t26 t26Var = p26Var.d;
                t26Var.getClass();
                switch (t26Var.ordinal()) {
                    case 0:
                        i3 = 1;
                        break;
                    case 1:
                        i3 = 3;
                        break;
                    case 2:
                        i3 = 4;
                        break;
                    case 3:
                        i3 = 2;
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
                String str14 = p26Var.a;
                String str15 = p26Var.c;
                String str16 = p26Var.b;
                String str17 = p26Var.i;
                fea feaVar = p26Var.k;
                ooe ooeVar = new ooe(i3, str14, str15, str16, str17, null, feaVar.a, feaVar.c, null, null, null, Integer.valueOf(p26Var.l), p26Var.m, p26Var.n);
                loe loeVar = new loe(new LinkedHashMap(cVar.b()));
                int i11 = sxeVar.n;
                sq6.a(i11);
                switch (sq6.F(i11)) {
                    case 0:
                        r11 = 0;
                        i4 = 1;
                        break;
                    case 1:
                        r11 = 0;
                        i4 = 2;
                        break;
                    case 2:
                        r11 = 0;
                        i4 = 3;
                        break;
                    case 3:
                        r11 = 0;
                        i4 = 4;
                        break;
                    case 4:
                        r11 = 0;
                        i4 = 5;
                        break;
                    case 5:
                        r11 = 0;
                        i4 = 6;
                        break;
                    case 6:
                        r11 = 0;
                        i4 = 7;
                        break;
                    default:
                        mr9.b();
                        return null;
                }
                return new ppe(j3, doeVar, lj5Var.c, lj5Var.e, String.valueOf(lj5Var.f), lj5Var.p, kxk.k(lj5Var), hpeVar, i2, ipeVar, mpeVar, null, ioeVar, null, this.U, null, xoeVar, ooeVar, new moe(new noe(r11, i4), new goe(Float.valueOf(cVar.h), r11, r11, r11), null, null, this.R, null, this.S, this.T, null), loeVar, coeVar, null, gpeVar);
            }
            i9++;
            iArrH = iArr;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
