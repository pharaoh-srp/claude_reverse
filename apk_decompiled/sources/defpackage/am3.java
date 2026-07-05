package defpackage;

import com.anthropic.claude.code.remote.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class am3 extends m08 implements bz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am3(l45 l45Var, ybg ybgVar) {
        super(1, gb9.class, "showSnackbar", "CodeRemoteListScreen$lambda$9$showSnackbar(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SnackbarHostState;Ljava/lang/String;)V", 0);
        this.F = l45Var;
        this.G = ybgVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.G;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                ((nwb) obj2).setValue(new va6(((cz5) ((nwb) obj3).getValue()).c0(((Number) obj).intValue())));
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ad9 ad9Var = e.a;
                gb9.D((l45) obj3, null, null, new yn((ybg) obj2, str, null, 2), 3);
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am3(nwb nwbVar, nwb nwbVar2) {
        super(1, gb9.class, "onSetBottomSpacerSizePx", "ClaudeRespondingScrollAndSpacerEffect_3GLzNTs$onSetBottomSpacerSizePx(Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;I)V", 0);
        this.F = nwbVar;
        this.G = nwbVar2;
    }
}
