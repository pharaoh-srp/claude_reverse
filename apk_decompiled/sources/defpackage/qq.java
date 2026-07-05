package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.conway.WebhookRecord;
import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.bell.b;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.conway.protocol.ConwayClientInfo;
import com.anthropic.claude.project.knowledge.f;
import com.anthropic.claude.tool.model.ChartDisplayV0Input;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qq implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ qq(cjh cjhVar, bz7 bz7Var, int i, int i2) {
        this.E = 22;
        this.G = cjhVar;
        this.H = bz7Var;
        this.F = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.F;
        Object obj3 = this.H;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                mok.e((i4g) obj4, (ta4) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                cc0.a((zb0) obj4, (List) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                euk.n((List) obj4, (bz7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                huk.f((ArrayList) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                x21.d((z21) obj4, i2, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                b.a((gj1) obj4, (um1) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((rr1) obj4).a((cte) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                pj2.a((ChartDisplayV0Input) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                tm3.c((v77) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                xq3.b((cte) obj4, (String) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                a.h((zy7) obj3, (i4g) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                a.u((String) obj3, (i4g) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                a.k((w36) obj4, (i) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                wi4.h((DirectoryServer) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                jj4.b((DirectoryServer) obj4, (LocalDate) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).getClass();
                ask.b((ConwayClientInfo) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                fs4.a((dx4) obj4, (bz7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                ktk.c((WebhookRecord) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                bz7 bz7Var = (bz7) obj4;
                iqb iqbVar = (iqb) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lz1 lz1Var = jd4.a;
                    if (i2 == 0) {
                        e18Var.a0(-101251783);
                        py8 py8VarE = rtk.f;
                        if (py8VarE == null) {
                            oy8 oy8Var = new oy8("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                            int i3 = asi.a;
                            eeg eegVar = new eeg(d54.b);
                            dn0 dn0Var = new dn0(1);
                            dn0Var.r(3.0f, 17.25f);
                            dn0Var.t(21.0f);
                            dn0Var.o(3.75f);
                            dn0Var.p(17.81f, 9.94f);
                            dn0Var.q(-3.75f, -3.75f);
                            dn0Var.p(3.0f, 17.25f);
                            dn0Var.j();
                            dn0Var.r(20.71f, 7.04f);
                            dn0Var.k(0.39f, -0.39f, 0.39f, -1.02f, MTTypesetterKt.kLineSkipLimitMultiplier, -1.41f);
                            dn0Var.q(-2.34f, -2.34f);
                            dn0Var.k(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, MTTypesetterKt.kLineSkipLimitMultiplier);
                            dn0Var.q(-1.83f, 1.83f);
                            dn0Var.q(3.75f, 3.75f);
                            dn0Var.q(1.83f, -1.83f);
                            dn0Var.j();
                            oy8Var.c(1.0f, 1.0f, 1.0f, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, 2, eegVar, null, "", dn0Var.E);
                            py8VarE = oy8Var.e();
                            rtk.f = py8VarE;
                        }
                        py8 py8Var = py8VarE;
                        String strE = dch.E(R.string.m3c_date_picker_switch_to_input_mode, e18Var);
                        boolean zF = e18Var.f(bz7Var);
                        Object objN = e18Var.N();
                        if (zF || objN == lz1Var) {
                            objN = new zb2(6, bz7Var);
                            e18Var.k0(objN);
                        }
                        cn5.h((zy7) objN, py8Var, strE, iqbVar, false, e18Var, 0, 16);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-100953904);
                        py8 py8VarE2 = rtk.g;
                        if (py8VarE2 == null) {
                            oy8 oy8Var2 = new oy8("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                            int i4 = asi.a;
                            eeg eegVar2 = new eeg(d54.b);
                            dn0 dn0Var2 = new dn0(1);
                            dn0Var2.r(9.0f, 11.0f);
                            dn0Var2.p(7.0f, 11.0f);
                            dn0Var2.u(2.0f);
                            dn0Var2.o(2.0f);
                            dn0Var2.u(-2.0f);
                            dn0Var2.j();
                            dn0Var2.r(13.0f, 11.0f);
                            dn0Var2.o(-2.0f);
                            dn0Var2.u(2.0f);
                            dn0Var2.o(2.0f);
                            dn0Var2.u(-2.0f);
                            dn0Var2.j();
                            dn0Var2.r(17.0f, 11.0f);
                            dn0Var2.o(-2.0f);
                            dn0Var2.u(2.0f);
                            dn0Var2.o(2.0f);
                            dn0Var2.u(-2.0f);
                            dn0Var2.j();
                            dn0Var2.r(19.0f, 4.0f);
                            dn0Var2.o(-1.0f);
                            dn0Var2.p(18.0f, 2.0f);
                            dn0Var2.o(-2.0f);
                            dn0Var2.u(2.0f);
                            dn0Var2.p(8.0f, 4.0f);
                            dn0Var2.p(8.0f, 2.0f);
                            dn0Var2.p(6.0f, 2.0f);
                            dn0Var2.u(2.0f);
                            dn0Var2.p(5.0f, 4.0f);
                            dn0Var2.k(-1.11f, MTTypesetterKt.kLineSkipLimitMultiplier, -1.99f, 0.9f, -1.99f, 2.0f);
                            dn0Var2.p(3.0f, 20.0f);
                            dn0Var2.k(MTTypesetterKt.kLineSkipLimitMultiplier, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                            dn0Var2.o(14.0f);
                            dn0Var2.k(1.1f, MTTypesetterKt.kLineSkipLimitMultiplier, 2.0f, -0.9f, 2.0f, -2.0f);
                            dn0Var2.p(21.0f, 6.0f);
                            dn0Var2.k(MTTypesetterKt.kLineSkipLimitMultiplier, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            dn0Var2.j();
                            dn0Var2.r(19.0f, 20.0f);
                            dn0Var2.p(5.0f, 20.0f);
                            dn0Var2.p(5.0f, 9.0f);
                            dn0Var2.o(14.0f);
                            dn0Var2.u(11.0f);
                            dn0Var2.j();
                            oy8Var2.c(1.0f, 1.0f, 1.0f, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, 2, eegVar2, null, "", dn0Var2.E);
                            py8VarE2 = oy8Var2.e();
                            rtk.g = py8VarE2;
                        }
                        py8 py8Var2 = py8VarE2;
                        String strE2 = dch.E(R.string.m3c_date_picker_switch_to_calendar_mode, e18Var);
                        boolean zF2 = e18Var.f(bz7Var);
                        Object objN2 = e18Var.N();
                        if (zF2 || objN2 == lz1Var) {
                            objN2 = new zb2(7, bz7Var);
                            e18Var.k0(objN2);
                        }
                        cn5.h((zy7) objN2, py8Var2, strE2, iqbVar, false, e18Var, 0, 16);
                        e18Var.p(false);
                    }
                } else {
                    e18Var.T();
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((Integer) obj2).intValue();
                cn5.l((wl5) obj4, (o72) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((Integer) obj2).getClass();
                ((js5) obj4).a((String) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                h66.j((iwg) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                dlk.e((cjh) obj4, (bz7) obj3, i2, (ld4) obj, x44.p0(1));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                qnc qncVar = (qnc) obj4;
                ta4 ta4Var = (ta4) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    for (int i5 = 0; i5 < i2; i5++) {
                        iqb iqbVarI = gb9.I(fqb.E, qncVar);
                        o5b o5bVarD = dw1.d(lja.G, false);
                        int iHashCode = Long.hashCode(e18Var2.T);
                        hyc hycVarL = e18Var2.l();
                        iqb iqbVarE = kxk.E(e18Var2, iqbVarI);
                        dd4.e.getClass();
                        re4 re4Var = cd4.b;
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var);
                        } else {
                            e18Var2.n0();
                        }
                        d4c.i0(e18Var2, cd4.f, o5bVarD);
                        d4c.i0(e18Var2, cd4.e, hycVarL);
                        d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                        d4c.h0(e18Var2, cd4.h);
                        d4c.i0(e18Var2, cd4.d, iqbVarE);
                        ta4Var.invoke(Integer.valueOf(i5), e18Var2, 0);
                        e18Var2.p(true);
                    }
                } else {
                    e18Var2.T();
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                ((zw9) obj4).b(i2, obj3, (ld4) obj, x44.p0(1));
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Integer) obj2).getClass();
                ((aoc) obj4).b(i2, obj3, (ld4) obj, x44.p0(1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                f.a((s64) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                npf.j((iyg) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                npf.h((buf) obj4, (String) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                quj.e((z4g) obj4, (pz7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ qq(int i, ta4 ta4Var, i4g i4gVar) {
        this.E = 0;
        this.G = i4gVar;
        this.H = ta4Var;
        this.F = i;
    }

    public /* synthetic */ qq(int i, Object obj, Object obj2, int i2) {
        this.E = i2;
        this.F = i;
        this.G = obj;
        this.H = obj2;
    }

    public /* synthetic */ qq(int i, int i2, int i3, Object obj, Object obj2) {
        this.E = i3;
        this.G = obj;
        this.F = i;
        this.H = obj2;
    }

    public /* synthetic */ qq(Object obj, i4g i4gVar, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.G = i4gVar;
        this.F = i;
    }

    public /* synthetic */ qq(Object obj, Object obj2, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.H = obj2;
        this.F = i;
    }
}
