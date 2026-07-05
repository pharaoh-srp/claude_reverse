package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$DiffCommentAdded;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.code.ui.DiffLineComment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bz3 implements uz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ bz3(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uz7
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i = this.E;
        Object obj7 = this.F;
        switch (i) {
            case 0:
                i iVar = (i) obj7;
                String str = (String) obj;
                String str2 = (String) obj5;
                String str3 = (String) obj6;
                grc.B(str, str2, str3);
                DiffLineComment.Companion.getClass();
                DiffLineComment diffLineComment = new DiffLineComment(vb7.i(), str, ((Long) obj2).longValue(), (Integer) obj3, (Integer) obj4, str2, str3, System.currentTimeMillis());
                String strE0 = iVar.E0();
                if (strE0 != null) {
                    ArrayList arrayListB1 = w44.b1(iVar.A0(), diffLineComment);
                    iVar.t1(arrayListB1);
                    gb9.D(iVar.a, null, null, new s14(iVar, strE0, arrayListB1, 0 == true ? 1 : 0, 0), 3);
                    qi3 qi3Var = iVar.l;
                    String str4 = iVar.m;
                    String strE02 = iVar.E0();
                    qi3Var.e(new CodeEvents$DiffCommentAdded(str4, strE02 != null ? strE02 : null), CodeEvents$DiffCommentAdded.Companion.serializer());
                }
                return iei.a;
            default:
                mif mifVar = (mif) obj7;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                cu9 cu9Var = (cu9) obj2;
                long jA = mifVar.a(cu9Var, ((fcc) obj3).a);
                long jA2 = mifVar.a(cu9Var, ((fcc) obj4).a);
                mifVar.q(zBooleanValue);
                return Boolean.valueOf(mifVar.t(jA, jA2, ((Boolean) obj5).booleanValue(), (phf) obj6));
        }
    }
}
