package defpackage;

import com.anthropic.claude.core.telemetry.SilentException;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tc8 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ad8 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ KSerializer H;

    public /* synthetic */ tc8(ad8 ad8Var, String str, KSerializer kSerializer, int i) {
        this.E = i;
        this.F = ad8Var;
        this.G = str;
        this.H = kSerializer;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        KSerializer kSerializer = this.H;
        String str = this.G;
        ad8 ad8Var = this.F;
        switch (i) {
            case 0:
                ad8Var.l.getValue();
                try {
                    pg7 pg7VarT = ad8Var.t(str, kSerializer);
                    if (pg7VarT != null) {
                        return pg7VarT.c;
                    }
                    return null;
                } catch (Throwable th) {
                    SilentException.a(new SilentException("Failed to parse feature ".concat(str), th), ozf.G, false, 2);
                    return null;
                }
            default:
                ad8Var.l.getValue();
                pg7 pg7VarT2 = ad8Var.t(str, kSerializer);
                if (pg7VarT2 != null) {
                    return pg7VarT2.c;
                }
                return null;
        }
    }
}
