package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fo8 extends m08 implements bz7 {
    public final /* synthetic */ pe6 E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ List G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ bz7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo8(pe6 pe6Var, bz7 bz7Var, List list, bz7 bz7Var2, bz7 bz7Var3) {
        super(1, gb9.class, "changeMode", "DrawerSheetContent$changeMode(Lcom/anthropic/claude/home/DrawerCustomizeState;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/anthropic/claude/home/DrawerTabsMode;)V", 0);
        this.E = pe6Var;
        this.F = bz7Var;
        this.G = list;
        this.H = bz7Var2;
        this.I = bz7Var3;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        ag6 ag6Var = (ag6) obj;
        ag6Var.getClass();
        pe6 pe6Var = this.E;
        if (pe6Var.c() == ag6.E && ag6Var == ag6.F) {
            this.F.invoke(Integer.valueOf(this.G.size()));
        } else {
            ag6 ag6VarC = pe6Var.c();
            bz7 bz7Var = this.H;
            ag6 ag6Var2 = ag6.G;
            if (ag6VarC != ag6Var2 && ag6Var == ag6Var2) {
                bz7Var.invoke(Boolean.TRUE);
            } else if (pe6Var.c() == ag6Var2 && ag6Var != ag6Var2) {
                uf6 uf6VarA = pe6Var.a();
                bz7Var.invoke(Boolean.FALSE);
                if (uf6VarA.c() || uf6VarA.c != pf6.I) {
                    this.I.invoke(w44.S0(uf6VarA.a, ",", null, null, new qy4(21), 30));
                }
            }
        }
        pe6Var.f.setValue(ag6Var);
        return iei.a;
    }
}
