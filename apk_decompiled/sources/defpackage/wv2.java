package defpackage;

import com.segment.analytics.kotlin.core.Settings;
import java.util.List;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wv2 extends m08 implements pz7, uzg {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv2(t53 t53Var) {
        super(2, 0, t53.class, t53Var, "setConnectorSuggestionsEnabled", "setConnectorSuggestionsEnabled(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        this.E = 1;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        JsonElement jsonElement;
        switch (this.E) {
            case 0:
                return ((gh2) this.receiver).b((tp4) obj2, (vt6) obj);
            case 1:
                return ((t53) this.receiver).v1(((Boolean) obj).booleanValue(), (tp4) obj2);
            case 2:
                return bg7.f((bg7) this.receiver, (List) obj, (tp4) obj2);
            case 3:
                return dl8.c((dl8) this.receiver, (List) obj, (tp4) obj2);
            case 4:
                return ((un8) this.receiver).A((uf6) obj, (tp4) obj2);
            case 5:
                return oq5.u((tp4) obj2, (bz7) obj, (cve) this.receiver);
            case 6:
                return ((bpg) this.receiver).g((wmi) obj, (tp4) obj2);
            case 7:
                return ((bpg) this.receiver).f((a1h) obj, (tp4) obj2);
            default:
                ((wah) this.receiver).getClass();
                Settings settings = ((a1h) obj).b;
                if (settings != null && (jsonElement = (JsonElement) settings.getMetrics().get((Object) "sampleRate")) != null) {
                    double d = Double.parseDouble(ch9.j(jsonElement).getContent());
                    wah.F = d;
                    if (!wah.N && d != 0.0d) {
                        wah.N = true;
                        if (Math.random() > wah.F) {
                            wah.L.clear();
                            wah.M = 0;
                        }
                        int i = 2;
                        gb9.D(wah.Q, wah.R, null, new ki5(i, null, i), 2);
                    }
                }
                return iei.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }
}
