package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class shd {
    static {
        nga.e("ProcessUtils");
    }

    public static final boolean a(Context context, fg4 fg4Var) {
        String strD;
        Object next;
        Object objInvoke;
        context.getClass();
        fg4Var.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            strD = je0.d();
        } else {
            strD = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, bgj.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
            } catch (Throwable unused) {
                nga.c().getClass();
            }
            if (objInvoke instanceof String) {
                strD = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                systemService.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        strD = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        return x44.r(strD, context.getApplicationInfo().processName);
    }
}
