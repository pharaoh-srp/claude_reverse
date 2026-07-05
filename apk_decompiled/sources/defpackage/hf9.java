package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hf9 extends kzi {
    public static final hf9 c = new hf9("package", false);

    @Override // defpackage.kzi
    public final Integer a(kzi kziVar) {
        kziVar.getClass();
        if (this == kziVar) {
            return 0;
        }
        lqa lqaVar = jzi.a;
        return (kziVar == ezi.c || kziVar == fzi.c) ? 1 : -1;
    }

    @Override // defpackage.kzi
    public final String b() {
        return "public/*package*/";
    }

    @Override // defpackage.kzi
    public final kzi c() {
        return gzi.c;
    }
}
