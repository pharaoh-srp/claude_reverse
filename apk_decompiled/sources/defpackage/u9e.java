package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.stt.repo.api.STTApiMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NotImplementedError;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u9e implements bz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        egg eggVar = null;
        ekhVar = null;
        ekh ekhVar = null;
        eggVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                List listX0 = bsg.X0(str, new char[]{'='}, 2);
                return listX0.size() == 2 ? ij0.C((String) listX0.get(0), "=", v9e.a((String) listX0.get(1))) : str;
            case 1:
                ((zy7) obj).a();
                return ieiVar;
            case 2:
                oqb oqbVar = (oqb) obj;
                oqbVar.getClass();
                kce kceVar = jce.a;
                xai xaiVar = new xai(kceVar.b(zni.class));
                oqbVar.a(new w7f(new qh1(xaiVar, kceVar.b(yle.class), null, new yta(15), kq9.G)));
                ij0.v(new qh1(xaiVar, kceVar.b(ole.class), null, new yta(14), kq9.F), oqbVar);
                oqbVar.d.add(xaiVar);
                return ieiVar;
            case 3:
                spe speVar = (spe) obj;
                speVar.getClass();
                return speVar.b;
            case 4:
                oqb oqbVar2 = (oqb) obj;
                oqbVar2.getClass();
                kce kceVar2 = jce.a;
                xai xaiVar2 = new xai(kceVar2.b(zni.class));
                yta ytaVar = new yta(16);
                pl9 pl9VarB = kceVar2.b(hse.class);
                kq9 kq9Var = kq9.F;
                oqbVar2.a(new ge7(new qh1(xaiVar2, pl9VarB, null, ytaVar, kq9Var)));
                ij0.v(new qh1(xaiVar2, kceVar2.b(jse.class), null, new yta(17), kq9Var), oqbVar2);
                oqbVar2.d.add(xaiVar2);
                return ieiVar;
            case 5:
                return new yte();
            case 6:
                ((ji5) obj).getClass();
                throw new NotImplementedError(0);
            case 7:
                oqb oqbVar3 = (oqb) obj;
                oqbVar3.getClass();
                u9e u9eVar = new u9e(8);
                oqb oqbVar4 = new oqb();
                u9eVar.invoke(oqbVar4);
                b54.u0(oqbVar3.e, new oqb[]{oqbVar4});
                ij0.v(new qh1(dpf.K, jce.a.b(i94.class), null, new k8d(objArr == true ? 1 : 0, 11), kq9.F), oqbVar3);
                return ieiVar;
            case 8:
                oqb oqbVar5 = (oqb) obj;
                oqbVar5.getClass();
                kce kceVar3 = jce.a;
                xai xaiVar3 = new xai(kceVar3.b(zni.class));
                k8d k8dVar = new k8d(objArr3 == true ? 1 : 0, 12);
                pl9 pl9VarB2 = kceVar3.b(re8.class);
                kq9 kq9Var2 = kq9.G;
                oqbVar5.a(new w7f(new qh1(xaiVar3, pl9VarB2, null, k8dVar, kq9Var2)));
                sq6.E(new qh1(xaiVar3, kceVar3.b(evd.class), null, new k8d(objArr2 == true ? 1 : 0, 13), kq9Var2), oqbVar5);
                oqbVar5.d.add(xaiVar3);
                return ieiVar;
            case 9:
                dc dcVar = (dc) obj;
                if (dcVar != null) {
                    return dcVar.a;
                }
                return null;
            case 10:
                return STTApiMessage.serializersModule$lambda$0$0$0((String) obj);
            case 11:
                ((c79) obj).getClass();
                return new rb0(r13.a, r13.b, r13.c, r13.d);
            case 12:
                rb0 rb0Var = (rb0) obj;
                rb0Var.getClass();
                return new c79(Math.round(rb0Var.a), Math.round(rb0Var.b), Math.round(rb0Var.c), Math.round(rb0Var.d));
            case 13:
                return new a5f((Map) obj);
            case 14:
                return obj;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                bz7 bz7Var = c6f.i.b;
                Boolean bool = Boolean.FALSE;
                egg eggVar2 = (x44.r(obj2, bool) || obj2 == null) ? null : (egg) bz7Var.invoke(obj2);
                Object obj3 = list.get(1);
                egg eggVar3 = (x44.r(obj3, bool) || obj3 == null) ? null : (egg) bz7Var.invoke(obj3);
                Object obj4 = list.get(2);
                egg eggVar4 = (x44.r(obj4, bool) || obj4 == null) ? null : (egg) bz7Var.invoke(obj4);
                Object obj5 = list.get(3);
                if (!x44.r(obj5, bool) && obj5 != null) {
                    eggVar = (egg) bz7Var.invoke(obj5);
                }
                return new ekh(eggVar2, eggVar3, eggVar4, eggVar);
            case 16:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (x44.r(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) c6f.b.b.invoke(obj6);
                Object obj7 = list2.get(0);
                String str2 = obj7 != null ? (String) obj7 : null;
                str2.getClass();
                return new zb0(list3, str2);
            case g.MAX_FIELD_NUMBER /* 17 */:
                obj.getClass();
                return new qeh(((Integer) obj).intValue());
            case g.AVG_FIELD_NUMBER /* 18 */:
                obj.getClass();
                List list4 = (List) obj;
                return new fjh(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                dlh[] dlhVarArr = clh.b;
                bz7 bz7Var2 = c6f.x.b;
                Boolean bool2 = Boolean.FALSE;
                x44.r(obj8, bool2);
                clh clhVar = obj8 != null ? (clh) bz7Var2.invoke(obj8) : null;
                clhVar.getClass();
                long j = clhVar.a;
                Object obj9 = list5.get(1);
                x44.r(obj9, bool2);
                clh clhVar2 = obj9 != null ? (clh) bz7Var2.invoke(obj9) : null;
                clhVar2.getClass();
                return new hjh(j, clhVar2.a);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                obj.getClass();
                return new dv7(((Integer) obj).intValue());
            case 21:
                obj.getClass();
                return new ue1(((Float) obj).floatValue());
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new kkh(mwa.m(iIntValue, num2.intValue()));
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i2 = d54.i;
                Boolean bool3 = Boolean.FALSE;
                x44.r(obj12, bool3);
                d54 d54Var = obj12 != null ? obj12.equals(bool3) ? new d54(d54.h) : new d54(d4c.m(((Integer) obj12).intValue())) : null;
                d54Var.getClass();
                long j2 = d54Var.a;
                Object obj13 = list7.get(1);
                b6f b6fVar = c6f.z;
                x44.r(obj13, bool3);
                fcc fccVar = obj13 != null ? (fcc) b6fVar.b.invoke(obj13) : null;
                fccVar.getClass();
                long j3 = fccVar.a;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new uzf(f.floatValue(), j2, j3);
            case 24:
                obj.getClass();
                return new fdh(((Integer) obj).intValue());
            case BuildConfig.VERSION_CODE /* 25 */:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str3 = obj15 != null ? (String) obj15 : null;
                str3.getClass();
                Object obj16 = list8.get(1);
                y5f y5fVar = c6f.j;
                if (!x44.r(obj16, Boolean.FALSE) && obj16 != null) {
                    ekhVar = (ekh) y5fVar.b.invoke(obj16);
                }
                return new n6a(str3, ekhVar, 4);
            case 26:
                obj.getClass();
                return new weh(((Integer) obj).intValue());
            case 27:
                obj.getClass();
                return new et8(((Integer) obj).intValue());
            case 28:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj17 = list9.get(i3);
                    yb0 yb0Var = (x44.r(obj17, Boolean.FALSE) || obj17 == null) ? null : (yb0) c6f.c.b.invoke(obj17);
                    yb0Var.getClass();
                    arrayList.add(yb0Var);
                }
                return arrayList;
            default:
                obj.getClass();
                return new wu7(((Integer) obj).intValue());
        }
    }

    public /* synthetic */ u9e(int i) {
        this.E = i;
    }
}
