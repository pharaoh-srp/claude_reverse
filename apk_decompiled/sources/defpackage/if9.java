package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class if9 extends kzi {
    public static final if9 c = new if9("protected_and_package", true);

    @Override // defpackage.kzi
    public final Integer a(kzi kziVar) {
        kziVar.getClass();
        if (this == kziVar) {
            return 0;
        }
        if (kziVar == bzi.c) {
            return null;
        }
        lqa lqaVar = jzi.a;
        return (kziVar == ezi.c || kziVar == fzi.c) ? 1 : -1;
    }

    @Override // defpackage.kzi
    public final String b() {
        return "protected/*protected and package*/";
    }

    @Override // defpackage.kzi
    public final kzi c() {
        return gzi.c;
    }
}
