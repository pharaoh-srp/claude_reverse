package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xbi extends m08 implements bz7 {
    public static final xbi E = new xbi(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Class cls = (Class) obj;
        cls.getClass();
        return cls.getComponentType();
    }
}
