package defpackage;

import android.content.Context;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.notification.FeaturePreference;
import java.util.LinkedHashSet;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f9c implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ f9c(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String value;
        int i = this.E;
        int i2 = 3;
        int i3 = 2;
        int i4 = 9;
        int i5 = 6;
        int i6 = 4;
        int i7 = 11;
        int i8 = 10;
        int i9 = 1;
        int i10 = 5;
        int i11 = 12;
        mpc lpcVar = null;
        byte b = 0;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                FeaturePreference featurePreference = (FeaturePreference) obj;
                featurePreference.getClass();
                return featurePreference.getDispatch();
            case 1:
                FeaturePreference featurePreference2 = (FeaturePreference) obj;
                featurePreference2.getClass();
                return featurePreference2.getMarketing();
            case 2:
                FeaturePreference featurePreference3 = (FeaturePreference) obj;
                featurePreference3.getClass();
                return featurePreference3.getCompass();
            case 3:
                FeaturePreference featurePreference4 = (FeaturePreference) obj;
                featurePreference4.getClass();
                return featurePreference4.getBogosort();
            case 4:
                oqb oqbVar = (oqb) obj;
                oqbVar.getClass();
                LinkedHashSet linkedHashSet = oqbVar.b;
                y1c y1cVar = new y1c(i4);
                kce kceVar = jce.a;
                pl9 pl9VarB = kceVar.b(hl8.class);
                mrg mrgVar = dpf.K;
                kq9 kq9Var = kq9.E;
                oqbVar.a(new t7g(new qh1(mrgVar, pl9VarB, null, y1cVar, kq9Var)));
                oqbVar.a(new t7g(new qh1(mrgVar, kceVar.b(tmf.class), null, new yta(i10), kq9Var)));
                oqbVar.a(new t7g(new qh1(mrgVar, kceVar.b(ec.class), null, new y1c(i8), kq9Var)));
                t7g t7gVar = new t7g(new qh1(mrgVar, kceVar.b(pxe.class), null, new y1c(i7), kq9Var));
                oqbVar.a(t7gVar);
                linkedHashSet.add(t7gVar);
                t7g t7gVar2 = new t7g(new qh1(mrgVar, kceVar.b(gmf.class), null, new y1c(i11), kq9Var));
                oqbVar.a(t7gVar2);
                linkedHashSet.add(t7gVar2);
                t7g t7gVarO = sq6.o(new qh1(mrgVar, kceVar.b(omf.class), null, new yta(i5), kq9Var), oqbVar);
                pl9 pl9VarB2 = kceVar.b(k4i.class);
                qh1 qh1Var = t7gVarO.a;
                qh1Var.f = w44.b1(qh1Var.f, pl9VarB2);
                rzd rzdVar = qh1Var.c;
                rzd rzdVar2 = qh1Var.a;
                StringBuilder sb = new StringBuilder();
                sq6.D(pl9VarB2, sb, ':');
                if (rzdVar == null || (value = rzdVar.getValue()) == null) {
                    value = "";
                }
                oqbVar.c.put(sq6.w(sb, value, ':', rzdVar2), t7gVarO);
                qh1 qh1Var2 = new qh1(mrgVar, kceVar.b(dl8.class), null, new y1c(13), kq9Var);
                t7g t7gVar3 = new t7g(qh1Var2);
                oqbVar.a(t7gVar3);
                linkedHashSet.add(t7gVar3);
                qh1Var2.g = new p92(new f9c(i10));
                return ieiVar;
            case 5:
                dl8 dl8Var = (dl8) obj;
                if (dl8Var != null) {
                    dl8Var.close();
                }
                return ieiVar;
            case 6:
                oqb oqbVar2 = (oqb) obj;
                oqbVar2.getClass();
                kce kceVar2 = jce.a;
                xai xaiVar = new xai(kceVar2.b(zni.class));
                y1c y1cVar2 = new y1c(14);
                pl9 pl9VarB3 = kceVar2.b(qkc.class);
                kq9 kq9Var2 = kq9.G;
                oqbVar2.a(new w7f(new qh1(xaiVar, pl9VarB3, null, y1cVar2, kq9Var2)));
                oqbVar2.a(new w7f(new qh1(xaiVar, kceVar2.b(pkc.class), null, new y1c(15), kq9Var2)));
                ij0.v(new qh1(xaiVar, kceVar2.b(spb.class), null, new yta(8), kq9.F), oqbVar2);
                oqbVar2.d.add(xaiVar);
                return ieiVar;
            case 7:
                return ieiVar;
            case 8:
                ne4 ne4Var = (ne4) obj;
                int i12 = u30.a;
                Context context = (Context) ne4Var.u0(w00.b);
                cz5 cz5Var = (cz5) ne4Var.u0(ve4.h);
                hmc hmcVar = (hmc) ne4Var.u0(imc.a);
                if (hmcVar == null) {
                    return null;
                }
                return new c20(context, cz5Var, hmcVar.a, hmcVar.b);
            case 9:
                Float f = (Float) obj;
                f.floatValue();
                return f;
            case 10:
                List list = (List) obj;
                Object obj2 = list.get(3);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                if (iIntValue == 1) {
                    Object obj3 = list.get(4);
                    obj3.getClass();
                    lpcVar = new lpc(((Float) obj3).floatValue());
                } else if (iIntValue == 2) {
                    Object obj4 = list.get(4);
                    obj4.getClass();
                    lpcVar = wb5.i(((Float) obj4).floatValue());
                } else if (iIntValue == 3) {
                    Object obj5 = list.get(4);
                    obj5.getClass();
                    lpcVar = wb5.h(((Float) obj5).floatValue());
                }
                Object obj6 = list.get(0);
                obj6.getClass();
                int iIntValue2 = ((Integer) obj6).intValue();
                Object obj7 = list.get(1);
                obj7.getClass();
                float fFloatValue = ((Float) obj7).floatValue();
                Object obj8 = list.get(2);
                obj8.getClass();
                return new wpc(iIntValue2, fFloatValue, ((Integer) obj8).intValue(), lpcVar);
            case 11:
                List list2 = (List) obj;
                Object obj9 = list2.get(0);
                obj9.getClass();
                if (((Integer) obj9).intValue() == 0 || list2.get(1) == null) {
                    return a5.L;
                }
                y5f y5fVarH = ovk.h();
                Object obj10 = list2.get(1);
                obj10.getClass();
                return (a9i) y5fVarH.b.invoke(obj10);
            case 12:
                c79 c79Var = (c79) obj;
                return new rb0(c79Var.a, c79Var.b, c79Var.c, c79Var.d);
            case 13:
                rb0 rb0Var = (rb0) obj;
                return new c79(Math.round(rb0Var.a), Math.round(rb0Var.b), Math.round(rb0Var.c), Math.round(rb0Var.d));
            case 14:
                oqb oqbVar3 = (oqb) obj;
                oqbVar3.getClass();
                y1c y1cVar3 = new y1c(24);
                kce kceVar3 = jce.a;
                pl9 pl9VarB4 = kceVar3.b(wr5.class);
                mrg mrgVar2 = dpf.K;
                kq9 kq9Var3 = kq9.E;
                oqbVar3.a(new t7g(new qh1(mrgVar2, pl9VarB4, null, y1cVar3, kq9Var3)));
                sq6.C(new qh1(mrgVar2, kceVar3.b(md9.class), null, new y1c(25), kq9Var3), oqbVar3);
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                oqb oqbVar4 = (oqb) obj;
                oqbVar4.getClass();
                sq6.C(new qh1(dpf.K, jce.a.b(mc.class), null, new y1c(26), kq9.E), oqbVar4);
                return ieiVar;
            case 16:
                oqb oqbVar5 = (oqb) obj;
                oqbVar5.getClass();
                y1c y1cVar4 = new y1c(27);
                kce kceVar4 = jce.a;
                pl9 pl9VarB5 = kceVar4.b(pjb.class);
                mrg mrgVar3 = dpf.K;
                kq9 kq9Var4 = kq9.E;
                oqbVar5.a(new t7g(new qh1(mrgVar3, pl9VarB5, null, y1cVar4, kq9Var4)));
                oqbVar5.a(new t7g(new qh1(mrgVar3, kceVar4.b(q1d.class), null, new y1c(28), kq9Var4)));
                sq6.C(new qh1(mrgVar3, kceVar4.b(u1d.class), null, new y1c(29), kq9Var4), oqbVar5);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                oqb oqbVar6 = (oqb) obj;
                oqbVar6.getClass();
                mrg mrgVar4 = nai.u;
                k8d k8dVar = new k8d(b, b);
                kce kceVar5 = jce.a;
                pl9 pl9VarB6 = kceVar5.b(String.class);
                mrg mrgVar5 = dpf.K;
                kq9 kq9Var5 = kq9.E;
                sq6.C(new qh1(mrgVar5, pl9VarB6, mrgVar4, k8dVar, kq9Var5), oqbVar6);
                sq6.C(new qh1(mrgVar5, kceVar5.b(String.class), nai.v, new k8d(b, i9), kq9Var5), oqbVar6);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                oqb oqbVar7 = (oqb) obj;
                oqbVar7.getClass();
                ij0.v(new qh1(dpf.K, jce.a.b(gk0.class), null, new k8d(b, i2), kq9.F), oqbVar7);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                oqb oqbVar8 = (oqb) obj;
                oqbVar8.getClass();
                kce kceVar6 = jce.a;
                xai xaiVar2 = new xai(kceVar6.b(zni.class));
                ij0.v(new qh1(xaiVar2, kceVar6.b(doi.class), null, new k8d(b, i3), kq9.F), oqbVar8);
                oqbVar8.d.add(xaiVar2);
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                wp9 wp9Var = (wp9) obj;
                wp9Var.a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                wp9Var.a(fValueOf, 300).b = csb.b;
                wp9Var.a(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                wp9Var.a(fValueOf2, 1800);
                wp9Var.a(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                wp9Var.a(fValueOf3, 3300);
                wp9Var.a(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                wp9Var.a(fValueOf4, 4800);
                wp9Var.a(fValueOf4, 6000);
                return ieiVar;
            case 21:
                ckf.r((ekf) obj, mjd.d);
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                oqb oqbVar9 = (oqb) obj;
                oqbVar9.getClass();
                b54.u0(oqbVar9.e, new oqb[]{wnd.a});
                kce kceVar7 = jce.a;
                xai xaiVar3 = new xai(kceVar7.b(zni.class));
                sq6.E(new qh1(xaiVar3, kceVar7.b(fod.class), null, new yta(i4), kq9.G), oqbVar9);
                oqbVar9.d.add(xaiVar3);
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                oqb oqbVar10 = (oqb) obj;
                oqbVar10.getClass();
                kce kceVar8 = jce.a;
                xai xaiVar4 = new xai(kceVar8.b(zni.class));
                k8d k8dVar2 = new k8d(b, i6);
                pl9 pl9VarB7 = kceVar8.b(mkd.class);
                kq9 kq9Var6 = kq9.F;
                oqbVar10.a(new ge7(new qh1(xaiVar4, pl9VarB7, null, k8dVar2, kq9Var6)));
                oqbVar10.a(new ge7(new qh1(xaiVar4, kceVar8.b(omd.class), null, new k8d(b, i10), kq9Var6)));
                ij0.v(new qh1(xaiVar4, kceVar8.b(kab.class), null, new k8d(b, i5), kq9Var6), oqbVar10);
                oqbVar10.d.add(xaiVar4);
                return ieiVar;
            case 24:
                oqb oqbVar11 = (oqb) obj;
                oqbVar11.getClass();
                kce kceVar9 = jce.a;
                xai xaiVar5 = new xai(kceVar9.b(zni.class));
                k8d k8dVar3 = new k8d(b, 7);
                pl9 pl9VarB8 = kceVar9.b(nkd.class);
                kq9 kq9Var7 = kq9.G;
                oqbVar11.a(new w7f(new qh1(xaiVar5, pl9VarB8, null, k8dVar3, kq9Var7)));
                oqbVar11.a(new w7f(new qh1(xaiVar5, kceVar9.b(wqd.class), null, new yta(i11), kq9Var7)));
                yta ytaVar = new yta(i8);
                pl9 pl9VarB9 = kceVar9.b(dmd.class);
                kq9 kq9Var8 = kq9.F;
                oqbVar11.a(new ge7(new qh1(xaiVar5, pl9VarB9, null, ytaVar, kq9Var8)));
                ij0.v(new qh1(xaiVar5, kceVar9.b(vpd.class), null, new yta(i7), kq9Var8), oqbVar11);
                oqbVar11.d.add(xaiVar5);
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                cv9 cv9Var = (cv9) obj;
                fj0 fj0Var = cv9Var.E.F;
                long jW = fj0Var.w();
                fj0Var.p().g();
                try {
                    ((efe) fj0Var.E).k(-3.4028235E38f, MTTypesetterKt.kLineSkipLimitMultiplier, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    cv9Var.a();
                    return ieiVar;
                } finally {
                    grc.y(fj0Var, jW);
                }
            case 26:
                Float f2 = (Float) obj;
                f2.getClass();
                return new mxd(new a80(f2, dgj.f, lpcVar, i11));
            case 27:
                return Boolean.TRUE;
            case 28:
                ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference) obj;
                chatConversationWithProjectReference.getClass();
                return chatConversationWithProjectReference.m209getUuidRjYBDck();
            default:
                ((ChatConversationWithProjectReference) obj).getClass();
                return le6.E;
        }
    }
}
