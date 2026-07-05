package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.messages.UnknownStreamEvent;
import com.anthropic.claude.api.chat.tool.ToolResultUnknown;
import com.anthropic.claude.api.chat.tool.UnknownDisplayContent;
import com.anthropic.claude.api.chat.tool.UnknownSourceMetadata;
import com.anthropic.claude.api.model.ThinkingState;
import java.util.ArrayList;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yeg implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ yeg(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        String value;
        ekh ekhVarB;
        egg eggVar;
        int i = this.E;
        int i2 = 5;
        int i3 = 22;
        int i4 = 0;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return UnknownSourceMetadata.Companion.serializer();
            case 1:
                oqb oqbVar = (oqb) obj;
                oqbVar.getClass();
                kce kceVar = jce.a;
                xai xaiVar = new xai(kceVar.b(zni.class));
                lwf lwfVar = new lwf(i2);
                pl9 pl9VarB = kceVar.b(ysg.class);
                kq9 kq9Var = kq9.F;
                oqbVar.a(new ge7(new qh1(xaiVar, pl9VarB, null, lwfVar, kq9Var)));
                yta ytaVar = new yta(i3);
                pl9 pl9VarB2 = kceVar.b(ptg.class);
                kq9 kq9Var2 = kq9.G;
                oqbVar.a(new w7f(new qh1(xaiVar, pl9VarB2, null, ytaVar, kq9Var2)));
                oqbVar.a(new ge7(new qh1(xaiVar, kceVar.b(b0f.class), null, new lwf(6), kq9Var)));
                sq6.E(new qh1(xaiVar, kceVar.b(shg.class), null, new lwf(7), kq9Var2), oqbVar);
                oqbVar.d.add(xaiVar);
                return ieiVar;
            case 2:
                oqb oqbVar2 = (oqb) obj;
                oqbVar2.getClass();
                sq6.C(new qh1(dpf.K, jce.a.b(mjg.class), null, new lwf(8), kq9.E), oqbVar2);
                return ieiVar;
            case 3:
                return UnknownStreamEvent.Companion.serializer();
            case 4:
                wn9[] wn9VarArr = ckf.a;
                dkf dkfVar = akf.m;
                wn9 wn9Var = ckf.a[5];
                ((ekf) obj).a(dkfVar, Boolean.TRUE);
                return ieiVar;
            case 5:
                return Float.valueOf(1.0f);
            case 6:
                return Float.valueOf(yuj.f((Context) obj));
            case 7:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 8:
                lze lzeVar = (lze) obj;
                lzeVar.getClass();
                tze tzeVarL0 = lzeVar.L0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (tzeVarL0.H0()) {
                        arrayList.add(tzeVarL0.g0(0));
                        break;
                    }
                    return arrayList;
                } finally {
                    tzeVarL0.close();
                }
            case 9:
                return new bfi((String) obj);
            case 10:
                return new jq((String) obj);
            case 11:
                oqb oqbVar3 = (oqb) obj;
                oqbVar3.getClass();
                kce kceVar2 = jce.a;
                xai xaiVar2 = new xai(kceVar2.b(zni.class));
                w7f w7fVar = new w7f(new qh1(xaiVar2, kceVar2.b(uah.class), null, new yta(23), kq9.G));
                oqbVar3.a(w7fVar);
                pl9 pl9VarB3 = kceVar2.b(kah.class);
                qh1 qh1Var = w7fVar.a;
                qh1Var.f = w44.b1(qh1Var.f, pl9VarB3);
                rzd rzdVar = qh1Var.c;
                rzd rzdVar2 = qh1Var.a;
                StringBuilder sb = new StringBuilder();
                sq6.D(pl9VarB3, sb, ':');
                if (rzdVar == null || (value = rzdVar.getValue()) == null) {
                    value = "";
                }
                oqbVar3.c.put(sq6.w(sb, value, ':', rzdVar2), w7fVar);
                lwf lwfVar2 = new lwf(10);
                pl9 pl9VarB4 = kceVar2.b(x5h.class);
                kq9 kq9Var3 = kq9.F;
                oqbVar3.a(new ge7(new qh1(xaiVar2, pl9VarB4, null, lwfVar2, kq9Var3)));
                oqbVar3.a(new ge7(new qh1(xaiVar2, kceVar2.b(f8h.class), null, new lwf(11), kq9Var3)));
                oqbVar3.a(new ge7(new qh1(xaiVar2, kceVar2.b(e8h.class), null, new lwf(12), kq9Var3)));
                ij0.v(new qh1(xaiVar2, kceVar2.b(e9h.class), null, new lwf(13), kq9Var3), oqbVar3);
                oqbVar3.d.add(xaiVar2);
                return ieiVar;
            case 12:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                ukc ukcVar = ((Boolean) obj2).booleanValue() ? ukc.E : ukc.F;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new rhh(ukcVar, ((Float) obj3).floatValue());
            case 13:
                return Boolean.valueOf(((l9e) obj) == null);
            case 14:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                y5f y5fVar = c6f.a;
                Boolean bool = Boolean.FALSE;
                zb0 zb0Var = (x44.r(obj4, bool) || obj4 == null) ? null : (zb0) y5fVar.b.invoke(obj4);
                zb0Var.getClass();
                Object obj5 = list2.get(1);
                int i5 = kkh.c;
                kkh kkhVar = (x44.r(obj5, bool) || obj5 == null) ? null : (kkh) c6f.p.b.invoke(obj5);
                kkhVar.getClass();
                return new cjh(zb0Var, kkhVar.a, (kkh) null);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                xe4 xe4Var = tjh.a;
                return ieiVar;
            case 16:
                yb0 yb0Var = (yb0) obj;
                Object obj6 = yb0Var.a;
                if (!(obj6 instanceof o6a) || (ekhVarB = ((o6a) obj6).b()) == null || (ekhVarB.a == null && ekhVarB.b == null && ekhVarB.c == null && ekhVarB.d == null)) {
                    return x44.s(yb0Var);
                }
                Object obj7 = yb0Var.a;
                obj7.getClass();
                ekh ekhVarB2 = ((o6a) obj7).b();
                if (ekhVarB2 == null || (eggVar = ekhVarB2.a) == null) {
                    eggVar = new egg(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                }
                return x44.s(yb0Var, new yb0(eggVar, yb0Var.b, yb0Var.c));
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((ekf) obj).a(akf.B, ieiVar);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ThinkingState.Unknown.INSTANCE.serializer();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Boolean.FALSE;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return UnknownDisplayContent.Companion.serializer();
            case 21:
                oqb oqbVar4 = (oqb) obj;
                oqbVar4.getClass();
                kce kceVar3 = jce.a;
                xai xaiVar3 = new xai(kceVar3.b(zni.class));
                yta ytaVar2 = new yta(24);
                pl9 pl9VarB5 = kceVar3.b(ie5.class);
                kq9 kq9Var4 = kq9.G;
                oqbVar4.a(new w7f(new qh1(xaiVar3, pl9VarB5, null, ytaVar2, kq9Var4)));
                oqbVar4.a(new w7f(new qh1(xaiVar3, kceVar3.b(gw8.class), null, new yta(25), kq9Var4)));
                oqbVar4.a(new w7f(new qh1(xaiVar3, kceVar3.b(k1d.class), null, new lwf(19), kq9Var4)));
                oqbVar4.a(new w7f(new qh1(xaiVar3, kceVar3.b(mwh.class), null, new yta(26), kq9Var4)));
                oqbVar4.a(new ge7(new qh1(xaiVar3, kceVar3.b(l0b.class), null, new lwf(20), kq9.F)));
                oqbVar4.a(new w7f(new qh1(xaiVar3, kceVar3.b(dnh.class), null, new yta(27), kq9Var4)));
                oqbVar4.a(new w7f(new qh1(xaiVar3, kceVar3.b(jzg.class), null, new yta(28), kq9Var4)));
                oqbVar4.a(new w7f(new qh1(xaiVar3, kceVar3.b(faj.class), null, new yta(29), kq9Var4)));
                oqbVar4.a(new w7f(new qh1(xaiVar3, kceVar3.b(myh.class), null, new vxh(i4), kq9Var4)));
                oqbVar4.a(new w7f(new qh1(xaiVar3, kceVar3.b(w72.class), null, new vxh(z ? 1 : 0), kq9Var4)));
                oqbVar4.a(new w7f(new qh1(xaiVar3, kceVar3.b(v72.class), null, new lwf(21), kq9Var4)));
                sq6.E(new qh1(xaiVar3, kceVar3.b(oi8.class), null, new lwf(i3), kq9Var4), oqbVar4);
                oqbVar4.d.add(xaiVar3);
                b54.u0(oqbVar4.e, new oqb[]{cyh.a});
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ToolResultUnknown.Companion.serializer();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((znb) obj).getClass();
                return Boolean.TRUE;
            case 24:
                ((znb) obj).getClass();
                return Boolean.TRUE;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Boolean) obj).getClass();
                o0i o0iVar = q0i.G;
                return ieiVar;
            case 26:
                oqb oqbVar5 = (oqb) obj;
                oqbVar5.getClass();
                kce kceVar4 = jce.a;
                xai xaiVar4 = new xai(kceVar4.b(zni.class));
                vxh vxhVar = new vxh(2);
                pl9 pl9VarB6 = kceVar4.b(q0i.class);
                kq9 kq9Var5 = kq9.G;
                oqbVar5.a(new w7f(new qh1(xaiVar4, pl9VarB6, null, vxhVar, kq9Var5)));
                sq6.E(new qh1(xaiVar4, kceVar4.b(tg7.class), null, new vxh(3), kq9Var5), oqbVar5);
                oqbVar5.d.add(xaiVar4);
                return ieiVar;
            case 27:
                tze tzeVar = (tze) obj;
                tzeVar.getClass();
                return Boolean.valueOf(tzeVar.H0());
            case 28:
                gff gffVar = (gff) obj;
                long j = gffVar.J;
                odg odgVar = gffVar.L;
                if (odgVar != null) {
                    odgVar.d(gffVar, nai.y, gffVar.K);
                }
                long j2 = gffVar.J;
                if (j != j2) {
                    zef zefVar = gffVar.S;
                    if (zefVar != null) {
                        long jE = zefVar.e();
                        long j3 = gffVar.J;
                        if (jE > j3) {
                            gffVar.Q0();
                        } else {
                            zefVar.l(j3);
                            if (zefVar.a() == null) {
                                zefVar.j(mwa.M((1.0d - ((double) zefVar.f().a(0))) * gffVar.J));
                            }
                        }
                    } else if (j2 != 0) {
                        gffVar.T0();
                    }
                }
                return ieiVar;
            default:
                tze tzeVar2 = (tze) obj;
                tzeVar2.getClass();
                pwf pwfVar = new pwf();
                while (tzeVar2.H0()) {
                    pwfVar.add(Integer.valueOf((int) tzeVar2.getLong(0)));
                }
                return sf5.k(pwfVar);
        }
    }
}
