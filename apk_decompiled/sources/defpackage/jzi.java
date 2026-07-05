package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jzi {
    public static final lqa a;

    static {
        lqa lqaVar = new lqa();
        lqaVar.put(fzi.c, 0);
        lqaVar.put(ezi.c, 0);
        lqaVar.put(bzi.c, 1);
        lqaVar.put(gzi.c, 1);
        lqaVar.put(hzi.c, 2);
        a = lqaVar.c();
    }

    public static Integer a(kzi kziVar, kzi kziVar2) {
        kziVar2.getClass();
        if (kziVar == kziVar2) {
            return 0;
        }
        lqa lqaVar = a;
        Integer num = (Integer) lqaVar.get(kziVar);
        Integer num2 = (Integer) lqaVar.get(kziVar2);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }
}
