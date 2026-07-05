package defpackage;

import coil.compose.AsyncImagePainter;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w01 implements lp7, zz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ w01(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.zz7
    public final qz7 d() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return new pd(2, 4, AsyncImagePainter.class, (AsyncImagePainter) obj, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
            case 1:
                return new m08(2, 0, gb9.class, (a33) obj, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/anthropic/claude/bell/ToolApprovalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            default:
                return new m08(2, 0, gb9.class, (bz7) obj, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }
    }

    public final boolean equals(Object obj) {
        switch (this.E) {
            case 0:
                if ((obj instanceof lp7) && (obj instanceof zz7)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof lp7) && (obj instanceof zz7)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof lp7) && (obj instanceof zz7)) {
                    break;
                }
                break;
        }
        return d().equals(((zz7) obj).d());
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                ((AsyncImagePainter) obj2).l((u01) obj);
                break;
            case 1:
                ((a33) obj2).invoke((ovh) obj);
                break;
            default:
                ((bz7) obj2).invoke((String) obj);
                break;
        }
        return ieiVar;
    }

    public final int hashCode() {
        switch (this.E) {
        }
        return d().hashCode();
    }
}
