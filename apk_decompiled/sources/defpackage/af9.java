package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class af9 extends l08 implements bz7 {
    public static final af9 E = new af9(1);

    @Override // defpackage.g92, defpackage.ll9
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // defpackage.g92
    public final fm9 getOwner() {
        return jce.a.c(he9.class, "compiler.common.jvm");
    }

    @Override // defpackage.g92
    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        ww7 ww7Var = (ww7) obj;
        ww7Var.getClass();
        ww7 ww7Var2 = he9.a;
        o9c.l.getClass();
        q28 q28Var = n9c.b;
        gs9 gs9Var = new gs9(1, 7, 20);
        q28Var.getClass();
        iie iieVar = (iie) ((efa) q28Var.G).invoke(ww7Var);
        if (iieVar != null) {
            return iieVar;
        }
        q28 q28Var2 = he9.c;
        q28Var2.getClass();
        ie9 ie9Var = (ie9) ((efa) q28Var2.G).invoke(ww7Var);
        if (ie9Var == null) {
            return iie.IGNORE;
        }
        gs9 gs9Var2 = ie9Var.b;
        return (gs9Var2 == null || gs9Var2.H - gs9Var.H > 0) ? ie9Var.a : ie9Var.c;
    }
}
