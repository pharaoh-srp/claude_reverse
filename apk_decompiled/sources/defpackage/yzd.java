package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class yzd {
    public String a;
    public String b;

    public yzd(ro6 ro6Var) {
        this.a = ro6Var.S("gcm.n.title");
        ro6Var.K("gcm.n.title");
        Object[] objArrJ = ro6Var.J("gcm.n.title");
        if (objArrJ != null) {
            String[] strArr = new String[objArrJ.length];
            for (int i = 0; i < objArrJ.length; i++) {
                strArr[i] = String.valueOf(objArrJ[i]);
            }
        }
        this.b = ro6Var.S("gcm.n.body");
        ro6Var.K("gcm.n.body");
        Object[] objArrJ2 = ro6Var.J("gcm.n.body");
        if (objArrJ2 != null) {
            String[] strArr2 = new String[objArrJ2.length];
            for (int i2 = 0; i2 < objArrJ2.length; i2++) {
                strArr2[i2] = String.valueOf(objArrJ2[i2]);
            }
        }
        ro6Var.S("gcm.n.icon");
        if (TextUtils.isEmpty(ro6Var.S("gcm.n.sound2"))) {
            ro6Var.S("gcm.n.sound");
        }
        ro6Var.S("gcm.n.tag");
        ro6Var.S("gcm.n.color");
        ro6Var.S("gcm.n.click_action");
        ro6Var.S("gcm.n.android_channel_id");
        String strS = ro6Var.S("gcm.n.link_android");
        strS = TextUtils.isEmpty(strS) ? ro6Var.S("gcm.n.link") : strS;
        if (!TextUtils.isEmpty(strS)) {
            Uri.parse(strS);
        }
        ro6Var.S("gcm.n.image");
        ro6Var.S("gcm.n.ticker");
        ro6Var.D("gcm.n.notification_priority");
        ro6Var.D("gcm.n.visibility");
        ro6Var.D("gcm.n.notification_count");
        ro6Var.C("gcm.n.sticky");
        ro6Var.C("gcm.n.local_only");
        ro6Var.C("gcm.n.default_sound");
        ro6Var.C("gcm.n.default_vibrate_timings");
        ro6Var.C("gcm.n.default_light_settings");
        ro6Var.L();
        ro6Var.I();
        ro6Var.T();
    }

    public zzd a() {
        String str = this.b;
        if ("first_party".equals(str)) {
            sz6.p("Serialized doc id must be provided for first party products.");
            return null;
        }
        if (this.a == null) {
            sz6.p("Product id must be provided.");
            return null;
        }
        if (str != null) {
            return new zzd(this);
        }
        sz6.p("Product type must be provided.");
        return null;
    }

    public void b(String str) {
        this.a = str;
    }

    public void c() {
        this.b = "subs";
    }
}
