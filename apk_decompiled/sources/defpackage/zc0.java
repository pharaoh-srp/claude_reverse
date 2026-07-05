package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zc0 {
    public static final /* synthetic */ wn9[] a;
    public static final x9c b;

    static {
        kce kceVar = jce.a;
        a = new wn9[]{kceVar.g(new mrd(kceVar.c(zc0.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};
        cbf cbfVar = r9i.F;
        pl9 pl9VarB = kceVar.b(yc0.class);
        cbfVar.getClass();
        b = new x9c(cbfVar.g(pl9VarB), pl9VarB);
    }

    public static final wc0 a(r9i r9iVar) {
        wc0 wc0Var;
        r9iVar.getClass();
        wn9 wn9Var = a[0];
        x9c x9cVar = b;
        x9cVar.getClass();
        wn9Var.getClass();
        yc0 yc0Var = (yc0) r9iVar.E.get(x9cVar.F);
        return (yc0Var == null || (wc0Var = yc0Var.a) == null) ? dd8.F : wc0Var;
    }
}
