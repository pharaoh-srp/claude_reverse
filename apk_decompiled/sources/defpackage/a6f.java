package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.sessions.api.b;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a6f implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ a6f(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        yb0 yb0Var;
        int i = this.E;
        int i2 = 21;
        int i3 = 4;
        int i4 = 2;
        iei ieiVar = iei.a;
        int i5 = 0;
        int i6 = 1;
        uzfVar = null;
        uzf uzfVar = null;
        hkhVar = null;
        hkh hkhVar = null;
        m6aVar = null;
        m6a m6aVar = null;
        n6aVar = null;
        n6a n6aVar = null;
        hliVar = null;
        hli hliVar = null;
        wsiVar = null;
        wsi wsiVar = null;
        eggVar = null;
        egg eggVar = null;
        jrcVar = null;
        jrc jrcVar = null;
        switch (i) {
            case 0:
                obj.getClass();
                break;
            case 1:
                Boolean bool = Boolean.FALSE;
                if (!x44.r(obj, bool)) {
                    obj.getClass();
                    List list = (List) obj;
                    Object obj2 = list.get(0);
                    Float f = obj2 != null ? (Float) obj2 : null;
                    f.getClass();
                    float fFloatValue = f.floatValue();
                    Object obj3 = list.get(1);
                    b6f b6fVar = c6f.y;
                    x44.r(obj3, bool);
                    dlh dlhVar = obj3 != null ? (dlh) b6fVar.b.invoke(obj3) : null;
                    dlhVar.getClass();
                }
                break;
            case 2:
                if (!x44.r(obj, 0)) {
                    if (!x44.r(obj, 1)) {
                    }
                }
                break;
            case 3:
                if (!x44.r(obj, Boolean.FALSE)) {
                    obj.getClass();
                    List list2 = (List) obj;
                    Object obj4 = list2.get(0);
                    Float f2 = obj4 != null ? (Float) obj4 : null;
                    f2.getClass();
                    float fFloatValue2 = f2.floatValue();
                    Object obj5 = list2.get(1);
                    Float f3 = obj5 != null ? (Float) obj5 : null;
                    f3.getClass();
                }
                break;
            case 4:
                obj.getClass();
                List list3 = (List) obj;
                ArrayList arrayList = new ArrayList(list3.size());
                int size = list3.size();
                while (i5 < size) {
                    Object obj6 = list3.get(i5);
                    eea eeaVar = (x44.r(obj6, Boolean.FALSE) || obj6 == null) ? null : (eea) c6f.B.b.invoke(obj6);
                    eeaVar.getClass();
                    arrayList.add(eeaVar);
                    i5++;
                }
                break;
            case 5:
                obj.getClass();
                break;
            case 6:
                obj.getClass();
                List list4 = (List) obj;
                Object obj7 = list4.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                Object obj8 = list4.get(1);
                break;
            case 7:
                obj.getClass();
                List list5 = (List) obj;
                Object obj9 = list5.get(0);
                float f4 = a6a.b;
                b6f b6fVar2 = c6f.D;
                Boolean bool2 = Boolean.FALSE;
                x44.r(obj9, bool2);
                a6a a6aVar = obj9 != null ? (a6a) b6fVar2.b.invoke(obj9) : null;
                a6aVar.getClass();
                float f5 = a6aVar.a;
                Object obj10 = list5.get(1);
                b6f b6fVar3 = c6f.E;
                x44.r(obj10, bool2);
                c6a c6aVar = obj10 != null ? (c6a) b6fVar3.b.invoke(obj10) : null;
                c6aVar.getClass();
                int i7 = c6aVar.a;
                Object obj11 = list5.get(2);
                b6f b6fVar4 = c6f.F;
                x44.r(obj11, bool2);
                b6a b6aVar = obj11 != null ? (b6a) b6fVar4.b.invoke(obj11) : null;
                b6aVar.getClass();
                break;
            case 8:
                obj.getClass();
                float fFloatValue3 = ((Float) obj).floatValue();
                a6a.a(fFloatValue3);
                break;
            case 9:
                obj.getClass();
                break;
            case 10:
                obj.getClass();
                List list6 = (List) obj;
                Object obj12 = list6.get(0);
                qc0 qc0Var = obj12 != null ? (qc0) obj12 : null;
                qc0Var.getClass();
                Object obj13 = list6.get(2);
                Integer num = obj13 != null ? (Integer) obj13 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj14 = list6.get(3);
                Integer num2 = obj14 != null ? (Integer) obj14 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj15 = list6.get(4);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                switch (qc0Var.ordinal()) {
                    case 0:
                        Object obj16 = list6.get(1);
                        y5f y5fVar = c6f.h;
                        if (!x44.r(obj16, Boolean.FALSE) && obj16 != null) {
                            jrcVar = (jrc) y5fVar.b.invoke(obj16);
                        }
                        jrcVar.getClass();
                        yb0Var = new yb0(iIntValue, iIntValue2, jrcVar, str2);
                        break;
                    case 1:
                        Object obj17 = list6.get(1);
                        y5f y5fVar2 = c6f.i;
                        if (!x44.r(obj17, Boolean.FALSE) && obj17 != null) {
                            eggVar = (egg) y5fVar2.b.invoke(obj17);
                        }
                        eggVar.getClass();
                        yb0Var = new yb0(iIntValue, iIntValue2, eggVar, str2);
                        break;
                    case 2:
                        Object obj18 = list6.get(1);
                        y5f y5fVar3 = c6f.d;
                        if (!x44.r(obj18, Boolean.FALSE) && obj18 != null) {
                            wsiVar = (wsi) y5fVar3.b.invoke(obj18);
                        }
                        wsiVar.getClass();
                        yb0Var = new yb0(iIntValue, iIntValue2, wsiVar, str2);
                        break;
                    case 3:
                        Object obj19 = list6.get(1);
                        y5f y5fVar4 = c6f.e;
                        if (!x44.r(obj19, Boolean.FALSE) && obj19 != null) {
                            hliVar = (hli) y5fVar4.b.invoke(obj19);
                        }
                        hliVar.getClass();
                        yb0Var = new yb0(iIntValue, iIntValue2, hliVar, str2);
                        break;
                    case 4:
                        Object obj20 = list6.get(1);
                        y5f y5fVar5 = c6f.f;
                        if (!x44.r(obj20, Boolean.FALSE) && obj20 != null) {
                            n6aVar = (n6a) y5fVar5.b.invoke(obj20);
                        }
                        n6aVar.getClass();
                        yb0Var = new yb0(iIntValue, iIntValue2, n6aVar, str2);
                        break;
                    case 5:
                        Object obj21 = list6.get(1);
                        y5f y5fVar6 = c6f.g;
                        if (!x44.r(obj21, Boolean.FALSE) && obj21 != null) {
                            m6aVar = (m6a) y5fVar6.b.invoke(obj21);
                        }
                        m6aVar.getClass();
                        yb0Var = new yb0(iIntValue, iIntValue2, m6aVar, str2);
                        break;
                    case 6:
                        Object obj22 = list6.get(1);
                        String str3 = obj22 != null ? (String) obj22 : null;
                        str3.getClass();
                        yb0Var = new yb0(iIntValue, iIntValue2, erg.a(str3), str2);
                        break;
                    default:
                        mr9.b();
                        break;
                }
                break;
            case 11:
                obj.getClass();
                break;
            case 12:
                String str4 = obj != null ? (String) obj : null;
                str4.getClass();
                break;
            case 13:
                String str5 = obj != null ? (String) obj : null;
                str5.getClass();
                break;
            case 14:
                obj.getClass();
                List list7 = (List) obj;
                Object obj23 = list7.get(0);
                b6f b6fVar5 = c6f.s;
                Boolean bool3 = Boolean.FALSE;
                x44.r(obj23, bool3);
                fdh fdhVar = obj23 != null ? (fdh) b6fVar5.b.invoke(obj23) : null;
                fdhVar.getClass();
                int i8 = fdhVar.a;
                Object obj24 = list7.get(1);
                b6f b6fVar6 = c6f.t;
                x44.r(obj24, bool3);
                weh wehVar = obj24 != null ? (weh) b6fVar6.b.invoke(obj24) : null;
                wehVar.getClass();
                int i9 = wehVar.a;
                Object obj25 = list7.get(2);
                dlh[] dlhVarArr = clh.b;
                b6f b6fVar7 = c6f.x;
                x44.r(obj25, bool3);
                clh clhVar = obj25 != null ? (clh) b6fVar7.b.invoke(obj25) : null;
                clhVar.getClass();
                long j = clhVar.a;
                Object obj26 = list7.get(3);
                hjh hjhVar = hjh.c;
                hjh hjhVar2 = (x44.r(obj26, bool3) || obj26 == null) ? null : (hjh) c6f.m.b.invoke(obj26);
                Object obj27 = list7.get(4);
                i5d i5dVar = (x44.r(obj27, bool3) || obj27 == null) ? null : (i5d) tvj.b.b.invoke(obj27);
                Object obj28 = list7.get(5);
                d6a d6aVar = d6a.d;
                d6a d6aVar2 = (x44.r(obj28, bool3) || obj28 == null) ? null : (d6a) c6f.C.b.invoke(obj28);
                Object obj29 = list7.get(6);
                e5a e5aVar = (x44.r(obj29, bool3) || obj29 == null) ? null : (e5a) tvj.d.b.invoke(obj29);
                e5aVar.getClass();
                int i10 = e5aVar.a;
                Object obj30 = list7.get(7);
                b6f b6fVar8 = c6f.u;
                x44.r(obj30, bool3);
                et8 et8Var = obj30 != null ? (et8) b6fVar8.b.invoke(obj30) : null;
                et8Var.getClass();
                int i11 = et8Var.a;
                Object obj31 = list7.get(8);
                y5f y5fVar7 = tvj.e;
                if (!x44.r(obj31, bool3) && obj31 != null) {
                    hkhVar = (hkh) y5fVar7.b.invoke(obj31);
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                obj.getClass();
                List list8 = (List) obj;
                Object obj32 = list8.get(0);
                int i12 = d54.i;
                Boolean bool4 = Boolean.FALSE;
                x44.r(obj32, bool4);
                d54 d54Var = obj32 != null ? obj32.equals(bool4) ? new d54(d54.h) : new d54(d4c.m(((Integer) obj32).intValue())) : null;
                d54Var.getClass();
                long j2 = d54Var.a;
                Object obj33 = list8.get(1);
                dlh[] dlhVarArr2 = clh.b;
                bz7 bz7Var = c6f.x.b;
                x44.r(obj33, bool4);
                clh clhVar2 = obj33 != null ? (clh) bz7Var.invoke(obj33) : null;
                clhVar2.getClass();
                long j3 = clhVar2.a;
                Object obj34 = list8.get(2);
                dv7 dv7Var = dv7.F;
                dv7 dv7Var2 = (x44.r(obj34, bool4) || obj34 == null) ? null : (dv7) c6f.n.b.invoke(obj34);
                Object obj35 = list8.get(3);
                wu7 wu7Var = (x44.r(obj35, bool4) || obj35 == null) ? null : (wu7) c6f.v.b.invoke(obj35);
                Object obj36 = list8.get(4);
                xu7 xu7Var = (x44.r(obj36, bool4) || obj36 == null) ? null : (xu7) c6f.w.b.invoke(obj36);
                Object obj37 = list8.get(6);
                String str6 = obj37 != null ? (String) obj37 : null;
                Object obj38 = list8.get(7);
                x44.r(obj38, bool4);
                clh clhVar3 = obj38 != null ? (clh) bz7Var.invoke(obj38) : null;
                clhVar3.getClass();
                long j4 = clhVar3.a;
                Object obj39 = list8.get(8);
                ue1 ue1Var = (x44.r(obj39, bool4) || obj39 == null) ? null : (ue1) c6f.o.b.invoke(obj39);
                Object obj40 = list8.get(9);
                fjh fjhVar = (x44.r(obj40, bool4) || obj40 == null) ? null : (fjh) c6f.l.b.invoke(obj40);
                Object obj41 = list8.get(10);
                gea geaVar = gea.G;
                gea geaVar2 = (x44.r(obj41, bool4) || obj41 == null) ? null : (gea) c6f.A.b.invoke(obj41);
                Object obj42 = list8.get(11);
                x44.r(obj42, bool4);
                d54 d54Var2 = obj42 != null ? obj42.equals(bool4) ? new d54(d54.h) : new d54(d4c.m(((Integer) obj42).intValue())) : null;
                d54Var2.getClass();
                long j5 = d54Var2.a;
                Object obj43 = list8.get(12);
                qeh qehVar = (x44.r(obj43, bool4) || obj43 == null) ? null : (qeh) c6f.k.b.invoke(obj43);
                Object obj44 = list8.get(13);
                uzf uzfVar2 = uzf.d;
                y5f y5fVar8 = c6f.q;
                if (!x44.r(obj44, bool4) && obj44 != null) {
                    uzfVar = (uzf) y5fVar8.b.invoke(obj44);
                }
                break;
            case 16:
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                fcc fccVar = (fcc) obj;
                long j6 = fccVar.a;
                if ((9223372034707292159L & j6) == 9205357640488583168L) {
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                pb0 pb0Var = (pb0) obj;
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((bga) obj).getClass();
                break;
            case 21:
                pl9 pl9Var = (pl9) obj;
                pl9Var.getClass();
                KSerializer kSerializerM = iv1.M(pl9Var);
                if (kSerializerM == null) {
                    if (ez1.I(pl9Var).isInterface()) {
                    }
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                pl9 pl9Var2 = (pl9) obj;
                pl9Var2.getClass();
                KSerializer kSerializerM2 = iv1.M(pl9Var2);
                if (kSerializerM2 == null) {
                    kSerializerM2 = ez1.I(pl9Var2).isInterface() ? new v8d(pl9Var2) : null;
                }
                if (kSerializerM2 != null) {
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                oqb oqbVar = (oqb) obj;
                oqbVar.getClass();
                z5f z5fVar = new z5f(i2);
                kce kceVar = jce.a;
                pl9 pl9VarB = kceVar.b(uof.class);
                mrg mrgVar = dpf.K;
                kq9 kq9Var = kq9.E;
                oqbVar.a(new t7g(new qh1(mrgVar, pl9VarB, null, z5fVar, kq9Var)));
                sq6.C(new qh1(mrgVar, kceVar.b(oof.class), null, new yta(18), kq9Var), oqbVar);
                break;
            case 24:
                oqb oqbVar2 = (oqb) obj;
                oqbVar2.getClass();
                z5f z5fVar2 = new z5f(23);
                kce kceVar2 = jce.a;
                pl9 pl9VarB2 = kceVar2.b(k8i.class);
                mrg mrgVar2 = dpf.K;
                kq9 kq9Var2 = kq9.E;
                oqbVar2.a(new t7g(new qh1(mrgVar2, pl9VarB2, null, z5fVar2, kq9Var2)));
                sq6.C(new qh1(mrgVar2, kceVar2.b(u5e.class), null, new z5f(24), kq9Var2), oqbVar2);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                oqb oqbVar3 = (oqb) obj;
                oqbVar3.getClass();
                kce kceVar3 = jce.a;
                xai xaiVar = new xai(kceVar3.b(zni.class));
                oqbVar3.a(new ge7(new qh1(xaiVar, kceVar3.b(kwf.class), null, new yta(19), kq9.F)));
                z5f z5fVar3 = new z5f(25);
                pl9 pl9VarB3 = kceVar3.b(j8i.class);
                kq9 kq9Var3 = kq9.G;
                sq6.E(new qh1(xaiVar, pl9VarB3, null, z5fVar3, kq9Var3), oqbVar3);
                sq6.E(new qh1(xaiVar, kceVar3.b(hdc.class), iv1.d, new z5f(26), kq9Var3), oqbVar3);
                oqbVar3.a(new w7f(new qh1(xaiVar, kceVar3.b(qre.class), iv1.c, new z5f(27), kq9Var3)));
                oqbVar3.a(new w7f(new qh1(xaiVar, kceVar3.b(nwf.class), null, new z5f(28), kq9Var3)));
                oqbVar3.a(new w7f(new qh1(xaiVar, kceVar3.b(so3.class), null, new z5f(29), kq9Var3)));
                oqbVar3.a(new w7f(new qh1(xaiVar, kceVar3.b(jwf.class), null, new lwf(i5), kq9Var3)));
                oqbVar3.a(new w7f(new qh1(xaiVar, kceVar3.b(tvf.class), null, new lwf(i6), kq9Var3)));
                oqbVar3.a(new w7f(new qh1(xaiVar, kceVar3.b(jrf.class), null, new lwf(i4), kq9Var3)));
                sq6.E(new qh1(xaiVar, kceVar3.b(b.class), null, new z5f(22), kq9Var3), oqbVar3);
                oqbVar3.d.add(xaiVar);
                break;
            case 26:
                Byte b = (Byte) obj;
                b.byteValue();
                break;
            case 27:
                oqb oqbVar4 = (oqb) obj;
                oqbVar4.getClass();
                kce kceVar4 = jce.a;
                xai xaiVar2 = new xai(kceVar4.b(zni.class));
                yta ytaVar = new yta(20);
                pl9 pl9VarB4 = kceVar4.b(b0g.class);
                kq9 kq9Var4 = kq9.G;
                oqbVar4.a(new w7f(new qh1(xaiVar2, pl9VarB4, null, ytaVar, kq9Var4)));
                sq6.E(new qh1(xaiVar2, kceVar4.b(j8f.class), null, new yta(i2), kq9Var4), oqbVar4);
                oqbVar4.d.add(xaiVar2);
                break;
            case 28:
                oqb oqbVar5 = (oqb) obj;
                oqbVar5.getClass();
                sq6.C(new qh1(dpf.K, jce.a.b(g6g.class), null, new lwf(i3), kq9.E), oqbVar5);
                break;
            default:
                a6f a6fVar = ycg.a;
                break;
        }
        return ieiVar;
    }
}
