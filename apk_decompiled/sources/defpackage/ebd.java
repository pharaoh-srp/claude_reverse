package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ebd {
    public static final df9 a = new df9(p9c.F, false);
    public static final df9 b;
    public static final df9 c;
    public static final LinkedHashMap d;

    static {
        p9c p9cVar = p9c.G;
        b = new df9(p9cVar, false);
        c = new df9(p9cVar, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        int i = 2;
        y0c y0cVar = new y0c(2);
        new ire(y0cVar, "java/util/".concat("Iterator"), false, i).h("forEachRemaining", new cbd(strConcat4, 0));
        new ire(y0cVar, "java/lang/".concat("Iterable"), false, i).h("spliterator", new pgg(1, 23));
        ire ireVar = new ire(y0cVar, "java/util/".concat("Collection"), false, 2);
        ireVar.h("removeIf", new cbd(strConcat2, 6));
        ireVar.h("stream", new cbd(strConcat8, 7));
        ireVar.h("parallelStream", new cbd(strConcat8, 8));
        boolean z = false;
        int i2 = 2;
        new ire(y0cVar, "java/util/".concat("List"), z, i2).h("replaceAll", new cbd(strConcat7, 9));
        ire ireVar2 = new ire(y0cVar, "java/util/".concat("Map"), z, i2);
        ireVar2.h("forEach", new cbd(strConcat6, 10));
        ireVar2.h("putIfAbsent", new cbd(strConcat, 11));
        ireVar2.h("replace", new cbd(strConcat, 12));
        ireVar2.h("replace", new cbd(strConcat, 13));
        ireVar2.h("replaceAll", new cbd(strConcat5, 14));
        ireVar2.h("compute", new dbd(strConcat, strConcat5, 0));
        ireVar2.h("computeIfAbsent", new dbd(strConcat, strConcat3, 1));
        ireVar2.h("computeIfPresent", new dbd(strConcat, strConcat5, 2));
        ireVar2.h("merge", new dbd(strConcat, strConcat5, 3));
        ire ireVar3 = new ire(y0cVar, strConcat9, false, 2);
        ireVar3.h("empty", new cbd(strConcat9, 15));
        ireVar3.h("of", new dbd(strConcat, strConcat9, 4));
        ireVar3.h("ofNullable", new dbd(strConcat, strConcat9, 5));
        ireVar3.h("get", new cbd(strConcat, 16));
        ireVar3.h("ifPresent", new cbd(strConcat4, 17));
        boolean z2 = false;
        int i3 = 2;
        new ire(y0cVar, "java/lang/".concat("ref/Reference"), z2, i3).h("get", new cbd(strConcat, 18));
        new ire(y0cVar, strConcat2, z2, i3).h("test", new cbd(strConcat, 19));
        new ire(y0cVar, "java/util/function/".concat("BiPredicate"), z2, i3).h("test", new cbd(strConcat, 20));
        new ire(y0cVar, strConcat4, z2, i3).h("accept", new cbd(strConcat, 1));
        new ire(y0cVar, strConcat6, z2, i3).h("accept", new cbd(strConcat, 2));
        new ire(y0cVar, strConcat3, z2, i3).h("apply", new cbd(strConcat, 3));
        new ire(y0cVar, strConcat5, z2, i3).h("apply", new cbd(strConcat, 4));
        new ire(y0cVar, "java/util/function/".concat("Supplier"), z2, i3).h("get", new cbd(strConcat, 5));
        d = y0cVar.a;
    }

    public static final LinkedHashMap a() {
        return d;
    }
}
