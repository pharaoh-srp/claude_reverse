package defpackage;

import com.segment.analytics.kotlin.core.Settings;
import java.util.Set;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class y0h implements m9 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ y0h(int i) {
        this.a = i;
    }

    @Override // defpackage.m9
    public final vlg a(vlg vlgVar) {
        switch (this.a) {
            case 0:
                a1h a1hVar = (a1h) vlgVar;
                a1hVar.getClass();
                return new a1h(a1hVar.a, a1hVar.b, a1hVar.c, dxf.p0(a1hVar.d, (Set) this.b), a1hVar.e);
            case 1:
                a1h a1hVar2 = (a1h) vlgVar;
                a1hVar2.getClass();
                return new a1h(a1hVar2.a, (Settings) this.b, a1hVar2.c, a1hVar2.d, a1hVar2.e);
            default:
                wmi wmiVar = (wmi) vlgVar;
                wmiVar.getClass();
                return new wmi(wmiVar.a, wmiVar.b, (JsonObject) this.b);
        }
    }
}
