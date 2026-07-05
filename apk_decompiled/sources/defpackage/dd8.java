package defpackage;

import android.content.Context;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.ReadAloudEvents$ReadAloudOutcome;
import com.anthropic.claude.bell.tts.d;
import com.anthropic.claude.bell.tts.f;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class dd8 implements kn6, b45, du6, ia4, rt7, go0, jo0, m6e, bl4, wjb, pyi, k5d, bof {
    public static final vc0 F = new vc0();
    public static final dd8 G = new dd8(2);
    public static final dd8 H = new dd8(3);
    public static final /* synthetic */ dd8 I = new dd8(4);
    public static final /* synthetic */ dd8 J = new dd8(5);
    public static final dd8 K = new dd8(6);
    public static final dd8 L = new dd8(7);
    public static final dd8 M = new dd8(8);
    public static final dd8 N = new dd8(9);
    public static final ozi O = new ozi();
    public static final /* synthetic */ dd8 P = new dd8(11);
    public final /* synthetic */ int E;

    public /* synthetic */ dd8(int i) {
        this.E = i;
    }

    public static final ReadAloudEvents$ReadAloudOutcome t(i2h i2hVar, long j) {
        Set set = f.y;
        if (j <= 0) {
            d dVarJ = i2hVar.j();
            if (x44.r(dVarJ != null ? dVarJ.u() : null, xi3.J.a())) {
                return ReadAloudEvents$ReadAloudOutcome.RATE_LIMITED;
            }
        }
        return null;
    }

    public static ewe u(dd8 dd8Var, List list, int i, int i2) {
        char c;
        long j;
        List listV;
        float f;
        float f2;
        ArrayList arrayList;
        Iterator it;
        long j2 = 4294967295L;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L);
        int i3 = 0;
        float f3 = 360.0f;
        if ((i2 & 8) == 0) {
            d8a d8aVarE = x44.E();
            ArrayList arrayList2 = new ArrayList(list.size());
            List list2 = list;
            int size = list2.size();
            c = ' ';
            int i4 = 0;
            while (i4 < size) {
                dwa dwaVar = (dwa) list.get(i4);
                dd8 dd8Var2 = ewa.a;
                long jH = fcc.h(dwaVar.a, jFloatToRawIntBits);
                arrayList2.add(Float.valueOf((((float) Math.atan2(Float.intBitsToFloat((int) (jH & r16)), Float.intBitsToFloat((int) (jH >> 32)))) * 180.0f) / 3.1415927f));
                i4++;
                j2 = j2;
            }
            j = j2;
            float f4 = 2.0f;
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList3.add(Float.valueOf(fcc.d(fcc.h(((dwa) list.get(i5)).a, jFloatToRawIntBits))));
            }
            int i6 = i * 2;
            float f5 = 360.0f / i6;
            int i7 = 0;
            while (i7 < i6) {
                Iterator it2 = x44.L(list2).iterator();
                while (true) {
                    a79 a79Var = (a79) it2;
                    if (a79Var.G) {
                        int iNextInt = a79Var.nextInt();
                        int i8 = i7 % 2;
                        if (i8 != 0) {
                            iNextInt = (list.size() - 1) - iNextInt;
                        }
                        if (iNextInt > 0 || i8 == 0) {
                            dd8 dd8Var3 = ewa.a;
                            f = f4;
                            float fFloatValue = (((i7 * f5) + (i8 == 0 ? ((Number) arrayList2.get(iNextInt)).floatValue() : (((Number) arrayList2.get(i3)).floatValue() * f) + (f5 - ((Number) arrayList2.get(iNextInt)).floatValue()))) / f3) * f * 3.1415927f;
                            f2 = f3;
                            arrayList = arrayList2;
                            double d = fFloatValue;
                            it = it2;
                            d8aVarE.add(new dwa(fcc.i(fcc.j(((Number) arrayList3.get(iNextInt)).floatValue(), (((long) Float.floatToRawIntBits((float) Math.sin(d))) & j) | (((long) Float.floatToRawIntBits((float) Math.cos(d))) << 32)), jFloatToRawIntBits), ((dwa) list.get(iNextInt)).b));
                        } else {
                            f = f4;
                            it = it2;
                            f2 = f3;
                            arrayList = arrayList2;
                        }
                        it2 = it;
                        f3 = f2;
                        f4 = f;
                        arrayList2 = arrayList;
                        i3 = 0;
                    }
                }
                i7++;
                i3 = 0;
            }
            listV = x44.v(d8aVarE);
        } else {
            c = ' ';
            j = 4294967295L;
            float f6 = 360.0f;
            int size3 = list.size();
            b79 b79VarH0 = wd6.H0(0, size3 * i);
            ArrayList arrayList4 = new ArrayList(x44.y(b79VarH0, 10));
            Iterator it3 = b79VarH0.iterator();
            while (true) {
                a79 a79Var2 = (a79) it3;
                if (!a79Var2.G) {
                    break;
                }
                int iNextInt2 = a79Var2.nextInt();
                dd8 dd8Var4 = ewa.a;
                int i9 = iNextInt2 % size3;
                long jH2 = fcc.h(((dwa) list.get(i9)).a, jFloatToRawIntBits);
                int i10 = (int) (jH2 >> 32);
                double d2 = ((((iNextInt2 / size3) * f6) / i) / f6) * 2.0f * 3.1415927f;
                int i11 = (int) (jH2 & 4294967295L);
                arrayList4.add(new dwa(fcc.i((((long) Float.floatToRawIntBits((Float.intBitsToFloat(i10) * ((float) Math.cos(d2))) - (Float.intBitsToFloat(i11) * ((float) Math.sin(d2))))) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i11) * ((float) Math.cos(d2))) + (Float.intBitsToFloat(i10) * ((float) Math.sin(d2))))) & 4294967295L), jFloatToRawIntBits), ((dwa) list.get(i9)).b));
                f6 = 360.0f;
            }
            listV = arrayList4;
        }
        int size4 = listV.size() * 2;
        float[] fArr = new float[size4];
        for (int i12 = 0; i12 < size4; i12++) {
            long j3 = ((dwa) listV.get(i12 / 2)).a;
            fArr[i12] = Float.intBitsToFloat((int) (i12 % 2 == 0 ? j3 >> c : j3 & j));
        }
        d8a d8aVarE2 = x44.E();
        Iterator it4 = listV.iterator();
        while (it4.hasNext()) {
            d8aVarE2.add(((dwa) it4.next()).b);
        }
        return x44.i(fArr, r35.b, x44.v(d8aVarE2), Float.intBitsToFloat((int) (jFloatToRawIntBits >> c)), Float.intBitsToFloat((int) (jFloatToRawIntBits & j)));
    }

    private final void x(qqb qqbVar, ArrayList arrayList) {
    }

    @Override // defpackage.m4i
    public void a(Context context) {
    }

    @Override // defpackage.bl4
    public void b() {
    }

    @Override // defpackage.bl4
    public void c(wk4 wk4Var) {
    }

    @Override // defpackage.go0, defpackage.jo0
    public float d() {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.du6
    public void e(qqb qqbVar, ArrayList arrayList) {
        switch (this.E) {
            case 8:
                throw new IllegalStateException("Incomplete hierarchy for class " + qqbVar.getName() + ", unresolved classes " + arrayList);
            default:
                return;
        }
    }

    @Override // defpackage.wjb
    public void f(File file, xg1 xg1Var) {
        file.getClass();
    }

    @Override // defpackage.bl4
    public void g(l4i l4iVar) {
    }

    @Override // defpackage.m6e
    public yr9 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // defpackage.du6
    public void h(e92 e92Var) {
        switch (this.E) {
            case 8:
                e92Var.getClass();
                throw new IllegalStateException("Cannot infer visibility for " + e92Var);
            default:
                if (e92Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
                }
                return;
        }
    }

    @Override // defpackage.kn6
    public void i(cf5 cf5Var) {
    }

    @Override // defpackage.go0
    public void j(cz5 cz5Var, int i, int[] iArr, fu9 fu9Var, int[] iArr2) {
        if (fu9Var == fu9.E) {
            ko0.a(i, iArr, iArr2, false);
        } else {
            ko0.a(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.m4i
    public void k(k99 k99Var, Context context) {
        k99Var.getClass();
        context.getClass();
    }

    @Override // defpackage.kn6
    public void l(cf5 cf5Var) {
    }

    @Override // defpackage.bl4
    public l4i m() {
        return l4i.E;
    }

    @Override // defpackage.bof
    public String o(Object obj) {
        wxe wxeVar = (wxe) obj;
        wxeVar.getClass();
        qh9 qh9Var = new qh9();
        qh9Var.r("type", "view");
        qh9Var.r("viewId", wxeVar.a);
        qh9Var.p(Long.valueOf(wxeVar.b), "documentVersion");
        qh9Var.q("hasAccessibility", wxeVar.c);
        String string = qh9Var.toString();
        string.getClass();
        return string;
    }

    @Override // defpackage.bl4
    public void q(wk4 wk4Var) {
    }

    @Override // defpackage.wjb
    public void r(File file, mpk mpkVar, int i) {
        file.getClass();
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        un3 un3Var = new un3();
        ReferenceQueue referenceQueue = un3Var.a;
        Set set = un3Var.b;
        set.add(new l3k(un3Var, referenceQueue, set));
        Thread thread = new Thread(new t08(referenceQueue, 8, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return un3Var;
    }

    public String toString() {
        switch (this.E) {
            case 13:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.jo0
    public void v(cz5 cz5Var, int i, int[] iArr, int[] iArr2) {
        ko0.a(i, iArr, iArr2, false);
    }

    public ewe w() {
        ewe eweVar = ewa.m;
        if (eweVar != null) {
            return eweVar;
        }
        ewe eweVarA = u(this, x44.X(new dwa((((long) Float.floatToRawIntBits(0.193f)) << 32) | (((long) Float.floatToRawIntBits(0.277f)) & 4294967295L), new r35(2, 0.053f)), new dwa((((long) Float.floatToRawIntBits(0.176f)) << 32) | (((long) Float.floatToRawIntBits(0.055f)) & 4294967295L), new r35(2, 0.053f))), 10, 12).a();
        ewa.m = eweVarA;
        return eweVarA;
    }
}
