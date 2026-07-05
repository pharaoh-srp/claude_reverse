package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ddi implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ ddi(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int i2 = 2;
        int i3 = 5;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                oqb oqbVar = (oqb) obj;
                oqbVar.getClass();
                sq6.C(new qh1(dpf.K, jce.a.b(xm8.class), null, new lwf(24), kq9.E), oqbVar);
                return ieiVar;
            case 1:
                oqb oqbVar2 = (oqb) obj;
                oqbVar2.getClass();
                lwf lwfVar = new lwf(25);
                kce kceVar = jce.a;
                pl9 pl9VarB = kceVar.b(oke.class);
                mrg mrgVar = dpf.K;
                kq9 kq9Var = kq9.E;
                oqbVar2.a(new t7g(new qh1(mrgVar, pl9VarB, null, lwfVar, kq9Var)));
                sq6.C(new qh1(mrgVar, kceVar.b(ike.class), null, new lwf(26), kq9Var), oqbVar2);
                return ieiVar;
            case 2:
                ((ekf) obj).getClass();
                return ieiVar;
            case 3:
                oqb oqbVar3 = (oqb) obj;
                oqbVar3.getClass();
                kce kceVar2 = jce.a;
                xai xaiVar = new xai(kceVar2.b(j8.class));
                vxh vxhVar = new vxh(i3);
                pl9 pl9VarB2 = kceVar2.b(q7.class);
                kq9 kq9Var2 = kq9.G;
                oqbVar3.a(new w7f(new qh1(xaiVar, pl9VarB2, null, vxhVar, kq9Var2)));
                sq6.E(new qh1(xaiVar, kceVar2.b(moi.class), null, new vxh(6), kq9Var2), oqbVar3);
                oqbVar3.d.add(xaiVar);
                return ieiVar;
            case 4:
                oqb oqbVar4 = (oqb) obj;
                oqbVar4.getClass();
                kce kceVar3 = jce.a;
                xai xaiVar2 = new xai(kceVar3.b(zni.class));
                vxh vxhVar2 = new vxh(7);
                pl9 pl9VarB3 = kceVar3.b(loi.class);
                kq9 kq9Var3 = kq9.G;
                qh1 qh1Var = new qh1(xaiVar2, pl9VarB3, null, vxhVar2, kq9Var3);
                oqbVar4.a(new w7f(qh1Var));
                qh1Var.g = new p92(new ddi(i3));
                oqbVar4.a(new w7f(new qh1(xaiVar2, kceVar3.b(wbb.class), null, new lwf(28), kq9Var3)));
                oqbVar4.a(new w7f(new qh1(xaiVar2, kceVar3.b(f9.class), null, new lwf(29), kq9Var3)));
                sq6.E(new qh1(xaiVar2, kceVar3.b(z8c.class), null, new vxh(8), kq9Var3), oqbVar4);
                oqbVar4.d.add(xaiVar2);
                return ieiVar;
            case 5:
                loi loiVar = (loi) obj;
                if (loiVar != null && fd9.d0(loiVar)) {
                    fd9.z(loiVar, null);
                    gb9.D(loiVar.G, loiVar.F.b(), null, new k7h(knk.z(loiVar.E.E), w44.p1(loiVar.H), (tp4) null, i3), 2);
                }
                return ieiVar;
            case 6:
                oqb oqbVar5 = (oqb) obj;
                oqbVar5.getClass();
                kce kceVar4 = jce.a;
                xai xaiVar3 = new xai(kceVar4.b(zni.class));
                aoi aoiVar = new aoi(i);
                pl9 pl9VarB4 = kceVar4.b(koi.class);
                kq9 kq9Var4 = kq9.G;
                oqbVar5.a(new w7f(new qh1(xaiVar3, pl9VarB4, null, aoiVar, kq9Var4)));
                sq6.E(new qh1(xaiVar3, kceVar4.b(d8f.class), null, new vxh(9), kq9Var4), oqbVar5);
                d8 d8Var = d8.I;
                pl9 pl9VarB5 = kceVar4.b(AccountId.class);
                kq9 kq9Var5 = kq9.F;
                ij0.v(new qh1(xaiVar3, pl9VarB5, null, d8Var, kq9Var5), oqbVar5);
                ij0.v(new qh1(xaiVar3, kceVar4.b(OrganizationId.class), null, d8.J, kq9Var5), oqbVar5);
                oqbVar5.d.add(xaiVar3);
                return ieiVar;
            case 7:
                oqb oqbVar6 = (oqb) obj;
                oqbVar6.getClass();
                hzh hzhVar = new hzh(3);
                kce kceVar5 = jce.a;
                pl9 pl9VarB6 = kceVar5.b(ded.class);
                mrg mrgVar2 = dpf.K;
                kq9 kq9Var6 = kq9.E;
                oqbVar6.a(new t7g(new qh1(mrgVar2, pl9VarB6, null, hzhVar, kq9Var6)));
                sq6.C(new qh1(mrgVar2, kceVar5.b(mn5.class), null, new hzh(4), kq9Var6), oqbVar6);
                return ieiVar;
            case 8:
                return new ob0(((Float) obj).floatValue());
            case 9:
                return new ob0(((Integer) obj).intValue());
            case 10:
                return Integer.valueOf((int) ((ob0) obj).a);
            case 11:
                return new ob0(((va6) obj).E);
            case 12:
                return new va6(((ob0) obj).a);
            case 13:
                ya6 ya6Var = (ya6) obj;
                return new pb0(ya6.a(ya6Var.a), ya6.b(ya6Var.a));
            case 14:
                pb0 pb0Var = (pb0) obj;
                return new ya6((((long) Float.floatToRawIntBits(pb0Var.a)) << 32) | (((long) Float.floatToRawIntBits(pb0Var.b)) & 4294967295L));
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                k8g k8gVar = (k8g) obj;
                return new pb0(Float.intBitsToFloat((int) (k8gVar.a >> 32)), Float.intBitsToFloat((int) (k8gVar.a & 4294967295L)));
            case 16:
                pb0 pb0Var2 = (pb0) obj;
                return new k8g((((long) Float.floatToRawIntBits(pb0Var2.a)) << 32) | (((long) Float.floatToRawIntBits(pb0Var2.b)) & 4294967295L));
            case g.MAX_FIELD_NUMBER /* 17 */:
                fcc fccVar = (fcc) obj;
                return new pb0(Float.intBitsToFloat((int) (fccVar.a >> 32)), Float.intBitsToFloat((int) (fccVar.a & 4294967295L)));
            case g.AVG_FIELD_NUMBER /* 18 */:
                pb0 pb0Var3 = (pb0) obj;
                return new fcc((((long) Float.floatToRawIntBits(pb0Var3.a)) << 32) | (((long) Float.floatToRawIntBits(pb0Var3.b)) & 4294967295L));
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                long j = ((y69) obj).a;
                return new pb0((int) (j >> 32), (int) (j & 4294967295L));
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                pb0 pb0Var4 = (pb0) obj;
                return new y69((((long) Math.round(pb0Var4.a)) << 32) | (((long) Math.round(pb0Var4.b)) & 4294967295L));
            case 21:
                long j2 = ((g79) obj).a;
                return new pb0((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                pb0 pb0Var5 = (pb0) obj;
                int iRound = Math.round(pb0Var5.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(pb0Var5.b);
                return new g79((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32));
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                l9e l9eVar = (l9e) obj;
                return new rb0(l9eVar.a, l9eVar.b, l9eVar.c, l9eVar.d);
            case 24:
                rb0 rb0Var = (rb0) obj;
                return new l9e(rb0Var.a, rb0Var.b, rb0Var.c, rb0Var.d);
            case BuildConfig.VERSION_CODE /* 25 */:
                return Float.valueOf(((ob0) obj).a);
            case 26:
                ((Integer) obj).getClass();
                return Boolean.TRUE;
            case 27:
                oqb oqbVar7 = (oqb) obj;
                oqbVar7.getClass();
                vxh vxhVar3 = new vxh(10);
                kce kceVar6 = jce.a;
                oqbVar7.a(new t7g(new qh1(dpf.K, kceVar6.b(n3f.class), null, vxhVar3, kq9.E)));
                xai xaiVar4 = new xai(kceVar6.b(zni.class));
                sq6.E(new qh1(xaiVar4, kceVar6.b(u4f.class), null, new aoi(i2), kq9.G), oqbVar7);
                oqbVar7.d.add(xaiVar4);
                return ieiVar;
            case 28:
                oqb oqbVar8 = (oqb) obj;
                oqbVar8.getClass();
                kce kceVar7 = jce.a;
                xai xaiVar5 = new xai(kceVar7.b(zni.class));
                sq6.E(new qh1(xaiVar5, kceVar7.b(u4f.class), null, new hzh(11), kq9.G), oqbVar8);
                oqbVar8.d.add(xaiVar5);
                return ieiVar;
            default:
                return ((gdj) obj).l;
        }
    }
}
