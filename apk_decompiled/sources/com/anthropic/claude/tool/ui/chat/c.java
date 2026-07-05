package com.anthropic.claude.tool.ui.chat;

import com.anthropic.claude.R;
import com.anthropic.claude.tool.ui.chat.FormSheetDestination;
import com.anthropic.claude.tool.ui.chat.PhoneCallSheetDestination;
import defpackage.bsg;
import defpackage.bz7;
import defpackage.e18;
import defpackage.ebh;
import defpackage.f0d;
import defpackage.fd9;
import defpackage.jd4;
import defpackage.kwe;
import defpackage.l1d;
import defpackage.ld4;
import defpackage.lpa;
import defpackage.lz1;
import defpackage.m1d;
import defpackage.nw7;
import defpackage.o1d;
import defpackage.pz7;
import defpackage.pza;
import defpackage.rz7;
import defpackage.t4g;
import defpackage.ta4;
import defpackage.tp4;
import defpackage.uje;
import defpackage.v0d;
import defpackage.vb7;
import defpackage.zn;
import defpackage.zy7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements rz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ c(uje ujeVar, String str, List list, bz7 bz7Var, t4g t4gVar) {
        this.G = ujeVar;
        this.F = str;
        this.H = list;
        this.I = bz7Var;
        this.J = t4gVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zy7 zy7Var;
        int i = this.E;
        lz1 lz1Var = jd4.a;
        kwe kweVarF = null;
        Object obj4 = this.J;
        Object obj5 = this.I;
        Object obj6 = this.H;
        String strN = this.F;
        Object obj7 = this.G;
        switch (i) {
            case 0:
                l1d l1dVar = (l1d) obj7;
                Integer num = (Integer) obj6;
                f0d f0dVar = (f0d) obj5;
                v0d v0dVar = (v0d) obj4;
                PhoneCallSheetDestination phoneCallSheetDestination = (PhoneCallSheetDestination) obj;
                ((Integer) obj3).getClass();
                phoneCallSheetDestination.getClass();
                e18 e18Var = (e18) ((ld4) obj2);
                e18Var.a0(603268520);
                if (phoneCallSheetDestination.equals(PhoneCallSheetDestination.Closed.INSTANCE)) {
                    e18Var.a0(1829406229);
                    e18Var.p(false);
                } else {
                    if (!phoneCallSheetDestination.equals(PhoneCallSheetDestination.Transcript.INSTANCE)) {
                        throw ebh.u(e18Var, -79536000, false);
                    }
                    e18Var.a0(-79532104);
                    boolean zBooleanValue = v0dVar != null ? ((Boolean) v0dVar.d.getValue()).booleanValue() : false;
                    if (v0dVar == null) {
                        e18Var.a0(1829726273);
                        e18Var.p(false);
                        zy7Var = null;
                    } else {
                        e18Var.a0(1829726274);
                        boolean zH = e18Var.h(v0dVar);
                        Object objN = e18Var.N();
                        if (zH || objN == lz1Var) {
                            objN = new pza(9, v0dVar);
                            e18Var.k0(objN);
                        }
                        zy7Var = (zy7) objN;
                        e18Var.p(false);
                    }
                    int i2 = o1d.a;
                    if (bsg.I0(strN)) {
                        strN = null;
                    }
                    if (strN == null) {
                        strN = vb7.n(e18Var, -1625678137, R.string.phone_call_transcript_sheet_title, e18Var, false);
                    } else {
                        e18Var.a0(-1625679222);
                        e18Var.p(false);
                    }
                    kwe kweVar = new kwe(strN, null, fd9.q0(1959299404, new lpa(l1dVar, 20, num), e18Var), null, (l1dVar != l1d.H || zy7Var == null) ? null : new ta4(1712931438, true, new m1d(zy7Var, zBooleanValue)), false, fd9.q0(87508009, new nw7(f0dVar, 20, l1dVar), e18Var), 46);
                    e18Var.p(false);
                    kweVarF = kweVar;
                }
                e18Var.p(false);
                return kweVarF;
            default:
                uje ujeVar = (uje) obj7;
                List list = (List) obj6;
                bz7 bz7Var = (bz7) obj5;
                t4g t4gVar = (t4g) obj4;
                FormSheetDestination formSheetDestination = (FormSheetDestination) obj;
                ((Integer) obj3).getClass();
                formSheetDestination.getClass();
                e18 e18Var2 = (e18) ((ld4) obj2);
                e18Var2.a0(655194856);
                if (formSheetDestination instanceof FormSheetDestination.Closed) {
                    e18Var2.a0(-1716313835);
                    e18Var2.p(false);
                } else {
                    if (!(formSheetDestination instanceof FormSheetDestination.FormInput)) {
                        throw ebh.u(e18Var2, -1717934656, false);
                    }
                    e18Var2.a0(-1717930915);
                    boolean zF = e18Var2.f(bz7Var) | e18Var2.h(t4gVar);
                    Object objN2 = e18Var2.N();
                    if (zF || objN2 == lz1Var) {
                        objN2 = new zn(bz7Var, t4gVar, (tp4) null, 27);
                        e18Var2.k0(objN2);
                    }
                    kweVarF = f.f(ujeVar, strN, list, (pz7) objN2, e18Var2);
                    e18Var2.p(false);
                }
                e18Var2.p(false);
                return kweVarF;
        }
    }

    public /* synthetic */ c(String str, l1d l1dVar, Integer num, f0d f0dVar, v0d v0dVar) {
        this.F = str;
        this.G = l1dVar;
        this.H = num;
        this.I = f0dVar;
        this.J = v0dVar;
    }
}
