package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class w2i {
    public static WeakReference c;
    public el5 a;
    public final ScheduledThreadPoolExecutor b;

    public w2i(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = scheduledThreadPoolExecutor;
    }

    public final synchronized v2i a() {
        String str;
        v2i v2iVar;
        el5 el5Var = this.a;
        synchronized (((ArrayDeque) el5Var.H)) {
            str = (String) ((ArrayDeque) el5Var.H).peek();
        }
        Pattern pattern = v2i.d;
        v2iVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                v2iVar = new v2i(strArrSplit[0], strArrSplit[1]);
            }
        }
        return v2iVar;
    }
}
