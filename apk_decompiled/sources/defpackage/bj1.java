package defpackage;

import com.anthropic.claude.bell.api.BellApiData;
import com.anthropic.claude.bell.api.BellApiServerMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class bj1 implements lp7 {
    public final /* synthetic */ ej1 E;

    public bj1(ej1 ej1Var) {
        this.E = ej1Var;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        BellApiData bellApiData = (BellApiData) obj;
        boolean z = bellApiData instanceof BellApiData.MessageData;
        ej1 ej1Var = this.E;
        if (z && (((BellApiData.MessageData) bellApiData).getMessage() instanceof BellApiServerMessage.SessionServerInitialized)) {
            ej1Var.e.r(ui1.a);
        }
        ej1Var.j.r(bellApiData);
        return iei.a;
    }
}
