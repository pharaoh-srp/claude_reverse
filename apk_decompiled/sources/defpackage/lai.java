package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lai extends l08 implements pz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lai(int i, Object obj, int i2) {
        super(i, obj);
        this.E = i2;
    }

    @Override // defpackage.g92, defpackage.ll9
    public final String getName() {
        switch (this.E) {
            case 0:
                return "isStrictSupertype";
            default:
                return "equalTypes";
        }
    }

    @Override // defpackage.g92
    public final fm9 getOwner() {
        switch (this.E) {
            case 0:
                return jce.a.b(mai.class);
            default:
                return jce.a.b(d3c.class);
        }
    }

    @Override // defpackage.g92
    public final String getSignature() {
        switch (this.E) {
            case 0:
                return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            default:
                return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                yr9 yr9Var = (yr9) obj;
                yr9 yr9Var2 = (yr9) obj2;
                yr9Var.getClass();
                yr9Var2.getClass();
                ((mai) this.receiver).getClass();
                c3c.b.getClass();
                d3c d3cVar = b3c.b;
                return Boolean.valueOf(d3cVar.b(yr9Var, yr9Var2) && !d3cVar.b(yr9Var2, yr9Var));
            default:
                yr9 yr9Var3 = (yr9) obj;
                yr9 yr9Var4 = (yr9) obj2;
                yr9Var3.getClass();
                yr9Var4.getClass();
                return Boolean.valueOf(((d3c) this.receiver).a(yr9Var3, yr9Var4));
        }
    }
}
