package defpackage;

import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Build;
import com.anthropic.claude.widget.ClaudeAppWidgetReceiver;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class m68 {
    public static final l68 d = new l68();
    public static final ubd e;
    public static vg5 f;
    public static final xbd g;
    public final Context a;
    public final AppWidgetManager b;
    public final u0h c = new u0h(new xi4(16, this));

    static {
        String processName;
        StringBuilder sb = new StringBuilder("GlanceAppWidgetManager-");
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            objInvoke.getClass();
            processName = (String) objInvoke;
        }
        sb.append(processName);
        String string = sb.toString();
        f7d f7dVar = new f7d(3);
        ft5 ft5Var = g86.a;
        vr5 vr5Var = vr5.G;
        myg mygVarG = iuj.g();
        vr5Var.getClass();
        e = new ubd(string, f7dVar, fd9.c(nai.Z(vr5Var, mygVarG)));
        g = new xbd("list::Providers");
    }

    public m68(Context context) {
        this.a = context;
        this.b = AppWidgetManager.getInstance(context);
    }

    public final Object a(ClaudeAppWidgetReceiver claudeAppWidgetReceiver, ive iveVar, ix5 ix5Var) {
        d.getClass();
        String canonicalName = claudeAppWidgetReceiver.getClass().getCanonicalName();
        tp4 tp4Var = null;
        if (canonicalName == null) {
            sz6.p("no receiver name");
            return null;
        }
        String canonicalName2 = iveVar.getClass().getCanonicalName();
        if (canonicalName2 != null) {
            Object objA = ((vg5) this.c.getValue()).a(new zn(canonicalName, canonicalName2, tp4Var, 15), ix5Var);
            return objA == m45.E ? objA : iei.a;
        }
        sz6.p("no provider name");
        return null;
    }
}
