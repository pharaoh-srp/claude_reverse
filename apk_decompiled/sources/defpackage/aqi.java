package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class aqi {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static aqi c;
    public final zp3 a;

    public aqi(zp3 zp3Var) {
        this.a = zp3Var;
    }

    public final boolean a(a91 a91Var) {
        if (TextUtils.isEmpty(a91Var.c)) {
            return true;
        }
        long j = a91Var.f + a91Var.e;
        this.a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
