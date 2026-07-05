package defpackage;

import android.graphics.Rect;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.datadog.android.rum.internal.domain.scope.r;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i, Object obj) {
        super(1);
        this.F = i;
        this.G = obj;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws IOException {
        Object next;
        zp3 zp3Var;
        wk wkVar;
        Object next2;
        int i = this.F;
        int i2 = 0;
        iei ieiVar = iei.a;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                bce bceVar = (bce) obj;
                bceVar.getClass();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                qb5 qb5Var = new qb5((rl) obj2, map, map2);
                Class cls = bceVar.a;
                cls.getClass();
                Method[] declaredMethods = cls.getDeclaredMethods();
                declaredMethods.getClass();
                int length = declaredMethods.length;
                int i3 = 0;
                while (i3 < length) {
                    Method method = declaredMethods[i3];
                    d0 d0VarE = qb5Var.E(sxb.e(method.getName()), uuj.g(method));
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    declaredAnnotations.getClass();
                    int length2 = declaredAnnotations.length;
                    for (int i4 = i2; i4 < length2; i4++) {
                        Annotation annotation = declaredAnnotations[i4];
                        annotation.getClass();
                        yfd.P(d0VarE, annotation);
                    }
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    parameterAnnotations.getClass();
                    Annotation[][] annotationArr = parameterAnnotations;
                    int length3 = annotationArr.length;
                    int i5 = i2;
                    while (i5 < length3) {
                        Annotation[] annotationArr2 = annotationArr[i5];
                        annotationArr2.getClass();
                        int length4 = annotationArr2.length;
                        int i6 = i2;
                        while (i6 < length4) {
                            Annotation annotation2 = annotationArr2[i6];
                            Class cls2 = cls;
                            Class clsI = ez1.I(ez1.H(annotation2));
                            Method[] methodArr = declaredMethods;
                            int i7 = length;
                            hi6 hi6VarD = d0VarE.D(i5, yae.a(clsI), new xae(annotation2));
                            if (hi6VarD != null) {
                                yfd.Q(hi6VarD, annotation2, clsI);
                            }
                            i6++;
                            cls = cls2;
                            declaredMethods = methodArr;
                            length = i7;
                        }
                        i5++;
                        i2 = 0;
                    }
                    d0VarE.C();
                    i3++;
                    i2 = 0;
                }
                Class cls3 = cls;
                Constructor<?>[] declaredConstructors = cls3.getDeclaredConstructors();
                declaredConstructors.getClass();
                int length5 = declaredConstructors.length;
                int i8 = 0;
                while (i8 < length5) {
                    Constructor<?> constructor = declaredConstructors[i8];
                    sxb sxbVar = ygg.e;
                    constructor.getClass();
                    d0 d0VarE2 = qb5Var.E(sxbVar, uuj.d(constructor));
                    Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                    declaredAnnotations2.getClass();
                    for (Annotation annotation3 : declaredAnnotations2) {
                        annotation3.getClass();
                        yfd.P(d0VarE2, annotation3);
                    }
                    Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                    parameterAnnotations2.getClass();
                    if (parameterAnnotations2.length != 0) {
                        int length6 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                        int length7 = parameterAnnotations2.length;
                        for (int i9 = 0; i9 < length7; i9++) {
                            Annotation[] annotationArr3 = parameterAnnotations2[i9];
                            annotationArr3.getClass();
                            int length8 = annotationArr3.length;
                            int i10 = 0;
                            while (i10 < length8) {
                                Annotation annotation4 = annotationArr3[i10];
                                Constructor<?>[] constructorArr = declaredConstructors;
                                Class clsI2 = ez1.I(ez1.H(annotation4));
                                int i11 = length5;
                                int i12 = i8;
                                int i13 = length6;
                                hi6 hi6VarD2 = d0VarE2.D(i9 + length6, yae.a(clsI2), new xae(annotation4));
                                if (hi6VarD2 != null) {
                                    yfd.Q(hi6VarD2, annotation4, clsI2);
                                }
                                i10++;
                                declaredConstructors = constructorArr;
                                length5 = i11;
                                i8 = i12;
                                length6 = i13;
                            }
                        }
                    }
                    Constructor<?>[] constructorArr2 = declaredConstructors;
                    int i14 = length5;
                    int i15 = i8;
                    d0VarE2.C();
                    i8 = i15 + 1;
                    declaredConstructors = constructorArr2;
                    length5 = i14;
                }
                Field[] declaredFields = cls3.getDeclaredFields();
                declaredFields.getClass();
                for (Field field : declaredFields) {
                    xv8 xv8VarC = qb5Var.C(sxb.e(field.getName()), uuj.e(field));
                    Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                    declaredAnnotations3.getClass();
                    for (Annotation annotation5 : declaredAnnotations3) {
                        annotation5.getClass();
                        yfd.P(xv8VarC, annotation5);
                    }
                    xv8VarC.C();
                }
                return new b0(map, map2, map3);
            case 1:
                ww7 ww7Var = (ww7) obj;
                ww7Var.getClass();
                xj9 xj9Var = (xj9) obj2;
                vz1 vz1VarC = xj9Var.c(ww7Var);
                if (vz1VarC == null) {
                    return null;
                }
                r06 r06Var = xj9Var.c;
                if (r06Var != null) {
                    vz1VarC.O0(r06Var);
                    return vz1VarC;
                }
                x44.o0("components");
                throw null;
            case 2:
                k4 k4Var = (k4) obj;
                k4Var.getClass();
                m4 m4Var = (m4) obj2;
                zp3 zp3VarH = m4Var.h();
                List listA = k4Var.a();
                zp3VarH.getClass();
                listA.getClass();
                if (listA.isEmpty()) {
                    yr9 yr9VarG = m4Var.g();
                    List listW = yr9VarG != null ? x44.W(yr9VarG) : null;
                    if (listW == null) {
                        listW = lm6.E;
                    }
                    listA = listW;
                }
                List listP1 = listA instanceof List ? (List) listA : null;
                if (listP1 == null) {
                    listP1 = w44.p1(listA);
                }
                k4Var.c(m4Var.k(listP1));
                return ieiVar;
            case 3:
                au auVar = (au) obj;
                bv9 bv9Var = (bv9) obj2;
                if (auVar.m() != Integer.MAX_VALUE) {
                    if (auVar.c().b) {
                        auVar.C();
                    }
                    for (Map.Entry entry : auVar.c().i.entrySet()) {
                        bv9.a(bv9Var, (ut) entry.getKey(), ((Number) entry.getValue()).intValue(), auVar.d());
                    }
                    m5c m5cVar = auVar.d().W;
                    m5cVar.getClass();
                    while (!m5cVar.equals(bv9Var.a.d())) {
                        for (ut utVar : bv9Var.b(m5cVar).keySet()) {
                            bv9.a(bv9Var, utVar, bv9Var.c(m5cVar, utVar), m5cVar);
                        }
                        m5cVar = m5cVar.W;
                        m5cVar.getClass();
                    }
                }
                return ieiVar;
            case 4:
                Map map4 = (Map) obj;
                map4.getClass();
                map4.put("message", "configured");
                eg4 eg4Var = ((mff) obj2).E;
                map4.put("apihost", eg4Var.e);
                map4.put("cdnhost", eg4Var.f);
                map4.put("flush", "at:3 int:10 pol:" + eg4Var.d.size());
                map4.put("config", "seg:true");
                return ieiVar;
            case 5:
                cma cmaVar = (cma) obj;
                AndroidComposeView androidComposeView = ((tz) obj2).T;
                if (androidComposeView.getInsetsListener().K.h() > 0) {
                    xub xubVar = ldj.a;
                    long jK = cmaVar.a().k();
                    ewb ewbVar = androidComposeView.getInsetsListener().J;
                    int i16 = (int) (jK >> 32);
                    int i17 = (int) (jK & 4294967295L);
                    for (jdj jdjVar : ldj.b) {
                        Object objG = ewbVar.g(jdjVar);
                        objG.getClass();
                        hej hejVar = (hej) objG;
                        ldj.a(cmaVar, ((kdj) jdjVar).c, hejVar.h, i16, i17);
                        if (((Boolean) hejVar.b.getValue()).booleanValue()) {
                            ldj.a(cmaVar, hejVar.f, hejVar.j, i16, i17);
                            ldj.a(cmaVar, hejVar.g, hejVar.k, i16, i17);
                        }
                        ldj.a(cmaVar, ((kdj) jdjVar).d, hejVar.i, i16, i17);
                    }
                    qvb qvbVar = androidComposeView.getInsetsListener().L;
                    if (qvbVar.i()) {
                        kdg kdgVar = androidComposeView.getInsetsListener().M;
                        Object[] objArr = qvbVar.a;
                        int i18 = qvbVar.b;
                        while (i2 < i18) {
                            nwb nwbVar = (nwb) objArr[i2];
                            a49 a49Var = (a49) kdgVar.get(i2);
                            Rect rect = (Rect) nwbVar.getValue();
                            cmaVar.b(a49Var.b(), rect.left);
                            cmaVar.b(a49Var.d(), rect.top);
                            cmaVar.b(a49Var.c(), rect.right);
                            cmaVar.b(a49Var.a(), rect.bottom);
                            i2++;
                        }
                    }
                }
                return ieiVar;
            case 6:
                return Boolean.valueOf(x44.r(obj, obj2));
            case 7:
                b3d b3dVar = (b3d) obj;
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                for (int i19 = 0; i19 < size; i19++) {
                    b3dVar.f((c3d) arrayList.get(i19), 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                }
                return ieiVar;
            case 8:
                return ((sv1) obj2).f;
            case 9:
                ah3 ah3Var = (ah3) obj;
                ah3Var.getClass();
                bh3 bh3Var = (bh3) obj2;
                gh3 gh3Var = ah3Var.a;
                r06 r06Var2 = bh3Var.a;
                Iterator it = r06Var2.k.iterator();
                while (it.hasNext()) {
                    qqb qqbVarA = ((yg3) it.next()).a(gh3Var);
                    if (qqbVarA != null) {
                        return qqbVarA;
                    }
                }
                if (bh3.c.contains(gh3Var)) {
                    return null;
                }
                ug3 ug3VarL = ah3Var.b;
                if (ug3VarL == null && (ug3VarL = r06Var2.d.l(gh3Var)) == null) {
                    return null;
                }
                txb txbVar = ug3VarL.a;
                esd esdVar = ug3VarL.b;
                wp1 wp1Var = ug3VarL.c;
                neg negVar = ug3VarL.d;
                gh3 gh3VarF = gh3Var.f();
                if (gh3VarF != null) {
                    qqb qqbVarA2 = bh3Var.a(gh3VarF, null);
                    c16 c16Var = qqbVarA2 instanceof c16 ? (c16) qqbVarA2 : null;
                    if (c16Var == null) {
                        return null;
                    }
                    sxb sxbVarI = gh3Var.i();
                    sxbVarI.getClass();
                    if (!c16Var.v0().m().contains(sxbVarI)) {
                        return null;
                    }
                    wkVar = c16Var.P;
                } else {
                    zmc zmcVar = r06Var2.f;
                    ww7 ww7VarG = gh3Var.g();
                    ww7VarG.getClass();
                    zmcVar.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    zmcVar.b(ww7VarG, arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            wmc wmcVar = (wmc) next;
                            if (wmcVar instanceof vz1) {
                                sxb sxbVarI2 = gh3Var.i();
                                sxbVarI2.getClass();
                                if (((m16) ((vz1) wmcVar).G()).m().contains(sxbVarI2)) {
                                }
                            }
                        } else {
                            next = null;
                        }
                    }
                    wmc wmcVar2 = (wmc) next;
                    if (wmcVar2 == null) {
                        return null;
                    }
                    ttd ttdVar = esdVar.i0;
                    ttdVar.getClass();
                    cbi cbiVar = new cbi(ttdVar);
                    aud audVar = esdVar.k0;
                    audVar.getClass();
                    if (audVar.F.size() == 0) {
                        zp3Var = zp3.Z;
                    } else {
                        audVar.F.getClass();
                        zp3Var = new zp3(10);
                    }
                    txbVar.getClass();
                    wkVar = new wk(r06Var2, txbVar, wmcVar2, cbiVar, zp3Var, wp1Var, (d16) null, (aai) null, lm6.E);
                }
                return new c16(wkVar, esdVar, txbVar, wp1Var, negVar);
            case 10:
                rb0 rb0Var = (rb0) obj;
                float f = rb0Var.b;
                float f2 = MTTypesetterKt.kLineSkipLimitMultiplier;
                if (f < MTTypesetterKt.kLineSkipLimitMultiplier) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f3 = rb0Var.c;
                if (f3 < -0.5f) {
                    f3 = -0.5f;
                }
                if (f3 > 0.5f) {
                    f3 = 0.5f;
                }
                float f4 = rb0Var.d;
                float f5 = f4 >= -0.5f ? f4 : -0.5f;
                float f6 = f5 <= 0.5f ? f5 : 0.5f;
                float f7 = rb0Var.a;
                if (f7 >= MTTypesetterKt.kLineSkipLimitMultiplier) {
                    f2 = f7;
                }
                return new d54(d54.a(d4c.l(f, f3, f6, f2 <= 1.0f ? f2 : 1.0f, t54.x), (r54) obj2));
            case 11:
                return new dd(4, (z86) obj2);
            case 12:
                return Boolean.valueOf(!x44.r(obj, ((a6i) obj2).d.getValue()));
            case 13:
                ((xre) obj).b(((Number) ((wlg) obj2).getValue()).floatValue());
                return ieiVar;
            case 14:
                Map map5 = (Map) obj;
                map5.getClass();
                map5.clear();
                sxe sxeVar = (sxe) obj2;
                if (sxeVar != null) {
                    map5.putAll(sxeVar.b());
                }
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                File file = (File) obj;
                file.getClass();
                Charset charset = (Charset) obj2;
                charset.getClass();
                ArrayList arrayList3 = new ArrayList();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
                try {
                    for (String str : new kl4(new c54(2, bufferedReader))) {
                        str.getClass();
                        arrayList3.add(str);
                        break;
                    }
                    bufferedReader.close();
                    return arrayList3;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        wd6.Z(bufferedReader, th);
                        throw th2;
                    }
                }
            case 16:
                if (x78.b.compareAndSet(false, true)) {
                    ((zy1) obj2).r(ieiVar);
                }
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                xd6 xd6Var = (xd6) obj;
                ja8 ja8Var = (ja8) obj2;
                c40 c40Var = ja8Var.l;
                if (ja8Var.n && ja8Var.w && c40Var != null) {
                    fj0 fj0VarB0 = xd6Var.B0();
                    long jW = fj0VarB0.w();
                    fj0VarB0.p().g();
                    try {
                        ((efe) fj0VarB0.E).j(c40Var);
                        ja8Var.d(xd6Var);
                    } finally {
                        grc.y(fj0VarB0, jW);
                    }
                } else {
                    ja8Var.d(xd6Var);
                }
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                xd6 xd6Var2 = (xd6) obj;
                fb2 fb2VarP = xd6Var2.B0().p();
                pz7 pz7Var = ((ma8) obj2).H;
                if (pz7Var != null) {
                    pz7Var.invoke(fb2VarP, (ja8) xd6Var2.B0().F);
                }
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                oqi oqiVar = (oqi) obj;
                bb8 bb8Var = (bb8) obj2;
                bb8Var.g(oqiVar);
                bz7 bz7Var = bb8Var.i;
                if (bz7Var != null) {
                    bz7Var.invoke(oqiVar);
                }
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                r9c r9cVar = (r9c) obj;
                InputConnection inputConnection = r9cVar.b;
                if (inputConnection != null) {
                    inputConnection.closeConnection();
                    r9cVar.b = null;
                }
                j49 j49Var = (j49) obj2;
                wwb wwbVar = j49Var.d;
                Object[] objArr2 = wwbVar.E;
                int i20 = wwbVar.G;
                while (true) {
                    if (i2 >= i20) {
                        i2 = -1;
                    } else if (!x44.r((o6j) objArr2[i2], r9cVar)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    wwbVar.m(i2);
                }
                if (wwbVar.G == 0) {
                    j49Var.b.a();
                }
                return ieiVar;
            case 21:
                zae zaeVar = (zae) obj;
                zaeVar.getClass();
                sxb sxbVar2 = rd9.a;
                sx9 sx9Var = (sx9) obj2;
                return rd9.b(sx9Var.E, zaeVar, sx9Var.G);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ww7 ww7Var2 = (ww7) obj;
                ww7Var2.getClass();
                uqb uqbVar = (uqb) obj2;
                enc encVar = uqbVar.J;
                gfa gfaVar = uqbVar.G;
                ((dnc) encVar).getClass();
                gfaVar.getClass();
                return new d1a(uqbVar, ww7Var2, gfaVar);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((wwb) obj2).b((gqb) obj);
                return Boolean.TRUE;
            case 24:
                ww7 ww7Var3 = (ww7) obj;
                ww7Var3.getClass();
                Map map6 = (Map) ((q28) obj2).F;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry2 : map6.entrySet()) {
                    ww7 ww7Var4 = (ww7) entry2.getKey();
                    if (!ww7Var3.equals(ww7Var4)) {
                        ww7Var4.getClass();
                        if (x44.r(ww7Var3.d() ? null : ww7Var3.e(), ww7Var4)) {
                        }
                    }
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
                if (linkedHashMap.isEmpty()) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    return null;
                }
                Iterator it3 = linkedHashMap.entrySet().iterator();
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (it3.hasNext()) {
                        int length9 = mwa.P((ww7) ((Map.Entry) next2).getKey(), ww7Var3).b().length();
                        do {
                            Object next3 = it3.next();
                            int length10 = mwa.P((ww7) ((Map.Entry) next3).getKey(), ww7Var3).b().length();
                            if (length9 > length10) {
                                next2 = next3;
                                length9 = length10;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next2 = null;
                }
                Map.Entry entry3 = (Map.Entry) next2;
                if (entry3 != null) {
                    return entry3.getValue();
                }
                return null;
            case BuildConfig.VERSION_CODE /* 25 */:
                cu9 cu9Var = (cu9) obj;
                cu9Var.getClass();
                ((nwb) obj2).setValue(new fcc(cu9Var.K(0L)));
                return ieiVar;
            case 26:
                Map map7 = (Map) obj;
                map7.getClass();
                map7.remove(((r) obj2).z);
                return ieiVar;
            case 27:
                ckf.s((ekf) obj, ((vue) obj2).a);
                return ieiVar;
            case 28:
                ckf.l((ekf) obj, (String) obj2);
                return ieiVar;
            default:
                ((List) obj).add((Float) ((f0a) obj2).a());
                return true;
        }
    }
}
