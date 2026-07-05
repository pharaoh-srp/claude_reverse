package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.bell.tts.f;
import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
import com.anthropic.claude.chat.input.files.a;
import com.anthropic.claude.chat.input.files.i;
import com.anthropic.claude.db.ClaudeDatabase;
import java.util.ArrayList;
import java.util.Date;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ph1 implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ ph1(w52 w52Var) {
        this.E = 6;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        tze tzeVarL0;
        String value;
        int i = this.E;
        int i2 = 16;
        int i3 = 15;
        int i4 = 14;
        int i5 = 21;
        int i6 = 20;
        int i7 = 19;
        int i8 = 18;
        int i9 = 22;
        int i10 = 1;
        int i11 = 0;
        int i12 = 3;
        int i13 = 2;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                pl9 pl9Var = (pl9) obj;
                pl9Var.getClass();
                return ql9.a(pl9Var);
            case 1:
                oqb oqbVar = (oqb) obj;
                oqbVar.getClass();
                mrg mrgVar = nai.q;
                fg0 fg0Var = new fg0(12);
                kce kceVar = jce.a;
                pl9 pl9VarB = kceVar.b(bg9.class);
                mrg mrgVar2 = dpf.K;
                kq9 kq9Var = kq9.E;
                oqbVar.a(new t7g(new qh1(mrgVar2, pl9VarB, mrgVar, fg0Var, kq9Var)));
                sq6.C(new qh1(mrgVar2, kceVar.b(um1.class), null, new fg0(13), kq9Var), oqbVar);
                return ieiVar;
            case 2:
                oqb oqbVar2 = (oqb) obj;
                oqbVar2.getClass();
                kce kceVar2 = jce.a;
                xai xaiVar = new xai(kceVar2.b(zni.class));
                d8 d8Var = new d8(i9);
                pl9 pl9VarB2 = kceVar2.b(gj1.class);
                kq9 kq9Var2 = kq9.F;
                oqbVar2.a(new ge7(new qh1(xaiVar, pl9VarB2, null, d8Var, kq9Var2)));
                fg0 fg0Var2 = new fg0(i4);
                pl9 pl9VarB3 = kceVar2.b(x4j.class);
                kq9 kq9Var3 = kq9.G;
                oqbVar2.a(new w7f(new qh1(xaiVar, pl9VarB3, null, fg0Var2, kq9Var3)));
                oqbVar2.a(new ge7(new qh1(xaiVar, kceVar2.b(xm1.class), null, new fg0(i3), kq9Var2)));
                oqbVar2.a(new ge7(new qh1(xaiVar, kceVar2.b(yh1.class), null, new fg0(i2), kq9Var2)));
                oqbVar2.a(new ge7(new qh1(xaiVar, kceVar2.b(d2h.class), null, new fg0(17), kq9Var2)));
                qh1 qh1Var = new qh1(xaiVar, kceVar2.b(e2h.class), null, new fg0(i8), kq9Var3);
                oqbVar2.a(new w7f(qh1Var));
                qh1Var.g = new p92(new ph1(i12));
                oqbVar2.a(new ge7(new qh1(xaiVar, kceVar2.b(f.class), null, new fg0(11), kq9Var2)));
                oqbVar2.a(new w7f(new qh1(xaiVar, kceVar2.b(u4j.class), null, new d8(23), kq9Var3)));
                sq6.E(new qh1(xaiVar, kceVar2.b(f4j.class), null, new d8(24), kq9Var3), oqbVar2);
                oqbVar2.d.add(xaiVar);
                return ieiVar;
            case 3:
                e2h e2hVar = (e2h) obj;
                coa coaVar = e2hVar instanceof coa ? (coa) e2hVar : null;
                if (coaVar != null) {
                    coaVar.close();
                }
                return ieiVar;
            case 4:
                if (((Context) ((ne4) obj).u0(w00.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return zx1.b;
                }
                xx1.a.getClass();
                return wx1.c;
            case 5:
                ckf.s((ekf) obj, 0);
                return ieiVar;
            case 6:
                lze lzeVar = (lze) obj;
                lzeVar.getClass();
                tzeVarL0 = lzeVar.L0("SELECT * FROM cachedConversations ORDER BY updated_at DESC");
                try {
                    int iV = iv1.v(tzeVarL0, "uuid");
                    int iV2 = iv1.v(tzeVarL0, "updated_at");
                    int iV3 = iv1.v(tzeVarL0, "conversation_json");
                    ArrayList arrayList = new ArrayList();
                    while (tzeVarL0.H0()) {
                        arrayList.add(new s52(tzeVarL0.g0(iV), new Date(tzeVarL0.getLong(iV2)), tzeVarL0.g0(iV3)));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 7:
                lze lzeVar2 = (lze) obj;
                lzeVar2.getClass();
                tzeVarL0 = lzeVar2.L0("SELECT uuid FROM cachedConversations WHERE uuid NOT IN (SELECT chat_uuid FROM chatIdListEntries)");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (tzeVarL0.H0()) {
                        arrayList2.add(tzeVarL0.g0(0));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 8:
                lze lzeVar3 = (lze) obj;
                lzeVar3.getClass();
                try {
                    lzeVar3.L0("DELETE FROM cachedProjects WHERE uuid NOT IN (SELECT project_uuid FROM projectIdListEntries)").H0();
                    return ieiVar;
                } finally {
                }
            case 9:
                ((e0g) obj).getClass();
                return fqb.E;
            case 10:
                c09 c09Var = (c09) obj;
                c09Var.getClass();
                return Boolean.valueOf(xb5.i(c09Var.a()));
            case 11:
                c09 c09Var2 = (c09) obj;
                c09Var2.getClass();
                return c09Var2.a();
            case 12:
                h09 h09Var = (h09) obj;
                h09Var.getClass();
                return h09Var.b();
            case 13:
                return Integer.valueOf(((Integer) obj).intValue() * 2);
            case 14:
                return Integer.valueOf(((Integer) obj).intValue() * 2);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return Integer.valueOf(((Integer) obj).intValue() * 2);
            case 16:
                return Integer.valueOf(((Integer) obj).intValue() * 2);
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((i90) obj).getClass();
                return xn5.w0(gp6.e(null, 3), gp6.f(null, 3));
            case g.AVG_FIELD_NUMBER /* 18 */:
                do7 do7Var = (do7) obj;
                do7Var.getClass();
                return jce.a.b(do7Var.getClass());
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                oqb oqbVar3 = (oqb) obj;
                oqbVar3.getClass();
                kce kceVar3 = jce.a;
                xai xaiVar2 = new xai(kceVar3.b(zni.class));
                fg0 fg0Var3 = new fg0(27);
                pl9 pl9VarB4 = kceVar3.b(oda.class);
                kq9 kq9Var4 = kq9.F;
                oqbVar3.a(new ge7(new qh1(xaiVar2, pl9VarB4, null, fg0Var3, kq9Var4)));
                oqbVar3.a(new ge7(new qh1(xaiVar2, kceVar3.b(sda.class), null, new fg0(28), kq9Var4)));
                oqbVar3.a(new ge7(new qh1(xaiVar2, kceVar3.b(u6j.class), null, new fg0(29), kq9Var4)));
                oqbVar3.a(new ge7(new qh1(xaiVar2, kceVar3.b(i.class), null, new fg0(i7), kq9Var4)));
                oqbVar3.a(new ge7(new qh1(xaiVar2, kceVar3.b(p6e.class), null, new fg0(i6), kq9Var4)));
                oqbVar3.a(new ge7(new qh1(xaiVar2, kceVar3.b(my8.class), null, new d8(26), kq9Var4)));
                oqbVar3.a(new ge7(new qh1(xaiVar2, kceVar3.b(bi7.class), null, new d8(27), kq9Var4)));
                oqbVar3.a(new ge7(new qh1(xaiVar2, kceVar3.b(k21.class), null, new d8(28), kq9Var4)));
                oqbVar3.a(new ge7(new qh1(xaiVar2, kceVar3.b(ck7.class), null, new d8(29), kq9Var4)));
                ge7 ge7Var = new ge7(new qh1(xaiVar2, kceVar3.b(a.class), null, new dx2(i11), kq9Var4));
                oqbVar3.a(ge7Var);
                pl9 pl9VarB5 = kceVar3.b(yw2.class);
                qh1 qh1Var2 = ge7Var.a;
                qh1Var2.f = w44.b1(qh1Var2.f, pl9VarB5);
                rzd rzdVar = qh1Var2.c;
                rzd rzdVar2 = qh1Var2.a;
                StringBuilder sb = new StringBuilder();
                sq6.D(pl9VarB5, sb, ':');
                if (rzdVar == null || (value = rzdVar.getValue()) == null) {
                    value = "";
                }
                oqbVar3.c.put(sq6.w(sb, value, ':', rzdVar2), ge7Var);
                oqbVar3.a(new ge7(new qh1(xaiVar2, kceVar3.b(pt2.class), null, new fg0(i5), kq9Var4)));
                sq6.E(new qh1(xaiVar2, kceVar3.b(fb6.class), null, new dx2(i10), kq9.G), oqbVar3);
                oqbVar3.d.add(xaiVar2);
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                oqb oqbVar4 = (oqb) obj;
                oqbVar4.getClass();
                kce kceVar4 = jce.a;
                xai xaiVar3 = new xai(kceVar4.b(zni.class));
                oqbVar4.a(new w7f(new qh1(xaiVar3, kceVar4.b(yw2.class), null, new fg0(i9), kq9.G)));
                fg0 fg0Var4 = new fg0(23);
                pl9 pl9VarB6 = kceVar4.b(dl2.class);
                kq9 kq9Var5 = kq9.F;
                oqbVar4.a(new ge7(new qh1(xaiVar3, pl9VarB6, null, fg0Var4, kq9Var5)));
                oqbVar4.a(new ge7(new qh1(xaiVar3, kceVar4.b(ok7.class), null, new fg0(24), kq9Var5)));
                oqbVar4.a(new ge7(new qh1(xaiVar3, kceVar4.b(swa.class), null, new fg0(25), kq9Var5)));
                ij0.v(new qh1(xaiVar3, kceVar4.b(haj.class), null, new fg0(26), kq9Var5), oqbVar4);
                oqbVar4.d.add(xaiVar3);
                return ieiVar;
            case 21:
                oqb oqbVar5 = (oqb) obj;
                oqbVar5.getClass();
                oqb[] oqbVarArr = {ex2.a};
                ArrayList arrayList3 = oqbVar5.e;
                b54.u0(arrayList3, oqbVarArr);
                b54.u0(arrayList3, new oqb[]{q03.a});
                b54.u0(arrayList3, new oqb[]{t03.a});
                b54.u0(arrayList3, new oqb[]{ta3.a});
                kce kceVar5 = jce.a;
                xai xaiVar4 = new xai(kceVar5.b(zni.class));
                dx2 dx2Var = new dx2(i12);
                pl9 pl9VarB7 = kceVar5.b(z93.class);
                kq9 kq9Var6 = kq9.G;
                oqbVar5.a(new w7f(new qh1(xaiVar4, pl9VarB7, null, dx2Var, kq9Var6)));
                oqbVar5.a(new w7f(new qh1(xaiVar4, kceVar5.b(uz2.class), null, new dx2(4), kq9Var6)));
                oqbVar5.a(new w7f(new qh1(xaiVar4, kceVar5.b(f93.class), null, new dx2(5), kq9Var6)));
                oqbVar5.a(new w7f(new qh1(xaiVar4, kceVar5.b(oa3.class), null, new dx2(6), kq9Var6)));
                oqbVar5.a(new w7f(new qh1(xaiVar4, kceVar5.b(cr9.class), null, new dx2(7), kq9Var6)));
                oqbVar5.a(new w7f(new qh1(xaiVar4, kceVar5.b(na3.class), null, new dx2(8), kq9Var6)));
                oqbVar5.a(new w7f(new qh1(xaiVar4, kceVar5.b(fm2.class), null, new dx2(9), kq9Var6)));
                sq6.E(new qh1(xaiVar4, kceVar5.b(h0e.class), null, new dx2(10), kq9Var6), oqbVar5);
                oqbVar5.d.add(xaiVar4);
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                oqb oqbVar6 = (oqb) obj;
                oqbVar6.getClass();
                kce kceVar6 = jce.a;
                xai xaiVar5 = new xai(kceVar6.b(zni.class));
                dx2 dx2Var2 = new dx2(i4);
                pl9 pl9VarB8 = kceVar6.b(sc3.class);
                kq9 kq9Var7 = kq9.G;
                oqbVar6.a(new w7f(new qh1(xaiVar5, pl9VarB8, null, dx2Var2, kq9Var7)));
                oqbVar6.a(new w7f(new qh1(xaiVar5, kceVar6.b(gl2.class), null, new dx2(i3), kq9Var7)));
                oqbVar6.a(new w7f(new qh1(xaiVar5, kceVar6.b(ny2.class), null, new dx2(i2), kq9Var7)));
                oqbVar6.a(new w7f(new qh1(xaiVar5, kceVar6.b(nz2.class), null, new dx2(17), kq9Var7)));
                dx2 dx2Var3 = new dx2(11);
                pl9 pl9VarB9 = kceVar6.b(nm2.class);
                kq9 kq9Var8 = kq9.F;
                oqbVar6.a(new ge7(new qh1(xaiVar5, pl9VarB9, null, dx2Var3, kq9Var8)));
                oqbVar6.a(new ge7(new qh1(xaiVar5, kceVar6.b(sm2.class), null, new dx2(12), kq9Var8)));
                ij0.v(new qh1(xaiVar5, kceVar6.b(nib.class), null, new dx2(13), kq9Var8), oqbVar6);
                oqbVar6.d.add(xaiVar5);
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                oqb oqbVar7 = (oqb) obj;
                oqbVar7.getClass();
                kce kceVar7 = jce.a;
                xai xaiVar6 = new xai(kceVar7.b(zni.class));
                s03 s03Var = new s03(i11);
                pl9 pl9VarB10 = kceVar7.b(ClaudeDatabase.class);
                kq9 kq9Var9 = kq9.G;
                oqbVar7.a(new w7f(new qh1(xaiVar6, pl9VarB10, null, s03Var, kq9Var9)));
                oqbVar7.a(new w7f(new qh1(xaiVar6, kceVar7.b(hq4.class), null, new s03(i10), kq9Var9)));
                oqbVar7.a(new w7f(new qh1(xaiVar6, kceVar7.b(vd3.class), null, new dx2(i8), kq9Var9)));
                oqbVar7.a(new w7f(new qh1(xaiVar6, kceVar7.b(oq4.class), null, new dx2(i7), kq9Var9)));
                oqbVar7.a(new w7f(new qh1(xaiVar6, kceVar7.b(iib.class), null, new s03(i13), kq9Var9)));
                oqbVar7.a(new w7f(new qh1(xaiVar6, kceVar7.b(bcb.class), null, new dx2(i6), kq9Var9)));
                oqbVar7.a(new w7f(new qh1(xaiVar6, kceVar7.b(led.class), null, new dx2(i5), kq9Var9)));
                sq6.E(new qh1(xaiVar6, kceVar7.b(ned.class), null, new dx2(i9), kq9Var9), oqbVar7);
                oqbVar7.d.add(xaiVar6);
                return ieiVar;
            case 24:
                ((ChatScreenArtifactSheetDestination) obj).getClass();
                return Boolean.valueOf(!(r0 instanceof ChatScreenArtifactSheetDestination.Closed));
            case BuildConfig.VERSION_CODE /* 25 */:
                ((MotionEvent) obj).getClass();
                return Boolean.FALSE;
            case 26:
                ((i90) obj).getClass();
                return xn5.w0(gp6.e(null, 3), gp6.f(null, 3));
            case 27:
                ((ekf) obj).getClass();
                return ieiVar;
            case 28:
                ((ekf) obj).getClass();
                return ieiVar;
            default:
                ((ekf) obj).getClass();
                return ieiVar;
        }
    }

    public /* synthetic */ ph1(int i) {
        this.E = i;
    }
}
