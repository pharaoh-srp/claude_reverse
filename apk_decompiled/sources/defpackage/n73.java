package defpackage;

import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n73 extends xzg implements pz7 {
    public final /* synthetic */ ChatScreenParams E;
    public final /* synthetic */ t53 F;
    public final /* synthetic */ rwe G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n73(ChatScreenParams chatScreenParams, t53 t53Var, rwe rweVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = chatScreenParams;
        this.F = t53Var;
        this.G = rweVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new n73(this.E, this.F, this.G, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        n73 n73Var = (n73) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        n73Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object next;
        sf5.h0(obj);
        ChatScreenParams chatScreenParams = this.E;
        if (chatScreenParams.m590getArtifactIdentifierToOpenNDePnSc() != null) {
            t53 t53Var = this.F;
            if (t53Var.I0()) {
                Iterator it = ((List) t53Var.j1.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String strM537getIdentifiereX_QYXY = ((tp0) next).a().m537getIdentifiereX_QYXY();
                    String strM590getArtifactIdentifierToOpenNDePnSc = chatScreenParams.m590getArtifactIdentifierToOpenNDePnSc();
                    if (strM590getArtifactIdentifierToOpenNDePnSc == null ? false : ArtifactIdentifier.m967equalsimpl0(strM537getIdentifiereX_QYXY, strM590getArtifactIdentifierToOpenNDePnSc)) {
                        break;
                    }
                }
                tp0 tp0Var = (tp0) next;
                if (tp0Var != null) {
                    this.G.E.m(new t23(new ChatScreenArtifactSheetDestination.ViewArtifact(t53Var.x0(tp0Var.a())), 1), new p23(12));
                }
            }
        }
        return iei.a;
    }
}
