package defpackage;

import com.anthropic.claude.api.chat.messages.ContentBlock;
import com.anthropic.claude.api.chat.messages.TextBlock;
import com.anthropic.claude.bell.api.BellApiServerMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class do1 extends xzg implements pz7 {
    public final /* synthetic */ go1 E;
    public final /* synthetic */ BellApiServerMessage.MessageCompleteData F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do1(go1 go1Var, BellApiServerMessage.MessageCompleteData messageCompleteData, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = go1Var;
        this.F = messageCompleteData;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new do1(this.E, this.F, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws IOException {
        do1 do1Var = (do1) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        do1Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws IOException {
        sf5.h0(obj);
        go1 go1Var = this.E;
        go1Var.i.setValue(null);
        List<ContentBlock> content = this.F.getContent();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : content) {
            if (obj2 instanceof TextBlock) {
                arrayList.add(obj2);
            }
        }
        String strS0 = w44.S0(arrayList, "", null, null, new zv(22), 30);
        if (!bsg.I0(strS0)) {
            go1Var.g.add(new z0j(strS0));
        }
        return iei.a;
    }
}
