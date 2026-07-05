package defpackage;

import com.anthropic.claude.sessions.types.EnvironmentResource;

/* JADX INFO: loaded from: classes2.dex */
public final class hz3 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ EnvironmentResource G;

    public /* synthetic */ hz3(bz7 bz7Var, EnvironmentResource environmentResource, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = environmentResource;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        EnvironmentResource environmentResource = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                bz7Var.invoke(environmentResource);
                break;
            case 1:
                bz7Var.invoke(environmentResource.getEnvironment_id());
                break;
            default:
                bz7Var.invoke(environmentResource);
                break;
        }
        return ieiVar;
    }
}
