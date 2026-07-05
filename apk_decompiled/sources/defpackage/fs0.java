package defpackage;

import anthropic.claude.usercontent.sandbox.ArtifactHostToSandboxService;
import anthropic.claude.usercontent.sandbox.SandboxContent;
import anthropic.claude.usercontent.sandbox.wire_format.Request;
import com.anthropic.claude.artifact.model.ArtifactType;

/* JADX INFO: loaded from: classes2.dex */
public final class fs0 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ tp0 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ t4f H;
    public final /* synthetic */ zy7 I;
    public final /* synthetic */ nwb J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs0(tp0 tp0Var, String str, t4f t4fVar, zy7 zy7Var, nwb nwbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = tp0Var;
        this.G = str;
        this.H = t4fVar;
        this.I = zy7Var;
        this.J = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new fs0(this.F, this.G, this.H, this.I, this.J, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((fs0) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            tp0 tp0Var = this.F;
            ArtifactType type = tp0Var.b.getType();
            if (type == null) {
                type = ArtifactType.Code.INSTANCE;
            }
            Request requestSetContent$default = ArtifactHostToSandboxService.SetContent$default(ArtifactHostToSandboxService.INSTANCE, new SandboxContent(tp0Var.a.g(), type.getMimeType(), this.G, null, 8, null), null, 2, null);
            this.E = 1;
            obj = this.H.h(requestSetContent$default, this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            this.J.setValue(Boolean.TRUE);
            this.I.a();
        }
        return iei.a;
    }
}
