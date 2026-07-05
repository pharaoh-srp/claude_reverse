package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yj9 {
    public static final LinkedHashSet a = dxf.q0(lyk.r("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    public static final LinkedHashSet b;
    public static final LinkedHashSet c;
    public static final LinkedHashSet d;
    public static final LinkedHashSet e;
    public static final LinkedHashSet f;

    static {
        List<nk9> listX = x44.X(nk9.BOOLEAN, nk9.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (nk9 nk9Var : listX) {
            String strB = nk9Var.d().f().b();
            strB.getClass();
            String[] strArr = {nk9Var.F + "Value()" + nk9Var.G};
            String strConcat = "java/lang/".concat(strB);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (String str : strArr2) {
                linkedHashSet2.add(strConcat + '.' + str);
            }
            b54.t0(linkedHashSet, linkedHashSet2);
        }
        b = dxf.p0(dxf.p0(dxf.p0(dxf.p0(dxf.p0(dxf.p0(linkedHashSet, lyk.r("List", "sort(Ljava/util/Comparator;)V")), lyk.q("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), lyk.q("Double", "isInfinite()Z", "isNaN()Z")), lyk.q("Float", "isInfinite()Z", "isNaN()Z")), lyk.q("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), lyk.q("CharSequence", "isEmpty()Z"));
        c = dxf.p0(dxf.p0(dxf.p0(dxf.p0(dxf.p0(dxf.p0(lyk.q("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), lyk.r("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), lyk.q("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), lyk.q("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), lyk.r("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), lyk.r("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), lyk.r("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        d = dxf.p0(dxf.p0(lyk.r("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), lyk.r("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), lyk.r("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        nk9 nk9Var2 = nk9.BOOLEAN;
        nk9 nk9Var3 = nk9.BYTE;
        List listX2 = x44.X(nk9Var2, nk9Var3, nk9.DOUBLE, nk9.FLOAT, nk9Var3, nk9.INT, nk9.LONG, nk9.SHORT);
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it = listX2.iterator();
        while (it.hasNext()) {
            String strB2 = ((nk9) it.next()).d().f().b();
            strB2.getClass();
            String[] strArrK = lyk.k("Ljava/lang/String;");
            b54.t0(linkedHashSet3, lyk.q(strB2, (String[]) Arrays.copyOf(strArrK, strArrK.length)));
        }
        String[] strArrK2 = lyk.k("D");
        LinkedHashSet linkedHashSetP0 = dxf.p0(linkedHashSet3, lyk.q("Float", (String[]) Arrays.copyOf(strArrK2, strArrK2.length)));
        String[] strArrK3 = lyk.k("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        e = dxf.p0(linkedHashSetP0, lyk.q("String", (String[]) Arrays.copyOf(strArrK3, strArrK3.length)));
        String[] strArrK4 = lyk.k("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f = lyk.q("Throwable", (String[]) Arrays.copyOf(strArrK4, strArrK4.length));
    }

    public static LinkedHashSet a() {
        return e;
    }

    public static LinkedHashSet b() {
        return d;
    }

    public static LinkedHashSet c() {
        return f;
    }

    public static boolean d(xw7 xw7Var) {
        return xw7Var.equals(okg.g) || okg.c0.get(xw7Var) != null;
    }

    public static boolean e(xw7 xw7Var) {
        if (d(xw7Var)) {
            return true;
        }
        String str = ue9.a;
        gh3 gh3VarG = ue9.g(xw7Var);
        if (gh3VarG == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(gh3VarG.b().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
