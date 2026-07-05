package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'G' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class cwh {
    public static final cwh F;
    public static final cwh G;
    public static final cwh H;
    public static final cwh I;
    public static final cwh J;
    public static final cwh K;
    public static final cwh L;
    public static final cwh M;
    public static final cwh N;
    public static final cwh O;
    public static final cwh P;
    public static final cwh Q;
    public static final /* synthetic */ cwh[] R;
    public final ud0 E;

    static {
        cwh cwhVar = new cwh(0, ud0.i0, "Read");
        F = cwhVar;
        ud0 ud0Var = ud0.e0;
        cwh cwhVar2 = new cwh(1, ud0Var, "Edit");
        G = cwhVar2;
        cwh cwhVar3 = new cwh(2, ud0Var, "NotebookEdit");
        H = cwhVar3;
        cwh cwhVar4 = new cwh(3, ud0.l0, "Write");
        I = cwhVar4;
        cwh cwhVar5 = new cwh(4, ud0.g1, "Bash");
        J = cwhVar5;
        ud0 ud0Var2 = ud0.k1;
        cwh cwhVar6 = new cwh(5, ud0Var2, "Grep");
        K = cwhVar6;
        cwh cwhVar7 = new cwh(6, ud0Var2, "Glob");
        L = cwhVar7;
        cwh cwhVar8 = new cwh(7, ud0.u0, "Web");
        M = cwhVar8;
        ud0 ud0Var3 = ud0.O;
        cwh cwhVar9 = new cwh(8, ud0Var3, "Todo");
        N = cwhVar9;
        cwh cwhVar10 = new cwh(9, ud0.w1, "Task");
        O = cwhVar10;
        cwh cwhVar11 = new cwh(10, ud0Var3, "ExitPlanMode");
        P = cwhVar11;
        cwh cwhVar12 = new cwh(11, ud0.B1, "Other");
        Q = cwhVar12;
        R = new cwh[]{cwhVar, cwhVar2, cwhVar3, cwhVar4, cwhVar5, cwhVar6, cwhVar7, cwhVar8, cwhVar9, cwhVar10, cwhVar11, cwhVar12};
    }

    public cwh(int i, ud0 ud0Var, String str) {
        this.E = ud0Var;
    }

    public static cwh valueOf(String str) {
        return (cwh) Enum.valueOf(cwh.class, str);
    }

    public static cwh[] values() {
        return (cwh[]) R.clone();
    }
}
