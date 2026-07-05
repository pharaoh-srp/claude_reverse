package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.experience.ExperienceToggle;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class vpi {
    public static final ww7 a = new ww7("kotlin.jvm.JvmStatic");

    public static final ol9 a(ll9 ll9Var) {
        ol9 ol9Var = ll9Var instanceof ol9 ? (ol9) ll9Var : null;
        if (ol9Var != null) {
            return ol9Var;
        }
        lm9 lm9VarB = b(ll9Var);
        return lm9VarB != null ? lm9VarB : c(ll9Var);
    }

    public static final lm9 b(Object obj) {
        lm9 lm9Var = obj instanceof lm9 ? (lm9) obj : null;
        if (lm9Var != null) {
            return lm9Var;
        }
        l08 l08Var = obj instanceof l08 ? (l08) obj : null;
        ll9 ll9VarCompute = l08Var != null ? l08Var.compute() : null;
        if (ll9VarCompute instanceof lm9) {
            return (lm9) ll9VarCompute;
        }
        return null;
    }

    public static final do9 c(Object obj) {
        do9 do9Var = obj instanceof do9 ? (do9) obj : null;
        if (do9Var != null) {
            return do9Var;
        }
        ord ordVar = obj instanceof ord ? (ord) obj : null;
        ll9 ll9VarCompute = ordVar != null ? ordVar.compute() : null;
        if (ll9VarCompute instanceof do9) {
            return (do9) ll9VarCompute;
        }
        return null;
    }

    public static final ArrayList d(ub0 ub0Var) throws IllegalAccessException, InvocationTargetException {
        List listW;
        ub0Var.getClass();
        wc0 annotations = ub0Var.getAnnotations();
        ArrayList<Annotation> arrayList = new ArrayList();
        Iterator it = annotations.iterator();
        while (true) {
            Annotation annotationI = null;
            if (!it.hasNext()) {
                break;
            }
            jc0 jc0Var = (jc0) it.next();
            neg negVarD = jc0Var.d();
            if (negVarD instanceof xae) {
                annotationI = ((xae) negVarD).E;
            } else if (negVarD instanceof ize) {
                obe obeVarA = ((ize) negVarD).a();
                zae zaeVar = obeVarA instanceof zae ? (zae) obeVarA : null;
                if (zaeVar != null) {
                    annotationI = zaeVar.b();
                }
            } else {
                annotationI = i(jc0Var);
            }
            if (annotationI != null) {
                arrayList.add(annotationI);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (ez1.I(ez1.H((Annotation) it2.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Annotation annotation : arrayList) {
                        Class clsI = ez1.I(ez1.H(annotation));
                        if (!clsI.getSimpleName().equals("Container") || clsI.getAnnotation(ihe.class) == null) {
                            listW = x44.W(annotation);
                        } else {
                            Object objInvoke = clsI.getDeclaredMethod(ExperienceToggle.DEFAULT_PARAM_KEY, null).invoke(annotation, null);
                            objInvoke.getClass();
                            listW = Arrays.asList((Annotation[]) objInvoke);
                            listW.getClass();
                        }
                        b54.t0(arrayList2, listW);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        type.getClass();
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            if (type.equals(Boolean.TYPE)) {
                return Boolean.FALSE;
            }
            if (type.equals(Character.TYPE)) {
                return (char) 0;
            }
            if (type.equals(Byte.TYPE)) {
                return (byte) 0;
            }
            if (type.equals(Short.TYPE)) {
                return (short) 0;
            }
            if (type.equals(Integer.TYPE)) {
                return 0;
            }
            if (type.equals(Float.TYPE)) {
                return Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
            }
            if (type.equals(Long.TYPE)) {
                return 0L;
            }
            if (type.equals(Double.TYPE)) {
                return Double.valueOf(0.0d);
            }
            if (type.equals(Void.TYPE)) {
                sz6.j("Parameter with void type is illegal");
                return null;
            }
            poc.t("Unknown primitive: ", type);
        }
        return null;
    }

    public static final c92 f(Class cls, r28 r28Var, txb txbVar, cbi cbiVar, wp1 wp1Var, pz7 pz7Var) {
        List list;
        cls.getClass();
        r28Var.getClass();
        txbVar.getClass();
        wp1Var.getClass();
        hze hzeVarA = rqb.a(cls);
        if (r28Var instanceof usd) {
            list = ((usd) r28Var).M;
        } else {
            if (!(r28Var instanceof ctd)) {
                xh6.d("Unsupported message: ", r28Var);
                return null;
            }
            list = ((ctd) r28Var).M;
        }
        List list2 = list;
        r06 r06Var = hzeVarA.a;
        tqb tqbVar = r06Var.b;
        zp3 zp3Var = zp3.Z;
        list2.getClass();
        return (c92) pz7Var.invoke(new bab(new wk(r06Var, txbVar, tqbVar, cbiVar, zp3Var, wp1Var, (d16) null, (aai) null, list2)), r28Var);
    }

    public static final l6e g(e92 e92Var) {
        e92Var.getClass();
        if (e92Var.P() == null) {
            return null;
        }
        bo5 bo5VarH = e92Var.h();
        bo5VarH.getClass();
        return ((qqb) bo5VarH).j0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class h(ClassLoader classLoader, gh3 gh3Var, int i) {
        String str = ue9.a;
        xw7 xw7VarI = gh3Var.b().i();
        xw7VarI.getClass();
        gh3 gh3VarG = ue9.g(xw7VarI);
        if (gh3VarG != null) {
            gh3Var = gh3VarG;
        }
        String strB = gh3Var.g().b();
        String strB2 = gh3Var.h().b();
        if (strB.equals("kotlin")) {
            switch (strB2.hashCode()) {
                case -901856463:
                    if (strB2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (strB2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (strB2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (strB2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (strB2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (strB2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (strB2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (strB2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (strB2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (strB.length() > 0) {
            sb.append(strB.concat("."));
        }
        String strReplace = strB2.replace('.', '$');
        strReplace.getClass();
        sb.append(strReplace);
        if (i > 0) {
            sb.append(";");
        }
        try {
            return Class.forName(sb.toString(), false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Annotation i(jc0 jc0Var) {
        qqb qqbVarD = o06.d(jc0Var);
        Class clsJ = qqbVarD != null ? j(qqbVarD) : null;
        if (clsJ == null) {
            clsJ = null;
        }
        if (clsJ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = jc0Var.f().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            sxb sxbVar = (sxb) entry.getKey();
            il4 il4Var = (il4) entry.getValue();
            ClassLoader classLoader = clsJ.getClassLoader();
            classLoader.getClass();
            Object objK = k(il4Var, classLoader);
            cpc cpcVar = objK != null ? new cpc(sxbVar.b(), objK) : null;
            if (cpcVar != null) {
                arrayList.add(cpcVar);
            }
        }
        return (Annotation) ask.d(clsJ, sta.p0(arrayList));
    }

    public static final Class j(qqb qqbVar) {
        qqbVar.getClass();
        neg negVarD = qqbVar.d();
        negVarD.getClass();
        if (negVarD instanceof vr9) {
            return ((vr9) negVarD).E.a;
        }
        if (negVarD instanceof ize) {
            obe obeVarA = ((ize) negVarD).a();
            obeVarA.getClass();
            return ((jbe) obeVarA).b();
        }
        gh3 gh3VarF = o06.f(qqbVar);
        if (gh3VarF == null) {
            return null;
        }
        return h(yae.d(qqbVar.getClass()), gh3VarF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object k(il4 il4Var, ClassLoader classLoader) {
        yr9 yr9VarC;
        Class clsH;
        if (il4Var instanceof uc0) {
            return i((jc0) ((uc0) il4Var).b());
        }
        int i = 0;
        if (il4Var instanceof lp0) {
            lp0 lp0Var = (lp0) il4Var;
            hbi hbiVar = lp0Var instanceof hbi ? (hbi) lp0Var : null;
            if (hbiVar != null && (yr9VarC = hbiVar.c()) != null) {
                Iterable iterable = (Iterable) lp0Var.b();
                ArrayList arrayList = new ArrayList(x44.y(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(k((il4) it.next(), classLoader));
                }
                sxb sxbVar = or9.e;
                xh3 xh3VarA = yr9VarC.O().a();
                vfd vfdVarQ = xh3VarA == null ? null : or9.q(xh3VarA);
                switch (vfdVarQ == null ? -1 : upi.a[vfdVarQ.ordinal()]) {
                    case -1:
                        if (!or9.x(yr9VarC)) {
                            mr9.k("Not an array type: ", yr9VarC);
                            return null;
                        }
                        yr9 yr9VarB = ((vai) w44.e1(yr9VarC.H())).b();
                        yr9VarB.getClass();
                        xh3 xh3VarA2 = yr9VarB.O().a();
                        qqb qqbVar = xh3VarA2 instanceof qqb ? (qqb) xh3VarA2 : null;
                        if (qqbVar == null) {
                            xh6.d("Not a class type: ", yr9VarB);
                            return null;
                        }
                        if (or9.F(yr9VarB)) {
                            int size = ((List) lp0Var.b()).size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                obj.getClass();
                                strArr[i] = obj;
                                i++;
                            }
                            return strArr;
                        }
                        if (or9.b(qqbVar, okg.P)) {
                            int size2 = ((List) lp0Var.b()).size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj2 = arrayList.get(i);
                                obj2.getClass();
                                clsArr[i] = obj2;
                                i++;
                            }
                            return clsArr;
                        }
                        gh3 gh3VarF = o06.f(qqbVar);
                        if (gh3VarF != null && (clsH = h(classLoader, gh3VarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsH, ((List) lp0Var.b()).size());
                            objNewInstance.getClass();
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        mr9.b();
                        return null;
                    case 1:
                        int size4 = ((List) lp0Var.b()).size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            Object obj3 = arrayList.get(i);
                            obj3.getClass();
                            zArr[i] = ((Boolean) obj3).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) lp0Var.b()).size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            Object obj4 = arrayList.get(i);
                            obj4.getClass();
                            cArr[i] = ((Character) obj4).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) lp0Var.b()).size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            Object obj5 = arrayList.get(i);
                            obj5.getClass();
                            bArr[i] = ((Byte) obj5).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) lp0Var.b()).size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            Object obj6 = arrayList.get(i);
                            obj6.getClass();
                            sArr[i] = ((Short) obj6).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) lp0Var.b()).size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            Object obj7 = arrayList.get(i);
                            obj7.getClass();
                            iArr[i] = ((Integer) obj7).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) lp0Var.b()).size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            Object obj8 = arrayList.get(i);
                            obj8.getClass();
                            fArr[i] = ((Float) obj8).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) lp0Var.b()).size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            Object obj9 = arrayList.get(i);
                            obj9.getClass();
                            jArr[i] = ((Long) obj9).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) lp0Var.b()).size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            Object obj10 = arrayList.get(i);
                            obj10.getClass();
                            dArr[i] = ((Double) obj10).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (il4Var instanceof mq6) {
            cpc cpcVar = (cpc) ((mq6) il4Var).b();
            gh3 gh3Var = (gh3) cpcVar.E;
            sxb sxbVar2 = (sxb) cpcVar.F;
            Class clsH2 = h(classLoader, gh3Var, 0);
            if (clsH2 != null) {
                return itj.e(clsH2, sxbVar2.b());
            }
        } else if (il4Var instanceof bm9) {
            am9 am9Var = (am9) ((bm9) il4Var).b();
            if (am9Var instanceof zl9) {
                zl9 zl9Var = (zl9) am9Var;
                return h(classLoader, zl9Var.b(), zl9Var.a());
            }
            if (!(am9Var instanceof yl9)) {
                mr9.b();
                return null;
            }
            xh3 xh3VarA3 = ((yl9) am9Var).a().O().a();
            qqb qqbVar2 = xh3VarA3 instanceof qqb ? (qqb) xh3VarA3 : null;
            if (qqbVar2 != null) {
                return j(qqbVar2);
            }
        } else {
            if (!(il4Var instanceof ou6 ? true : il4Var instanceof m9c)) {
                return il4Var.b();
            }
        }
        return null;
    }
}
