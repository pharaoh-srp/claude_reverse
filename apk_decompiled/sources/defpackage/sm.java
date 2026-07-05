package defpackage;

import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sm extends m08 implements pz7, uzg {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm(zy1 zy1Var) {
        super(2, 0, gh2.class, zy1Var, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        this.E = 4;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                return vm.b((vm) this.receiver, ((SessionId) obj).m1120unboximpl(), (tp4) obj2);
            case 1:
                tp4 tp4Var = (tp4) obj2;
                return ((gh2) this.receiver).b(tp4Var, (vt6) obj);
            case 2:
                tp4 tp4Var2 = (tp4) obj2;
                return ((gh2) this.receiver).b(tp4Var2, (vt6) obj);
            case 3:
                tp4 tp4Var3 = (tp4) obj2;
                return ((gh2) this.receiver).b(tp4Var3, (vt6) obj);
            case 4:
                tp4 tp4Var4 = (tp4) obj2;
                return ((gh2) this.receiver).b(tp4Var4, (vt6) obj);
            case 5:
                tp4 tp4Var5 = (tp4) obj2;
                return ((gh2) this.receiver).b(tp4Var5, (vt6) obj);
            case 6:
                return f.a0((f) this.receiver, (String) obj, (tp4) obj2);
            case 7:
                return oq5.u((tp4) obj2, (bz7) obj, (cve) this.receiver);
            default:
                return ((i) this.receiver).y0.a.w((String) obj, (tp4) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm(cve cveVar) {
        super(2, 1, eve.class, cveVar, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        this.E = 7;
    }
}
