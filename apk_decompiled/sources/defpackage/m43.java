package defpackage;

import com.anthropic.claude.artifact.model.WiggleArtifactIdentifier;
import com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams;

/* JADX INFO: loaded from: classes2.dex */
public final class m43 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ t53 F;
    public final /* synthetic */ ArtifactBottomSheetParams.WiggleFileArtifact G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m43(t53 t53Var, ArtifactBottomSheetParams.WiggleFileArtifact wiggleFileArtifact, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = t53Var;
        this.G = wiggleFileArtifact;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new m43(this.F, this.G, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((m43) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            saj sajVar = this.F.S;
            WiggleArtifactIdentifier identifier = this.G.getIdentifier();
            this.E = 1;
            sajVar.getClass();
            ft5 ft5Var = g86.a;
            Object objC0 = gb9.c0(vr5.G, new k7h(sajVar, identifier, (tp4) null, 12), this);
            m45 m45Var = m45.E;
            if (objC0 == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }
}
