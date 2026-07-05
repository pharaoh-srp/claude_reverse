package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import defpackage.a1c;
import defpackage.bla;
import defpackage.bsg;
import defpackage.cla;
import defpackage.dch;
import defpackage.dgj;
import defpackage.dla;
import defpackage.fla;
import defpackage.g99;
import defpackage.gla;
import defpackage.h99;
import defpackage.j8;
import defpackage.jla;
import defpackage.kla;
import defpackage.kxk;
import defpackage.lj5;
import defpackage.lla;
import defpackage.lm6;
import defpackage.mla;
import defpackage.ola;
import defpackage.p26;
import defpackage.pla;
import defpackage.qla;
import defpackage.rb1;
import defpackage.rla;
import defpackage.sla;
import defpackage.sq6;
import defpackage.sta;
import defpackage.sxe;
import defpackage.t26;
import defpackage.ts9;
import defpackage.wg6;
import defpackage.wla;
import defpackage.x44;
import defpackage.xla;
import defpackage.xmi;
import defpackage.y6a;
import defpackage.zla;
import defpackage.zy7;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends ts9 implements zy7 {
    public final /* synthetic */ lj5 F;
    public final /* synthetic */ sxe G;
    public final /* synthetic */ r H;
    public final /* synthetic */ long I;
    public final /* synthetic */ RumRawEvent.AddLongTask J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ LinkedHashMap L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(lj5 lj5Var, sxe sxeVar, r rVar, long j, RumRawEvent.AddLongTask addLongTask, boolean z, LinkedHashMap linkedHashMap) {
        super(0);
        this.F = lj5Var;
        this.G = sxeVar;
        this.H = rVar;
        this.I = j;
        this.J = addLongTask;
        this.K = z;
        this.L = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Number, tla] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // defpackage.zy7
    public final Object a() {
        List listW;
        int i;
        int i2;
        ?? r15;
        int i3;
        lj5 lj5Var = this.F;
        xmi xmiVar = lj5Var.n;
        p26 p26Var = lj5Var.m;
        sxe sxeVar = this.G;
        String str = sxeVar.i;
        String str2 = sxeVar.h;
        wla wlaVar = (str2 == null || bsg.I0(str2) || str == null || bsg.I0(str)) ? null : new wla(str2, str, null, new LinkedHashMap());
        int i4 = wlaVar == null ? 1 : 2;
        RumRawEvent.AddLongTask addLongTask = this.J;
        long j = this.I - (addLongTask.a / 1000000);
        pla plaVar = new pla(UUID.randomUUID().toString(), null, 0, addLongTask.a, null, null, null, null, Boolean.valueOf(this.K), null);
        String str3 = sxeVar.g;
        bla blaVar = str3 != null ? new bla(x44.W(str3)) : null;
        String str4 = sxeVar.d;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = sxeVar.e;
        String str6 = sxeVar.f;
        rla rlaVar = new rla(str4, null, str6 != null ? str6 : "", str5);
        xla xlaVar = j8.Q(xmiVar) ? new xla(xmiVar.b, xmiVar.c, xmiVar.d, xmiVar.a, sta.t0(xmiVar.e)) : null;
        a1c a1cVar = lj5Var.l;
        a1cVar.getClass();
        String str7 = a1cVar.b;
        int i5 = dgj.I(a1cVar) ? 1 : 2;
        switch (sq6.F(a1cVar.a)) {
            case 0:
                listW = lm6.E;
                break;
            case 1:
                listW = x44.W(ola.ETHERNET);
                break;
            case 2:
                listW = x44.W(ola.WIFI);
                break;
            case 3:
                listW = x44.W(ola.WIMAX);
                break;
            case 4:
                listW = x44.W(ola.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listW = x44.W(ola.CELLULAR);
                break;
            case 11:
                listW = x44.W(ola.OTHER);
                break;
            default:
                wg6.i();
                return null;
        }
        String str8 = a1cVar.g;
        gla glaVar = new gla(i5, listW, 0, (str8 == null && str7 == null) ? null : new dla(str8, str7));
        cla claVar = new cla(sxeVar.a, null);
        String str9 = sxeVar.b;
        r rVar = this.H;
        qla qlaVar = new qla(str9, i4, Boolean.valueOf(rVar.W));
        String str10 = lj5Var.h;
        h99 h99VarT = rVar.b.t();
        str10.getClass();
        h99VarT.getClass();
        try {
        } catch (NoSuchElementException e) {
            dch.H(h99VarT, 5, g99.E, new rb1(str10, 24), e, false, 48);
            i = 0;
        }
        for (int i6 : sq6.H(11)) {
            if (y6a.i(i6).equals(str10)) {
                i = i6;
                sla slaVar = new sla(p26Var.f, p26Var.h, null, p26Var.g);
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
                        wg6.i();
                        return null;
                }
                mla mlaVar = new mla(i2, p26Var.a, p26Var.c, p26Var.b, p26Var.i, null, null, null, null, null, null, Integer.valueOf(p26Var.l), p26Var.m, p26Var.n);
                jla jlaVar = new jla(this.L);
                int i7 = sxeVar.n;
                if (i7 == 0) {
                    throw null;
                }
                switch (sq6.F(i7)) {
                    case 0:
                        r15 = 0;
                        i3 = 1;
                        break;
                    case 1:
                        r15 = 0;
                        i3 = 2;
                        break;
                    case 2:
                        r15 = 0;
                        i3 = 3;
                        break;
                    case 3:
                        r15 = 0;
                        i3 = 4;
                        break;
                    case 4:
                        r15 = 0;
                        i3 = 5;
                        break;
                    case 5:
                        r15 = 0;
                        i3 = 6;
                        break;
                    case 6:
                        r15 = 0;
                        i3 = 7;
                        break;
                    default:
                        wg6.i();
                        return null;
                }
                return new zla(j, claVar, lj5Var.c, lj5Var.e, String.valueOf(lj5Var.f), lj5Var.p, kxk.k(lj5Var), qlaVar, i, rlaVar, xlaVar, null, glaVar, null, wlaVar, null, slaVar, mlaVar, new kla(new lla(r15, i3), new fla(Float.valueOf(rVar.m), r15, r15, r15), null, null, null, null), jlaVar, blaVar, null, plaVar);
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
