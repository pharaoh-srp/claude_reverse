package defpackage;

import android.content.Context;
import com.anthropic.claude.mcpapps.transport.MessageParams;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class m23 extends xzg implements rz7 {
    public Iterator E;
    public int F;
    public /* synthetic */ MessageParams G;
    public /* synthetic */ String H;
    public final /* synthetic */ hw2 I;
    public final /* synthetic */ Context J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m23(hw2 hw2Var, Context context, tp4 tp4Var) {
        super(3, tp4Var);
        this.I = hw2Var;
        this.J = context;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m23 m23Var = new m23(this.I, this.J, (tp4) obj3);
        m23Var.G = (MessageParams) obj;
        m23Var.H = (String) obj2;
        return m23Var.invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00cd -> B:34:0x00d0). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m23.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
