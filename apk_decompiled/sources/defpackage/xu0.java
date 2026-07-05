package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.view.Window;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.tool.ToolResultKnowledge;
import com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xu0 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;

    public /* synthetic */ xu0(Object obj, boolean z, int i) {
        this.E = i;
        this.G = obj;
        this.F = z;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int i2 = 1;
        iei ieiVar = iei.a;
        Object obj2 = this.G;
        boolean z = this.F;
        switch (i) {
            case 0:
                hsc hscVar = (hsc) obj2;
                ((cz5) obj).getClass();
                break;
            case 1:
                p61 p61Var = (p61) obj2;
                r4a r4aVar = (r4a) obj;
                r4aVar.getClass();
                if (z) {
                    l51 l51Var = p61Var.F;
                    ((Handler) l51Var.i).post((k51) l51Var.j);
                }
                break;
            case 2:
                t4g t4gVar = (t4g) obj2;
                whb whbVar = (whb) obj;
                whbVar.getClass();
                if (z) {
                    if (whbVar instanceof vhb) {
                        qxh qxhVar = ((vhb) whbVar).a;
                        if (qxhVar instanceof ParsedContentBlock$McpToolInvocation) {
                            t4gVar.d(new CollapsedToolsSheetDestination.ToolContent(((ParsedContentBlock$McpToolInvocation) qxhVar).getId()));
                        }
                    } else if (whbVar instanceof uhb) {
                        t4gVar.d(new CollapsedToolsSheetDestination.Thinking(((uhb) whbVar).a.getId()));
                    } else if (!(whbVar instanceof thb)) {
                        wg6.i();
                    } else {
                        htc htcVar = ((thb) whbVar).a;
                        List list = htcVar.d;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (obj3 instanceof ToolResultKnowledge) {
                                arrayList.add(obj3);
                            }
                        }
                        t4gVar.d(new CollapsedToolsSheetDestination.Sources(htcVar.getBody(), jpi.k(arrayList)));
                    }
                }
                break;
            case 3:
                Activity activity = (Activity) obj2;
                ((w86) obj).getClass();
                if (activity != null) {
                    int requestedOrientation = activity.getRequestedOrientation();
                    activity.setRequestedOrientation(z ? 6 : requestedOrientation);
                }
                break;
            case 4:
                Window window = (Window) obj2;
                ((w86) obj).getClass();
                if (window != null) {
                    int statusBarColor = window.getStatusBarColor();
                    cbi cbiVar = new cbi(window, window.getDecorView());
                    boolean zB = ((fdj) cbiVar.E).b();
                    window.setStatusBarColor(0);
                    cbiVar.d(!z);
                }
                break;
            case 5:
                jy1 jy1Var = (jy1) obj2;
                cv9 cv9Var = (cv9) obj;
                cv9Var.getClass();
                if (!z) {
                    xd6.S0(cv9Var, jy1Var, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 126);
                }
                cv9Var.a();
                if (z) {
                    xd6.S0(cv9Var, jy1Var, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 126);
                }
                break;
            case 6:
                mag magVar = (mag) obj2;
                ekf ekfVar = (ekf) obj;
                if (!z) {
                    ckf.b(ekfVar);
                }
                ckf.v(ekfVar, String.valueOf(mwa.L(magVar.d.h() * 100.0f) / 100.0f));
                ekfVar.a(ojf.i, new e5(null, new bag(magVar, i)));
                break;
            case 7:
                ed6 ed6Var = (ed6) obj;
                float f = (int) (((g79) obj2).a >> 32);
                ed6Var.a(n0h.G, MTTypesetterKt.kLineSkipLimitMultiplier);
                if (z) {
                    ed6Var.a(n0h.E, f);
                }
                ed6Var.a(n0h.F, -f);
                break;
            default:
                nwb nwbVar = (nwb) obj2;
                ekf ekfVar2 = (ekf) obj;
                ekfVar2.getClass();
                if (z) {
                    ckf.a(ekfVar2, new lxf(15, nwbVar));
                } else {
                    ckf.c(ekfVar2, new lxf(16, nwbVar));
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ xu0(boolean z, Object obj, int i) {
        this.E = i;
        this.F = z;
        this.G = obj;
    }
}
