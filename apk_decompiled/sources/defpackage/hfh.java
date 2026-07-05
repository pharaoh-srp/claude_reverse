package defpackage;

import android.content.ClipDescription;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.mcp.McpServer;
import java.util.Collection;
import kotlinx.serialization.json.JsonElement;
import org.chromium.net.CronetEngine;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hfh implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ hfh(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        boolean z = false;
        iei ieiVar = iei.a;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                kfh kfhVar = (kfh) obj2;
                cu9 cu9Var = (cu9) obj;
                l9e l9eVar = (l9e) kfhVar.Y.y.getValue();
                if (l9eVar == null) {
                    l9eVar = l9e.e;
                }
                cu9 cu9VarE = kfhVar.W.e();
                if (cu9VarE == null) {
                    e39.d("Required value was null.");
                    sz6.r();
                }
                break;
            case 1:
                ClipDescription clipDescription = ttj.o((gb6) obj).getClipDescription();
                Iterable<q8b> iterable = (Iterable) ((pfh) obj2).a();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (q8b q8bVar : iterable) {
                        if (x44.r(q8bVar, q8b.c) || (clipDescription != null && clipDescription.hasMimeType(q8bVar.a()))) {
                            z = true;
                        }
                    }
                }
                break;
            case 2:
                rhh rhhVar = (rhh) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                hsc hscVar = rhhVar.a;
                float fH = hscVar.h() + fFloatValue;
                hsc hscVar2 = rhhVar.b;
                if (fH > hscVar2.h()) {
                    fFloatValue = hscVar2.h() - hscVar.h();
                } else if (fH < MTTypesetterKt.kLineSkipLimitMultiplier) {
                    fFloatValue = -hscVar.h();
                }
                hscVar.i(hscVar.h() + fFloatValue);
                break;
            case 3:
                ekh ekhVar = (ekh) obj2;
                yb0 yb0Var = (yb0) obj;
                vb0 vb0Var = (vb0) yb0Var.a;
                if (vb0Var instanceof n6a) {
                    n6a n6aVar = (n6a) vb0Var;
                    if (n6aVar.b == null) {
                    }
                }
                if (vb0Var instanceof m6a) {
                    m6a m6aVar = (m6a) vb0Var;
                    if (m6aVar.b() == null) {
                    }
                }
                break;
            case 4:
                break;
            case 5:
                ((McpServer) obj).getClass();
                break;
            case 6:
                ((McpServer) obj).getClass();
                break;
            case 7:
                JsonElement jsonElement = (JsonElement) obj;
                jsonElement.getClass();
                ((dae) obj2).E = jsonElement;
                break;
            default:
                CronetEngine cronetEngine = (CronetEngine) obj;
                cronetEngine.getClass();
                ((dmi) obj2).F = sb5.d(cronetEngine).h();
                break;
        }
        return ieiVar;
    }
}
