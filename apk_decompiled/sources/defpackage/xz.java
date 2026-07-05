package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public final class xz extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xz(Object obj, int i, Object obj2) {
        super(0);
        this.F = i;
        this.G = obj;
        this.H = obj2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        wjf wjfVar;
        av9 av9Var;
        int i = this.F;
        int i2 = 1;
        iei ieiVar = iei.a;
        Object obj = this.H;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj));
            case 1:
                return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) obj));
            case 2:
                k00 k00Var = (k00) obj;
                g9f g9fVar = (g9f) obj2;
                v8f v8fVar = g9fVar.I;
                v8f v8fVar2 = g9fVar.J;
                Float f = g9fVar.G;
                Float f2 = g9fVar.H;
                float fFloatValue = (v8fVar == null || f == null) ? 0.0f : ((Number) v8fVar.a.a()).floatValue() - f.floatValue();
                float fFloatValue2 = (v8fVar2 == null || f2 == null) ? 0.0f : ((Number) v8fVar2.a.a()).floatValue() - f2.floatValue();
                if (fFloatValue != MTTypesetterKt.kLineSkipLimitMultiplier || fFloatValue2 != MTTypesetterKt.kLineSkipLimitMultiplier) {
                    int iV = k00Var.v(g9fVar.E);
                    yjf yjfVar = (yjf) k00Var.n().b(k00Var.O);
                    if (yjfVar != null) {
                        try {
                            i6 i6Var = k00Var.Q;
                            if (i6Var != null) {
                                i6Var.a.setBoundsInScreen(k00Var.f(yjfVar));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    yjf yjfVar2 = (yjf) k00Var.n().b(k00Var.P);
                    if (yjfVar2 != null) {
                        try {
                            i6 i6Var2 = k00Var.R;
                            if (i6Var2 != null) {
                                i6Var2.a.setBoundsInScreen(k00Var.f(yjfVar2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    k00Var.H.invalidate();
                    yjf yjfVar3 = (yjf) k00Var.n().b(iV);
                    if (yjfVar3 != null && (wjfVar = yjfVar3.a) != null && (av9Var = wjfVar.c) != null) {
                        if (v8fVar != null) {
                            k00Var.T.i(iV, v8fVar);
                        }
                        if (v8fVar2 != null) {
                            k00Var.U.i(iV, v8fVar2);
                        }
                        k00Var.r(av9Var);
                    }
                }
                if (v8fVar != null) {
                    g9fVar.G = (Float) v8fVar.a.a();
                }
                if (v8fVar2 != null) {
                    g9fVar.H = (Float) v8fVar2.a.a();
                }
                return ieiVar;
            case 3:
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(((Class) obj2).getCanonicalName());
                w44.R0(((Map) obj).entrySet(), sb, ", ", "(", ")", ex.W, 48);
                return sb.toString();
            case 4:
                return String.format(Locale.US, "The file provided (%s) doesn't belong to the current folder (%s)", Arrays.copyOf(new Object[]{((File) obj2).getPath(), ((hh1) obj).E.getPath()}, 2));
            case 5:
                return "Unexpected consent migration from " + ((l4i) obj2) + " to " + ((l4i) obj);
            case 6:
                el5 el5Var = (el5) obj2;
                wc0 wc0Var = (wc0) obj;
                el5Var.getClass();
                wc0Var.getClass();
                return ((ke9) el5Var.E).q.b((ef9) ((kw9) el5Var.H).getValue(), wc0Var);
            case 7:
                Locale locale = Locale.US;
                Throwable th = (Throwable) obj;
                th.getClass();
                return String.format(locale, "SDK instance with name %s is not found, returning no-op implementation. Please make sure to call Datadog.initialize([instanceName]) before getting the instance. SDK instance was requested from:\n%s", Arrays.copyOf(new Object[]{(String) obj2, w44.S0(w44.I0(bsg.N0(csk.h(th)), 1), "\n", null, null, null, 62)}, 2));
            case 8:
                c16 c16Var = (c16) obj2;
                return w44.p1(((r06) c16Var.P.d).e.e(c16Var.Z, (psd) obj));
            case 9:
                ((dae) obj2).E = yb5.o((ht7) obj, y2d.a);
                return ieiVar;
            case 10:
                ((dae) obj2).E = ((jt7) obj).r1();
                return ieiVar;
            case 11:
                ((an8) obj2).d((hqb) obj);
                return ieiVar;
            case 12:
                j7g j7gVarW = ((ke9) ((el5) obj2).E).o.f().i(((qd9) obj).a).W();
                j7gVarW.getClass();
                return j7gVarW;
            case 13:
                vx9 vx9Var = (vx9) obj2;
                el5 el5Var2 = vx9Var.N;
                ke9 ke9Var = (ke9) el5Var2.E;
                el5 el5Var3 = new el5(new ke9(ke9Var.a, ke9Var.b, ke9Var.c, ke9Var.d, ke9Var.e, ke9Var.f, ke9Var.h, ke9Var.i, ke9Var.j, ke9Var.k, ke9Var.l, ke9Var.m, ke9Var.n, ke9Var.o, ke9Var.p, ke9Var.q, ke9Var.r, ke9Var.s, ke9Var.t, ke9Var.u, ke9Var.v, ke9Var.w), (tai) el5Var2.F, (kw9) el5Var2.G);
                bo5 bo5VarH = vx9Var.h();
                bo5VarH.getClass();
                return new vx9(el5Var3, bo5VarH, vx9Var.L, (qqb) obj);
            case 14:
                lm9 lm9Var = (lm9) obj2;
                im9 im9Var = lm9Var.J;
                String str = (String) obj;
                String str2 = lm9Var.K;
                im9Var.getClass();
                str.getClass();
                str2.getClass();
                Collection collectionP1 = str.equals("<init>") ? w44.p1(im9Var.l()) : im9Var.m(sxb.e(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : collectionP1) {
                    if (x44.r(jze.c((h08) obj3).f(), str2)) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.size() == 1) {
                    return (h08) w44.e1(arrayList);
                }
                String strS0 = w44.S0(collectionP1, "\n", null, null, f06.V, 30);
                StringBuilder sbR = kgh.r("Function '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbR.append(im9Var);
                sbR.append(':');
                sbR.append(strS0.length() == 0 ? " no members found" : "\n".concat(strS0));
                throw new KotlinReflectionInternalError(sbR.toString());
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                cs9 cs9Var = (cs9) ((z1a) obj).G.a();
                ((es9) obj2).getClass();
                cs9Var.getClass();
                return (yr9) cs9Var;
            case 16:
                Iterable iterable = (List) ((l2c) obj2).e.getValue();
                if (iterable == null) {
                    iterable = lm6.E;
                }
                Iterable iterable2 = iterable;
                es9 es9Var = (es9) obj;
                ArrayList arrayList2 = new ArrayList(x44.y(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((fhi) it.next()).j0(es9Var));
                }
                return arrayList2;
            case g.MAX_FIELD_NUMBER /* 17 */:
                che cheVar = ((oge) obj2).a;
                bhe bheVarD = cheVar.d();
                lsc lscVar = cheVar.j;
                tp4 tp4Var = null;
                y69 y69Var = bheVarD != null ? new y69(bheVarD.d()) : null;
                bhe bheVarD2 = cheVar.d();
                if ((bheVarD2 != null ? Integer.valueOf(bheVarD2.a.a) : null) != null) {
                    cheVar.r.setValue(lscVar.getValue());
                    gb9.D(cheVar.b, null, null, new l70(cheVar, cheVar.e(), tp4Var, 1), 3);
                }
                cheVar.l.setValue(new fcc(0L));
                lscVar.setValue(null);
                cheVar.m.setValue(new y69(y69Var != null ? y69Var.a : 0L));
                maf mafVar = cheVar.f;
                gb9.D(mafVar.b, null, null, new kaf(mafVar, tp4Var, i2), 3);
                cheVar.n.setValue(null);
                cheVar.o.setValue(null);
                ((zy7) obj).a();
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((ov5) obj2).getClass();
                return "Failed to track null error, session " + ((String) obj) + " has ended";
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                o9i o9iVar = (o9i) obj2;
                q16 q16Var = o9iVar.i0;
                gfa gfaVar = o9iVar.h0;
                q16 q16Var2 = o9iVar.i0;
                tg3 tg3Var = (tg3) obj;
                wc0 annotations = tg3Var.getAnnotations();
                int kind = tg3Var.getKind();
                if (kind == 0) {
                    throw null;
                }
                neg negVarD = q16Var.d();
                negVarD.getClass();
                o9i o9iVar2 = new o9i(gfaVar, q16Var2, tg3Var, o9iVar, annotations, kind, negVarD);
                o9i.k0.getClass();
                a aVarD = q16Var.N0() == null ? null : a.d(q16Var.O0());
                if (aVarD == null) {
                    return null;
                }
                l6e l6eVar = tg3Var.N;
                mw9 mw9VarO0 = l6eVar != null ? ((mw9) l6eVar).e(aVarD) : null;
                List listX = tg3Var.X();
                listX.getClass();
                List list = listX;
                ArrayList arrayList3 = new ArrayList(x44.y(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((mw9) ((l6e) it2.next())).e(aVarD));
                }
                List listI0 = q16Var.i0();
                List listI = o9iVar.I();
                yr9 yr9Var = o9iVar.K;
                yr9Var.getClass();
                o9iVar2.S0(null, mw9VarO0, arrayList3, listI0, listI, yr9Var, 1, q16Var.I);
                return o9iVar2;
            default:
                wk wkVar = ((aai) obj2).a;
                return ((r06) wkVar.d).e.j((ntd) obj, (txb) wkVar.e);
        }
    }
}
